package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;


public class NoteGUI  extends  Application{

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/note.fxml"));
        Parent root = loader.load();
        stage.setTitle("Notebook");
        stage.setScene(new Scene(root));
        stage.show();
    }

}