package classB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassB {
private static Logger log = LogManager.getLogger(ClassB.class.getName());

public static void main(String[] args) {
	// TODO Auto-generated method stub

	log.debug("I am debugging");
	log.error("I am an error");
	log.info("I am an information");
	log.fatal("I am fatal");
	log.warn("I am warning");
		
		

	}
}

