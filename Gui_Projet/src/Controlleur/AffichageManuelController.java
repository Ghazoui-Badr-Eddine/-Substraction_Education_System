/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AffichageManuelController implements Initializable {

    Stage stg;
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public AffichageManuelController(Stage stg) {
        this.stg = stg;
          try {      
        FXMLLoader loader= new FXMLLoader();
        loader.setController(this);
        loader.setLocation(Main.Racine.class.getResource("/View/AffichageManuel.fxml"));
        Scene scene = new Scene(loader.load());
        this.stg.getIcons().add(new Image("/Images/how.jpg"));
        this.stg.setTitle("Comment ça marche ");
        stg.setScene(scene);
        //this.resoudre();
        stg.show();
      
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void finish()
    {
        this.stg.close();
    }
    
}
