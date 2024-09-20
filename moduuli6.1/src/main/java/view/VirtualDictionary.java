// VirtualDictionary.java
package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import controller.DictionaryController;

public class VirtualDictionary extends Application {

    private final DictionaryController controller = new DictionaryController();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Virtual Dictionary");

        Label searchLabel = new Label("Enter a word:");
        TextField wordField = new TextField();
        Button searchButton = new Button("Search");
        Label meaningLabel = new Label();

        searchButton.setOnAction(e -> {
            String word = wordField.getText().trim();
            if (!word.isEmpty()) {
                String meaning = controller.searchWord(word);
                if (meaning != null) {
                    meaningLabel.setText("Meaning: " + meaning);
                } else {
                    meaningLabel.setText("Word not found.");
                }
            } else {
                meaningLabel.setText("Please enter a word.");
            }
        });

        FlowPane root = new FlowPane();
        root.getChildren().addAll(searchLabel, wordField, searchButton, meaningLabel);
        root.setVgap(10);
        root.setHgap(10);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}