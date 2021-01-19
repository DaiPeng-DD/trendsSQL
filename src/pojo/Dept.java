package pojo;

import java.util.List;

public class Dept {
    private String deptno;
    private String dname;
    private String loc;
    private String dLevel;
    private List<Emp> empList;


    public Dept(){}
    public Dept(String deptno){
        this.deptno=deptno;
    }
    public Dept(String deptno,String dname){
        this.deptno=deptno;
        this.dname=dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno='" + deptno + '\'' +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", dLevel='" + dLevel + '\'' +

                '}'+"\n";
    }
}
