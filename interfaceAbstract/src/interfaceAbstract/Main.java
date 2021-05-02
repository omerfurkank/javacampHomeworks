package interfaceAbstract;

public class Main {

	public static void main(String[] args) {
		StarbucksManager manager=new StarbucksManager(new CustomerCheckManager());
manager.Save(new Customer(1, "ömer", "12345678910"));
	}

}
