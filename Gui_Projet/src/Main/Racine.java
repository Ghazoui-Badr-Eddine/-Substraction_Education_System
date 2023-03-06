/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Racine extends Application {
    
    private Stage primaryStage2;
    private BorderPane rootLayout; 
    private AnchorPane rootLayoutBienvenu;
    private Image icone =new Image("/Icons/presentation.png") ;
   
    public void start(Stage primaryStage) {
        this.primaryStage2=primaryStage;
        this.primaryStage2.setTitle("S.T.I.D.E.S");
         this.primaryStage2.getIcons().add(icone);
         InitRootLayout();

        
    }
    public void InitRootLayout()
    {
        try {
                    FXMLLoader loader= new FXMLLoader();
                    loader.setLocation(Main.Racine.class.getResource("/View/Bienveanu.fxml"));
                    rootLayoutBienvenu=(AnchorPane)loader.load();
                    Scene scene =new Scene(rootLayoutBienvenu);
                    primaryStage2.setScene(scene);
                    primaryStage2.setResizable(false);
                    primaryStage2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }                   

        
    }
 
    public Stage getStage()
    {
        return primaryStage2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] arg) {
        launch(arg);

    }
    
    
    
}
