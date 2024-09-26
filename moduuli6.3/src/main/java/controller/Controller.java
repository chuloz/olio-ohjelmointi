package controller;

import model.Player;

import view.GraphicsDemo;

public class Controller {
    private Player player;
    private GraphicsDemo gui;

    public Controller(GraphicsDemo gui) {
        this.player = new Player(0, 0);
        this.gui = gui;
    }



    public int getPlayerX() {
        return player.getX();
    }

    public int getPlayerY() {
        return player.getY();
    }

    public int getGridSize() {
        return player.getGridSize();
    }

    public void updatePosition(int x, int y) {
        System.out.println("Position " + x +  "  " + y);
        player.setPosition(x, y);
    }




}