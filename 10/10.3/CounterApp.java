import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CounterApp extends Application {

    private int count = 0;

    @Override
    public void start(Stage primaryStage) {

        Label countLabel = new Label("Count:");

        TextField countField = new TextField(Integer.toString(count));
        countField.setEditable(false);

        Button countButton = new Button("Count");
        countButton.setOnAction(e -> {
            count++;
            countField.setText(Integer.toString(count));
        });

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(countLabel, 0, 0);
        gridPane.add(countField, 1, 0);
        gridPane.add(countButton, 2, 0);

        Scene scene = new Scene(gridPane, 280, 50);

        primaryStage.setTitle("JavaFX Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
