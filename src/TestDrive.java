
public class TestDrive {

	public static void main(String[] args) {
		PopsicleMachine popsicleMachine = new PopsicleMachine();

		System.out.println(popsicleMachine);

		popsicleMachine.insertDollar();
		popsicleMachine.pickPopsicle("Strawberry");

		System.out.println(popsicleMachine);
		
		popsicleMachine.swipeCard();
		System.out.println(popsicleMachine);
		popsicleMachine.pickPopsicle("Rainbow");
		popsicleMachine.swipeCard();
		popsicleMachine.pickPopsicle("Rainbow");
		
		System.out.println(popsicleMachine);
		
		popsicleMachine.swipeCard();
		System.out.println(popsicleMachine);

		popsicleMachine.cancelTransaction();
		
		//popsicleMachine.refill("Strawberry", 1);
		
		System.out.println(popsicleMachine);

	}
}