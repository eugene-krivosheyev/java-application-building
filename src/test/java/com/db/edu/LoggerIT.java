package com.db.edu;

import com.db.edu.logger.api.LoggerController;

public class LoggerIT {
    public static void main(String[] args) {
        LoggerController logger = new LoggerController();

        LoggerController var = new LoggerController();
        var = null;
        System.gc(); //Not garanteed GC!!!

        logger.log("test message");
//        assertThatMessageInConsoleEqualsTo(">> test message");
    }
}
