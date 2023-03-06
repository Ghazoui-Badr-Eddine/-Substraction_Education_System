/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import Classes.Generateur;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;



public class ChoixTacheController implements Initializable {
    @FXML ComboBox<String> mycom;
    Espace_TravailController espace;

    String choix;
    @FXML RadioButton sys ;
    @FXML RadioButton user;
    Stage stg;

    
    
    
    public ChoixTacheController(Espace_TravailController espace)
    {
        this.espace=espace;
        this.stg=new Stage();
        try {      
        FXMLLoader loader= new FXMLLoader();
        loader.setController(this);
        loader.setLocation(Main.Racine.class.getResource("/View/ChoixTache.fxml"));
        Scene scene = new Scene(loader.load());
        stg.getIcons().add(new Image("/Icons/choice.png"));
               /*     Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
                    stg.setX((primScreenBounds.getWidth() - stg.getWidth()) / 2);
                    stg.setY((primScreenBounds.getHeight() - stg.getHeight()) / 2);*/
        stg.setTitle("choix de la tâche ");
        stg.setScene(scene);
        stg.setResizable(false);
        stg.show();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mycom.getItems().addAll("Probléme arbitaire","Probléme sans emprunt","Probléme avec un seul emprunt",
                "Probléme avec deux emprunts","Probléme avec un zéro en haut","Probléme avec des zéros en haut",
                "Probléme avec un zéro en bas","Probléme avec des zéros en bas");
        
    } 
    public void Choix_Button()
    {
        List<Integer> list=new ArrayList<>();
        
        if(sys.isSelected())
        {
            
          switch(mycom.getValue())
          {
              case "Probléme arbitaire":
                  Generateur.prob_arb();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                  this.stg.close();
                  espace.setAffichage(""); 
                  break;
              case "Probléme sans emprunt":
                  Generateur.prob_SE();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                  this.stg.close();
                   espace.setAffichage(""); ;
                  break;
              case "Probléme avec un seul emprunt":
                  Generateur.prob_1E();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                   espace.setAffichage(""); 
                  this.stg.close();
                  break;
              case "Probléme avec deux emprunts":
                  Generateur.prob_2E();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                   espace.setAffichage(""); 
                  this.stg.close();
                  break;
              case "Probléme avec un zéro en haut":
                  Generateur.Prob_1ZH();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                  espace.setAffichage(""); 
                  this.stg.close();
                  break;
              case "Probléme avec des zéros en haut":
                  Generateur.Prob_DZH();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                  espace.setAffichage(""); 
                  this.stg.close();
                  break;
              case "Probléme avec un zéro en bas":
                  Generateur.Prob_1ZB();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                  espace.setAffichage(""); 
                  this.stg.close();
                  break;
              case "Probléme avec des zéros en bas":
                  Generateur.Prob_DZB();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  espace.setNumber(list);
                  espace.setAffichage(""); 
                  this.stg.close();
                  break;
                                   
                      
          }
        }
        else
        {
            espace.libererCases();
            espace.setAffichage(""); 
            this.stg.close();
        }
        
         
     
    }
    
}
