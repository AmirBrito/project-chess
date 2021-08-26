package application;

import boardgame.Board;
import boardgame.Position;

public class App{
    public static void main(String[] args) {
        
        System.out.println("Hello World!"); 
        
        Position position = new Position(3,5);
        System.out.println(position);

        Board board = new Board(8, 8);
    }
}
