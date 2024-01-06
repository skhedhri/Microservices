package org.sid.ref.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sid.ref.RefApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = RefApplication.class)
public class TierRestServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeClass
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testTiers() throws Exception {
        mockMvc.perform(get("/referentiel/tiers")).andExpect(status().isOk());
    }

    @Test
    public void testSaveTier() throws Exception {
        Object randomObj = new Object() {
            public final String id = "1234";
        };
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(randomObj);
        mockMvc.perform(post("/referentiel/tiers")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
        )
    .andExpect(status().isBadRequest());

    }
    @Test
    public void testBanques() throws Exception {
        mockMvc.perform(get("/referentiel/banques")).andExpect(status().isOk());

    }

    @Test
    public void testDeleteTier() throws Exception {
        mockMvc.perform(delete("/referentiel/tiers/13")).andExpect(status().isOk());

    }

    @Test
    public void testTier() throws Exception {
        mockMvc.perform(get("/referentiel/tiers/7")).andExpect(status().isOk());

    }

    @Test
    public void testGetComptesByTier() throws Exception {
        mockMvc.perform(get("/referentiel/tiers")).andExpect(status().isOk());

    }

    @Test
    public void testPersons() throws Exception {
        mockMvc.perform(get("/referentiel/persons")).andExpect(status().isOk());

    }


    @Test
    public void testGetTiers() throws Exception {
        mockMvc.perform(get("/referentiel/tiers")).andExpect(status().isOk());

    }
}
