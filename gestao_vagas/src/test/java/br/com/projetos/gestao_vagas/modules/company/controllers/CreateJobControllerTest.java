package br.com.projetos.gestao_vagas.modules.company.controllers;

import br.com.projetos.gestao_vagas.modules.company.dto.CreateJobDTO;
import br.com.projetos.gestao_vagas.utils.TestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreateJobControllerTest {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(context)
                .apply(SecurityMockMvcConfigurers.springSecurity())
                .build();
    }

    @Test
    public void should_be_able_to_create_a_new_job() throws Exception {

        var createdJobDTO = CreateJobDTO.builder()
                .description("Vaga para pessoa desenvolvedora júnior")
                .benefits("Gympass e Plano de saúde")
                .level("JUNIOR")
                .build();

        var result = mvc.perform(MockMvcRequestBuilders.post("/company/job/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(TestUtils.objectToJson(createdJobDTO))
                        .header("Authorization", TestUtils.generateToken(UUID.fromString("371dc184-15cc-40f4-8911-ff4288809328"), "JAVAGAS_@852#"))
                )
                .andExpect(MockMvcResultMatchers.status().isOk());

        System.out.println(result);
    }

}
