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
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class MenuManuelController implements Initializable {
    Stage stg;
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public MenuManuelController(Stage stg) {
        this.stg=stg;
        try {      
        FXMLLoader loader= new FXMLLoader();
        loader.setController(this);
        loader.setLocation(Main.Racine.class.getResource("/View/MenuManuel.fxml"));
        Scene scene = new Scene(loader.load());
        this.stg.getIcons().add(new Image("/Images/how.jpg"));
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        this.stg.setX((primScreenBounds.getWidth() - this.stg.getWidth()) / 2);
        this.stg.setY((primScreenBounds.getHeight() - this.stg.getHeight()) / 2);
        this.stg.setTitle("Comment ça marche ");
        this.stg.setResizable(false);
        stg.setScene(scene);
        //this.resoudre();
        stg.show();
      
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void next()
    {
        EspaceManuelController em=new EspaceManuelController(this.stg);
    }
    
    
}
