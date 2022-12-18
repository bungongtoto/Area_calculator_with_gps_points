
public class compute_area {
	public static void main(String [] args) {
		
		
		Triangle triangle1 = new Triangle(args[0],args[1],args[2]) ;
		 
		Lat_Long_points A = new Lat_Long_points(triangle1.get_longuitude(triangle1.getGpsPoint_A()) , triangle1.get_latitude(triangle1.getGpsPoint_A()));
		Lat_Long_points B = new Lat_Long_points(triangle1.get_longuitude(triangle1.getGpsPoint_B()) , triangle1.get_latitude(triangle1.getGpsPoint_B()));
		Lat_Long_points C = new Lat_Long_points(triangle1.get_longuitude(triangle1.getGpsPoint_C()) , triangle1.get_latitude(triangle1.getGpsPoint_C()));
		

		double longA = A.convert_DMSp_to_degrees(A.getLong_point());
		double latA = A.convert_DMSp_to_degrees(A.getLat_point());
		
		double longB = B.convert_DMSp_to_degrees(B.getLong_point());
		double latB = B.convert_DMSp_to_degrees(B.getLat_point());
		
		double longC = C.convert_DMSp_to_degrees(C.getLong_point());
		double latC = C.convert_DMSp_to_degrees(C.getLat_point());
		
		double AB = triangle1.distance_between_two_points(longA, latA, longB, latB);
		double AC = triangle1.distance_between_two_points(longA, latA, longC, latC);
		double BC = triangle1.distance_between_two_points(longB, latB, longC, latC);
		
		System.out.println( "The Area of the Triangle formed by the GPS-cordinates:  "+triangle1.Area_of_triangle(AC, AB, BC) + " kilometers square");
		
		
	}

}
