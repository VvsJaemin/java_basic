package collection_Ex;

public class Emp {
    private int empNo;
    private String empName;
    private int deptNo;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptNo() {
        return deptNo;
    }


    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", deptNo=" + deptNo +
                '}';
    }
}
