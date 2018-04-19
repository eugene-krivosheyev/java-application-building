package com.db.edu;

import com.db.edu.logger.LoggerController;

public class LoggerIT {
    public static void main(String[] args) {
        LoggerController logger = new LoggerController();
        logger.log("test message");
    }
}
