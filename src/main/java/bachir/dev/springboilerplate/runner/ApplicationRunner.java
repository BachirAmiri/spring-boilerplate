package bachir.dev.springboilerplate.runner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(ApplicationRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Application start");
    }
}
