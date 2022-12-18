package pl.edu.wszib.lab03.chainofresponsibility;

import java.util.Map;

public record HttpRequest(
    String url,
    String method,
    Map<String, String> headers,
    Object body
) {

}
