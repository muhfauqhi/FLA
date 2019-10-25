package builder;

import bread.Bread;
import ingredients.Filling;
import ingredients.Flavor;
import ingredients.Topping;

public class BreadBuilder {
	private Flavor flavor;
	private Filling filling;
	private Topping topping;
	
	
	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}
	public void setFilling(Filling filling) {
		this.filling = filling;
	}
	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	
	public Bread getResult(){
		Bread bread = new Bread();
		bread.setFlavor(flavor);
		bread.setFilling(filling);
		bread.setTopping(topping);
		
		return bread;
	}
	
}
