package dataset.fetch.data.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {

		File datasetFile = new File("D:/yelp_academic_dataset_business.json");
		List<String> jsons = getRecords(datasetFile);

		List<String> onlyRestaurants = getOnlyRestaurants(jsons);

		List<FeatureVector> fv = getFeatureVectors(onlyRestaurants);

		List<String> rfv = new ArrayList<String>();

		fv.stream().forEach(r -> {

			rfv.add(r.toString().replace("null", "-1").replace("wv", "null").replace("false", "0").replace("true",
					"1"));

			

		});
		
		writeTofile(rfv,"D:/feature_vectors.txt");

	}

	private static List<String> getRecords(File file) {

		if (file.exists()) {

			List<String> lines = null;
			try {
				lines = FileUtils.readLines(file, "utf-8");
			} catch (IOException e) {

				e.printStackTrace();
				return null;
			}

			return lines;

		} else {

			return null;

		}

	}

	private static List<String> getOnlyRestaurants(List<String> records) {

		List<String> onlyRestaurants = new ArrayList<String>();

		records.stream().forEach((r) -> {

			JSONObject currentObject = new JSONObject(r);

			try {

				if (currentObject.getString("categories").toLowerCase().contains("restaurant")) {

					onlyRestaurants.add(r);
				}

			} catch (Exception ex) {

				// System.out.println(r);
			}
		});

		return onlyRestaurants;
	}

	private static List<FeatureVector> getFeatureVectors(List<String> records) {

		List<FeatureVector> fvs = new ArrayList<FeatureVector>();

		records.stream().forEach((record) -> {

			JSONObject current = new JSONObject(record);

			FeatureVector fv = new FeatureVector();

			if (current.getString("business_id") != null) {
				fv.setId(current.getString("business_id"));
				// System.out.println(current.getString("business_id"));

			}

			JSONObject attributes = null;

			if (current.has("attributes")) {

				try {

					attributes = current.getJSONObject("attributes");

				} catch (Exception ex) {
				}

			}

			if (attributes != null) {

				if (attributes.has("Alcohol"))
					if (attributes.getString("Alcohol") != null)
						fv.setAlcohol(attributes.getString("Alcohol"));

				JSONObject ambience = null;
				if (attributes.has("Ambience")) {

					try {
						ambience = attributes.getJSONObject("Ambience");
					} catch (Exception ex) {

						ambience = new JSONObject(attributes.getString("Ambience"));
					}

				}

				if (ambience != null) {

					Ambience ambienceObj = new Ambience();

					try {
						ambienceObj.setCasual(ambience.getBoolean("casual"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setClassy(ambience.getBoolean("classy"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setDivey(ambience.getBoolean("divey"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setHipster(ambience.getBoolean("hipster"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setIntimate(ambience.getBoolean("intimate"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setRomantic(ambience.getBoolean("romantic"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setTouristy(ambience.getBoolean("touristy"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setTrendy(ambience.getBoolean("trendy"));
					} catch (Exception ex) {
					}

					try {
						ambienceObj.setUpscale(ambience.getBoolean("upscale"));
					} catch (Exception ex) {
					}

					fv.setAmbiences(ambienceObj);

				}

				JSONObject bestNights = null;

				if (attributes.has("BestNights")) {
					try {
						bestNights = attributes.getJSONObject("BestNights");

					} catch (Exception ex) {

						bestNights = new JSONObject(attributes.getString("BestNights"));
					}

				}
				if (bestNights != null) {

					BestNight bn = new BestNight();

					try {

						bn.setFriday(bestNights.getBoolean("friday"));

					} catch (Exception ex) {
					}

					try {

						bn.setMonday(bestNights.getBoolean("monday"));

					} catch (Exception ex) {
					}
					try {

						bn.setSaturday(bestNights.getBoolean("Saturday"));

					} catch (Exception ex) {
					}
					try {

						bn.setSunday(bestNights.getBoolean("sunday"));

					} catch (Exception ex) {
					}
					try {

						bn.setThursday(bestNights.getBoolean("thursday"));

					} catch (Exception ex) {
					}
					try {

						bn.setTuesday(bestNights.getBoolean("tuesday"));

					} catch (Exception ex) {
					}
					try {

						bn.setWednesday(bestNights.getBoolean("wednesday"));

					} catch (Exception ex) {
					}

					fv.setBestnights(bn);

				}

				try {

					fv.setBikeParking(attributes.getBoolean("BikeParking"));

				} catch (Exception ex) {
				}

				try {

					fv.setBusinessAcceptsBitcoin(attributes.getBoolean("BusinessAcceptsBitcoin"));
				} catch (Exception ex) {
				}

				try {

					fv.setBusinessAcceptsCreditCards(attributes.getBoolean("BusinessAcceptsCreditCards"));

				} catch (Exception ex) {
				}

				JSONObject businessParking = null;

				if (attributes.has("BusinessParking")) {

					try {
						businessParking = attributes.getJSONObject("BusinessParking");
					} catch (Exception ex) {

						businessParking = new JSONObject(attributes.getString("BusinessParking"));

					}

				}

				if (businessParking != null) {

					BusinessParking businessParkingObj = new BusinessParking();

					try {

						businessParkingObj.setGarage(businessParking.getBoolean("garage"));

					} catch (Exception ex) {

					}

					try {

						businessParkingObj.setLot(businessParking.getBoolean("lot"));

					} catch (Exception ex) {

					}

					try {

						businessParkingObj.setStreet(businessParking.getBoolean("street"));

					} catch (Exception ex) {

					}

					try {

						businessParkingObj.setValet(businessParking.getBoolean("valet"));

					} catch (Exception ex) {

					}

					try {

						businessParkingObj.setValidated(businessParking.getBoolean("validated"));

					} catch (Exception ex) {

					}

					fv.setBusinessParking(businessParkingObj);
				}

				try {

					fv.setCaters(attributes.getBoolean("Caters"));

				} catch (Exception ex) {

				}

				try {

					fv.setCoatCheck(attributes.getBoolean("CoatCheck"));

				} catch (Exception ex) {

				}

				try {

					fv.setDogsAllowed(attributes.getBoolean("DogsAllowed"));

				} catch (Exception ex) {

				}

				try {

					fv.setGoodForDancing(attributes.getBoolean("GoodForDancing"));
				} catch (Exception ex) {

				}

				try {

					fv.setGoodForKids(attributes.getBoolean("GoodForKids"));

				} catch (Exception ex) {

				}

				JSONObject goodForMeal = null;

				if (attributes.has("GoodForMeal")) {

					try {
						goodForMeal = attributes.getJSONObject("GoodForMeal");
					} catch (Exception ex) {

						goodForMeal = new JSONObject(attributes.getString("GoodForMeal"));

					}

				}

				if (goodForMeal != null) {

					GoodForMeal gfm = new GoodForMeal();

					try {

						gfm.setBreakfast(goodForMeal.getBoolean("breakfast"));

					} catch (Exception ex) {

					}

					try {

						gfm.setBrunch(goodForMeal.getBoolean("brunch"));

					} catch (Exception ex) {

					}
					try {

						gfm.setDessert(goodForMeal.getBoolean("dessert"));

					} catch (Exception ex) {

					}
					try {

						gfm.setDinner(goodForMeal.getBoolean("dinner"));

					} catch (Exception ex) {

					}

					try {

						gfm.setLatenight(goodForMeal.getBoolean("latenight"));

					} catch (Exception ex) {

					}

					try {

						gfm.setLunch(goodForMeal.getBoolean("lunch"));

					} catch (Exception ex) {

					}

					fv.setGoodForMeal(gfm);
				}

				try {

					fv.setHappyHour(attributes.getBoolean("HappyHour"));

				} catch (Exception ex) {
				}

				try {

					fv.setHasTV(attributes.getBoolean("HasTV"));
				} catch (Exception ex) {

				}

				JSONObject music = null;

				if (attributes.has("Music")) {

					try {
						music = attributes.getJSONObject("Music");
					} catch (Exception ex) {

						music = new JSONObject(attributes.getString("Music"));
					}

				}

				if (music != null) {

					Music musicObj = new Music();

					try {

						musicObj.setBackgroundMusic(music.getBoolean("background_music"));

					} catch (Exception ex) {
					}

					try {

						musicObj.setDj(music.getBoolean("dj"));

					} catch (Exception ex) {
					}

					try {

						musicObj.setJukebox(music.getBoolean("jukebox"));

					} catch (Exception ex) {
					}

					try {

						musicObj.setKaraoke(music.getBoolean("karaoke"));

					} catch (Exception ex) {
					}

					try {

						musicObj.setLive(music.getBoolean("live"));

					} catch (Exception ex) {
					}

					try {

						musicObj.setNoMusic(music.getBoolean("no_music"));

					} catch (Exception ex) {
					}

					try {

						musicObj.setVideo(music.getBoolean("video"));

					} catch (Exception ex) {
					}

					fv.setMusic(musicObj);
				}

				if (attributes.has("NoiseLevel"))
					if (attributes.getString("NoiseLevel") != null)
						fv.setNoiseLevel(attributes.getString("NoiseLevel"));

				try {

					fv.setOutdoorSeating(attributes.getBoolean("OutdoorSeating"));
				} catch (Exception ex) {
				}

				if (attributes.has("RestaurantsAttire"))
					if (attributes.getString("RestaurantsAttire") != null)
						fv.setRestaurantsAttire(attributes.getString("RestaurantsAttire"));

				try {

					fv.setRestaurantsDelivery(attributes.getBoolean("RestaurantsDelivery"));

				} catch (Exception ex) {
				}

				try {

					fv.setRestaurantsGoodForGroups(attributes.getBoolean("RestaurantsGoodForGroups"));

				} catch (Exception ex) {
				}

				try {

					fv.setRestaurantsReservations(attributes.getBoolean("RestaurantsReservations"));
				} catch (Exception ex) {
				}

				try {

					fv.setRestaurantsTableService(attributes.getBoolean("RestaurantsTableService"));
				} catch (Exception ex) {
				}

				try {

					fv.setRestaurantsTakeOut(attributes.getBoolean("RestaurantsTakeOut"));

				} catch (Exception ex) {
				}

//				try {
//
//					fv.setSmoking(attributes.getBoolean("Smoking"));
//				} catch (Exception ex) {
//				}

				if (attributes.has("Smoking"))
					if (attributes.getString("Smoking") != null)
						fv.setSmoking(attributes.getString("Smoking"));
				try {

					fv.setWheelchairAccessible(attributes.getBoolean("WheelchairAccessible"));
				} catch (Exception ex) {
				}

				if (attributes.has("WiFi"))
					if (attributes.getString("WiFi") != null) {

						fv.setWiFi(attributes.getString("WiFi"));
					}

				if (attributes.has("RestaurantsPriceRange2"))
					if (attributes.getString("RestaurantsPriceRange2") != null) {

						fv.setRestaurantsPriceRange(Integer.parseInt(attributes.getString("RestaurantsPriceRange2")));

					}

			}

			fvs.add(fv);

		});

		return fvs;

	}

	private static void writeTofile(List<String> list,String path) {
		
		
		 PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(int index=0;index<list.size();index++)
		 {
		     pw.println(list.get(index));       
		 }
		 
		 pw.close();
		
		
	}
}
