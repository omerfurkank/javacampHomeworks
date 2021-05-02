package interfaceAbstract;

public class Customer implements Entity {
private int id;
private String 	name;
private String nationalityId;
public Customer(int id, String name, String nationalityId) {
	super();
	this.id = id;
	this.name = name;
	this.nationalityId = nationalityId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNationalityId() {
	return nationalityId;
}
public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}
}
