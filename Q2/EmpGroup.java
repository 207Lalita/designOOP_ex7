import java.util.ArrayList;
import java.util.List;

public class EmpGroup extends EmpComp {
    private List<EmpComp> employee = new ArrayList<>();
    private String groupName;

    public EmpGroup(String groupName)
    {
        this.groupName = groupName;
    }

    @Override
    public void add(EmpComp employeeComponent)
    {
        employee.add(employeeComponent);
    }

    @Override
    public void remove(EmpComp employeeComponent)
    {
        employee.remove(employeeComponent);
    }

    @Override
    public void print()
    {
        System.out.println("\n"+ groupName + " Group:");
        for (EmpComp emp : employee)
        {
            emp.print();
        }

    }



}
