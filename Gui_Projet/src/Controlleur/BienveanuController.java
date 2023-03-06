/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;
import Main.Fenetres;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javax.swing.JTextArea;

/**
 * FXML Controller class
 *
 * @author user
 */
public class BienveanuController implements Initializable {


  
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    public void Onclick(ActionEvent event)throws IOException
    {

                    
                    Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
                    Fenetres fn=new Fenetres(stage);
                    fn.ShowEspaceTravail();
                //    fn.ShowAffichage();
                    stage.setScene(fn.getScene());
                    Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
                    stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
                    stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
                    stage.show();
                    
                  //  msj();
                    
        
    }

    
}
