package tr.edu.medipol.yova.KocaeliUniversitesiApi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class KOURestApiTest {
	//
	@Test
	public void testListele() {
        KOURestApi restApi = new KOURestApi();
        List<String> eskiDersListesi = new ArrayList<>();
        for(String ders : KOURestApi.DERSLER) {
        	
        eskiDersListesi.add(ders);
        }
        List<String> dersListesi = restApi.listele();
        assertEquals(eskiDersListesi, dersListesi);
        }
	//
	@Test
	public void testEkle() {
		String dersAd = "Eklenen Ders";
		boolean addResult = KOURestApi.ekle(dersAd);
		assertTrue(addResult);
		
		boolean containsResult = KOURestApi.DERSLER.contains(dersAd);
		assertTrue(containsResult);
	}
	@Test
	public void testSil() {	
		String dersAd = "C# UYGULAMALARI";
		boolean removeResult = KOURestApi.sil(dersAd);
		assertTrue(removeResult);
	
	}
	
}