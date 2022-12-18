package pl.edu.wszib.lab03.chainofresponsibility;

public abstract class AbstractFilter {

    protected final AbstractFilter next;

    public AbstractFilter(AbstractFilter next) {
        this.next = next;
    }

    public abstract boolean filter(final HttpRequest request);

}
