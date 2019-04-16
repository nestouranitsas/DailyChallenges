public class PostTest 
{
    public static void main (String[] args)
    {
        String considerIP = "true";
        String macAddress = "12:34:56:78:90";
        
         String PostBody = 
         "{\n" + 
         "  \"considerIP\": " + considerIP + "," + "\n" + 
         "  \"wifiAccessPoints\": [" + "\n" + 
         "      {" + "\n" +
         "          \"macAddress\": " + "\"" + macAddress + "\"" + "," + "\n" +
         "      }," + "\n" +
         "      {" + "\n" +
         "          \"macAddress\": " + "\"" + macAddress + "\"" + "," + "\n" +
         "      }" + "\n" +
         "      ]" + "\n"
         + "}";

        
         System.out.println(PostBody);
    }
}

