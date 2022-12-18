
public class Lat_Long_points {
	private String lat_point;
	private String long_point;
	
	Lat_Long_points (String longuitude , String latitude){
		
		lat_point  = latitude;
		long_point = longuitude;
	}

	public String getLat_point() {
		return lat_point;
	}

	public void setLat_point(String lat_point) {
		this.lat_point = lat_point;
	}

	public String getLong_point() {
		return long_point;
	}

	public void setLong_point(String long_point) {
		this.long_point = long_point;
	}
	
	
    public double convert_DMSp_to_degrees(String Entry) {
    	
    	double sub_degree = (Double.valueOf(Entry.substring(0, Entry.lastIndexOf("°")))).doubleValue();
    	
    	double minute_degree = ((Double.valueOf(Entry.substring(Entry.indexOf("°") + 1, Entry.lastIndexOf("'")))).doubleValue())* Constance.const_minutes_to_degrees;
    	
    	double seconds_degree = ((Double.valueOf(Entry.substring(Entry.indexOf("'")+1, Entry.lastIndexOf("'")+3))).doubleValue()) * Constance.const_seconds_to_degrees;
    	
    	double degree = sub_degree + minute_degree + seconds_degree ;
    	
    	if (Entry.endsWith("W") || Entry.endsWith("S")) {
    		return -1 * degree;
    	}else
    		return degree ;
	}
}
