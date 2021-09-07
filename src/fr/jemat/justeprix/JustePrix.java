package fr.jemat.justeprix;

public class JustePrix {
	
	private int prix, min , max ;
	
	
	public JustePrix(int prix, int min, int max) {
	this.prix = prix;
	this.min = min;
	this.max = max;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}
	

}
