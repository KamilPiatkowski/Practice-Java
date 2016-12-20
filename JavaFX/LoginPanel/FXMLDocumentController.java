package loginpanel;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXTextField user;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton signup;

    @FXML
    void makeLogin(ActionEvent event) {
        String username = user.getText();
        String password = pass.getText();
        if(username.equals("admin") && password.equals("pass")) {
        System.out.println("Login Successfull.");
        } else {
        System.out.println("Wrong username or password.");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
