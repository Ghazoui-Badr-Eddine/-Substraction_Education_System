/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.Nombres;
import java.util.Random;

/**
 *
 * @author user
 */
public class Generateur {
   static public int nb_haut,nb_bas;
   static  int nb1,nb2;

    public Generateur(int nb_haut, int nb_bas) {
        this.nb_haut = nb_haut;
        this.nb_bas = nb_bas;
    }
    

    public void setNb_haut(int nb_haut) {
        this.nb_haut = nb_haut;
    }

    public void setNb_bas(int nb_bas) {
        this.nb_bas = nb_bas;
    }

    public int getNb_haut() {
        return nb_haut;
    }

    public int getNb_bas() {
        return nb_bas;
    }
    
    static public  void prob_arb()
    {
       
        do{
            Random r1=new Random();
            Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2= 0 + r2.nextInt(999); 
           // System.out.println("en haut :"+ nb_haut+ " \n en bas :"+nb_bas);
         }while(nb1 < nb2);
        nb_haut=nb1;
        nb_bas=nb2;
        //System.out.println("en haut :"+ nb1+ " \n en bas :"+nb2);
    }
    static public void prob_SE()
    {
       
            Random r1=new Random();
            Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(!(nb11.getU()>nb22.getU() && nb11.getD()>nb22.getD() && nb11.getC() >nb22.getC()))
           {
               prob_SE();
           }
           nb_haut=nb1;
           nb_bas=nb2;
            
        
    }
        static public void prob_1E()
    {
       
           Random r1=new Random();
           Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(nb2 > nb1 )
           {
               prob_1E();
           }
           else
           {
                    //System.out.println("en haut :"+ nb_haut+ " \n en bas :"+nb_bas);
               if((nb11.getU()<nb22.getU() && nb11.getD()>nb22.getD()) || (nb11.getU()>nb22.getU() && nb11.getD()< nb22.getD()))
                        {
                           
                                               nb_haut=nb1;
                                               nb_bas=nb2;
                        }
               else{
                    prob_1E();
               }
                   
           } 
           
     
            
            
        
    }
       static public void prob_2E()
       {
           Random r1=new Random();
           Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(nb2 > nb1 )
           {
               prob_2E();
           }
           else
           {
                    //System.out.println("en haut :"+ nb_haut+ " \n en bas :"+nb_bas);
               if((nb11.getU()<nb22.getU() && nb11.getD()<nb22.getD()) )
                        {
                           
                                               nb_haut=nb1;
                                               nb_bas=nb2;
                        }
               else{
                    prob_2E();
               }
                   
           } 
           
       }
       static public void Prob_1ZH()
       {
           Random r1=new Random();
           Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(nb2 > nb1 )
           {
               Prob_1ZH();
           } 
           else
           {
               if((nb11.getU()==0 && nb11.getD()!=0) ||(nb11.getD()==0 && nb11.getU()!=0))
               {
                                               nb_haut=nb1;
                                               nb_bas=nb2;                  
               }
               else
               {
                   Prob_1ZH();
               }
           }
       }
              static public void Prob_DZH()
       {
           Random r1=new Random();
           Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(nb2 > nb1 )
           {
               Prob_DZH();
           } 
           else
           {
               if((nb11.getC()==0 && nb11.getD()==0 )||(nb11.getU()==0 && nb11.getC()==0) || (nb11.getU()==0 && nb11.getD()==0))
               {
                                               nb_haut=nb1;
                                               nb_bas=nb2;                  
               }
               else
               {
                   Prob_DZH();
               }
           }
       }
              
          static public void Prob_1ZB()
       {
           Random r1=new Random();
           Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(nb2 > nb1 )
           {
               Prob_1ZB();
           } 
           else
           {
               if((nb22.getU()==0 && nb22.getD()!=0 && nb22.getC()!=0)
                       ||
                  (nb22.getU()!=0 && nb22.getD()==0 && nb22.getC()!=0)
                       ||
                  (nb22.getU()!=0 && nb22.getD()!=0 && nb22.getC()==0))
               {
                                               nb_haut=nb1;
                                               nb_bas=nb2;                  
               }
               else
               {
                   Prob_1ZB();
               }
           }
       }
          
          
          
         static public void Prob_DZB()
       {
           Random r1=new Random();
           Random r2=new Random();
           nb1= 0 + r1.nextInt(999);
           nb2=  0 + r2.nextInt(999); 
           Nombres nb11=new Nombres(nb1);
           Nombres nb22=new Nombres(nb2);
           if(nb2 > nb1 )
           {
               Prob_DZB();
           } 
           else
           {
               if((nb22.getC()==0 && nb22.getD()==0 )||(nb22.getU()==0 && nb22.getC()==0) || (nb22.getU()==0 && nb22.getD()==0))
               {
                                               nb_haut=nb1;
                                               nb_bas=nb2;                  
               }
               else
               {
                   Prob_DZB();
               }
           }
       }
    
    
    
    
}
