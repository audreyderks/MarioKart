package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        RaceGamePane raceGamePane = new RaceGamePane();
        Scene scene = new Scene(raceGamePane, 1200, 1200);
        stage.setScene(scene);
        stage.show();
        raceGamePane.requestFocus();
    }
}
