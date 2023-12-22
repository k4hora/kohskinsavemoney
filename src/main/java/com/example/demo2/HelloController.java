package com.example.demo2;

import Users.Users;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField textField;
    @FXML
    private Button entry;
    @FXML
    private Button registration;

    @FXML
    protected void registrationButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Регистрация");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void loginButtonClick() throws IOException {
        String login = textField.getText();
        String password = passwordField.getText();
        try {
            for (Users user: Login.users) {
                    if (user.getName().equals(login) && user.getPassword().equals(password)) {
                        entry();
                        System.out.println("Вход выполнен");
                    }
                }

        }catch (Exception e){
            System.out.println("Ошибка" + e.getMessage());
        }

    }
    public void entry() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pageOne.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Деньгииии");
        stage.setScene(scene);
        stage.show();

    }
}