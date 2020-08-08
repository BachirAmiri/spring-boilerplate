package bachir.dev.springboilerplate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuickProjectApplicationTests {

	@Test
	@DisplayName("Dummy Test")
	void contextLoads() {
		Assertions.assertThat("DummyTest").isNotSameAs("TestDummy");
	}

}
