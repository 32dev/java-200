package e017.사용자_정의_참조_타입_사용하기;

class JLocation {
	public double lat;
	public double lng;
}

public class Main {
	public static void main(String[] args) {
		double latitude = 37.52127220511242;
		double longitude = 127.0074462890625;
		JLocation jloc = new JLocation();
		jloc.lat = latitude;
		jloc.lng = longitude;
		JLocation newLoc = jloc;
		System.out.println(newLoc.lat);
	}
}
