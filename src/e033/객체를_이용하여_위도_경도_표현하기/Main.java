package e033.객체를_이용하여_위도_경도_표현하기;
/**
 * 
 */
class Geo{
	public double latitude;
	public double longitude;
	@Override
	public String toString() {
		return "Geo [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
public class Main {
	public static void main(String[] args) {
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625;
		double latitude2=35.137879119634185;
		double longitude2 = 129.04541015625;
		
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.toString());
	}
}
