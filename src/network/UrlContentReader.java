package network;

import java.io.*;
import java.net.*;

public class UrlContentReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.codezeronepal.com/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("URL exception occurred. " + e.getMessage());
        } catch (IOException ioEx) {
            System.out.println("IO Exception occurred with message: "+ ioEx.getMessage());
        }
    }
}
