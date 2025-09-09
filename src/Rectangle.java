public class Rectangle {

    private double llx, lly, urx, ury;
    public Rectangle( double x1, double y1, double x2, double y2 ) {
        llx = x1; lly = y1; urx = x2; ury = y2;
    }
    public boolean inside( double ptx, double pty ) {
        return ((llx <= ptx && ptx <= urx) && (llx <= pty && ptx <= ury));
    }
}
