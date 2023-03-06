/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyse;
import Classes.Nombres;
import java.io.*;

public class Analysis extends Operation {
    //<<<<------------------------------------------------Declaring Attributes-------------------------------------------------->>>>
    private String model ;   
    private String [] messages = new String[3] ;

    //<<<<--------------------------------------------------------method-------------------------------------------------------->>>>
    public Analysis(String model) {
        this.model = model;
    }

    //<<<<--------------------------------------------------------Getter-------------------------------------------------------->>>>    
    public String[] getAnalyse( Nombres result, Nombres nombreHaut , Nombres nombreBas , int emp10, int emp11, int emp20 , int emp21 ){
        String msg = "";
        String[] messages = new String[3];
        if( this.model == "A" ){

            if (emp10 == 0){
                //msg += " vous  n'empruntez pas ";
            }
            // Case 1
            if ( emp20 == result.getD()  ){             
                messages = this.getMessages( 1 );
                System.out.println("message A: "+messages);
            }
            // Case 2
            if ( nombreBas.getD() == result.getD() ){ 
                //msg += this.messages[1];
                messages = this.getMessages( 2 );
                System.out.println("message B: "+messages);
            }

            if (nombreBas.getD()==result.getD() && nombreHaut.getD()==nombreBas.getD()){ // Case 3
                //msg += this.messages[2];
                messages = this.getMessages( 3 );
            }
            // Case 4
            if (result.getD() == ( emp11 - 1 ) - nombreBas.getD()){ 
                //msg += this.messages[3];
                messages = this.getMessages( 4 );
            }
            // Case 5
            if (result.getD() == emp11 - nombreBas.getD()){ 
                //msg += this.messages[4];
                messages = this.getMessages( 5 );
            }
            // Case 6
            if (result.getU() == emp10 - nombreBas.getU()){ 
                //msg += this.messages[5];
                messages = this.getMessages( 6 );
            }
            // cas7
            if (result.getD() == ((emp11-1) - nombreBas.getD()) && result.getC()==(nombreHaut.getC()-1)-nombreBas.getC()) {
                //msg += this.messages[6];
                messages = this.getMessages( 7);
            }
        }

         if( this.model == "B" ){
            System.out.println(" Model B ");
            //case9
            if (nombreBas.getD()==0 && result.getD()==0 && emp21==nombreHaut.getC()-1) {
                System.out.println(" cas 9 ");
                messages = this.getMessages( 9);

            }
            //case10
            if(result.getD() == 1 -nombreBas.getD() && result.getC()==nombreHaut.getC()-nombreBas.getC()){
                messages = this.getMessages( 10);
            }

            //case11
            if(result.getC()==((nombreHaut.getC()-1)-nombreBas.getC())){
                messages = this.getMessages( 11);
            }

            //case12
            if(result.getD()==0 && emp11==10){
                System.out.println(" cas 12");
                messages = this.getMessages( 12);
            }
            //case13

            if(result.getD()==nombreBas.getD() && result.getC()==nombreHaut.getC()-1){
                messages = this.getMessages( 13);
            }
            //case14
            if(result.getC()==nombreHaut.getC()-1 && result.getD()==nombreHaut.getD()){
                messages = this.getMessages( 14);
            }
        }

        if( this.model == "C" ){
            // cas 17 et 19 et 20
            // cas 17
            if(nombreBas.getD() == 0 && nombreBas.getC()== 0 && nombreHaut.getC()!= 0  &&  result.getD() == 0 && result.getC() == 0 ) {
                //msg += this.messgaesModelC[0];
                messages = this.getMessages( 17 );
            }
            // cas 19
            if(result.getC() == nombreHaut.getC()-1 && result.getD() == nombreHaut.getD() -1 ){
                //msg += this.messgaesModelC[1];
                messages = this.getMessages( 19 );
            }
            // cas 20
            if(result.getD() ==nombreHaut.getC() &&  nombreBas.getD() == 0 && nombreBas.getC() == 0){
                //msg += this.messgaesModelC[2];
                messages = this.getMessages(20 );
            }
        }
        if ( this.model == "D"){
            // 26 et 28  et 31 et 34 et 39 et 47
            // traite cas 26 et 28  et 31 et 34 et 39
            // cas 26
            if(result.getU() == nombreBas.getU() - nombreHaut.getU() && nombreHaut.getC()==0){
                //msg += this.messgaesModelD[0];
                messages = this.getMessages( 26 );
            }
            // cas 28
            if(nombreHaut.getD() == nombreBas.getD() && emp21 == nombreHaut.getC() -1){
                //msg += this.messgaesModelD[1];
                messages = this.getMessages( 28 );
            }
            // cas 31
            if(result.getU() == 10 - nombreBas.getU()){
                //msg += this.messgaesModelD[2];
                messages = this.getMessages( 31 );
            }
            // cas 34
            if( emp10 == 10 && emp11 == 10  && emp21 == nombreHaut.getC() - 2){
                //msg += this.messgaesModelD[3];
                messages = this.getMessages( 34 );
            }
            // cas 39
            if( result.getU() == (nombreHaut.getU() - 1) + 10 - nombreBas.getU() && emp11==10){
                messages = this.getMessages( 39 );
            }

            // cas 47
            if(nombreHaut.getD() == 0 && emp20 == 9 && emp11 == 10 && result.getC() == nombreHaut.getC() -nombreBas.getC() ){
                messages = this.getMessages( 47 );
            }

        }
        // 24 et 25 et 55
        if( this.model == "E" ){
            //cas 24
            if( result.getD() == 0 && result.getC() == 0 ){
                messages = this.getMessages( 24 );
            }
            //cas 25
            if( result.getD() == nombreHaut.getC() - nombreBas.getC() && result.getC()==0){
                messages = this.getMessages( 25 );
            }

        }
        // model F
        if( this.model == "F" ){
            // nombreHaut.getD() == 0 && nombreBas.getD != 0 &&

            // cas 45
            if( result.getD() == emp11-(nombreBas.getD()-1) ){
                //
                //msg += this.getMessgaesModelF[0];
                messages = this.getMessages( 45 );
            }

            // cas 49
            if( nombreHaut.getU() < nombreBas.getU() && result.getU() ==  nombreBas.getU() - nombreHaut.getU() && emp21 == nombreHaut.getC() -1 ){
                //msg += this.getMessgaesModelF[1];
                messages = this.getMessages( 49 );
            }

            // cas 51
            if( emp11 == 10 && result.getC() == nombreHaut.getC() - nombreBas.getC()){
                //msg += this.getMessgaesModelF[2];
                messages = this.getMessages( 51 );
            }

            // cas 52
            if ( nombreHaut.getU() < nombreBas.getU() && result.getU() == 0 && emp11==10){
                messages = this.getMessages( 52 );
            }
            // cas 46
            if( emp10 == 10 && emp20 == 10 && result.getD() == 10 - nombreBas.getD() &&  result.getC() == nombreHaut.getC() - nombreBas.getC() ){
                messages = this.getMessages( 46 );
            }
        }

        // Model G
        if(this.model == "G"){
            // nomberHautUn = 0  et emp10 = 0
            // 58 et 59 et 60
            // cas 58
            if( result.getU() == nombreHaut.getU() ){
                //msg += this.getMessgaesModelG[0];
                messages = this.getMessages( 58 );
            }

            // cas 59
            if( result.getU() == nombreBas.getU()){
                //msg += this.getMessgaesModelG[1];
                messages = this.getMessages( 59 );
            }

            // cas 60
            if( result.getU() == 9 ){
                //msg += this.getMessgaesModelG[2];
                messages = this.getMessages( 60 );
            }
        }
        // Model H 73 et 83
        if ( this.model == "H" ){
            //  emp10 = 10 et emp11 = 10

            // cas 63
            if( result.getC() == nombreHaut.getC() - nombreBas.getC() && result.getC()!=0){
                //msg += this.getMessgaesModelH[0];
                messages = this.getMessages( 63 );
            }

            // cas 65
            if( nombreHaut.getU() < nombreBas.getU() && result.getD() == ( nombreHaut.getD() +1 + 10) - nombreBas.getD() ){
                //msg += this.getMessgaesModelH[1];
                messages = this.getMessages( 65 );
            }

            // cas 73
            if( nombreHaut.getD() > nombreBas.getD() && result.getD() == 10 + nombreHaut.getD() -1 - nombreBas.getD() ){
                messages = this.getMessages( 73 );
            }

            // cas 83
            if( nombreHaut.getU() < nombreBas.getU() && nombreHaut.getD() > nombreBas.getD() && result.getD() >10){
                messages = this.getMessages( 83 );
                System.out.println("cas 83");
            }


        }
        // Model I 42
        if( this.model == "I"){

            // resultUn = nomberHautUn or resultCent = nomberHauCent
            // 68 et 69 et 70 et 76
            // cas 68
          /*  if( nombreHaut.getU() == nombreBas.getU() ){
                messages = this.getMessages(68);
            }*/
            // cas 69
            if( emp10 == 10 && result.getD() == nombreHaut.getD() ){
                messages = this.getMessages(69);
            }
            // cas 70
            if( emp10 == 10 && nombreHaut.getD() == 0 && result.getD() == 1){
                messages = this.getMessages(70);

            }
            // cas 76
            if( result.getC()== nombreHaut.getC() && result.getD() == nombreBas.getD() && result.getU() == nombreBas.getU() ){
                messages = this.getMessages(76);
            }

        }


            // Model K48 et 50 et 53 et 45 et 35
        if( this.model == "K" ){
            // cas 48
            if( nombreBas.getD() == 0 && nombreHaut.getD()==0 && result.getD() == 0 && emp20 == 10 && result.getC() == nombreHaut.getC() - nombreBas.getC()){
                messages = this.getMessages(48);
            }
            // cas 50
             if( emp11 == 10 && result.getD() == (emp11 - nombreBas.getD()) && result.getC() == nombreHaut.getC()-1 - nombreBas.getC()){
                messages = this.getMessages(50);
            }
            // cas 53
            if( nombreHaut.getU() < nombreBas.getU() && result.getD() == 0 && result.getC()  == nombreHaut.getC() - 1 - nombreBas.getC()){
                messages = this.getMessages(53);
            }
            // cas 54
            if( result.getD() == nombreBas.getD() && nombreBas.getD()!=0){
                messages = this.getMessages(54);
                System.out.println("cas 54");
            }
            // cas 64
            if( (result.getC() == nombreHaut.getC() - nombreBas.getC()) && nombreHaut.getD()==0 && result.getD()==9-nombreBas.getD()){
                messages = this.getMessages(64);
            }
            // cas 35
            if(nombreHaut.getU() == 0 && result.getU() == 9 - nombreBas.getU() ){
                messages = this.getMessages(35);
            }


        }

        // model L
        if( this.model == "L"){
            //57 et 61
            // cas 57
            if( emp10 == 10 && nombreHaut.getU() == 0){
                messages = this.getMessages(57);
            }

            // cas 61
            if( result.getD() == nombreHaut.getD() - nombreBas.getD()){
                messages = this.getMessages(61);
            }
        }

        // model S  80 et 81
        if( this.model == "S"){
            // cas 80
            if( result.getU() == nombreHaut.getU() + nombreBas.getU() ){
                messages = this.getMessages(80);
                 System.out.println(messages);
            }
            // cas 81
            if(  nombreHaut.getU() + nombreBas.getU() >= 10  ){ // gere cette cas avec les string && result.getU() == nombreHaut.getU() + nombreBas.getU()
                messages = this.getMessages(81);
                System.out.println("cc");
            }
        }
        // model M
        if( this.model == "M"){
            // cas 88
            // nombreHautDix + 1 - nombreBasDix >= 10
            if( result.getD()== ((nombreHaut.getD()+1)-nombreBas.getC()) && result.getC()== (nombreHaut.getC() - nombreBas.getC())){
                messages = this.getMessages(88);
                System.out.println("88");
            }
            // cas 79
            // nombreHautDix > nombreBasDix
            if( nombreHaut.getD() > nombreBas.getD() ){
                messages = this.getMessages(79);
            }
        }

        // model N
        if( this.model == "N") {
            // cas 85
            if( nombreHaut.getU() < nombreBas.getU()   && result.getD()==nombreHaut.getD()+emp11-nombreBas.getD()/*&& result.getU() == nombreHaut.getD() + 10 - nombreBas.getD()*/ ){
                messages = this.getMessages(85);
            }
            // cas 87
            if( emp20 == nombreBas.getD() - 1  || ( nombreHaut.getD() > nombreBas.getD() && emp20 == nombreHaut.getD() - 1 ) ){
                messages = this.getMessages(87);
            }

        }
        // model O 42 et 43
        if( this.model == "O" ){
            // cas 42
            if( result.getU() == nombreBas.getU() && emp11==10 && result.getD()==emp11-nombreBas.getD()){
                messages = this.getMessages(42);

            }
            // cas 43
            if(result.getD()==emp11-nombreBas.getD() && nombreBas.getD() != 0 && result.getD() == 10 -nombreBas.getD() ){
                messages = this.getMessages(43);
            }
        }

        // Model NOT FOUND
        if( this.model == "NOTFOUND"){
            // 67 et 68 et 72 et 30
            // 15 et 16 et 22 et 23 et
            // 56 et 66 et 71 et 74 et 77

            // cas 67
            // nomberHautUnt = 1 et nomberBasUnt > 1 et resultUnt  = 1
            if( nombreHaut.getU() == 1 && nombreBas.getU() > 1 && result.getU() == 1){
                messages = this.getMessages(67);
            }
            // cas 68
            // si nomberHautUn = nomberBasUnt et resultUn = nomberHautUn
            if( nombreHaut.getU() == nombreBas.getU() && result.getU() == nombreHaut.getU()){
                messages = this.getMessages(68);
            }
            // cas 72
            // si nomberHautDix = nomberHautUn et resultDix = 1 et emp10 =10
            if( nombreHaut.getD() == nombreBas.getD() && result.getD() == 1 && emp10 == 10 ){
                messages = this.getMessages(72);
            }
            // cas 30
            //si nomberHautUn = nomberBasUn et resultUnit = 9 et emp11 = 10 et resultDix = nomberHautDix -1 - nomberBasDix
            if( nombreHaut.getU() == nombreBas.getU() && result.getU() == 9  && result.getD() == nombreHaut.getD() -1 -nombreBas.getD()){
                messages = this.getMessages(30);
                System.out.println("Cas:33");
            }
            // cas 15
            // et emp11 = 10 et  nombrehautCent = resultCent
            if( emp11 == 10 && nombreHaut.getC() == result.getC() ){
                messages = this.getMessages(15);
            }
            // cas 16
            //si resultCent = 0 ( vide ) et
            //        nombreBastCent = 0 ( vide ) et nombreHautCent != 0 ( cent )
            if( result.getC() == 0 && nombreBas.getC() == 0 && nombreHaut.getC() != 0){
                messages = this.getMessages(16);
            }

            // cas 22
            //si  emp10 = 10  et emp20 = 0
            //et nomberHautDix > nomberBasDix et emp21 = nombreHaut.cent - 1
            if( emp10 == 10 && emp20 == 0 && nombreHaut.getD() > nombreBas.getD() && emp21 == nombreHaut.getC() -1){
                messages = this.getMessages(22);
                System.out.println("R22");
            }
            // cas 23
            // resultUn = 0  et emp10 + nomberHautUn = nomberBasUn
            // et emp20 = nomberHautDix - emp10
            // et resultDix = emp20 - nomberBasdix
            if( result.getU() == 0 && (emp10 + nombreHaut.getU() == nombreBas.getU() )&& (emp20 == nombreHaut.getD() - emp10) && ( result.getD() == emp20 - nombreBas.getD() )){
                messages = this.getMessages(23);
            }

            // cas 56
            //si nomberHautDix = 0 et ResultDix = nomberBasDix
            //        et nomberHautUn < nomberBasUn et resultUnt = 0
            if (nombreHaut.getD() == 0 && result.getD() == nombreBas.getD() && nombreHaut.getU() < nombreBas.getU() && result.getU() == 0){
                messages = this.getMessages(56);
                System.out.println("cas 56");
            }

            //  66 : NOT FOUND
            //        emp10 = 10 et resultUnt = 10 + nomberHautUn - nomberBasUn (corecte)
            //        et resultDix = nomberHautDix - nomberBasDix (ne decremente pas )
            if( emp10 == 10 && emp21 == 0 && emp20 == 0 && result.getU() == 10 + nombreHaut.getU() - nombreBas.getU() && result.getD() == nombreHaut.getD() - nombreBas.getD()){
                messages = this.getMessages(66);
            }

            // 71 : NOT FOUND
            //        si nomberBasDix = 9 et emp10 = 10 et
            //        resultDix =  nomberHautDix - 1

            if( nombreBas.getD() == 9 && emp10 == 10 && result.getD() == nombreHaut.getD() -1){
                messages = this.getMessages(71);
            }

            // 74 : NOT FOUND
            //        nomberHautUn < nombreBasUn et emp10 = 0 (vide )
            //        et resultUnt = nombreBasUn - nombreHautUn
            if( nombreHaut.getU() < nombreBas.getU() && emp10 == 0 && result.getU() == nombreBas.getU() - nombreHaut.getU())  {
                messages = this.getMessages(74);
            }

            //77 : NOT FOUND
            //        emp10 = 0 et nombreHautUn < nombreBasUn &&
            //        resultUn = 0
            if( emp10 == 0 && nombreHaut.getU() < nombreBas.getU() && result.getU() == 0 && nombreHaut.getC()==0 ){
                messages = this.getMessages(77);
            }
             // cas 78 : ( add ) CAS NOT FOUND
            
            if(( result.getD() == nombreHaut.getD() + nombreBas.getD()-emp20) ){
                messages = this.getMessages(78);
            }

        }



        return messages ;
    }

    // trouvé messages analyse et diagnostique
    private String[] getMessages(int regle){     
        //messages[0] = getMessagesFromFile( regle );
        Errors err = new Errors();
        this.messages[0] = err.messageAnalyse[regle -1];
        this.messages[1] = err.messageDiagnositic[regle -1];
        return messages ;
    }
    
    


   /*private String getMessagesFromFile(int regle){

        // chnager chemin des fichier
        //File f = new File("/Analyse/Analysis/model"+ this.model);
        File file = new File( "../Analyse.Analysis/model"+ this.model );
        String message = "" ;
        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            String line = reader.readLine();
            while ( line != null ){

                if( line.startsWith("Regle "+regle) ){
                    message = line;
                    break;
                }
                line = reader.readLine();

            }
            reader.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        return message;
    }*/


}