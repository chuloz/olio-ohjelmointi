package com.example.currencyconverter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class CurrencyApp extends Application {

    private CurrencyService currencyService = new CurrencyService();
    private ListView<String> currencyListView = new ListView<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Currency Converter");

        Button addButton = new Button("Add New Currency");
        addButton.setOnAction(e -> showAddCurrencyWindow());

        VBox vbox = new VBox(10, addButton, currencyListView);
        updateCurrencyList();

        Scene scene = new Scene(vbox, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAddCurrencyWindow() {
        Stage newStage = new Stage();
        VBox vbox = new VBox(10);
        TextField codeField = new TextField();
        TextField nameField = new TextField();
        TextField rateField = new TextField();

        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            String code = codeField.getText();
            String name = nameField.getText();
            double rate = Double.parseDouble(rateField.getText());

            Currency newCurrency = new Currency();
            newCurrency.setCode(code);
            newCurrency.setName(name);
            newCurrency.setExchangeRate(rate);

            currencyService.saveCurrency(newCurrency);
            updateCurrencyList();
            newStage.close();
        });

        vbox.getChildren().addAll(new Label("Code:"), codeField, new Label("Name:"), nameField, new Label("Rate:"), rateField, saveButton);
        Scene scene = new Scene(vbox, 200, 300);
        newStage.setScene(scene);
        newStage.showAndWait();
    }

    private void updateCurrencyList() {
        List<Currency> currencies = currencyService.getAllCurrencies();
        currencyListView.getItems().clear();
        for (Currency currency : currencies) {
            currencyListView.getItems().add(currency.getCode() + ": " + currency.getName() + " (" + currency.getExchangeRate() + ")");
        }
    }
}
