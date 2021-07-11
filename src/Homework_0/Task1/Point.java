package Homework_0.Task1;

//Task 1
//Design a class named Point
//properties
//- x
//- y
//Point should provide a method distance().
//if distance is invoked with no arguments it should return
//the distance of that point from x=0, y=0 coordinate
//if distance is invoked with argument (Point secondPoint),
//the method should return the distance between those two points

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    double distance(Point secondPoint){
        return Math.sqrt(Math.pow(x - secondPoint.x,2) + Math.pow(y - secondPoint.y,2));
    }


}




