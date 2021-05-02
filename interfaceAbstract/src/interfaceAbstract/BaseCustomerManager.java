package interfaceAbstract;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("save to db : "+customer.getName());
		
	}

}
