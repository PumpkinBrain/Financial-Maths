package financialMaths;

public class Logic {
	Data dat = new Data();
	
	protected void input() {
		dat.setPv(Scan.nextDouble("Insert Starting value"));
		dat.setI(Scan.nextDouble("Insert tax in %"));
		dat.setTax(Scan.nextChar("Is the tax in days, months or years? (d, m, y)"));
		dat.setN(Scan.nextDouble("Inset time"));
		dat.setTim(Scan.nextChar("Is the time in days, months or years? (d, m, y)"));
	}
	
//if the time measurement is different from the tax measurement, make the time equal to the tax
	protected void checkTime() {
		dat.setI(dat.getI() / 100); //divide tax by 100 to get the decimal value
		
		if (dat.getTax() != dat.getTim()) {
			switch (dat.getTax()) {
			case 'd':
				if (dat.getTim() == 'm') {
					dat.setN(dat.getN() / 30);
				} else {
					dat.setN(dat.getN() / 360);
				}
			break;
			case 'm':
				if (dat.getTim() == 'd') {
					dat.setN(dat.getN() / 30);
				} else {
					dat.setN(dat.getN() * 12);
				}
			break;
			case 'y':
				if (dat.getTim() == 'd') {
					dat.setN(dat.getN() / 360);
				} else {
					dat.setN(dat.getN() / 12);
				}
			}
		}
	}
	
	protected void showResults() {
		System.out.println("-------------------------------");
		System.out.println("        -Simple Interest-");
		System.out.println(dat.simpleInterest());
		System.out.println("-------------------------------");
		System.out.println("        -Compund Interest-");
		System.out.println(dat.compoundInterest());
	}
}
