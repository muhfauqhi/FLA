package bread;

import ingredients.Filling;
import ingredients.Flavor;
import ingredients.Topping;

public class Bread implements Cloneable{
	private Flavor flavor;
	private Filling filling;
	private Topping topping;
	private String name;
	
	
	public Bread() {
		
	}
	public Bread(Flavor flavor, Filling filling, Topping topping, String name) {
		this.flavor = flavor;
		this.filling = filling;
		this.topping = topping;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Flavor getFlavor() {
		return flavor;
	}
	public Filling getFilling() {
		return filling;
	}
	public Topping getTopping() {
		return topping;
	}
	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}
	public void setFilling(Filling filling) {
		this.filling = filling;
	}
	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
