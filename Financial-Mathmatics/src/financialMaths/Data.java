package financialMaths;
	
public class Data {
	private double pv, fv, i, n, interest; //original values
	private char tax, tim, type;
	private boolean valPv, valI, valN; //bool values will be used to check for unknown numbers
	
//formulas section.
//at the start of each formula, the tem variables will be "reset" by getting the values input by the user
//the findN and findI methods will ask for the Fv because it's needed for the formula
//Simple Interest formulas:
	protected double simpleInterest() {
		i = 1 + (i * n);
		fv = pv * i;
		interest = fv - pv;
		System.out.println("-------Simple Interest----------");
		System.out.println("Interest: " + interest);
		System.out.print("Final Value: ");
		return fv;
	}
	
	protected double simpleFindPv() {
		fv = Scan.nextDouble("What is the final value? (Fv)");
		i = (i * n) + 1;
		pv = fv / i;
		System.out.println("-----------------");
		System.out.print("Pv value: ");
		return pv;
	}
	
	protected double simpleFindI() {
		fv = Scan.nextDouble("What is the final value? (Fv)");
		fv = (fv / pv) - 1;
		i = fv / n;
		System.out.println("-----------------");
		System.out.print("I value: ");
		return i;
	}
	
	protected double simpleFindN() {
		fv = Scan.nextDouble("What is the final value? (Fv)");
		fv = (fv / pv) - 1;
		n = fv / i;
		System.out.println("-----------------");
		System.out.print("N value: ");
		return n;
	}
	
//Compound Interest formulas:
	protected double compoundInterest() {
		i = 1 + i;
		i = Math.pow(i, n);
		fv = pv * i;
		interest = fv - pv;
		System.out.println("--------Compound Interest---------");
		System.out.println("Interest: " + interest);
		System.out.print("Final Value: ");
		return fv;
	}
	
	protected double compoundFindPv() {
		fv = Scan.nextDouble("what is the final value?");
		i = 1 + i;
		i = Math.pow(i, n);
		pv = fv / i;
		System.out.print("Pv value: ");
		return pv;
	}
	
	protected double compoundFindI() {
		fv = Scan.nextDouble("What is the final value?");
		fv = fv / pv;
		fv = Math.pow(fv, 1 / n);
		i = fv - 1;
		System.out.print("I value: ");
		return i;
	}
	
	protected double compoundFindN() {
		fv = Scan.nextDouble("What is the final value?");
		fv = fv / pv;
		fv = Math.log10(fv);
		i = 1 + i;
		i = Math.log10(i);
		n = fv / i;
		System.out.print("N value: ");
		return n;
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
