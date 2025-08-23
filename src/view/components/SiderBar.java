package view.components;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SiderBar extends VBox {
    public Button buttonHome = new Button("Home");
    public Button buttonTasks = new Button("Tarefas");
    public Button buttonHistory = new Button("Histórico");
    public Button buttonSettings = new Button("Configuracões");

    public void sideBar(){
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
    };
}
