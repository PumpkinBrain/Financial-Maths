package financialMaths;

public class Data {
	private double pv, fv, i, n; //original values
	private double temPv, temFv, temI, temN, interest; //temporary values so original values aren't lost when executing methods
	private char tax, tim, type;
	private boolean valPv, valI, valN; //bool values will be used to check unknown numbers
	
//formulas section.
//at the start of each formula, the tem variables will be "reset" by getting the values input by the user
//the findN and findI methods will ask for the Fv because it's needed for the formula
//Simple Interest formulas:
	protected double simpleInterest() {
		temPv = pv; temI = i; temN = n;
		temI = 1 + (temI * temN);
		temFv = temPv * temI;
		interest = temFv - temPv;
		System.out.println("-------Simple Interest----------");
		System.out.println("Interest: " + interest);
		System.out.print("Final Value: ");
		return temFv;
	}
	
	protected double simpleFindPv() {
		fv = Scan.nextDouble("What is the final value? (Fv)");
		temFv = fv; temI = i; temN = n;
		temI = (temI * temN) + 1;
		temPv = temFv / temI;
		System.out.println("-----------------");
		System.out.print("Pv value: ");
		return temPv;
	}
	
	protected double simpleFindI() {
		fv = Scan.nextDouble("What is the final value? (Fv)");
		temPv = pv; temFv = fv; temN = n;
		temFv = (temFv / temPv) - 1;
		temI = temFv / temN;
		System.out.println("-----------------");
		System.out.print("I value: ");
		return temI;
	}
	
	protected double simpleFindN() {
		fv = Scan.nextDouble("What is the final value? (Fv)");
		temPv = pv; temFv = fv; temI = i;
		temFv = (temFv / temPv) - 1;
		temN = temFv / temI;
		System.out.println("-----------------");
		System.out.print("N value: ");
		return temN;
	}
	
//Compound Interest formulas:
	protected double compoundInterest() {
		temPv = pv; temI = i; temN = n;
		temI = 1 + temI;
		temI = Math.pow(temI, temN);
		temFv = temPv * temI;
		interest = temFv - temPv;
		System.out.println("--------Compound Interest---------");
		System.out.println("Interest: " + interest);
		System.out.print("Final Value: ");
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
	
	protected void setType(char chara) {
		this.type = chara;
	}
	protected char getType() {
		return type;
	}
	
	protected void setValPv(boolean value) {
		this.valPv = (value);
	}
	protected boolean getValPv() {
		return valPv;
	}
	
	protected void setValN(boolean value) {
		this.valN = (value);
	}
	protected boolean getValN() {
		return valN;
	}
	
	protected void setValI(boolean value) {
		this.valI = (value);
	}
	protected boolean getValI() {
		return valI;
	}
}
