package performance.transferobject;

import java.io.Serializable;

public class EmployeeTO implements Serializable {

    private String empName;
    private String empId;
    private String empPhone;

    public EmployeeTO(String empName, String empId, String empPhone) {
        this.empName = empName;
        this.empId = empId;
        this.empPhone = empPhone;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public String toString() {
        return "EmployeeTO{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", empPhone='" + empPhone + '\'' +
                '}';
    }
}
