/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mis.track.data.generator;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jwalton
 */
public class Track implements Serializable{
    
    private String name;
    private List<Position> positions;
    private Long startTime;
    private Long endTime;
    
    public Track(String name, List<Position> positions){
        this.name = name;
        this.positions = positions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    
    
    
}
