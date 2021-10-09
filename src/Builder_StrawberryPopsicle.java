

public class Builder_StrawberryPopsicle extends Builder_Popsicle {
	public Builder_StrawberryPopsicle() {
		this.name = "Strawberry Popsicle";
	}

	@Override
	public Builder_Popsicle addStrawberry() {
		this.flavors.add("Strawberry");
		return this;
	}
	@Override
	public Builder_Popsicle addBlueberry() {
		//Nothing
		return this;
	}
	@Override
	public Builder_Popsicle addLemonLime() {
		//Nothing
		return this;
	}
	@Override
	public Builder_Popsicle addChocolate() {
		//Nothing
		return this;
	}
	@Override
	public Builder_Popsicle addGrape() {
		//Nothing
		return this;
	}
	@Override
	public Builder_Popsicle addBlueRasberry() {
		//Nothing
		return this;
	}
	@Override
	public Builder_Popsicle addOrange() {
		//Nothing
		return this;
	}
	
	public Popsicle build() {
		Popsicle popsicle = new Popsicle();
		popsicle.setName(this.name);
		popsicle.addFlavors(flavors);
		return popsicle;
	}
	
}