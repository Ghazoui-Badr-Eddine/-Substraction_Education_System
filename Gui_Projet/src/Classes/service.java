/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Controlleur.Espace_TravailController;



/**
 *
 * @author user
 */


public class service {
    Espace_TravailController espace;
  

    public service(Espace_TravailController espace) {
        this.espace=espace;
    }
    public service()
    {
        
    }
    
    
   public String  Affichage(int nb_haut,int nb_bas,int Resultat,int Ruser)
    {
       String affichage = "*********************************";
        affichage+="\nNombre en haut : "+nb_haut;
        affichage+="\n        --                  ";
        affichage+="\n Nombre en bas  : "+nb_bas;
        affichage+="\n ----------------------------------";
        affichage+="\n La bonne résultat : "+ Resultat;
        affichage+="\n Votre résultat    : "+ Ruser;
   
        return affichage;
    }

    public void setEspace(Espace_TravailController espace) {
        this.espace=espace;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void seText()
    {
        espace.setAffichage("holaaaa");
    }
    
    
}
