package com.ujianjunit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianjunit.main.fungsi.KonversiSuhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingKonversiSuhu {
	KonversiSuhu suhu;

	@Before
	public void setUp() throws Exception {
		suhu = new KonversiSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/Fahrenheit_ke_Celcius.csv")
	public void testHitungKonversiSuhu(double fahrenheit, double hasil) {
		assertEquals(hasil, suhu.HitungKonversiSuhu(fahrenheit), 0.0001);
	}
	
	@Test
	public void testBukanAngka_KonversiSuhu() {
		assertEquals(40.0, suhu.HitungKonversiSuhu("a"), 0.0);
	}
	
	@Test
	public void testAngkaNegatif_KonversiSuhu() {
		assertEquals(-0, suhu.HitungKonversiSuhu(32.0), 0.0);
	}
	
	@Test
	public void testTidakAdaAngka_KonversiSuhu() {
		assertEquals(0, suhu.HitungKonversiSuhu(0), 0.0);
	}

}
