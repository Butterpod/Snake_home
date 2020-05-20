package snake.model;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Snake {

    private int applesEaten;
    private Position posSnakehead;
    private Deque tail;
    private List<Movement> actions;

    public Snake(int applesEaten, Position posSnakehead, LinkedList tail,List<Movement>actions) {
        this.applesEaten = applesEaten;
        this.posSnakehead = posSnakehead;
        this.tail = tail;
        this.actions=actions;
    }

    public Snake(){
        applesEaten =0;
        posSnakehead = new Position(0,0);
        tail=new LinkedList();
        actions=new ArrayList<>();
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

    public List<Movement> getActions() {
        return actions;
    }

    public void setActions(List<Movement> actions) {
        this.actions = actions;
    }

    public void move(Movement movement){
        int x = posSnakehead.getX();
        int y = posSnakehead.getY();
        switch (movement.getDirection()){
            case up:
                posSnakehead = new Position(x,--y);
                break;
            case left:
                posSnakehead = new Position(--x,y);
                break;
            case down:
                posSnakehead = new Position(x,++y);
                break;
            case right:
                posSnakehead = new Position(++x,y);
                break;
        }
    }
}
