package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import view.components.Sidebar;

public class cadTask extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Sidebar sidebar = new Sidebar();
        BorderPane mainPane = new BorderPane();
        mainPane.setLeft(sidebar);

        TableView<model.Tarefa> tarefas = new TableView<>();
        TableColumn<model.Tarefa, String> nomeTarefa = new TableColumn<>("Nome");
        TableColumn<model.Tarefa, String> descTarefa = new TableColumn<>("Descricao");
        TableColumn<model.Tarefa, Button> abrirTarefa = new TableColumn<>("Clique");

        mainPane.setCenter(tarefas);
        HBox hBox = new HBox(mainPane);
        Scene scene = new Scene(hBox, 350, 350);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Tarefa");

    }

    public static void main(String[] args) {

    }
}
