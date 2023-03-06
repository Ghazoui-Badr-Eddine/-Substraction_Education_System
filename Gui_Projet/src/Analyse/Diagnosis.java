/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyse;
import java.io.*;
import java.nio.Buffer;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Diagnosis {
    //<<<<------------------------------------------------Declaring Attributes-------------------------------------------------->>>>
    private String model;
    public int index;

    public Diagnosis(String model) {
        this.model=model;
    }

    /**
     *
     * @param regle
     * @return string
     */
    /*public String getDiagnosis( int regle ) {
        // chnager chemin des fichier
                File f = new File("/Analyse/Analysis/model"+ this.model);
        File file = new File( f.getAbsolutePath() );
       // File file = new File("C:/Users/user/Documents/NetBeansProjects/Gui_Projet/Diagnosis/model"+this.model); // +this.model
        boolean exist = true ;
        boolean messageFound = true ;

        String message = "" ;
        try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            String line = reader.readLine();

            while ( line != null ){

                if( line.startsWith("Regle "+regle+" debut") && exist ){
                    exist = false ;
                }
                if( !line.startsWith("Regle "+regle+" fin") && exist == false && messageFound ){
                    message += line + "\n";
                }
                if ( line.startsWith("Regle "+regle+" fin") ){
                    messageFound = false;
                    break;
                }


                line = reader.readLine();
            }
            //System.out.println(message);
            reader.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        return message;

    }
*/







}