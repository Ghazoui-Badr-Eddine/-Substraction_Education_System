/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Classes.Alert;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import Classes.Nombres;
import Classes.service;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author user
 */
public class Espace_TravailController implements Initializable {

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
    @FXML private Button val;
    @FXML private TextArea affichage;
    @FXML private MenuItem RsMenuItem;
    service service;
    Alert alert=new Alert();

 

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        service =new service();
        Verfier();
      //  ResMenuItem();
       

     
        
    } 
    

    // y a une faute de frappe dans le nom de méthode Vérifier au lieu de l'écrire vérifier j'ai écrit verfier à cause de la flemme j l'ai pas changé


    
    
    
    
    
    
    //methode pour vider toutes les cases 
     public void vider ()
     {
         U1.setText("");
         U2.setText("");
         D1.setText("");
         D2.setText("");
         C1.setText("");
         C2.setText("");
         RU.setText("");
         RD.setText("");
         RC.setText("");
         EU1.setText("");
         EU2.setText("");
         ED1.setText("");
         ED2.setText("");
         

         
     }
     //méthode pour rendre les cases de Resultat et celles des empruntes  modifiable
     public void liberer()
     {
         RU.setEditable(true);
         RD.setEditable(true);
         RC.setEditable(true);
         EU1.setEditable(true);
         EU2.setEditable(true);
         ED1.setEditable(true);
         ED2.setEditable(true);
         val.setDisable(false);
     }
     //méthode pour rendre les cases des opérations modifiable
     public void libererCases()
     {
                  U1.setEditable(true);
                  U2.setEditable(true);
                  D1.setEditable(true);
                  D2.setEditable(true);
                  C1.setEditable(true);
                  C2.setEditable(true);
     }
     //méthode pour le button Nv Probléme pour qu'il puisse choisir le mode
     public void Commencer()
    {

        vider();
        liberer();
        ChoixTacheController choix =new ChoixTacheController(this);
        
        
    }
     //méthode pour remplir les cases (lorsque il s'agit d'un prob génerer par le systéme)
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
     //méthode pour ajouter un text dans  l'affichage 
     public void setAffichage(String text)
     {
         affichage.setText("");
         affichage.appendText(text);
     }
     //méthode lie à ttes les cases afin de les vérifier 
    public void Verfier()
    {
       
        Verfier2(U1);Verfier2(D1);Verfier2(C1);
        Verfier2(U2); Verfier2(D2);Verfier2(C2);
        Verfier2Res(RU);Verfier2Res(RD);Verfier2Res(RC);
        Verfier2Res(EU1);Verfier2Res(ED1);Verfier2Res(EU2);  Verfier2Res(ED2);
        VerfierSens();
        verifierSensRes();
  
       
        
    }

    //méthode pour verifier si le nombre en bas est sup de celui qu est en haut
    public void verfierSup()
    {
        if(getN_ba()>getN_haut())
            alert.erreurSup();
        
        verfierSens();
  
    }
    //méthode pour verifier c'est l'utilisateur a bien entré les chiffres de le sens adéquat 
    public void verfierSens()
    {
        boolean testU1=U1.getText().equals("") && (!D1.getText().equals("") || !C1.getText().equals(""));
        boolean testD1=D1.getText().equals("") && (!C1.getText().equals("") && !U1.getText().equals(""));
        boolean testU2=U2.getText().equals("") && (!D2.getText().equals("") || !C2.getText().equals(""));
        boolean testU22=U2.getText().equals("") && (D2.getText().equals("") && C2.getText().equals(""));
        boolean testD2=D2.getText().equals("") && (!C2.getText().equals("") && !U2.getText().equals(""));

        
        if(testU1 || testU2 || testD1 || testD2||testU22)
        {
            alert.erreurSens();
        }


  
    }
    //Verfier le sens 
    public void verifierSensRes()
    {
        boolean testRU=RU.getText().equals("") && (!RC.getText().equals("") || !RD.getText().equals(""));
        boolean testRD=RD.getText().equals("") && (!RC.getText().equals("") || !RU.getText().equals(""));
        RD.textProperty().addListener(new ChangeListener<String>() 
                {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if ( (!newValue.isEmpty() ) && (RU.getText().equals("")) ) 
                                {
                                     RD.setText("");
                                     alert.Sens_Res();
				} 
                                 
                                
			}

           
		});
         RC.textProperty().addListener(new ChangeListener<String>() 
                {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if ( (!newValue.isEmpty() ) &&(    (RD.getText().equals("")) || (RU.getText().equals(""))  ) ) 
                                {
                                     RC.setText("");
                                     alert.Sens_Res();
				}
                                 
                                
			}

           
		});
        
   
        
        
        
    
    }
    //méthode qui s'occupe de verifier les validation des cases (autremment il doit entrer un seul chiffre )
    public void Verfier2(TextField t)
    {
       
        t.textProperty().addListener(new ChangeListener<String>() 
                {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if ( !newValue.isEmpty()   && !newValue.matches("[0-9]")) 
                                {
                                    t.setText("");
                                     alert.erreurNombre();

				} 
                                
			}

           
		});
        
   
    }
    
    //verifier les cases de résultat 
        public void Verfier2Res(TextField t)
    {
       
        t.textProperty().addListener(new ChangeListener<String>() 
                {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if ( !newValue.isEmpty()   && !newValue.matches("([1-9][0-9])|([0-9])")) 
                                {
                                    t.setText("");
                                     alert.erreurNombre();

				} 
                                
			}

           
		});
        
   
    }
        //verfie chaque case du nombre bas est inf au nombre haut afin d'avoir un nombre bas < nombre haut et un
        //controle instantane 
       public void VerfierSens()
    {
       
              C2.textProperty().addListener(new ChangeListener<String>() 
                {
                    

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                             int nv=newValue.equals("")?-1:Integer.parseInt(newValue);
                             int c1=C1.getText().equals("")?-1:Integer.parseInt(C1.getText());
                             
				
                            if ( nv >c1  ) 
                             
                                {
                                     C2.setText("");
                                     alert.erreurSup();
                                     
				} 
                                 
                                
                }
         

           
		});
        
                D2.textProperty().addListener(new ChangeListener<String>() 
                {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                            int c1=C1.getText().equals("")?-1:Integer.parseInt(C1.getText());
                            int c2=C2.getText().equals("")?-1:Integer.parseInt(C2.getText());
                            int nv=newValue.equals("")?-1:Integer.parseInt(newValue);
                            int d1=D1.getText().equals("")?-1:Integer.parseInt(D1.getText());
                                
				if ( 
                                        (( C1.getText().equals("")) || (c1<=c2) ) 
                                        &&
                                        (nv > d1)  
                                    ) 
                                {
                                     D2.setText("");
                                     alert.erreurSup();
                      
				} 
                                 
                                
                }
            
         

           
		});
                
   
                U2.textProperty().addListener(new ChangeListener<String>() 
                {

			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                            int c1=C1.getText().equals("")?-1:Integer.parseInt(C1.getText());
                            int c2=C2.getText().equals("")?-1:Integer.parseInt(C2.getText());
                            int nv=newValue.equals("")?-1:Integer.parseInt(newValue);
                            int u1=U1.getText().equals("")?-1:Integer.parseInt(U1.getText());
                            int d1=D1.getText().equals("")?-1:Integer.parseInt(D1.getText());
                            int d2=D2.getText().equals("")?-1:Integer.parseInt(D2.getText());
                                
				if ( 
                                        ( (!C2.getText().equals("")) || (!D2.getText().equals("")) ) 
                                        &&
                                        (c1==c2 && d1==d2)
                                        &&
                                        (nv > u1)  
                                    ) 
                                {
                                     U2.setText("");
                                     alert.erreurSup();
                      
				} 
                                 
                                
                }
            
         

           
		});
        
        
        
        
   
    }
    
    
    
    //méthode lié à la button valider  qui s'occupe de vérifier le résultat 
    public void Résolution()
    {
       
        Alert alert=new Alert();
       
        
        
       int nombre_haut =getN_haut();
       int nombre_bas=getN_ba();
       int resultat =getRes();
       int res=getResRel();
     
       

                    if(resultat==-1 && nombre_bas==-1 && nombre_bas==-1)
                    {
                       alert.erreurValidation();
                    }
                    else
                    {
                              if(resultat==-1 &&( nombre_bas!=-1 && nombre_haut!=-1))
                                    alert.erreurRes();
                              else
                                 if(res==resultat)
                                 {
                                     affichage.setText("");
                                     
                                     setAffichage("**********************************************************************\n"
                                                + "         **************************************************          \n"                                                   
                                                + "           Félicitation Mon petit vous avez bien répondu\n"
                                                + "         **************************************************          \n"
                                                + "***********************************************************************\n");
                                     
                                 }
                                 else
                                 {
                                     affichage.setText("");
                                     setAffichage(service.Affichage(nombre_haut, nombre_bas, res,resultat));
                                     alert.Analyse(this);
                      
                                 }

                    }

        
        
    }

    //case pas vide
    public boolean rs()
    {
        if(getN_haut() !=-1 && getN_ba()!=-1)
            return true;
        else
            return false;
    }
    //méthode pour récuperer le nombre en haut 
    public int getN_haut()
    {
        Nombres nb=new Nombres();
        if(U1.getText().equals("") && D1.getText().equals("")&& C1.getText().equals("") )
            return -1;
        else
        return nb.ChangeToInt(U1.getText(),D1.getText() , C1.getText());
    }
      //méthode pour récuperer le nombre en bas
        public int getN_ba()
    {
        Nombres nb=new Nombres();
        if(U2.getText().equals("") &&D2.getText().equals("")&& C2.getText().equals("") )
            return -1;
        else
        return nb.ChangeToInt(U2.getText(),D2.getText() , C2.getText());
    }
      //  //méthode pour récuperer le nombre du résultat
        public int getRes()
    {
        Nombres nb=new Nombres();
        if(RU.getText().equals("") &&RD.getText().equals("")&& RC.getText().equals("") )
            return -1;
        else
        return nb.ChangeToInt(RU.getText(),RD.getText() , RC.getText());
    }
     public int getResRel()
     {
         return getN_haut()-getN_ba();
     }
     
     
     //geeter&setter
    public int getEmp10()
    {
        if(EU1.getText().equals(""))
            return 0;
       return Integer.parseInt(EU1.getText()); 
    }
        public int getEmp11()
    {
         if(ED1.getText().equals(""))
            return 0;
       return Integer.parseInt(ED1.getText()); 
    }
        public int getEmp20()
    {
       if(EU2.getText().equals(""))
            return 0;
       return Integer.parseInt(EU2.getText()); 
    }
       public int getEmp21()
    {
       if(ED2.getText().equals(""))
            return 0;
       return Integer.parseInt(ED2.getText()); 
    }

    public TextField getC1() {
        return C1;
    }

    public void setC1(TextField C1) {
        this.C1 = C1;
    }

    public TextField getC2() {
        return C2;
    }

    public void setC2(TextField C2) {
        this.C2 = C2;
    }

    public TextField getD1() {
        return D1;
    }

    public void setD1(TextField D1) {
        this.D1 = D1;
    }

    public TextField getD2() {
        return D2;
    }

    public void setD2(TextField D2) {
        this.D2 = D2;
    }

    public TextField getU1() {
        return U1;
    }

    public void setU1(TextField U1) {
        this.U1 = U1;
    }

    public TextField getU2() {
        return U2;
    }

    public void setU2(TextField U2) {
        this.U2 = U2;
    }

    public TextField getRU() {
        return RU;
    }

    public void setRU(TextField RU) {
        this.RU = RU;
    }

    public TextField getRD() {
        return RD;
    }

    public void setRD(TextField RD) {
        this.RD = RD;
    }

    public TextField getRC() {
        return RC;
    }

    public void setRC(TextField RC) {
        this.RC = RC;
    }

    public TextField getEU1() {
        return EU1;
    }

    public void setEU1(TextField EU1) {
        this.EU1 = EU1;
    }

    public TextField getEU2() {
        return EU2;
    }

    public void setEU2(TextField EU2) {
        this.EU2 = EU2;
    }

    public TextField getED1() {
        return ED1;
    }

    public void setED1(TextField ED1) {
        this.ED1 = ED1;
    }

    public TextField getED2() {
        return ED2;
    }

    public void setED2(TextField ED2) {
        this.ED2 = ED2;
    }
    // ************************MENU*************************************
    //MenuItem résoudre afin de voir la solution du probléme courant 
    public void Resoudre()
{
    if(rs())
    {
      ResolutionController rs=new ResolutionController(this,"/Images/res.jpg"); 
      rs.resoudre();
    }
    else
        alert.erreurValidation();
    
    
}
    //voir les exemples 
    // sans emprunte
    public void SE()
    {
    ResolutionController rs=new ResolutionController(this,"/Images/example.png");
      rs.SE();
    }
    // des zeros en haut
    public void DZH()
    {
    ResolutionController rs=new ResolutionController(this,"/Images/example.png");
          rs.DZH();
    }
    //avec 1 seul emprunte 
    public void S1E()
    {
    ResolutionController rs=new ResolutionController(this,"/Images/example.png");
          rs.S1E();
    }
    // avec 2 empruntes
        public void S2E()
    {
    ResolutionController rs=new ResolutionController(this,"/Images/example.png");
          rs.S2E();
    }
        // avec un seul zero
         public void S1Z()
         {
   ResolutionController rs=new ResolutionController(this,"/Images/example.png");
           rs.S1Z() ;
         }
         //avec des zeros en bas 
         public void DZB()
         {
   ResolutionController rs=new ResolutionController(this,"/Images/example.png");
           rs.DZB();  
         }
         // avec un seul zeros en bas 
       
         public void Z1B()
         {
   ResolutionController rs=new ResolutionController(this,"/Images/example.png");
           rs.Z1B();           
         }
         //exit
         public void close()
         {

             Platform.exit();
            
         }
         //MenuItem AboutUs
         public void about()
         {
             AboutUsController ab=new AboutUsController();
         }
         //MenuItem ContactUs
         public void contact()
         {
             ContactUsController ct=new ContactUsController();
         }
         //consulter Manuel 
         public void how()
         {
             ManuelMenuController mn=new ManuelMenuController();
         }
         
}
