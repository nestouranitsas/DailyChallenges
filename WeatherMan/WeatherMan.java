//created on 3/10/2019 by Nestor Ouranitsas
/*This program takes the user's zip code and gets
local weather information using an the dark sky API*/

public class WeatherMan
{
    //gets GPS coordinates using google maps API
    public void getCoordinates(int zipCode, String state)
    {

    }

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
    wm.getCoordinates(11206, "New York");
    wm.getWeather();
    wm.reportWeather();
}
}