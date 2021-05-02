package interfaceAbstract;

public class StarbucksManager extends BaseCustomerManager implements CustomerService {

	private CustomerCheckService checkService;
	public StarbucksManager(CustomerCheckService checkService) {
		
		this.checkService = checkService;
	}
	@Override
	public void Save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
		super.Save(customer);
		}
	}

}
