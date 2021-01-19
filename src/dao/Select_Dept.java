package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Dept;

import javax.swing.event.ListDataEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Select_Dept {
    public List<Map<String,Object>> selectDeptToEmps1();

    public List<Map<String,Object>>selectDeptAndEmps2();

    public List<Dept> findList1(Dept dept);

    public List<Dept> findList2(Dept dept);

    public void update(Dept dept);

    public void update1(Dept dept);

    public List<Dept> findList3();

    public List<Dept> findList4(List <Integer> list);

    public List<Dept> findList6(@Param("myMap")HashMap<String,Integer> map);


}
