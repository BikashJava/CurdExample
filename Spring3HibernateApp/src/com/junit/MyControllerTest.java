package com.junit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ JpaTestConfig.class, TestConfig.class })
public class MyControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup() {

        mockMvc = MockMvcBuilders
            .annotationConfigSetup(JpaTestConfig.class, TestConfig.class)
            .build();

    }

    @Test
    public void testHome() throws Exception {

        mockMvc.perform(get('/'))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl('WEB-INF/views/index.jsp'));

    }

    @Test
    public void testPersistenceStatus() throws Exception {

        mockMvc.perform(get('/addEmployee'))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl('WEB-INF/pages/addEmployee.jsp'))
            .andExpect(model().attributeExists('addEmployee'));

    }

}