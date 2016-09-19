/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package serenitylabs.tutorials.trains.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import serenitylabs.tutorials.trains.ui.JourneySummary;

/**
 * Created by vdheer on 9/20/2016.
 */
public class TheJourneySummary {

    public static Question<String> destination() {
        return actor -> Text.of(JourneySummary.DESTINATION).viewedBy(actor).asString();
    }

    public static Question<String> origin() {
        return actor -> Text.of(JourneySummary.ORIGIN).viewedBy(actor).asString();
    }
}
