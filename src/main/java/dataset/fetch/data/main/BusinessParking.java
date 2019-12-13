package dataset.fetch.data.main;

public class BusinessParking {
	
	private Boolean garage;
	private Boolean street;
	private Boolean validated;
	private Boolean lot;
	private Boolean valet;
	
	
	
	@Override
	public String toString() {
		return  garage + ", " + street + ", " + validated + ", " + lot
				+ ", " + valet;
	}
	public Boolean getGarage() {
		return garage;
	}
	public void setGarage(Boolean garage) {
		this.garage = garage;
	}
	public Boolean getStreet() {
		return street;
	}
	public void setStreet(Boolean street) {
		this.street = street;
	}
	public Boolean getValidated() {
		return validated;
	}
	public void setValidated(Boolean validated) {
		this.validated = validated;
	}
	public Boolean getLot() {
		return lot;
	}
	public void setLot(Boolean lot) {
		this.lot = lot;
	}
	public Boolean getValet() {
		return valet;
	}
	public void setValet(Boolean valet) {
		this.valet = valet;
	}

	


}
