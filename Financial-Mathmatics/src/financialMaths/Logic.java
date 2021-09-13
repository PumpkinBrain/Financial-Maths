package financialMaths;

public class Logic {
	Data dat = new Data();
	
//user input method
//try numerical inputs and if mismatch occurs, set the value of corresponding bool to true, representing an unknown number,
//then use scan.next() to clear scan content so it doesn't affect future checks
	protected void input() {
		dat.setType(Scan.nextChar("Do you wish to calculate simple or compound interest? (S , C)"));
		
		try {
			dat.setPv(Scan.nextDouble("Insert Starting value (Pv)"));
		} catch(Exception e) {
			dat.setValPv(true);
			Scan.next();
		}
		
		try {
			dat.setI(Scan.nextDouble("Insert tax in % (I)"));
		} catch(Exception e) {
			dat.setValI(true);
			Scan.next();
		}
		
		dat.setTax(Scan.nextChar("Is the tax in days, months or years? (d, m, y)"));
	
		try {
			dat.setN(Scan.nextDouble("Inset time (N)"));
		} catch(Exception e) {
			dat.setValN(true);
			Scan.next();
		}
		
		dat.setTim(Scan.nextChar("Is the time in days, months or years? (d, m, y)"));
	}
	
//time unit conversion method
//if the time measurement is different from the tax measurement,
//compare tax to time in each case and convert time
	protected void checkTime() {
		dat.setI(dat.getI() / 100); //divide tax by 100 to get the decimal value

		if (dat.getTim() != dat.getTax()) {
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
	
//this method will check if simple or compound interest was required by user
//then check for unknown numbers and apply corresponding formula method
//if there is no unknown numbers, do the standard formula
	protected void unknownCheck() {
		switch(dat.getType()) {
		case 's':
			if(dat.getValPv()) {
				System.out.println(dat.simpleFindPv());
			} else if (dat.getValN()) {
				System.out.println(dat.simpleFindN());
			} else if (dat.getValI()) {
				System.out.println(dat.simpleFindI());
			} else {
				System.out.println(dat.simpleInterest());
			}
		break;
		case 'c':
			System.out.println(dat.compoundInterest());
		break;
		}
	}
}
