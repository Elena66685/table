package com.example.table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    public ObservableList dataUser = FXCollections.observableArrayList();

    @FXML
    private TableColumn<User, String> idcolumn;

    @FXML
    private TableColumn<User, String> logincolumn;

    @FXML
    private TableColumn<User, String> namecolumn;

    @FXML
    private TableColumn<User, String> passcolumn;

    @FXML
    private TableView<User> tableuser;

    @FXML
    private Button knob;

    @FXML
    void initialize()
    {
        initData();

        idcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        logincolumn.setCellValueFactory(new PropertyValueFactory<>("login"));
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("fio"));
        passcolumn.setCellValueFactory(new PropertyValueFactory<>("password"));

        tableuser.setItems(dataUser);

    }

    private void initData()
    {
        dataUser.addAll(new User("1", "Иванов Иван Иванович", "qwew", "ghjk"));
        dataUser.addAll(new User("2", "Демкин Валерий Матвеевич", "vbnm", "ghjkl"));
    }

    public void newWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reg-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)knob.getScene().getWindow();
        stage.setTitle("Введите свои данные!");
        stage.setScene(scene);
        stage.show();
    }

    /*public void setText (String text)
    {
        dataUser.addAll
    }*/

}