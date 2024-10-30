package com.example.tableview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TableView<categoryDetails> tableView;
    @FXML
    private TableColumn<categoryDetails, String> cate_name;
    @FXML
    private TableColumn<categoryDetails, Integer> cate_id;
    @FXML
    private Button btnReload;

    @Override
    public void initialize(URL url, ResourceBundle rs) {
        cate_id.setCellValueFactory(new PropertyValueFactory<>("cate_id"));
        cate_name.setCellValueFactory(new PropertyValueFactory<>("cate_name"));
        tableView.setItems(categoryData());
    }

        private ObservableList<categoryDetails> categoryData(){
        return FXCollections.observableArrayList(
                new categoryDetails(1, "Men")
        );
    }

    public void addData(Integer id, String name){
        tableView.getItems().add(new categoryDetails(id, name));
    }

    public void movetoAdd() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("addData.fxml"));
        Parent root = loader.load();

        addDataController addDataController = loader.getController();
        addDataController.setHelloController(this);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();

    }

}
