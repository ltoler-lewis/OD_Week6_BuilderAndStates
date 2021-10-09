
import java.util.List;
import java.util.ArrayList;

public abstract class Builder_Popsicle {
	String name;
	List<String> flavors = new ArrayList<String>();
	
	public abstract Builder_Popsicle addStrawberry();
	public abstract Builder_Popsicle addBlueberry();
	public abstract Builder_Popsicle addLemonLime();
	public abstract Builder_Popsicle addChocolate();
	public abstract Builder_Popsicle addGrape();
	public abstract Builder_Popsicle addBlueRasberry();
	public abstract Builder_Popsicle addOrange();

	public Popsicle build() {
		Popsicle popsicle = new Popsicle();
		popsicle.setName(this.name);
		popsicle.addFlavors(flavors);
		return popsicle;
	}
}