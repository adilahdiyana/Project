package Project;

public interface LDiscount {  //2.5 Interface, for discount rate
	
	double discountRate();
}

class WeekendDiscountRate implements LDiscount { //implementation of interface LDiscount
	
	public double discountRate() {
		return 0.10;
	}
	
}	
