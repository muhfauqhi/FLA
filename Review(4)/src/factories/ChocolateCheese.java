package factories;

import ingredients.CheeseTopping;
import ingredients.ChocolateFilling;
import ingredients.IFilling;
import ingredients.ITopping;

public class ChocolateCheese extends BreadFactory{

	@Override
	public ITopping getTopping() {
		return new CheeseTopping();
	}

	@Override
	public IFilling getFilling() {
		return new ChocolateFilling();
	}
	
}
