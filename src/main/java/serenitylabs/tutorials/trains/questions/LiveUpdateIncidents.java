package serenitylabs.tutorials.trains.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import serenitylabs.tutorials.trains.ui.LiveUpdates;
import serenitylabs.tutorials.trains.ui.UpdateType;

import java.util.Collection;
import java.util.List;

import static serenitylabs.tutorials.trains.ui.UpdateType.*;

public class LiveUpdateIncidents {
    public static Question<List<String>> forLineUpdates() {
        return actor -> Text.of(LiveUpdates.messageForUpdatesOfType(LineUpdates)).viewedBy(actor).asList();
    }

    public static Question<List<String>> forGeneralUpdates() {
        return actor -> Text.of(LiveUpdates.messageForUpdatesOfType(GeneralUpdates)).viewedBy(actor).asList();
    }

    public static Question<List<String>> forTrainCancellations() {
        return actor -> Text.of(LiveUpdates.messageForUpdatesOfType(TrainCancellation)).viewedBy(actor).asList();
    }

    public static Question<List<String>> forStationUpdates() {
        return actor -> Text.of(LiveUpdates.messageForUpdatesOfType(StationUpdates)).viewedBy(actor).asList();
    }
}

