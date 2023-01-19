package tr.edu.medipol.yova.KocaeliUniversitesiApi;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
//DERS ARRAYLISTI OLUSTURMA VE ICINE DERS EKLEME
@RequestMapping("/ders")

public  class KOURestApi {
	
	public static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("C# UYGULAMALARI");
		DERSLER.add("VERITABANI UYGULAMALARI");
		DERSLER.add("YAZILIM ORTAM VE ARACLARI");
		DERSLER.add("BLOCKCHAIN UYGULAMALARI");	
	}
	//DERSLERI LISTELEME
	@GetMapping("/")
	public List<String> listele() {
		return DERSLER;
	}
	//DERS EKLEME 
	@PostMapping("/")
	public static boolean ekle(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}
	//EN SON EKLENEN DERSI SILME
	@GetMapping("/sil")
	public static boolean sil(@RequestBody String dersAd) {
		boolean containsResult = DERSLER.contains(dersAd);
		DERSLER.remove(dersAd);
		return containsResult;
	}
}

