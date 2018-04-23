package com.db.edu.logger.businesslogic.service;

import com.db.edu.logger.dal.ConsoleLoggerSaver;

public class LogService {
    private LogMessageFilter filter = new LogMessageFilter();
    private LogMessageFormatter formatter = new LogMessageFormatter();
    private ConsoleLoggerSaver saver = new ConsoleLoggerSaver();

    public void log(String message) {
        if(filter.filter(message)) {
            String formattedMessage = formatter.format(message);
            saver.save(formattedMessage);
        }
    }
}
