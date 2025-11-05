package e032.d1d2차원배열로_위도_경도표현하기;

public class Main {
	public static void main(String[] args) {
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625;
		double latitude2 = 35.137879119364185;
		double longitude2 = 129.04541015625;
		System.out.println(latitude1 + "\t" + longitude1);

		double[] latlng1 = { latitude1, longitude1 };
		double[] latlng2 = { latitude2, longitude2 };
		System.out.println(latlng1[0] + "\t" + latlng1[1]);
		System.out.println(latlng2[0] + "\t" + latlng2[1]);

		double[][] latlng = { { latitude1, longitude1 }, { latitude2, longitude2 } };
		System.out.println(latlng[0][0] + "\t" + latlng[0][1]);
		System.out.println(latlng[0][0]+"\t"+latlng[0][1]);
	}
}
