/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Classes.Generateur;
import Classes.Nombres;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ResolutionController implements Initializable {

    
    @FXML private TextField C1;
    @FXML private TextField C2;
    @FXML private TextField D1;
    @FXML private TextField D2;
    @FXML private TextField U1;
    @FXML private TextField U2;
    @FXML private TextField RU;
    @FXML private TextField RD;
    @FXML private TextField RC;
    @FXML private TextField EU1;
    @FXML private TextField EU2;
    @FXML private TextField ED1;
    @FXML private TextField ED2;
    @FXML private Label titre;
    Stage stg;
    Espace_TravailController espace;
    List<Integer> list=new ArrayList<>();
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }   
    public ResolutionController(Espace_TravailController espace,String url)
    {
         this.espace=espace;
       this.stg=new Stage();
        try {      
        FXMLLoader loader= new FXMLLoader();
        loader.setController(this);
        loader.setLocation(Main.Racine.class.getResource("/View/Resolution.fxml"));
        Scene scene = new Scene(loader.load());
        stg.setTitle("Résolution ");
        stg.setScene(scene);
        this.stg.getIcons().add(new Image(url));
        stg.setResizable(false);
        stg.show();
      
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void resoudre() {
        int nbrH= espace.getN_haut();
        int nbrB= espace.getN_ba();
        Nombres nbH=new Nombres(nbrH);
        Nombres nbB=new Nombres(nbrB);
        Nombres res=new Nombres(nbrH-nbrB);
        this.U1.setText(""+nbH.getU());
        this.D1.setText(""+nbH.getD());
        this.C1.setText(""+nbH.getC());
        this.U2.setText(""+nbB.getU());
        this.D2.setText(""+nbB.getD());
        this.C2.setText(""+nbB.getC());
        
        this.RU.setText(""+res.getU());
        this.RD.setText(""+res.getD());
        this.RC.setText(""+res.getC());
        
        
                if(nbH.getU()<nbB.getU())
        {
            this.EU1.setText(""+10);
            if(nbH.getD()==0)
                this.EU2.setText(""+1);
            else
            
               this.EU2.setText(""+(nbH.getD()-1));
            
                    if(nbH.getD()-1<nbB.getD())
               {
                   this.ED1.setText(""+10);
                   this.ED2.setText(""+(nbH.getC()-1));
               } 
            

        }
        else
        {
             if(nbH.getD()<nbB.getD())
        {
            this.ED1.setText(""+10);
            this.ED2.setText(""+(nbH.getC()-1));
        }
        }
       //  stg.show();
        
        
    }
    public void ResoudreExemple(Nombres nbH,Nombres nbB)
    {
       
        
        Nombres res=new Nombres(nbH.getValeur()-nbB.getValeur());
        
        this.RU.setText(""+res.getU());
        this.RD.setText(""+res.getD());
        this.RC.setText(""+res.getC());
        
        
               
        if(nbH.getU()<nbB.getU())
        {
            this.EU1.setText(""+10);
            if(nbH.getD()==0)
                this.EU2.setText(""+9);
            else
            this.EU2.setText(""+(nbH.getD()-1));
            
                    if(nbH.getD()-1<nbB.getD())
               {
                   this.ED1.setText(""+10);
                   this.ED2.setText(""+(nbH.getC()-1));
               }
        }
        else
        {
             if(nbH.getD()<nbB.getD())
        {
            this.ED1.setText(""+10);
            this.ED2.setText(""+(nbH.getC()-1));
        }
        }
        
    }
   public void close()
    {
        this.stg.close();
    }
     public void setNumber(List number)
     {
         Nombres nb1=new Nombres((int) number.get(0));
         Nombres nb2=new Nombres((int) number.get(1));
         U1.setText(Integer.toString(nb1.getU()));
         D1.setText(Integer.toString(nb1.getD()));
         C1.setText(Integer.toString(nb1.getC()));
         U2.setText(Integer.toString(nb2.getU()));
         D2.setText(Integer.toString(nb2.getD()));
         C2.setText(Integer.toString(nb2.getC()));
         
         
     }
   
   public void SE()
   {
                  Generateur.prob_SE();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Sans Emprunte");
                  
               //   this.stg.show();
                  
       
   }
   public void S1E()
   {
                   Generateur.prob_1E();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Avec un seul Emprunte");
                  
   }
   public void DZH()
   {
                   Generateur.Prob_DZH();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Avec des zeros en Haut");
                  
   }
   public void S2E()
   {
                  Generateur.prob_2E();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Avec deux empruntes");
                  
   }
   public void S1Z()
   {
                    Generateur.Prob_1ZH();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Avec un seul zero en Haut");
                  
       
   }
   public void DZB()
   {
                  Generateur.Prob_DZB();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Avec  des zeros en Bas");
                  
   }
      public void Z1B()
   {
                    Generateur.Prob_1ZB();
                  list.add(Generateur.nb_haut);
                  list.add(Generateur.nb_bas);
                  this.setNumber(list);
                  Nombres nbH=new Nombres(list.get(0));
                  Nombres nbB=new Nombres(list.get(1));
                  ResoudreExemple(nbH,nbB);
                  this.stg.setTitle("Example");
                  this.titre.setText("Avec un seul zero en Bas");
                  
   }
  
}
