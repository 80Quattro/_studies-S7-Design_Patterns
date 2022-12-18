package pl.edu.wszib.lab03.chainofresponsibility;

import java.util.Map;

public class Application {

    public static void main(String[] args) {

        final AbstractFilter filter = createHttpFilter();

        /*final HttpRequest httpRequest = new HttpRequest(
                "https://google.com",
                "GET",
                Map.of("accept", "text/html"),
                null
        );*/
        HttpRequest httpRequest = new HttpRequest(
                "https://google.com",
                "POST",
                Map.of(
                        "Content-Type", "application/json",
                        "Accept", "application/json"
                ),
                "{}"
        );

        boolean result = filter.filter(httpRequest);

        // Ex:
        // Create filter, which allows only http requests with response type "application/json" (Accept header)
        // Create second filter, which for POST requests will only allow requests in json format (header "Content-type" = "application/json")

    }

    private static AbstractFilter createHttpFilter() {
        return new LoggingFilter(
                new HttpsOnlyFilter(new ResultJsonOnlyFilter(new AcceptJsonOnlyFilter(new NoopFilter())))
        );
    }

}
