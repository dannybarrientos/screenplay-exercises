/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package serenitylabs.tutorials.trains.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by vdheer on 9/19/2016.
 */
public class ViewTheAvailableTickets implements Task {

    private final String departureStation;
    private final String destinationStation;

    public ViewTheAvailableTickets(String departureStation, String destinationStation) {
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
    }

    @Step("{0} can view the tickets from #departureStation to #destinationStation")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(departureStation).into(By.id("depart-from")).thenHit(Keys.TAB),
                Enter.theValue(destinationStation).into(By.id("going-to")).thenHit(Keys.TAB),
                Click.on(By.className("planner__submit"))
        );
    }

    public static ViewTheAvailableTicketsBuilder from(String departureStation) {
        return new ViewTheAvailableTicketsBuilder(departureStation);
    }

    public static class ViewTheAvailableTicketsBuilder {
        private final String departureStation;

        public ViewTheAvailableTicketsBuilder(String departureStation) {
            this.departureStation = departureStation;
        }

        public Performable to(String destinationStation) {
            return Instrumented.instanceOf(ViewTheAvailableTickets.class)
                    .withProperties(departureStation, destinationStation);
        }
    }
}
