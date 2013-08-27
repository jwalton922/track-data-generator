/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mis.track.data.generator;

import java.io.Serializable;

/**
 *
 * @author jwalton
 */
public class City implements Serializable{
    
    public String countryCode;
    public String name;
    public double lat;
    public double lon;
    
    public City(String countryCode, String name, double lat, double lon){
        this.countryCode = countryCode;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }
}
