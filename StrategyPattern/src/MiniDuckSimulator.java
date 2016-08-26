
public class MiniDuckSimulator {

	public static void main(String[] args) {
		System.out.println("This is a Mallard Duck: ");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("\nThis is a Model Duck: ");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
