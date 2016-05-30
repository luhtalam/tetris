/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.entity;

import java.awt.Color;

/**
 *
 * @author luhtalam
 */
public class Part implements Moveable {

    private int x;
    private int y;
    private Color color;

    public Part(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void moveDown() {
        y += 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    public void newCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXCoordinate() {
        return x;
    }

    public int getYCoordinate() {
        return y;
    }
    
    public Color getColor() {
        return color;
    }
}