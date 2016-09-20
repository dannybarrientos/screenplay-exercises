package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Created by vdheer on 9/20/2016.
 */
public class JourneyForm extends PageObject {
    public static final Target ORIGIN = Target.the("Origin Fiedl").located(By.id("depart-from"));
    public static final Target DESTINATION = Target.the("Destination field").located(By.id("going-to"));
    public static final Target BUY_TICKETS = Target.the("Buys tickets button").located(By.className("planner__submit"));
}
