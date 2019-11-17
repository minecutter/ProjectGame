package com.main.Maps;

import com.main.Helpers;

import java.awt.*;

public class Level {
    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}

    protected Room[][] rooms;
    protected Point currentPoint;
    protected Point startPoint;
    protected Point endPoint;
    protected Direction currentDirection;


    public void playLevel(){
        currentPoint = startPoint;
        startLevel();

        while (true) {
            currentDirection = rooms[currentPoint.x][currentPoint.y].playRoom(currentDirection);
            nextRoom(currentDirection);
            if(currentPoint.equals(endPoint)){
                break;
            }

        }
        endLevel();
    }

    public void nextRoom(Direction travelDirection){
        if(travelDirection == Direction.POSX){
            currentPoint.move(1,0);
        }
        else if(travelDirection == Direction.NEGX){
            currentPoint.move(-1,0);
        }
        else if(travelDirection == Direction.POSY){
            currentPoint.move(0,1);
        }
        else if(travelDirection == Direction.NEGY){
            currentPoint.move(0,-1);
        }

    }

    public void endLevel(){

    }
    public void startLevel(){

    }

}
