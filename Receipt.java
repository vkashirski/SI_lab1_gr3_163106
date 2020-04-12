class Receipt {
	List<Item> Items = new List<Item>;
	
	public addItem(Item A){
		Items.add(A);
	}
	public DeleteItem(Item A){
		Items.remove(A);
	}
	public double receiptPrice(){
		double finalPrice = 0;
		foreach(Item i: Items){
			finalPrice += i.price;
		}
		return finalPrice;
	}
	public double receiptTaxReturn(){
		double finalTaxReturn = 0;
		foreach(Item i: Items){
			finalTaxReturn += i.taxReturn();
		}
		return finalTaxReturn;
	}
}