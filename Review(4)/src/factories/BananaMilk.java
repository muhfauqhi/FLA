package factories;

import ingredients.BananaFilling;
import ingredients.IFilling;
import ingredients.ITopping;
import ingredients.MilkTopping;

public class BananaMilk extends BreadFactory{

	@Override
	public ITopping getTopping() {
		return new MilkTopping();
	}

	@Override
	public IFilling getFilling() {
		return new BananaFilling();
	}
	
}
