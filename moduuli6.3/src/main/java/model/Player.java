package model;


public class Player {
    private int x;
    private int y;
    private static final int GRID_SIZE = 10;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }



    // pelaajan sijainnin päivittäminen
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getGridSize() {
        return GRID_SIZE;
    }
}