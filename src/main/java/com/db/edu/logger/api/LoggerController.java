package com.db.edu.logger.api;

import com.db.edu.logger.businesslogic.service.LogService;

/**
 * Controller's responsibilities:
 * - Security
 * - Logging
 * - TXs
 * - Request preparation
 * - Routing
 * - other Aspects
 */
public class LoggerController {
    private LogService logService = new LogService();

    /**
     * @param message to be logged
     */
    /*
    @RollesAllowed("admin")
    @Transactional()
    @WebMethod("/url")
    */
    public void log(String message) {
        logService.log(message);
    }
}
