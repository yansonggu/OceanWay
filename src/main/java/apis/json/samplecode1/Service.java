package apis.json.samplecode1;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This is main POJO class which contains list of all employees data
 */
public class Service {
    private List<Employee> Employee = null;

    public List<Employee> getEmpList() {
        return Employee;
    }

    public void setEmployee(List<Employee> empList) {
        this.Employee = empList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("employee", Employee).toString();
    }

}
