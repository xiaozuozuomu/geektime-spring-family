package io.github.shaw;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Unit tests for methods of {@link HelloSpringApplication}.
 *
 * @author <a href="mailto:missyou5957@gmail.com">shaw</a>
 * @since 1.0
 */
@Slf4j
@WebMvcTest
class HelloSpringControllerTests {
	@Autowired
	private MockMvc mockMvc;

	/**
	 * Test for {@link HelloSpringApplication#hello()} .
	 */
	@Test
	void testHello() throws Exception {
		this.mockMvc.perform(
				MockMvcRequestBuilders.get("/hello")
						.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
		).andExpect(status().isOk())
				.andDo(log())
				.andDo(print())
				.andReturn();
	}
}
