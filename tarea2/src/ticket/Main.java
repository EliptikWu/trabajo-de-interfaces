package ticket;

import ticket.EmployeeController;
import ticket.Employee;
import ticket.EmployeeView;

public class Main {
    public static void main(String[] args) {
        // fetching the employee record based on the employee_id from the database
        Employee model = retriveEmployeeFromDatabase();

        // creating a view to write Employee details on console
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        //updating the model data
        controller.setEmployeeName("Likun");
        System.out.println("\nEmployee details will be displayed below when refreshed: ");

        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Elip");
        Employee.setId("7");
        Employee.setDepartment("Manager");
        return Employee;
    }
}