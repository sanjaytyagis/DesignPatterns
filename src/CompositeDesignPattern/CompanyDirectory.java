package CompositeDesignPattern;
import java.util.*;

public class CompanyDirectory implements Employee{

	private List<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
        
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println(employeeList.size());
		for(Employee emp:employeeList)
        {
			System.out.println(emp);
            emp.showEmployeeDetails();
        }
	}
    
	
}
