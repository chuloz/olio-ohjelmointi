package controller;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;

public class noteController {
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;
    @FXML
    private TextArea displayArea;

    @FXML
    private void initialize() {


    }

    @FXML
    protected void handleAddButtonAction() {
        String title = titleField.getText();
        String content = contentArea.getText();


        if (!title.isEmpty() && !content.isEmpty()) {
            displayArea.appendText("title: " + title + "\n" + "content: " + content + "\n\n");

            titleField.clear();
            contentArea.clear();
        }
    }

}