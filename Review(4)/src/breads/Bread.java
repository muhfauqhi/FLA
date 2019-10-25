package breads;

import ingredients.Filling;
import ingredients.Topping;

public class Bread {
	private Topping topping;
	private String name;
	private Filling filling = null;
	public Bread(Topping topping, Filling filling) {
		this.filling = filling;
		this.topping = topping;
	}
	public Topping getTopping() {
		return topping;
	}
	public Filling getFilling() {
		return filling;
	}
	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	public void setFilling(Filling filling) {
		this.filling = filling;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
