package com.main.Maps;

import com.main.DiedExeption;
import com.main.Entitys.PC;
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
    protected Wall wall = new Wall();
    protected Door door = new Door();
    protected LockedDoor lDoor = new LockedDoor();

    public void playLevel(PC PC) throws DiedExeption {
        currentPoint = startPoint;
        startLevel(PC);

        while (true) {
            currentDirection = rooms[currentPoint.x][currentPoint.y].playRoom(currentDirection, PC);
//            print(rooms[currentPoint.x][currentPoint.y].Name);
            nextRoom(currentDirection);
            if(currentPoint.equals(endPoint)){
                break;
            }

        }
        endLevel(PC);
    }

    public void nextRoom(Direction travelDirection){
        if(travelDirection == Direction.POSX){
            currentPoint.translate(1,0);
        }
        else if(travelDirection == Direction.NEGX){
            currentPoint.translate(-1,0);
        }
        else if(travelDirection == Direction.POSY){
            currentPoint.translate(0,1);
        }
        else if(travelDirection == Direction.NEGY){
            currentPoint.translate(0,-1);
        }

    }

    public void endLevel(PC PC) throws DiedExeption {

    }
    public void startLevel(PC PC){

    }

}
