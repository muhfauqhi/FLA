package storages;

import java.util.ArrayList;

import breads.Bread;

public class Storage {
	
	private static Storage instance;
	private Integer currChocolate;
	private Integer currStrawberry;
	private Integer currBanana;
	private ArrayList<Bread> chocolateBread;
	private ArrayList<Bread> strawberryBread;
	private ArrayList<Bread> bananaBread;
	
	public Storage() {
		currBanana = 0;
		currChocolate = 0;
		currStrawberry = 0;
		
		chocolateBread = new ArrayList<>();
		strawberryBread = new ArrayList<>();
		bananaBread = new ArrayList<>();
	}
	
	public static Storage getInstance() {
		if(instance == null){
			instance = new Storage();
		}
		return instance;
	}
	public void useChocolate(){
		this.currChocolate--;
	}
	public void useStrawberry(){
		this.currStrawberry--;
	}
	public void useBanana(){
		this.currBanana--;
	}
	public static void setInstance(Storage instance) {
		Storage.instance = instance;
	}
	public Integer getCurrChocolate() {
		return currChocolate;
	}
	public Integer getCurrStrawberry() {
		return currStrawberry;
	}
	public Integer getCurrBanana() {
		return currBanana;
	}
	public void setCurrChocolate(Integer currChocolate) {
		this.currChocolate = currChocolate;
	}
	public void setCurrStrawberry(Integer currStrawberry) {
		this.currStrawberry = currStrawberry;
	}
	public void setCurrBanana(Integer currBanana) {
		this.currBanana = currBanana;
	}
	public ArrayList<Bread> getChocolateBread() {
		return chocolateBread;
	}
	public ArrayList<Bread> getStrawberryBread() {
		return strawberryBread;
	}
	public ArrayList<Bread> getBananaBread() {
		return bananaBread;
	}
	public void setChocolateBread(ArrayList<Bread> chocolateBread) {
		this.chocolateBread = chocolateBread;
	}
	public void setStrawberryBread(ArrayList<Bread> strawberryBread) {
		this.strawberryBread = strawberryBread;
	}
	public void setBananaBread(ArrayList<Bread> bananaBread) {
		this.bananaBread = bananaBread;
	}
	
}
