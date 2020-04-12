class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	Character taxType;

	//TODO constructor
	Item(int id, String name, double price, Character taxType){
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	//TODO setters and getters
	public void setId(int newId){
		this.id = newId;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	public void setTaxType(Character newTaxType){
		this.taxType = newTaxType;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public Character getTaxType(){
		return taxType;
	}
	
	//ne sum siguren deka razbrav matematikata kako ja sakate
	double taxReturn () { 
		//TODO
		if(taxType == 'A')
			return price * 0.18 * 0.15;
		else if(taxType == 'B')
			return price * 0.5 * 0.15;
		else
			return 0;
	}
}