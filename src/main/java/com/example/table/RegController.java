package com.example.table;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegController {


    @FXML
    private Button knobz;

    @FXML
    private TextField login;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private TextField patronymic;

    @FXML
    private TextField surname;

    @FXML
    private TextField id;



    @FXML
     public void onClick() {
        String valuo = name.getText() + patronymic.getText() + surname.getText();
        String id_i = id.getText();
        String log_in = login.getText();
        String password_i = password.getText();
        //dataUser.addAll(new User("1", "Иванов Иван Иванович", "qwew", "ghjk"));
        //tableuser.setItems(dataUser);
    }

}
