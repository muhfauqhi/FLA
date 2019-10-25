package factories;

import ingredients.IFilling;
import ingredients.ITopping;

public abstract class BreadFactory {
	public abstract ITopping getTopping();
	public abstract IFilling getFilling();
}
