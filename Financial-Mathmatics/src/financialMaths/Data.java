package financialMaths;

public class Data {
	private double pv, fv, i, n;
	private double temPv, temFv, temI, temN, interest; //temporary values so program doesn't lose the original when executing methods
	private char tax, tim;
	
//formulas.
//at the start of each formula, the tem variables will be "reset" by getting the values input by the user
	protected double simpleInterest() {
		temPv = pv; temI = i; temN = n;
		temI = 1 + (temI * temN);
		temFv = temPv * temI;
		interest = temFv - temPv;
		System.out.println("Interest: " + interest);
		return temFv;
	}
	
	protected double compoundInterest() {
		temPv = pv; temI = i; temN = n;
		temI = 1 + temI;
		temI = Math.pow(temI, temN);
		temFv = temPv * temI;
		interest = temFv - temPv;
		System.out.println("Interest: " + interest);
		return temFv;
	}
	
//getters and setters
	protected void setPv(double num) {
		this.pv = num;
	}
	protected double getPv() {
		return pv;
	}
	
	protected void setFv(double num) {
		this.fv = num;
	}
	protected double getFv() {
		return fv;
	}
	
	protected void setI(double num) {
		this.i = num;
	}
	protected double getI() {
		return i;
	}
	
	protected void setN(double num) {
		this.n = num;
	}
	protected double getN() {
		return n;
	}
	
	protected void setTax(char chara) {
		this.tax = chara;
	}
	protected char getTax() {
		return tax;
	}
	
	protected void setTim(char chara) {
		this.tim = chara;
	}
	protected char getTim() {
		return tim;
	}
}
