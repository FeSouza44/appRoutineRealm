package view.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Sidebar extends VBox {
    public Button buttonHome = new Button("Home");
    public Button buttonTasks = new Button("Tarefas");
    public Button buttonHistory = new Button("Histórico");
    public Button buttonSettings = new Button("Configuracões");

    String styleButton = "-fx-background-color: transparent;"+"-fx-border-color: transparent;"+"-fx-graphic-text-gap: 10px;";

    public Sidebar(){
        Image homeImg = new Image(getClass().getResourceAsStream("/view/resources/img/homeLogo.png"));
        ImageView homeView = new ImageView(homeImg);
        homeView.setFitWidth(30);
        homeView.setFitHeight(30);
        buttonHome.setGraphic(homeView);

        Image tasksImg = new Image(getClass().getResourceAsStream("/view/resources/img/taskLogo.png"));
        ImageView tasksView = new ImageView(tasksImg);
        tasksView.setFitWidth(30);
        tasksView.setFitHeight(30);
        buttonTasks.setGraphic(tasksView);

        Image historyImg = new Image(getClass().getResourceAsStream("/view/resources/img/historicoLogo.png"));
        ImageView historyView = new ImageView(historyImg);
        historyView.setFitWidth(30);
        historyView.setFitHeight(30);
        buttonHistory.setGraphic(historyView);

        Image settingsImg = new Image("resources/img/opcoesLogo.png");
        ImageView settingsView = new ImageView(settingsImg);
        settingsView.setFitWidth(30);
        settingsView.setFitHeight(30);
        buttonSettings.setGraphic(settingsView);

        buttonHome.setStyle(styleButton);
        buttonTasks.setStyle(styleButton);
        buttonHistory.setStyle(styleButton);
        buttonSettings.setStyle(styleButton);

        buttonHome.setOnMouseEntered(mouseEvent -> buttonHome.setStyle(styleButton.replace("transparent", "#D6C388FF")));
        buttonHome.setOnMouseExited(mouseEvent -> buttonHome.setStyle(styleButton));

        buttonTasks.setOnMouseEntered(mouseEvent -> buttonTasks.setStyle(styleButton.replace("transparent", "#D6C388FF")));
        buttonTasks.setOnMouseExited(mouseEvent -> buttonTasks.setStyle(styleButton));

        buttonSettings.setOnMouseEntered(mouseEvent -> buttonSettings.setStyle(styleButton.replace("transparent", "#D6C388FF")));
        buttonSettings.setOnMouseExited(mouseEvent -> buttonSettings.setStyle(styleButton));

        buttonHistory.setOnMouseEntered(mouseEvent -> buttonHistory.setStyle(styleButton.replace("transparent", "#D6C388FF")));
        buttonHistory.setOnMouseExited(mouseEvent -> buttonHistory.setStyle(styleButton));

        Label titulo = new Label("Routine Realm");
        setStyle("-fx-background-color: transparent;");
        setMargin(titulo, new Insets(0, 0, 20, 0));
        setSpacing(12);
    getChildren().addAll(titulo,buttonHome,buttonTasks,buttonHistory,buttonSettings);

    };




}
