package factories;

import breads.BananaBread;
import breads.Bread;
import breads.ChocolateBread;
import breads.StrawberryBread;
import storages.Storage;

public class BreadFactory {
	public Bread createBread(String type){
		Bread bread = null;
		Storage storage = Storage.getInstance();
		
		if(type.equals("Chocolate")){
			if(storage.getCurrChocolate() < 1){
				
			}
			else{
				bread = new ChocolateBread();
				storage.useChocolate();
				storage.getChocolateBread().add(bread);
			}
		}
		else if(type.equals("Strawberry")){
			if(storage.getCurrStrawberry() < 1){
				
			}
			else{
				bread = new StrawberryBread();
				storage.useStrawberry();
				storage.getStrawberryBread().add(bread);
			}
		}
		else if(type.equals("Banana")){
			if(storage.getCurrBanana() < 1){
				
			}
			else{
				bread = new BananaBread();
				storage.useBanana();
				storage.getBananaBread().add(bread);
			}
		}
		
		return bread;
	}
}
