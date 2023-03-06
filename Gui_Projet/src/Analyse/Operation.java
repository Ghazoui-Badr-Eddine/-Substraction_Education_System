/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyse;

import Classes.Nombres;

/**
 *
 * @author user
 */

public class Operation {

    //<<<<--------------------------------------------------------Attributes-------------------------------------------------------->>>>
    private Nombres nombreHaut ;
    private Nombres  nombreBas  ;
    private Nombres resultuser;
    private Nombres resultreel;
    private int emp10;
    private int emp11;
    private int emp20;
    private int emp21;

    private boolean found = true;


    //<<<<----------------------------------------------------Default Contractor---------------------------------------------------->>>>
    public Operation(){
    }

    //<<<<--------------------------------------------------------Contractor-------------------------------------------------------->>>>
    public Operation(int nombreHaut , int nombreBas,int resultuser, int resultreel,int emp10,int emp11,int emp20,int emp21){
            this.nombreHaut = new Nombres(nombreHaut) ;
            this.nombreBas = new Nombres(nombreBas) ;
            this.resultuser= new Nombres(resultuser);
            this.resultreel=new Nombres(resultreel);
            this.emp10=emp10;
            this.emp11=emp11;
            this.emp20=emp20;
            this.emp21=emp21;
        }
    //<<<<----------------------------------------------------Getters and Setters--------------------------------------------------->>>>
    public Nombres getnombrebas() {
        return nombreBas;
    }

    public Nombres getnombrehaut() {
        return nombreHaut;
    }

    public Nombres setnombrehaut(Nombres nombreHaut) {
        this.nombreHaut = nombreHaut;
        return this.nombreHaut;
    }

    public Nombres setnombrebas(Nombres nombreBas) {
        this.nombreBas = nombreBas;
        return this.nombreBas;
    }

    public Nombres getresultuser() {
        return resultuser;
    }

    public Nombres getresultreel() {
        return resultreel;
    }

    public Nombres setreultuser(Nombres ruser) {
        this.resultuser=ruser;
        return this.resultuser;
    }

    public Nombres setresultreel(Nombres rreel) {
        this.resultreel=rreel;
        return this.resultreel;
    }
    public int getemp20() {
        return emp20;
    }

    public void setemp20( int emp20) {
        this.emp20 = emp20;
    }

    public int getemp21() {
        return emp21;
    }

    public void setemp21( int emp21) {
        this.emp21 = emp21;
    }

    public int getemp11() {
        return emp11;
    }

    public void setemp11( int emp11) {
        this.emp11 = emp11;
    }

    public int getemp10() {
        return emp10;
    }

    public void setemp10( int emp10) {
        this.emp10 = emp10;
    }

    //<<<<----------------------------------------------------Subtraction Method---------------------------------------------------->>>>
    public int[] substraction(){
        return new int[4];
    }

    public void showingResult(){

    }

    //<<<<----------------------------------------------------Comparing Results------------------------------------------------------>>>>

    public String[] compareResult(){
        String[] messages = new String[3];
          System.out.println("Model H "+resultuser.getU()+" "+ resultuser.getD()+" "+resultuser.getC());

        boolean found  = true ;
        if( resultuser.getC() != resultreel.getC() || resultuser.getU() != resultreel.getU() || resultuser.getD() != resultreel.getD() ){
            //model A
            if ( nombreHaut.getD()== 1 && emp21 == 0 && this.found){                
                    messages = this.showMessages("A" , emp10, emp11 ,emp20, emp21);                  
            }
            // model B
            if( nombreHaut.getD() == 0 && nombreBas.getD() == 0 && this.found ) {
                System.out.println(" B ");
                messages = this.showMessages("B" , emp10, emp11 ,emp20, emp21);
            }
            // model C
            if( nombreBas.getD() == 0 && nombreBas.getC() == 0 && this.found ){ // traite cas 17 et cas 19 et 20
                messages = this.showMessages("C" , emp10, emp11 ,emp20, emp21);
            }
            //logique  model D
            if (nombreHaut.getU() < nombreBas.getU() && emp10 == 10 && this.found ){ // traite cas 26 et 28  et 31 et 34 et 39
                messages = this.showMessages("D" , emp10, emp11 ,emp20, emp21);
            }
            // model F 46
            if( nombreHaut.getD() == 0 && nombreBas.getD() != 0 && this.found ){ // traite cas 49 et 45  et 51 et 52
                messages = this.showMessages("F" , emp10, emp11 ,emp20, emp21);
            }


            // model G
            if( nombreHaut.getU() == 0 && emp10 == 0 && this.found ){ // traite 58 et 59 et 60
                messages = this.showMessages("G" , emp10, emp11 ,emp20, emp21);
            }
            // E 24 et 25 et 55
            // nomberHautDix < nomberBasDix et emp11 = 0
            // model E
            if( nombreHaut.getD() < nombreBas.getD() && emp11 == 0 && this.found){
                messages = this.showMessages("E" , emp10, emp11 ,emp20, emp21);
            }

            // model H modification 65 et 63 et 73 et 83
            if( emp10 == 10 && emp11 == 10 && this.found ){ // traite cas 65 et 63
                messages = this.showMessages("H" , emp10, emp11 ,emp20, emp21);
              
            }
            // model I modification 42
            if( ( resultuser.getU() == nombreHaut.getU() || resultuser.getC() == nombreHaut.getC() )  && this.found){ // traite cas 68 et 69 et 70 et 76
                messages = this.showMessages("I" , emp10, emp11 ,emp20, emp21);
            }

            //
            // model K 48 et 50 et 53 et 45 et 35
            if( emp10 == 10 && nombreHaut.getD() == 0 && this.found){
                messages = this.showMessages("K" , emp10, emp11 ,emp20, emp21);
            }

            //Model L
            //condition ===> emp10 = 10  et nomberHautUnt = 0
            //57 et 61
            if( emp10 == 10 && nombreHaut.getU() == 0 && this.found ){
                messages = this.showMessages("L" , emp10, emp11 ,emp20, emp21);
            }

            // model S 80 et 81
            System.out.println(nombreHaut.getC()+"+"+nombreBas.getC()+"="+resultuser.getC()+"&&"+nombreHaut.getD()+"+"+nombreBas.getD()+"="+resultuser.getD());
            if( nombreHaut.getC() + nombreBas.getC() == resultuser.getC() &&  nombreHaut.getD() + nombreBas.getD() == resultuser.getD()  && this.found ){
                messages = this.showMessages("S" , emp10, emp11 ,emp20, emp21);
                System.out.println("cc");
               
            }
            // model M 88 et 79
            if( emp10 == 10 && resultuser.getD() == nombreHaut.getD() + 1 - nombreBas.getD()  && this.found){
               System.out.println("M");
                messages = this.showMessages("M" , emp10, emp11 ,emp20, emp21);
            }

            // model N 85 et 87
            if( emp10 == 10 && nombreHaut.getD() < nombreBas.getD()&& this.found){
                messages = this.showMessages("N" , emp10, emp11 ,emp20, emp21);
            }
            // model  O 42 et 43
            // nombreHautUn = 0 et nomberHautUn < nomberBasUn
            if( nombreHaut.getU() == 0 && nombreHaut.getU() < nombreBas.getU() && nombreHaut.getD() == 0 && this.found){
                messages = this.showMessages("O" , emp10, emp11 ,emp20, emp21);
            }

            // Model NOT FOUND
            if( this.found ){
                messages = this.showMessages("NOTFOUND" , emp10, emp11 ,emp20, emp21);
            }




        }
           messages[2] =  help() ;
            return messages;
        }
    
    
    public String help(){
            String msg =  "";
            // pour unité
            if ( this.nombreHaut.getU() < this.nombreBas.getU() ){
                if( emp10 == 0 ){
                    msg += "Rgearder la disposition des chifres et utiliser l'emprunt  \n";
                }
                // verfier decrementaion cas nombreHaut.getD() != 0
                if(  emp20 == nombreHaut.getD() - 1  && nombreHaut.getD() != 0){
                    msg += "décrémentant le nombre à  gauche.  \n";
                }
                // verfier decrementaion cas nombreHaut.getD() == 0
                if(  emp20 != 9  && nombreHaut.getD() == 0){
                    msg += "décrémentant le nombre à  gauche , attention au zero qui se change au 9 !!  \n";
                }
            }
            // pour dix
            if( this.nombreHaut.getD() < this.nombreBas.getD() ){
                if( emp11 == 0 ){
                    msg += "Rgearder la disposition des chifres et utiliser l'emprunt  \n";
                }
                // verfier decrementaion cas nombreHaut.getD() != 0
                if(  emp21 == nombreHaut.getC() - 1  && nombreHaut.getC() != 0){
                    msg += "décrémentant le nombre à  gauche.  \n";
                }

            }
            
            return msg ;

        }
    

        private String[]  showMessages(String model ,int  emp10,int  emp11 ,int emp20,int emp21){

            Analysis analyse = new  Analysis(model);
            String[] messages = analyse.getAnalyse(this.resultuser , this.nombreHaut , this.nombreBas, emp10, emp11 ,emp20, emp21);
            if( messages[0] != null && messages[1] != null ){
                this.found = false ;
            }
            return  messages;

        }

}