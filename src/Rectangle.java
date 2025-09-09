public class Rectangle {

    private double llx, lly, urx, ury;

    public double getLLX() { return llx; }
    public double getLLY() { return lly; }
    public double getURX() { return urx; }
    public double getURY() { return ury; }
    public Rectangle( double x1, double y1, double x2, double y2 ) {
        llx = x1; lly = y1; urx = x2; ury = y2;
    }
    public boolean inside( double ptx, double pty ) {
        return ((llx <= ptx && ptx <= urx) && (llx <= pty && ptx <= ury));
    }

    public boolean intersect( Rectangle other ) {
        double o_llx = other.getLLX();
        double o_lly = other.getLLY();
        double o_urx = other.getURX();
        double o_ury = other.getURY();
        return inside( o_llx, o_lly ) || inside( o_llx, o_ury ) ||
                inside( o_urx, o_ury ) || inside( o_urx, o_lly );
    }
}
