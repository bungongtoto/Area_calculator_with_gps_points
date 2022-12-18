
public class Triangle {
	
	private String GpsPoint_A;
	private String GpsPoint_B;
	private String GpsPoint_C;
	
	
	
	// setting the triangle constructor
	Triangle (String point_A , String point_B , String point_C){
		GpsPoint_A = point_A;
		GpsPoint_B = point_B;
		GpsPoint_C = point_C;
	}
	
	public String get_latitude(String Entry) {
		return (Entry.substring(Entry.indexOf(",")+1));
	}
	public String get_longuitude(String Entry) {
		
		return (Entry.substring(Entry.indexOf("=") + 1, Entry.lastIndexOf(",")));
		
	}
	public String getGpsPoint_A() {
		return GpsPoint_A;
	}
	public void setGpsPoint_A(String gpsPoint_A) {
		GpsPoint_A = gpsPoint_A;
	}
	public String getGpsPoint_B() {
		return GpsPoint_B;
	}
	public void setGpsPoint_B(String gpsPoint_B) {
		GpsPoint_B = gpsPoint_B;
	}
	public String getGpsPoint_C() {
		return GpsPoint_C;
	}
	public void setGpsPoint_C(String gpsPoint_C) {
		GpsPoint_C = gpsPoint_C;
	}
	
	public double distance_between_two_points(double long1 , double lat1 , double long2 , double lat2) {
		
	double longuitude = Math.toRadians(long2 - long1);
	
	double latitude = Math.toRadians(lat2 - lat1);
	
	double a = Math.pow(Math.sin( latitude/2), 2) + ( Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.pow(Math.sin( longuitude/2), 2) );  
	
	double distance = 2 * Constance.const_raduis_of_earth * Math.asin(Math.pow(a, 0.5));
	
	return distance ;
	}
	
	public double Area_of_triangle(double a , double b , double c) {
		
		double s = (a+b+c)/2 ;
		
		double Area = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
		
		return Area;
	}
	
	
}
