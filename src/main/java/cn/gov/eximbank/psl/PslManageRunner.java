package cn.gov.eximbank.psl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PslManageRunner implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(PslManageRunner.class);

    @Override
    public void run(String... args) throws Exception {
        if (args.length != 1) {
            logger.error("Arguments is not enough");
        }
        else {
            String argument = args[0];
        }
    }
}
