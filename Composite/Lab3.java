package Composite;

public class Lab3 {
    static public void main(String args[]) {
        Cabinet cab = new Cabinet();
        Board board = new Board();

        Drive dr1= new Drive();
        Drive dr2= new Drive();
        Drive dr3= new Drive();
        Bus bus = new Bus();


        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();

        cab.addComponent(board);
        cab.addComponent(dr1);
        cab.addComponent(dr2);
        cab.addComponent(dr3);

        board.addBoardComponent(bus);
        board.addBoardComponent(card1);
        board.addBoardComponent(card2);
        board.addBoardComponent(card3);
        
        System.out.println("Total price of computer is: "+ cab.computePrice());
    }
}
