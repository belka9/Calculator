package ru.nsu.fit.oppjava.task2.commands;

import ru.nsu.fit.oppjava.task2.core.Command;
import ru.nsu.fit.oppjava.task2.core.ExecutionContext;
import ru.nsu.fit.oppjava.task2.core.MyEmptyStackException;
import ru.nsu.fit.oppjava.task2.core.CalculatorException;

import java.util.EmptyStackException;

public class Pop implements Command {
    ExecutionContext context;

    public Pop(ExecutionContext context, String[] arguments) {
        this.context = context;
    }

    @Override
    public String getName() {
        return "POP";
    }

    @Override
    public void execute() throws CalculatorException {
        try {
            context.stackPop();
        } catch (EmptyStackException es) {
            throw new MyEmptyStackException();
        }
    }
}
