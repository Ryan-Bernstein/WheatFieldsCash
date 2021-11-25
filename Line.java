public class Line{
    private Point orgPoint;
    private double length;
    private double angle;
    
    public Line(Point _origin, double _length, double _angle){
        orgPoint = _origin;
        length = _length;
        angle = _angle;
    }
    public Point pointB(){
        double addX = Math.cos(this.angle) * length;
        double addY = Math.sin(this.angle) * length;
        Point out = new Point(this.x + addX, this.y + addY);
        return out;
    }
    
    public void setAngle(double _angle){angle = _angle;}
    public void setOrigin(Point _point){orgPoint = _point;}

<<<<<<< HEAD
=======
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
>>>>>>> origin/main
    public void draw(){
        
    }
}