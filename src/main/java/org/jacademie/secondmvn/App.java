package org.jacademie.secondmvn;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App {
	
	private static Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args ) {
    	
    	String hello = "Hello World with Maven !";
    	
        logger.info(hello);
        
        String[] splittedHello = StringUtils.splitByWholeSeparator(hello, " ");
        
        for (String currentSring : splittedHello) {
        	
        	logger.info(currentSring);
        }
        
        DateTimeFormatter fmt = DateTimeFormat.forPattern("E d MMMM, yyyy : HH:mm");
        
        DateTime dateTime1 = new DateTime(1998, 07, 12, 21, 00);
        
        logger.info("Debut de la finale : " + dateTime1.toString(fmt));
        
        DateTime dateTime2 = dateTime1.plusMinutes(45);
        
        logger.info("On mène 2-0 : " + dateTime2.toString(fmt));
        
        DateTime dateTime3 = dateTime2.plusMinutes(60);
        
        logger.info("On est les champions : " + dateTime3.toString(fmt));
    }
}
