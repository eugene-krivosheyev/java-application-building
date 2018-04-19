package com.db.edu.logger;

public class LoggerController {
    private LoggerSaver saver = new LoggerSaver();

    /**
     *
     * @param message
     */
    public void log(String message) {
        saver.save(message);
    }
}
