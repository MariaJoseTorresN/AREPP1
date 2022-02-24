package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Respuesta {
    public static String respuesta(String city) throws IOException {
        String site = "http://api.openweathermap.org/data/2.5/weather?q=" + city
                + "&appid=5f8afd3074c154b26c51779cd5f5b3c0";
        URL google = new URL(site);
        String datos = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                datos+=inputLine;
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return datos;
    }

}
