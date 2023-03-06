/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyse;

/**
 *
 * @author user
 */

public class Number {
	private int U;
	private int D;
	private int C;
	
	Number(int c,int d, int u){
		this.U=u;
		this.D=d;
		this.C=c;
		}
	public int getu() {
		return U;
	}
	public int getd() {
		return D;
	}
	public int getc() {
		return C;
	}
	public int setu(int unite) {
		this.U=unite;
		return U;
	}
    public int setd(int decimale) {
		this.D=decimale;
		return D;
	}
    public int setc(int centaine) {
    	this.C=centaine;
    	return C;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
