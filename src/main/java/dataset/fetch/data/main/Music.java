package dataset.fetch.data.main;

public class Music {
	
	private Boolean dj;
	private Boolean backgroundMusic;
	private Boolean noMusic;
	private Boolean karaoke;
	private Boolean live;
	private Boolean video;
	private Boolean jukebox;
	
	
	@Override
	public String toString() {
		return dj + ", " + backgroundMusic + ", " + noMusic + ", "
				+ karaoke + ", " + live + ", " + video + ", " + jukebox;
	}
	public Boolean getDj() {
		return dj;
	}
	public void setDj(Boolean dj) {
		this.dj = dj;
	}
	
	
	public Boolean getBackgroundMusic() {
		return backgroundMusic;
	}
	public void setBackgroundMusic(Boolean backgroundMusic) {
		this.backgroundMusic = backgroundMusic;
	}
	public Boolean getNoMusic() {
		return noMusic;
	}
	public void setNoMusic(Boolean noMusic) {
		this.noMusic = noMusic;
	}
	public Boolean getKaraoke() {
		return karaoke;
	}
	public void setKaraoke(Boolean karaoke) {
		this.karaoke = karaoke;
	}
	public Boolean getLive() {
		return live;
	}
	public void setLive(Boolean live) {
		this.live = live;
	}
	public Boolean getVideo() {
		return video;
	}
	public void setVideo(Boolean video) {
		this.video = video;
	}
	public Boolean getJukebox() {
		return jukebox;
	}
	public void setJukebox(Boolean jukebox) {
		this.jukebox = jukebox;
	}
	
	

}


