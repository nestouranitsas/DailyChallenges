//created on 3/10/2019 by Nestor Ouranitsas
/*This program takes the user's zip code and gets
local weather information using an the dark sky API*/

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import com.sun.net.ssl.HttpsURLConnection;

public class WeatherMan
{
    public WeatherMan() 
    {
        final String apiKey = "AIzaSyB_rrQEs8aM4kj2xdZS2t8UmlyVlxhdn-Y";
    }
    
   
    //gets MAC address to input into google geolocation API
    public String getMacAddress()
    {
    String macAddress = "";
    
    //get MAC address to input in Google Geolocation API note: separators must be ":" (colon).
    InetAddress ip;
    try
    {		
		ip = InetAddress.getLocalHost();
		
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			
		byte[] mac = network.getHardwareAddress();
			
        //constructs MAC Address string
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? ":" : ""));		
		}
        macAddress = sb.toString();
    }	

    catch (UnknownHostException e)
    {
        e.printStackTrace();
        return macAddress;
    }

    catch (SocketException e)
    {
        e.printStackTrace();
        return macAddress;
    }
    return macAddress;
    }

    public void generatePostRequest(String macAddress)
    {
        


    }
    
    //Gets location via Google GeoLocaiton API
    /*
    public void getLocation() throws Exception
    {
        String url = "https://www.googleapis.com/geolocation/v1/geolocate?key=";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
        
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
    }
    */

    //gets weather conditions from GPS coordinates using Dark Sky API
    public void getWeather()
    {

    }

    //reports weather in a readable format from dark sky API
    public void reportWeather()
    {

    }

    public static void main (String[] args)
    {
        WeatherMan wm = new WeatherMan();
        wm.getMacAddress();
        wm.generatePostRequest(macAddress);
        //wm.getLocation();

    }
}
