package pl.edu.wszib.lab03.chainofresponsibility;

import java.util.logging.Logger;

public class LoggingFilter extends AbstractFilter {

    private static Logger log = Logger.getLogger(LoggingFilter.class.getName());

    public LoggingFilter(AbstractFilter next) {
        super(next);
    }

    @Override
    public boolean filter(HttpRequest request) {
        log.info("Incoming request: " + request);
        boolean result = next.filter(request);
        log.info("Request processing result: " + result);
        return result;
    }
}
