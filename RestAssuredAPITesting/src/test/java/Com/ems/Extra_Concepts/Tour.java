package Com.ems.Extra_Concepts;

public class Tour {


	String place;
	String Modeoftravel;


	public String getPlace() {
		return place;
	}
	public Tour setPlace(String place) {
		this.place = place;
		return this;
	}
	public String getModeoftravel() {
		return Modeoftravel;
	}
	public Tour setModeoftravel(String modeoftravel) {
		Modeoftravel = modeoftravel;
		return this;
	}

	public void heymanwherearegoing() {
		System.out.println(getPlace());
		System.out.println("Oh jolly ah car"+ getModeoftravel()+"la"+getPlace()+"poriya");
	}

	public static void main(String[] args) {

		Tour tour = new Tour();
		tour.setPlace("chennai");
		tour.setModeoftravel("car");
		tour.heymanwherearegoing();

		tour.setPlace("Austraila").setModeoftravel("Flight").heymanwherearegoing();
	}

}
