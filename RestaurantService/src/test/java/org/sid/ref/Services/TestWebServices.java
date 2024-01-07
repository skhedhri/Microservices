package org.sid.ref.Services;

import org.junit.jupiter.api.Test;
import org.sid.ref.Metier.RestaurentMetier;
import org.sid.ref.Model.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TestWebServices {

    @Autowired
    private RestaurentMetier restaurentMetier;
    @Test
    public void testApi() throws Exception {
        String ville = "Tunis";
        List<Restaurent> restaurentList = new ArrayList<>();
        restaurentList = restaurentMetier.findAvailableRestaurants(ville);
        assertNotNull(restaurentList);
    }
}
