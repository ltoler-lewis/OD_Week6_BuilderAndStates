

public class Builder_RainbowPopsicle extends Builder_Popsicle {
	public Builder_RainbowPopsicle() {
		this.name = "Rainbow Popsicle";
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
		this.flavors.add("Lemon-Lime");
		return this;
	}
	@Override
	public Builder_Popsicle addChocolate() {
		//Nothing
		return this;
	}
	@Override
	public Builder_Popsicle addGrape() {
		this.flavors.add("Grape");
		return this;
	}
	@Override
	public Builder_Popsicle addBlueRasberry() {
		this.flavors.add("Blue Rasberry");
		return this;
	}
	@Override
	public Builder_Popsicle addOrange() {
		this.flavors.add("Orange");
		return this;
	}
	public Popsicle build() {
		System.out.println("In build");
		Popsicle popsicle = new Popsicle();
		System.out.println("Spawned pop");
		popsicle.setName(this.name);
		System.out.println("Set Name");
		popsicle.addFlavors(flavors);
		System.out.println("Added flavors");
		return popsicle;
	}
}