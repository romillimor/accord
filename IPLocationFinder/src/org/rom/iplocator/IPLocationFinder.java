package org.rom.iplocator;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("You need to pass an arg");
		}
		 
		else {
			String ipAddress = "216.58.192.14";
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = ipServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		} 
		
	}

}
