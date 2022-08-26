package com.akbas.springboot.PribasProject.DTO;

public class TimelineResponse { // Data transfer objesi. Join query için !

	private String desription;

	private String userName;

	public TimelineResponse(String desription, String userName) {
		this.desription = desription;
		this.userName = userName;
	}
	
	/* bu DTO objesi için hibernate constructor istiyor. 
	 * Aksi halde "Unable to locate appropriate constructor on class" hatası alırsın !!! */
	
	public String getDesription() {
		return desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TimelineResponse [desription=" + desription + ", userName=" + userName + "]";
	}

}
