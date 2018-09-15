package nine_exer;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);
	// write your code here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //создание подписи - email
        Text text1 = new Text("Email");

        //создание подписи - пароль
        Text text2 = new Text("Password");

        //Создание текстового поля - email
        TextField textField1 = new TextField();
        //создание поля для пароля - пароль
        PasswordField textField2 = new PasswordField();

        //Создание кнопок отправить и очистить
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        //Создание панели - Grid Pane
        GridPane gridPane = new GridPane();

        //Настраивание размера панели
        gridPane.setMinSize(400,200);
        gridPane.setPadding(new Insets(10,10,10,10));

        //Настройка вертикальных и горизонтальных отступов
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        // Настройка расположения grid панели
        gridPane.setAlignment(Pos.CENTER);

        //Расположение всех узлов на решетке панели
        gridPane.add(text1,0,0);
        gridPane.add(textField1,1,0);
        gridPane.add(text2,0,1);
        gridPane.add(textField2,1,1);
        gridPane.add(button1,0,2);
        gridPane.add(button2, 1,2);

        //стилизация узлов
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //создание объекта сцены
        Scene scene = new Scene(gridPane);

        primaryStage.setTitle("CSS Example");

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
