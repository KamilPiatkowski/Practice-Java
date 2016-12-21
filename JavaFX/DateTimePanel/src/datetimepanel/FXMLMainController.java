package datetimepanel;

import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FXMLMainController implements Initializable {
    

    @FXML
    private JFXDatePicker selectDate;

    @FXML
    private JFXDatePicker selectTime;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
