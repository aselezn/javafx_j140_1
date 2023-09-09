import DataBase.DataBaseManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class AuthenticationApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Аутентификация пользователя");

        VBox vbox = new VBox(10);
        Scene scene = new Scene(vbox, 300, 200);

        Label usernameLabel = new Label("Имя пользователя:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Пароль:");
        PasswordField passwordField = new PasswordField();

        Button authenticateButton = new Button("Войти");

        Text resultText = new Text();

        authenticateButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (DataBaseManager.authenticateUser(username, password)) {
                resultText.setText("Аутентификация успешна!");
            } else {
                resultText.setText("Ошибка аутентификации. Попробуйте снова.");
            }
        });

        vbox.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, authenticateButton, resultText);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

