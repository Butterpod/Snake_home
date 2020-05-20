package snake.model;

public class Playground {

    private int width;
    private  int height;
    private char[][] snakeBoard;

    public Playground(int width, int height){
        this.width=width;
        this.height=height;
        this.snakeBoard= new char[this.height][this.width];

    }


}
