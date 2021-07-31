package lab7_inter;





public class lab7 {

	public static void main(String[] args) {
        inTurn FixedTurn = new FixedTurn();
        FixedTurn.goIn();
        FixedTurn.goOut();

        inTurn dynTerm = new DynTurn();
        dynTerm.goIn();
        dynTerm.goOut();

	
	}

}
