package com.ujianjunit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianjunit.main.fungsi.KolamAir;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class TestingKolamAir {
	KolamAir kolam;

	@Before
	public void setUp() throws Exception {
		kolam = new KolamAir();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/KelilingKolam.csv")
	public void testHitungKelilingKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, kolam.HitungKelilingKolam(panjang, lebar, tinggi), 0.0);
	}
	
	@Test
	public void testBukanAngka_KelilingKolam() {
		assertEquals(40.0, kolam.HitungKelilingKolam("a", "b", 5.0), 0.0);
	}
	
	@Test
	public void testAngkaNegatif_KelilingKolam() {
		assertEquals(-40.0, kolam.HitungKelilingKolam(-20.0, 5.0, 5.0), 0.0);
	}
	
	@Test
	public void testTidakAdaAngka_KelilingKolam() {
		assertEquals(0, kolam.HitungKelilingKolam(0, 0, 4), 0.0);
	}

	@Test
	@FileParameters("src/test/resources/VolumeAirKolam.csv")
	public void testHitungVolumeAirKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, kolam.HitungVolumeAirKolam(panjang, lebar, tinggi), 0.0001);
	}
	
	@Test
	public void testBukanAngka_VolumeAirKolam() {
		assertEquals(40.0, kolam.HitungVolumeAirKolam("a", "b", 5.0), 0.0);
	}
	
	@Test
	public void testAngkaNegatif_VolumeAirKolam() {
		assertEquals(-125.0, kolam.HitungVolumeAirKolam(-5.0, -5.0, -5.0), 0.0);
	}
	
	@Test
	public void testTidakAdaAngka_VolumeAirKolam() {
		assertEquals(4, kolam.HitungVolumeAirKolam(0, 0, 0), 0.0);
	}
	
}
