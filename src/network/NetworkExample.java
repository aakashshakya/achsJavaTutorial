package network;

import java.net.*;

public class NetworkExample {
    public static void main(String[] args) {
        try {
            //Setting a URL
            URL url = new URL("https://www.example.com:8080/");
            URL firstPageURL = new URL(url, "first-page");
            URL secondPageURL = new URL(url, "second-page");
            URL queryComponentURL = new URL(url, "?username=aakash&password=test");
            URL urlWithReference = new URL(url, "#contact-us");

            //Parsing a URL
            //Returns the protocol identifier component of the URL.
            System.out.println("Protocol: " + url.getProtocol());
            //Returns the authority component of the URL.
            System.out.println("Authority: " + url.getAuthority());
            //Returns the host name component of the URL.
            System.out.println("Host: " + url.getHost());
            //Returns the port number component of the URL. The getPort method returns an integer that is the port number. If the port is not set, getPort returns -1.
            System.out.println("Port: " + url.getPort());
            //Returns the path component of this URL.
            System.out.println("Path component: " + firstPageURL.getPath());
            //Returns the query component of this URL.
            System.out.println("Query component: " + queryComponentURL.getQuery());
            //Returns the filename component of the URL. The getFile method returns the same as getPath, plus the concatenation of the value of getQuery, if any.
            System.out.println("File name component: " + secondPageURL.getFile());
            //Returns the reference component of the URL.
            System.out.println("Reference Component: " + urlWithReference.getRef());

        } catch (MalformedURLException e) {
            System.out.println("URL exception occurred. " + e.getMessage());
        }
    }
}
