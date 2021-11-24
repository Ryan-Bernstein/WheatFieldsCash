public class Line{
    Point orgPoint;
    double length;
    double angle;

    public Line(Point _origin, double _length, double _angle){
        orgPoint = _origin;
        length = _length;
        angle = _angle;
    }

    public Point findB(){
        double addX = Math.cos(angle) * this.length;
        double addY = Math.sin(angle) * this.length;
        Point out = new Point(addX + orgPoint.getX(),addY + orgPoint.getY());
        return out;
    }
    public void draw(){
        
    }
}