package pl.edu.wszib.lab03.chainofresponsibility;

import java.util.Objects;

public class ResultJsonOnlyFilter extends AbstractFilter {

    public ResultJsonOnlyFilter(AbstractFilter next) {
        super(next);
    }

    @Override
    public boolean filter(HttpRequest request) {
        if(Objects.equals(request.headers().get("Accept"), "application/json")) {
            return next.filter(request);
        }
        return false;
    }
}
