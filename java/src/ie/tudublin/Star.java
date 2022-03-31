package ie.tudublin;

import processing.data.TableRow;

public class Star {
    
    private boolean hab;
    private String displayName;
    private float distance;
    private float x6;
    private float yg;
    private float zg;
    private float absMag;

    


    @Override
    public String toString() {
        return "Star [absMag=" + absMag + ", displayName=" + displayName + ", distance=" + distance + ", hab=" + hab
                + ", x6=" + x6 + ", yg=" + yg + ", zg=" + zg + "]";
    }


    public Star(TableRow tr)
    {
        this(tr.getInt("Hab?") == 1, 
        tr.getString("Display Name"), 
        tr.getFloat("Distance"),
        tr.getFloat("Xg"), 
        tr.getFloat("Yg"),
        tr.getFloat("Zg"),
        tr.getFloat("AbsMag"));
    }

    
    public Star(boolean hab, String displayName, float distance, float x6, float yg, float zg, float absMag) {
        this.hab = hab;
        this.displayName = displayName;
        this.distance = distance;
        this.x6 = x6;
        this.yg = yg;
        this.zg = zg;
        this.absMag = absMag;
    }


    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }
    public boolean isHab() {
        return hab;
    }
    public void setHab(boolean hab) {
        this.hab = hab;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public float getDistance() {
        return distance;
    }
    public void setDistance(float distance) {
        this.distance = distance;
    }
    public float getX6() {
        return x6;
    }
    public void setX6(float x6) {
        this.x6 = x6;
    }
    public float getYg() {
        return yg;
    }
    public void setYg(float yg) {
        this.yg = yg;
    }
    public float getZg() {
        return zg;
    }
    public void setZg(float zg) {
        this.zg = zg;
    }
    public float getAbsMag() {
        return absMag;
    }

    
    
}
