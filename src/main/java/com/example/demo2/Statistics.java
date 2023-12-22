package com.example.demo2;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class Statistics {
    @FXML
    TextField textFieldDoxod;
    @FXML
    TextField textFieldRasxod;

    private  double totalDoxod = 0;
    private  double totalRasxod = 0;

    @FXML
    protected void clickButtonAdd() {
        try {
            double doxod = Double.parseDouble(textFieldDoxod.getText());
            totalDoxod += doxod;
            double rasxod = Double.parseDouble(textFieldRasxod.getText());
            totalRasxod += rasxod;
            System.out.println("Доходы: " + totalDoxod);
            System.out.println("Расходы: " + totalRasxod);
        }catch (NumberFormatException e){
            System.out.println("Введите числовое значение");
        }

    }


    }

