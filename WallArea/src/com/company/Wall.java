package com.company;

public class Wall {
    private double width;
    private double height;
    public Wall(){
        this(0,0);
    }

    public Wall(double width, double height) {
        if(width<0){
            height=0;
        }
        if(height<0){
            width=0;
        }
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width=width;
        if(width<0){
            this.width=0;
        }else{
            this.height=height;
        }
    }
    public void setHeight(double height){
        this.height=height;
        if(height<0){
            this.height=0;
        }else{
            this.width=width;
        }
    }
    public double getArea(){
        return height * width;
    }

}
