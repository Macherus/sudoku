public class Board {
    private int plansza[][] = new int[9][9];

    public Board(int[][] plansza) throws BoardException{
        for(int[] i : plansza){
            for(int j: i){
                if(j < 0 || j > 9){
                    throw new BoardException();
                }
            }
        }
        this.plansza = plansza;
    }
    public void printBoard(){
        for(int[] i: plansza) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
