package com.ujianjunit.main.fungsi;

public class KolamAir {
	public double HitungKelilingKolam(double panjang, double lebar, double tinggi) {
		return 4*(panjang + lebar + tinggi);
	}
	
	public double HitungVolumeAirKolam(double panjang, double lebar, double tinggi) {
		return panjang * lebar * tinggi;
	}
}
