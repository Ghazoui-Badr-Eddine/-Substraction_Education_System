/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;




import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Fenetres {
       private BorderPane rootLayout;
       private Scene scene;
       private Stage stage;
       
       public Fenetres(Stage stage)
       {
           this.stage=stage;
           //this.ShowMenu();
           //MainController mainController = new MainController();
       }
       public Stage getStage()
       {
           return stage;
           
       }
       public Scene getScene()
       {
           return scene;
       }
       public BorderPane getRootLayout()
       {
           return rootLayout;
       }
       public void setStage(Stage stage)
       {
           this.stage=stage;
       }
       public void setScene()
       {
           this.scene=scene;
       }
       public void setRootLayout()
       {
           this.rootLayout=rootLayout;
       }
        
        
        
        
        
        
        
        
         public void ShowMenu()
    {
        try {
                    FXMLLoader loader= new FXMLLoader();
                    loader.setLocation(Main.Racine.class.getResource("/View/Menu.fxml"));
                    
                    rootLayout=(BorderPane)loader.load();
                    this.scene =new Scene(rootLayout);
                    

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void ShowEspaceTravail()
    {
        try {
                FXMLLoader loader=new FXMLLoader();
                loader.setLocation(Main.Racine.class.getResource("/View/Espace_Travail.fxml"));
              
                AnchorPane EspTravPane=(AnchorPane) loader.load();
                 this.scene =new Scene(EspTravPane);
               
               // rootLayout (EspTravPane);
              //  rootLayout.getCenter()
                
                
            } catch (Exception e) {
              e.printStackTrace();
        }
        
    }
   /*     public void ShowAffichage()
    {
        try {
                FXMLLoader loader=new FXMLLoader();
                loader.setLocation(Main.Racine.class.getResource("/View/Affichage.fxml"));
                AnchorPane AffichagePane=(AnchorPane) loader.load();
                rootLayout.setRight(AffichagePane);
        } catch (Exception e) {
              e.printStackTrace();
        }
        
    }
    */

}


