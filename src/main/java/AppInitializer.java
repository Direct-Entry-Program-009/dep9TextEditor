import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent splshContainer = FXMLLoader.load(this.getClass().getResource("/Splash.fxml"));
        Scene sceneSplash = new Scene(splshContainer);
        sceneSplash.setFill(Color.TRANSPARENT); // set the scene transparent
        //Stage stage = new Stage(StageStyle.TRANSPARENT); // remove top close minimize button
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(sceneSplash);
        primaryStage.centerOnScreen();
        primaryStage.show();



    }
}
