package Users;

import com.example.demo2.HelloApplication;
import com.example.demo2.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Registration {
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private PasswordField password;

    @FXML
    protected void registrationButtonClick() throws IOException {
        try {
            for (Users user : Login.users) {
                if (user.getName().equals(name.getText()) && user.getPassword().equals(password.getText())) {
                    System.out.println("Пользователь с такими данными уже существует");
                } else
                    Login.users.add(new Users(name.getText(), surname.getText(), password.getText()));
                System.out.println("Регистрация успешна");
                entry();
            }
        } catch (Exception e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }

    public void entry() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Вход");
        stage.setScene(scene);
        stage.show();
    }
}
