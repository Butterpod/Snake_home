package snake.model;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int lenght = 20;
        int height = 10;
        char[][] background =  new char[height][lenght];

        fillChar(background,lenght,height);


        /** setting variables **/
        Position positionInitial = new Position(5,5);
        Movement mouvementLeft = new Movement(Direction.left);
        Movement movementRight = new Movement(Direction.down);
        List<Movement> movements = new ArrayList<>();
        movements.add(mouvementLeft);
        movements.add(movementRight);

        /** Initialize Snake* **/
        Snake snake = new Snake();
        snake.setApplesEaten(0);
        snake.setPosSnakehead(positionInitial);
        snake.setActions(movements);

        /** Mise du serpent dans le backgroud**/

        setBackground(background,lenght,height,snake);
        printChar(background, lenght,height);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous allez bouger la tete du serpent pour 4 tours");
        for(int i = 0; i<4;i++){
            System.out.println("Que voulez vous faire ?");
            System.out.println(actions(snake.getActions()));
            int action = Integer.parseInt(scanner.nextLine());
            Movement movement = snake.getActions().get(action);
            snake.move(movement);
            setBackground(background,lenght,height,snake);
            printChar(background, lenght,height);
        }


    }

    public static void setBackground(char[][] background,int lenght,int height , Snake snake){
        Position position = snake.getPosSnakehead();
        fillChar(background,lenght,height);
        background[position.getY()][position.getX()] = '0';
    }

    public static void printChar(char[][] background,int lenght,int height){

        System.out.println("Etat du jeux :");
        for(int l = 0; l <height; l++){
            for(int h= 0; h <lenght; h++ ){
                System.out.print(background[l][h]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void fillChar(char[][] background,int lenght,int height){
        for(int l = 0; l <height; l++) {
            for (int h = 0; h < lenght; h++) {
                background[l][h] = '*';
            }
        }
    }

    public static String actions(List<Movement> movements){
        int i = 0;
        StringBuilder actions = new StringBuilder();
        for (Movement move :
             movements) {
            actions.append( i + " : " + move + "\t");
            i++;
        }
        return actions.toString();
    }
}
