package collection_Ex;

import java.util.HashMap;
import java.util.Map;

public class EmpDao {
    // 1회성 map 타입 사용
    public Map<String, Object> selectEmpMapOne() {
        Map<String, Object> map = new HashMap<>();

        map.put("empNo", 1);
        map.put("empName", "루피");
        map.put("deptNo", 100);
        map.put("deptName", "밀짚모자해적단");
        map.put("deptLoc", "이스트블루");

        return map;
    }

    public EmpAndDept selectEmpVOOne() {
        Emp emp = new Emp();
        emp.setEmpNo(1);
        emp.setEmpName("루피");
        emp.setDeptNo(100);
        Dept dept = new Dept();
        dept.setDeptNo(100);
        dept.setDeptName("밀짚모자해적단");
        dept.setDeptLoc("이스트블루");

        EmpAndDept ed = new EmpAndDept();
        ed.setEmp(emp);
        ed.setDept(dept);
        return ed;
    }

    public static void main(String[] args) {
        EmpDao empDao = new EmpDao();
        EmpAndDept ed = empDao.selectEmpVOOne();
        System.out.print(ed.getEmp().getEmpNo()+"\t");
        System.out.print(ed.getEmp().getEmpName()+"\t");
        System.out.print(ed.getEmp().getDeptNo()+"\t");
        System.out.print(ed.getDept().getDeptName()+"\t");
        System.out.print(ed.getDept().getDeptLoc()+"\n");

        Map<String, Object> map = empDao.selectEmpMapOne();
        System.out.print((Integer)map.get("empNo")+"\t");
        System.out.print((String)map.get("empName")+"\t");
        System.out.print((Integer)map.get("deptNo")+"\t");
        System.out.print((String)map.get("deptName")+"\t");
        System.out.print((String)map.get("deptLoc")+"\n");


    }
}
