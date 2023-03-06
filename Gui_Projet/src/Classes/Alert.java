/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Analyse.Operation;
import Controlleur.Affichage_ADController;
import Controlleur.Espace_TravailController;
import java.util.Optional;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Alert {
    private Espace_TravailController esp;
    private String[] msg;
    private Stage stg2=new Stage();
        public void erreurNombre()
    {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("erreur");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();

        alert.setHeaderText(null);
        alert.setContentText("Faut insérer un seul chiffre");
 
        alert.showAndWait();
    }
        public void  Analyse(Espace_TravailController esp)
        {
            this.esp=esp;
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION);
        alert.setTitle("Analyse");
        alert.setHeaderText(null);
        alert.setContentText("Malheureusement vous avez commis une erreur  :'(   \n vous voulez faire l'analyse ");
        Rectangle2D bounds = Screen.getPrimary().getBounds();
            alert.setX(bounds.getMaxX() - 650);
            alert.setY(bounds.getMaxY() - 300);
        Operation op=new Operation(esp.getN_haut(), esp.getN_ba(), esp.getRes(),esp.getResRel(),esp.getEmp10(),esp.getEmp11() ,esp.getEmp20(),esp.getEmp21());
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK){
            this.msg=op.compareResult();
          //  esp.setAffichage(msg[0]+msg[1]);
            Affichage_ADController af=new Affichage_ADController(this.stg2);
            af.Analyse(msg);
  
        } else {
           
        }
    
        }


    public void erreurSup() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("erreur");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();
        
        //stg.getIcons().add(new Image("/Icons/info.png"));
        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("le nombre de haut doit etre supérieur au nombre du bas ");
 
        alert.showAndWait();
    }
        public void InofInserer() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();
        
        //stg.getIcons().add(new Image("/Icons/info.png"));
        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("Veuillez faire votre opération de soustraction Svp et donner le résultat ");
 
        alert.showAndWait();
    }
            public void erreurSens() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("erreur");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();
        
        //stg.getIcons().add(new Image("/Icons/info.png"));
        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("une case ou deux cases ne sont pas remplis ");
 
        alert.showAndWait();
    }

    public void erreurValidation() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("erreur");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();
        
        //stg.getIcons().add(new Image("/Icons/info.png"));
        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("veuillez saisir votre opération  ");
 
        alert.showAndWait();
    }

    public void erreurRes() {
               javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("erreur");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();
        
        //stg.getIcons().add(new Image("/Icons/info.png"));
        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("veuillez entrer votre résultat  ");
 
        alert.showAndWait();
    }
    public void Sens_Res()
    {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
        alert.setTitle("erreur");
        Stage stg=(Stage) alert.getDialogPane().getScene().getWindow();
        
        //stg.getIcons().add(new Image("/Icons/info.png"));
        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("vous devez respecter le sens du resultat \n"
                + "d abord on commence par les unités puis "
                + "les dizaines et finalement les centaines. \n"
                + "Merci de ressayer   ");
 
        alert.showAndWait();
    }
    
}
