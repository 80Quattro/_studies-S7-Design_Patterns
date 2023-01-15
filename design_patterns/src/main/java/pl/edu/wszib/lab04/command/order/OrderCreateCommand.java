package pl.edu.wszib.lab04.command.order;

import pl.edu.wszib.lab04.command.Command;

public record OrderCreateCommand(
        String id
) implements Command {

}
