package com.example.tableview;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class addDataController {

    @FXML
    private Button btnAdd;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;
    @FXML
    private AnchorPane anchorPane;



    private HelloController helloController;

    public void setHelloController(HelloController helloController) {
        this.helloController = helloController;
    }

    public void add() throws IOException {
        helloController.addData(Integer.parseInt(txtId.getText()), txtName.getText());
        Stage curStage = (Stage) anchorPane.getScene().getWindow();
        curStage.close();

    }

}
