package dataset.fetch.data.main;

public class FeatureVector {
	
	private String id;
	private String alcohol="wv";
	private Ambience ambiences = new Ambience();//9
	private BestNight bestnights = new BestNight();//7
	private Boolean bikeParking;
	private Boolean businessAcceptsBitcoin;
	private Boolean businessAcceptsCreditCards;
	private BusinessParking businessParking = new BusinessParking();//5
	private Boolean caters;
	private Boolean coatCheck;
	private Boolean dogsAllowed;
	private Boolean goodForDancing;
	private Boolean goodForKids;
	private GoodForMeal goodForMeal = new GoodForMeal();//6
	private Boolean happyHour;
	private Boolean hasTV;
	private Music music = new Music();//7
	private String noiseLevel="wv";
	private Boolean outdoorSeating;
	private String restaurantsAttire="wv";
	private Boolean restaurantsDelivery;
	private Boolean restaurantsGoodForGroups;
	private Integer restaurantsPriceRange;
	private Boolean restaurantsReservations;
	private Boolean restaurantsTableService;
	private Boolean restaurantsTakeOut;
	private String smoking="wv";
	private Boolean wheelchairAccessible;
	private String wiFi="wv";
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public Ambience getAmbiences() {
		return ambiences;
	}
	public void setAmbiences(Ambience ambiences) {
		this.ambiences = ambiences;
	}
	public BestNight getBestnights() {
		return bestnights;
	}
	public void setBestnights(BestNight bestnights) {
		this.bestnights = bestnights;
	}
	public Boolean getBikeParking() {
		return bikeParking;
	}
	public void setBikeParking(Boolean bikeParking) {
		this.bikeParking = bikeParking;
	}
	public Boolean getBusinessAcceptsBitcoin() {
		return businessAcceptsBitcoin;
	}
	public void setBusinessAcceptsBitcoin(Boolean businessAcceptsBitcoin) {
		this.businessAcceptsBitcoin = businessAcceptsBitcoin;
	}
	public Boolean getBusinessAcceptsCreditCards() {
		return businessAcceptsCreditCards;
	}
	public void setBusinessAcceptsCreditCards(Boolean businessAcceptsCreditCards) {
		this.businessAcceptsCreditCards = businessAcceptsCreditCards;
	}
	public BusinessParking getBusinessParking() {
		return businessParking;
	}
	public void setBusinessParking(BusinessParking businessParking) {
		this.businessParking = businessParking;
	}
	public Boolean getCaters() {
		return caters;
	}
	public void setCaters(Boolean caters) {
		this.caters = caters;
	}
	public Boolean getCoatCheck() {
		return coatCheck;
	}
	public void setCoatCheck(Boolean coatCheck) {
		this.coatCheck = coatCheck;
	}
	public Boolean getDogsAllowed() {
		return dogsAllowed;
	}
	public void setDogsAllowed(Boolean dogsAllowed) {
		this.dogsAllowed = dogsAllowed;
	}
	public Boolean getGoodForDancing() {
		return goodForDancing;
	}
	public void setGoodForDancing(Boolean goodForDancing) {
		this.goodForDancing = goodForDancing;
	}
	public Boolean getGoodForKids() {
		return goodForKids;
	}
	public void setGoodForKids(Boolean goodForKids) {
		this.goodForKids = goodForKids;
	}
	public GoodForMeal getGoodForMeal() {
		return goodForMeal;
	}
	public void setGoodForMeal(GoodForMeal goodForMeal) {
		this.goodForMeal = goodForMeal;
	}
	public Boolean getHappyHour() {
		return happyHour;
	}
	public void setHappyHour(Boolean happyHour) {
		this.happyHour = happyHour;
	}
	public Boolean getHasTV() {
		return hasTV;
	}
	public void setHasTV(Boolean hasTV) {
		this.hasTV = hasTV;
	}
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	public String getNoiseLevel() {
		return noiseLevel;
	}
	public void setNoiseLevel(String noiseLevel) {
		this.noiseLevel = noiseLevel;
	}
	public Boolean getOutdoorSeating() {
		return outdoorSeating;
	}
	public void setOutdoorSeating(Boolean outdoorSeating) {
		this.outdoorSeating = outdoorSeating;
	}
	public String getRestaurantsAttire() {
		return restaurantsAttire;
	}
	public void setRestaurantsAttire(String restaurantsAttire) {
		this.restaurantsAttire = restaurantsAttire;
	}
	public Boolean getRestaurantsDelivery() {
		return restaurantsDelivery;
	}
	public void setRestaurantsDelivery(Boolean restaurantsDelivery) {
		this.restaurantsDelivery = restaurantsDelivery;
	}
	public Boolean getRestaurantsGoodForGroups() {
		return restaurantsGoodForGroups;
	}
	public void setRestaurantsGoodForGroups(Boolean restaurantsGoodForGroups) {
		this.restaurantsGoodForGroups = restaurantsGoodForGroups;
	}
	public Integer getRestaurantsPriceRange() {
		return restaurantsPriceRange;
	}
	public void setRestaurantsPriceRange(Integer restaurantsPriceRange) {
		this.restaurantsPriceRange = restaurantsPriceRange;
	}
	public Boolean getRestaurantsReservations() {
		return restaurantsReservations;
	}
	public void setRestaurantsReservations(Boolean restaurantsReservations) {
		this.restaurantsReservations = restaurantsReservations;
	}
	public Boolean getRestaurantsTableService() {
		return restaurantsTableService;
	}
	public void setRestaurantsTableService(Boolean restaurantsTableService) {
		this.restaurantsTableService = restaurantsTableService;
	}
	public Boolean getRestaurantsTakeOut() {
		return restaurantsTakeOut;
	}
	public void setRestaurantsTakeOut(Boolean restaurantsTakeOut) {
		this.restaurantsTakeOut = restaurantsTakeOut;
	}
	
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public Boolean getWheelchairAccessible() {
		return wheelchairAccessible;
	}
	public void setWheelchairAccessible(Boolean wheelchairAccessible) {
		this.wheelchairAccessible = wheelchairAccessible;
	}
	public String getWiFi() {
		return wiFi;
	}
	public void setWiFi(String wiFi) {
		this.wiFi = wiFi;
	}
	@Override
	public String toString() {
		return id +":["+alcohol + ", " + ambiences + ", "
				+ bestnights + ", " + bikeParking + ", " + businessAcceptsBitcoin
				+ ", " + businessAcceptsCreditCards + ", " + businessParking
				+ ", " + caters + ", " + coatCheck + ", " + dogsAllowed
				+ ", " + goodForDancing + ", " + goodForKids + ", " + goodForMeal
				+ ", " + happyHour + ", " + hasTV + ", " + music + ", " + noiseLevel
				+ ", " + outdoorSeating + ", " + restaurantsAttire
				+ ", " + restaurantsDelivery + ", "
				+ restaurantsGoodForGroups + ", " + restaurantsPriceRange
				+ ", " + restaurantsReservations + ", "
				+ restaurantsTableService + ", " + restaurantsTakeOut + ", " + smoking
				+ ", " + wheelchairAccessible + ", " + wiFi + "]";
	}
	
	
	
	
	
}
