package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

    public class cadUsuario extends Application {

        @Override
        public void start(Stage primaryStage) {

            //Inicializando a foto da Logo da Aplicação
            Image logoRR = new Image(getClass().getResourceAsStream("/view/resources/img/logoRR.jpg"));
            ImageView logo = new ImageView(logoRR);
            logo.setFitHeight(150);
            logo.setFitWidth(150);

            // Criando o layout GridPane
            GridPane gridPane = new GridPane();
            gridPane.setAlignment(Pos.CENTER_LEFT);
            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setPadding(new Insets(25, 25, 25, 25));

            // Criando os componentes da interface
            Label nameLabel = new Label("Nome:");
            TextField nameField = new TextField();

            Label emailLabel = new Label("Email:");
            TextField emailField = new TextField();

            Label passwordLabel = new Label("Senha:");
            PasswordField passwordField = new PasswordField();

            //Criando e estilizando o botão de login
            Button loginButton = new Button("Login");
            loginButton.setCursor(Cursor.HAND);
            String styleButton = "-fx-background-color: transparent;"+"-fx-border-color: transparent;"+"-fx-graphic-text-gap: 10px;";
            loginButton.setStyle(styleButton);
            loginButton.setOnMouseEntered(mouseEvent -> loginButton.setStyle(styleButton.replace("transparent", "#D6C388FF")));
            loginButton.setOnMouseExited(mouseEvent -> loginButton.setStyle(styleButton));

            // Adicionando os componentes ao GridPane
            gridPane.add(nameLabel, 0, 0);
            gridPane.add(nameField, 1, 0);
            gridPane.add(emailLabel, 0, 1);
            gridPane.add(emailField, 1, 1);
            gridPane.add(passwordLabel, 0, 2);
            gridPane.add(passwordField, 1, 2);

            VBox vBox = new VBox(gridPane, loginButton);
            vBox.setAlignment(Pos.CENTER);
            loginButton.setAlignment(Pos.CENTER);

            HBox hBox = new HBox(vBox, logo);
            hBox.setAlignment(Pos.CENTER);
            hBox.setSpacing(45);

            // Configurando a cena
            Scene scene = new Scene(hBox, 700, 450);
            primaryStage.setTitle("Tela de Login");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
