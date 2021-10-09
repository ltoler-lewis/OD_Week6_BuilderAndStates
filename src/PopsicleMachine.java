
public class PopsicleMachine {
 
	State hasDollarState;
	State swipedCardState;
	//State soldOutState;
	State soldState;
	State idleState;

	State state;
	
	Builder_Popsicle popBuilder;
	Popsicle popsicle;
 
	public PopsicleMachine() {
		
		popsicle = new Popsicle();
		
		hasDollarState = new State_HasDollar(this);
		swipedCardState = new State_HasCard(this);
		idleState = new State_Idle(this);
		soldState = new State_Sold(this);
		

		setState(getIdleState());

	}
 
	public void insertDollar() {
		state.insertDollar();
	}
 
	public void swipeCard() {
		state.swipeCard();
	}
	
	public void cancelTransaction() {
		state.cancelTransaction();
	}
 
	public void pickPopsicle(String choice) {
		state.pickPopsicle(choice);
	}
 
	//Refill a specified pop type

	void refill(String popsicle, int count) {
		
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getHasDollarState() {
        return hasDollarState;
    }

    public State getSwipedCardState() {
        return swipedCardState;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getSoldState() {
        return soldState;
    }
    

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nWelcome to Mike's Popsicle Machine\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}