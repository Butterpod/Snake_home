package snake.model;

import java.util.Deque;
import java.util.LinkedList;

public class Snake {

    private int applesEaten;
    private Position posSnakehead;
    private Deque tail;

    public Snake(int applesEaten, Position posSnakehead, Deque tail) {
        this.applesEaten = applesEaten;
        this.posSnakehead = posSnakehead;
        this.tail = tail;
    }

    public Snake(){
        applesEaten =0;
        posSnakehead = new Position(0,0);
        tail=new LinkedList();
    }

    public int getApplesEaten() {
        return applesEaten;
    }

    public void setApplesEaten(int applesEaten) {
        this.applesEaten = applesEaten;
    }

    public Position getPosSnakehead() {
        return posSnakehead;
    }

    public void setPosSnakehead(Position posSnakehead) {
        this.posSnakehead = posSnakehead;
    }

    public Deque getTail() {
        return tail;
    }

    public void setTail(Deque tail) {
        this.tail = tail;
    }
}
