package dataset.fetch.data.main;

public class Ambience {

	private Boolean romantic;
	private Boolean intimate;
	private Boolean classy;
	private Boolean hipster;
	private Boolean divey;
	private Boolean touristy;
	private Boolean trendy;
	private Boolean upscale;
	private Boolean casual;
	
	

	@Override
	public String toString() {
		return romantic + ", " + intimate + ", " + classy + ", "
				+ hipster + ", " + divey + ", " + touristy + ", " + trendy + ", "
				+ upscale + ", " + casual;
	}

	public Boolean getRomantic() {
		return romantic;
	}

	public void setRomantic(Boolean romantic) {
		this.romantic = romantic;
	}

	public Boolean getIntimate() {
		return intimate;
	}

	public void setIntimate(Boolean intimate) {
		this.intimate = intimate;
	}

	public Boolean getClassy() {
		return classy;
	}

	public void setClassy(Boolean classy) {
		this.classy = classy;
	}

	public Boolean getHipster() {
		return hipster;
	}

	public void setHipster(Boolean hipster) {
		this.hipster = hipster;
	}

	public Boolean getDivey() {
		return divey;
	}

	public void setDivey(Boolean divey) {
		this.divey = divey;
	}

	public Boolean getTouristy() {
		return touristy;
	}

	public void setTouristy(Boolean touristy) {
		this.touristy = touristy;
	}

	public Boolean getTrendy() {
		return trendy;
	}

	public void setTrendy(Boolean trendy) {
		this.trendy = trendy;
	}

	public Boolean getUpscale() {
		return upscale;
	}

	public void setUpscale(Boolean upscale) {
		this.upscale = upscale;
	}

	public Boolean getCasual() {
		return casual;
	}

	public void setCasual(Boolean casual) {
		this.casual = casual;
	}

}
