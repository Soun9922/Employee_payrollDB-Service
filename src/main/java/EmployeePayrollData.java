import java.time.LocalDate;
import java.util.Objects;

public class EmployeePayrollData {
    public int employeeId;
    public String employeeName;
    public double employeeSalary;
    public LocalDate startDate;

    public EmployeePayrollData(Integer id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public EmployeePayrollData(Integer id, String name, double salary, LocalDate startDate) {
        this(id, name, salary);
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "EmployeeId=" + employeeId +
                ", EmployeeName='" + employeeName + '\'' +
                ", EmployeeSalary=" + employeeSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EmployeePayrollData that = (EmployeePayrollData) o;
        return employeeId == that.employeeId
                && Double.compare(that.employeeSalary, employeeSalary) == 0
                && employeeName.equals(that.employeeName);
    }
}
