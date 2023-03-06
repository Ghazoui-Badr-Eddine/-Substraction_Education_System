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
public class ContactUsController implements Initializable {

    
    Stage stg;
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
        public ContactUsController()
    {
        this.stg=new Stage();
        try {      
        FXMLLoader loader= new FXMLLoader();
        loader.setController(this);
        loader.setLocation(Main.Racine.class.getResource("/View/ContactUs.fxml"));
        Scene scene = new Scene(loader.load());
        stg.getIcons().add(new Image("/Images/cn.png"));
        stg.setTitle("Contact us ");
        stg.setScene(scene);
        stg.setResizable(false);
        //this.resoudre();
        stg.show();
      
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void close()
    {
        this.stg.close();
    }
    
}
