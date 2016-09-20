package serenitylabs.tutorials.trains;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import serenitylabs.tutorials.trains.questions.TheJourneySummary;
import serenitylabs.tutorials.trains.tasks.ChosenTo;
import serenitylabs.tutorials.trains.tasks.ViewTheAvailableTickets;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class WhenPlanningATrip {
    Actor vikrant;

    @Managed
    WebDriver browser;

    @Before
    public void setUp() {
        vikrant = Actor.named("Vikrant Dheer");
        vikrant.can(BrowseTheWeb.with(browser));
    }

    @Test
    public void booking_a_simple_trip() {
        vikrant.has(ChosenTo.bookATicket());

        vikrant.attemptsTo(ViewTheAvailableTickets
                .from("London Paddington")
                .to("Oxford"));

        vikrant.should(seeThat("the origin station", TheJourneySummary.origin(), equalTo("London Paddington")),
                seeThat("the destination station", TheJourneySummary.destination(), equalTo("Oxford")));
    }
}
