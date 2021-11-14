package oleuzop.services.transaction.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class TransactionControllerTests {

	@Autowired
	private MockMvc mockMvc;

	/*
	@Test
	void test_get_all_ok() throws Exception {
		this.mockMvc.perform(get("/transaction")).andExpect(status().isOk());
	}

	@Test
	void test_get_id_200() throws Exception {
		this.mockMvc.perform(get("/transaction/1")).andExpect(status().isOk());
	}
	*/

	@Test
	void test_get_id_401() throws Exception {
		this.mockMvc.perform(get("/transaction/1234567890")).andExpect(status().is4xxClientError());
	}

}
