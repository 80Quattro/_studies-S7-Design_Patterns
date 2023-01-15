package pl.edu.wszib.lab04.command;

public interface CommandHandler<TCommand> {

    void handle(TCommand command);

}
