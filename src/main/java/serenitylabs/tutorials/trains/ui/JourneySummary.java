/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by vdheer on 9/20/2016.
 */
public class JourneySummary {
    public static Target ORIGIN = Target.the("origin").locatedBy(".planner-header__origin");
    public static Target DESTINATION = Target.the("destination").locatedBy(".planner-header__destination");
}
