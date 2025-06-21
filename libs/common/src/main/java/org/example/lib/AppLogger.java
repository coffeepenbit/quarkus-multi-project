package org.example.lib;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

/**
 * Supplies application logging.
 */
@ApplicationScoped
public class AppLogger {
    private static final Logger LOG = Logger.getLogger(AppLogger.class);

    /**
     * Logs a message.
     *
     * @param message text to log
     */
    public void log(String message) {
        LOG.info(message);
    }
}
