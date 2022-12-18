package pl.edu.wszib.lab03.chainofresponsibility;

public class NoopFilter extends AbstractFilter {

    public NoopFilter() {
        super(null);
    }

    @Override
    public boolean filter(HttpRequest request) {
        return true;
    }
}
