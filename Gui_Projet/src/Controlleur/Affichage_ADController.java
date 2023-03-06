/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Classes.Alert;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Affichage_ADController implements Initializable {

    Stage stg;
    @FXML TextArea affichage;
    String s[];
    @FXML Button oui;
    @FXML Button non;
    @FXML Label label;
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        affichage.setWrapText(true);
    }  

    public Affichage_ADController(Stage stg ) {
        this.stg = stg;
         try {      
        FXMLLoader loader= new FXMLLoader();
        loader.setController(this);
        loader.setLocation(Main.Racine.class.getResource("/View/Affichage_AD.fxml"));
        Scene scene = new Scene(loader.load());  
        stg.setX(200);
        stg.setY(100);
        stg.getIcons().add(new Image("/Icons/choice.png"));
        stg.setScene(scene);
        stg.setResizable(false);
        stg.show();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void Analyse(String [] s)
    {
         this.s=s;
         stg.setTitle("Analyse");
         affichage.setText(s[0]);       
         System.out.println(s[0]);
         
       oui.setOnAction(new EventHandler<ActionEvent>()
       {
             @Override
             public void handle(ActionEvent event) {
                 Diagnostique();
             }
           
       });
        
        
    }
             public void  Diagnostique()
        {

         stg.setTitle("Diagnostique");
         affichage.setText(s[1]);
         label.setText("vous voulez voir l'aide ?");
                oui.setOnAction(new EventHandler<ActionEvent>()
       {
             @Override
             public void handle(ActionEvent event) {
                  Aide();
             }
           
       });
        
            
           
       
    
        }

            public void Aide()
    {
        
         stg.setTitle("Aide");
         affichage.setText(s[2]);
         hidden();
            
           
    
    
         
        
    }
            public void hidden()
            {
                oui.setVisible(false);
                non.setVisible(false);
                label.setVisible(false);
            }
    
    
    
}
