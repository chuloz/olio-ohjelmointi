package View;

import Controller.CurrencyController;
import Model.CurrencyConverter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class CurrencyView extends Application {
    private Parent xml;
    @Override
    public void start(Stage stage) throws Exception {
        this.xml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Currencyview.fxml")));
        stage.setTitle("Currency Converter");
        stage.setScene(new Scene(this.xml));
        stage.show();

        CurrencyController controller = CurrencyController.getInstance();
        ChoiceBox<String> from = (ChoiceBox<String>) this.xml.lookup("#fromCB");
        ChoiceBox<String> to = (ChoiceBox<String>) this.xml.lookup("#toCB");
        TextField amount = (TextField) this.xml.lookup("#Amount");
        TextField Result = (TextField) this.xml.lookup("#Result");
        Button convert = (Button) this.xml.lookup("#button");

        // Add the currencies to the choice boxes
        for (CurrencyConverter currency : controller.getCurrencies()) {
            from.getItems().add(currency.getName());
            to.getItems().add(currency.getName());
        }


        // Set the default value
        convert.setOnAction(e -> {
            CurrencyConverter fromCurrency = controller.getCurrencies().get(from.getSelectionModel().getSelectedIndex());
            CurrencyConverter toCurrency = controller.getCurrencies().get(to.getSelectionModel().getSelectedIndex());
            double result = controller.convert(fromCurrency, toCurrency, Double.parseDouble(amount.getText()));
            System.out.println(result);
            Result.setText(String.valueOf(result));
        });





    }


}