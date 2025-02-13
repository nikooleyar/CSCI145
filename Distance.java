public class Distance { 
	//access modifiers (private, public, etc)
	private double meters;
	private double kilometers;
	private double miles;

	static final double METERS_PER_MILE = 1609.34; 
	static final double METERS_PER_KILOMETER = 1000;

	public Distance(double meters) {
		//this.meters refers to the one above the constructor, whereas the other meters refers to the parameter
		this.meters = meters;
		//this.kilometers = meters / METERS_PER_KILOMETER;
		//this.miles = meters / METERS_PER_MILE;
	}

	//making a setter
	public void setMeters(double meters) {
		//same code as above
		this.meters = meters;
	}

	//setter for Kilometers
	public void setKilometers(double kilometers) {
		this.meters = kilometers * METERS_PER_KILOMETER;
	}

	//setter for Miles
	public void setMiles(double miles) {
		this.meters = miles * METERS_PER_MILE;
	}

	//getter for kilometers
	public double getKilometers() {
		return meters / METERS_PER_KILOMETER;
	}

	//getter for Miles
	public double getMiles() {
		return meters / METERS_PER_MILE;
	}

	//making a getter
	public double getMeters() {
		return meters;
	}
	
	


				
	
	//bad stuff
	
	/*static double convertMetersToKilometers(double meters) { 
		return meters / METERS_PER_KILOMETER; 
	} 
					
	static double convertMetersToMiles(double meters) { 
		return meters / METERS_PER_MILE; 
	} 
						
	static double convertKilometersToMeters(double kilometers) {
		return kilometers * METERS_PER_KILOMETER; 
	} 
							
	static double convertMilesToMeters(double miles) { 
		return miles * METERS_PER_MILE; 
	} */
}
