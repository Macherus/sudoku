import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int plansza[][] = new int[9][9];
        System.out.println("Puste pola wypełnij 0");
        Scanner odczyt = new Scanner(System.in);
        for(int i = 0; i< 9; i++){
            System.out.println("Podaj rząd " + (i+1));
            for(int j = 0; j< 9; j++){
                plansza[i][j] = odczyt.nextInt();
            }
        }

        try {
            Board board = new Board(plansza);
        } catch (BoardException e) {
            System.out.println("Błędna plansza!");
        }
    }
}
