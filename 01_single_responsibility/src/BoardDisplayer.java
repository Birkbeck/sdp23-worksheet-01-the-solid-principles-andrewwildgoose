public class BoardDisplayer {

    private static BoardDisplayer single_instance = null;

    private BoardDisplayer(){}

    public static synchronized BoardDisplayer getInstance()
    {
        if (single_instance == null)
            single_instance = new BoardDisplayer();

        return single_instance;
    }

    public void display (Board board){
        String formattedFirstRow = board.spots.get(0) + " | " + board.spots.get(1) + " | " + board.spots.get(2) + "\n"
                + board.spots.get(3) + " | " + board.spots.get(4) + " | " + board.spots.get(5) + "\n"
                + board.spots.get(6) + " | " + board.spots.get(7) + " | " + board.spots.get(8);
        System.out.print(formattedFirstRow);
    }
}
