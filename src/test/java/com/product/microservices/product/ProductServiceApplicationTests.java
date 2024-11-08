package com.product.microservices.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

//@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductServiceApplicationTests {
//	static mongoDBContainer mongoDBContainer = new mongoDBContainer(dockerImageName: "mongo:7.0.5");
	@Test
	void shouldCreateProduct() {
	}

}
