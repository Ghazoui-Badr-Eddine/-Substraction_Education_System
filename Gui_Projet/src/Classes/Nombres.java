/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author user
 */
public class Nombres {
    int U,D,C;
    public Nombres(Integer n)
    {
           String num=Integer.toString(n);
           int taille=num.length();
           switch(taille)
           {
                case 3:
                        this.C=num.charAt(0)-'0';
                        this.D=num.charAt(1)-'0';
                        this.U=num.charAt(2)-'0';
                        break;
                case 2:
                        this.C=0;
                        this.D=num.charAt(0)-'0';
                        this.U=num.charAt(1)-'0';
                        break;
                case 1:
                        this.C=0;
                        this.D=0;
                        this.U=num.charAt(0)-'0';
//                        break;
                     
           }

           //attention a la langueur
    }
    public Nombres()
    {
        
    }

    public void setU(int U) {
        this.U = U;
    }

    public void setD(int D) {
        this.D = D;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getU() {
        return U;
    }

    public int getD() {
        return D;
    }

    public int getC() {
        return C;
    }
    public int getValeur()
    {
        
        return (U*1)+(D*10)+(C*100);
    }
    public Integer ChangeToInt(String u,String d,String c)
    {
       /* if(u.isEmpty() &&d.isEmpty()&& c.isEmpty() )
            return -1;
        else
        {*/
        Integer num=0;
        
        if(!u.isEmpty())
           num+=Integer.parseInt(u)*1;  
        if(!d.isEmpty())
           num+=Integer.parseInt(d)*10;
        if(!c.isEmpty())
           num+=Integer.parseInt(c)*100;
       // }

        
        return num;
    }
    
}
