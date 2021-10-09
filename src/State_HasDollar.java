
public class State_HasDollar implements State {
 
    PopsicleMachine popsicleMachine;
 
    public State_HasDollar(PopsicleMachine popsicleMachine) {
        this.popsicleMachine = popsicleMachine;
    }

	@Override
	public void insertDollar() {
		System.out.println("You have already swiped your card.\n");
	}
	@Override
	public void swipeCard() {
		System.out.println("You have already swiped your card.\n");
		
	}
	@Override
	public void cancelTransaction() {
		System.out.println("The transaction has been cancelled.Your money will be returned.\n");
		popsicleMachine.setState(popsicleMachine.getIdleState());
	}

	@Override
	public void dispensePopsicle() {

	}

	@Override
	public boolean canRefill() {
		System.out.println("You cannot refill me in the middle of a transaction.");
		return false;
	}
	
	public String toString() {
		return "waiting for your choice.\n";
	}

	@Override
	public void pickPopsicle(String choice) {
		boolean validOption = false;
		if (choice == "Strawberry") {
			popsicleMachine.popBuilder = new Builder_StrawberryPopsicle();
			popsicleMachine.popsicle = popsicleMachine.popBuilder.addStrawberry().build();
			validOption = true;
			System.out.println("PickPopsicle");
		}
		else if (choice == "Rainbow") {
			popsicleMachine.popBuilder = new Builder_RainbowPopsicle();
			popsicleMachine.popsicle = popsicleMachine.popBuilder.addGrape().addBlueRasberry().addStrawberry().addLemonLime().addOrange().build();
			validOption = true;
		}
		
		
		
		if (!validOption) {
			System.out.println("It doesn't look like we carry that");
			//State stays the same
		}else {
			popsicleMachine.popsicle.prepare();
			popsicleMachine.popsicle.freeze();
			popsicleMachine.popsicle.wrap();
			popsicleMachine.setState(popsicleMachine.getIdleState());
		}
		
	}


}