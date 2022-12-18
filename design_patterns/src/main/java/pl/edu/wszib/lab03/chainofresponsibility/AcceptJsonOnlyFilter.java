package pl.edu.wszib.lab03.chainofresponsibility;

import java.util.Objects;

public class AcceptJsonOnlyFilter extends AbstractFilter {

    public AcceptJsonOnlyFilter(AbstractFilter next) {
        super(next);
    }

    @Override
    public boolean filter(HttpRequest request) {
        if(request.method().equalsIgnoreCase("POST")) {
            if(Objects.equals(request.getHeader("Content-Type"), "application/json")) {
                return next.filter(request);
            }
            return false;
        }
        return next.filter(request);
    }

}
