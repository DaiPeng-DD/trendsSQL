package pojo;

import java.io.Serializable;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Date;

public class Emp implements Serializable {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private int sal;
    //奖金
    private int comm;
    private String deptno;
    //private User user;


    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}'+"\n";
    }
}
