package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.screenplay.targets.Target;

import java.util.HashMap;

import static serenitylabs.tutorials.trains.ui.UpdateType.*;

public class LiveUpdates {

    public static final Target LINE_UPDATE_BADGE = Target.the("Line updates badge").locatedBy("#line_updatesCount");
    public static final Target GENERAL_UPDATE_BADGE = Target.the("General updates badge").locatedBy("#general_updatesCount");
    public static final Target TRAIN_CANCELLATION_BADGE = Target.the("Train cancellation update badge").locatedBy("#train_cancel_updatesCount");
    public static final Target STATION_UPDATES_BADGE = Target.the("Station updates badge").locatedBy("#station_updatesCount");

    public static HashMap<UpdateType, Target> UPDATE_TOGGLE = new HashMap<>();
    public static HashMap<UpdateType, Target> UPDATE_MESSAGES = new HashMap<>();

    static {
        UPDATE_TOGGLE.put(LineUpdates, Target.the("Line updates button").locatedBy("//span[contains(.,'Line Updates')]"));
        UPDATE_TOGGLE.put(GeneralUpdates, Target.the("General updates button").locatedBy("#general_updates_btn"));
        UPDATE_TOGGLE.put(TrainCancellation, Target.the("Train cancellation updates button").locatedBy("#train_cancel_updates_btn"));
        UPDATE_TOGGLE.put(StationUpdates, Target.the("Station update button").locatedBy("#station_updates_btn"));

        UPDATE_MESSAGES.put(LineUpdates, Target.the("Line updates").locatedBy("#line_updates .incident"));
        UPDATE_MESSAGES.put(GeneralUpdates, Target.the("General updates").locatedBy("#general_updates .incident"));
        UPDATE_MESSAGES.put(TrainCancellation, Target.the("train Cancellation updates").locatedBy("#train_cancel_updates .incident"));
        UPDATE_MESSAGES.put(StationUpdates, Target.the("Station updates").locatedBy("#station_updates .incident"));

    }

    public static Target toggleForUpdatesOfType(UpdateType updateType) {
        return UPDATE_TOGGLE.get(updateType);
    }

    public static Target messageForUpdatesOfType(UpdateType updateType) {
        return UPDATE_MESSAGES.get(updateType);
    }
}
