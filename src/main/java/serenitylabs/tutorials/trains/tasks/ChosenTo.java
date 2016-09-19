/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package serenitylabs.tutorials.trains.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import serenitylabs.tutorials.trains.ui.BuyTicketsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by vdheer on 9/19/2016.
 */
public class ChosenTo implements Task {

    private BuyTicketsPage buyTicketsPage;

    @Step("{0} has chosen to book a ticket")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(buyTicketsPage)
        );
    }

    public static Performable bookATicket() {
        return instrumented(ChosenTo.class);
    }
}
