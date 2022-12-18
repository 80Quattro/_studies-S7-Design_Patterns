package pl.edu.wszib.lab03.chainofresponsibility;

import java.util.Map;

public class Application {

    public static void main(String[] args) {

        final HttpRequest httpRequest = new HttpRequest(
                "https://google.com",
                "GET",
                Map.of("accept", "text/html"),
                null
        );

        final AbstractFilter filter = createHttpFilter();
        boolean result = filter.filter(httpRequest);

    }

    private static AbstractFilter createHttpFilter() {
        return new LoggingFilter(
                new HttpsOnlyFilter(new NoopFilter())
        );
    }

}
