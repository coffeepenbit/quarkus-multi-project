package org.example.libs;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

/**
 * Provides logging utilities.
 */
@ApplicationScoped
public class LoggerBean {
    private static final Logger LOG = Logger.getLogger(LoggerBean.class);

    /**
     * Logs a message at info level.
     *
     * @param msg the message
     */
    public void info(String msg) {
        LOG.info(msg);
    }
}
