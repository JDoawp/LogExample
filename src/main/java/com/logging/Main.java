package com.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //Levels
        LOG.debug("Debug");
        LOG.info("Info");
        LOG.warn("Warn");
        LOG.error("Error");
        LOG.fatal("Fatal");

        //Appending String
        LOG.info("Appending string: {}.", "Hello, World");

        //Exception Test
        try{
            throwError();
        }catch (Exception e){
            LOG.error("Logger exception: ", e);
        }
    }


    private static void throwError() throws Exception{
        throw new Exception("Throwing Exception");
    }
}
