package test;

import dao.Select_Dept;
import dao.Select_If;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import pojo.Dept;
import pojo.Emp;
import pojo.test01;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class main01 {


    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis_config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        Select_Dept select_dept=sqlSession.getMapper(Select_Dept.class);
        Select_If select_if=sqlSession.getMapper(Select_If.class);
//        //插入
//        List <test01> list=new LinkedList<test01>();
//        for (int i=0;i<10;i++){
//            list.add(new test01("00"+i,"123456","ll","1111111"));
//        }
//        System.out.println(select_if.insert_all(list));
//        sqlSession.commit();
//        //查询
//        test01 test0= select_if.select_one(new test01("002"));
//        if (test0!=null)
//        {System.out.println(test0.toString());}
//
//        sqlSession.close();


//        List<Map<String,Object>> list= select_dept.selectDeptToEmps1();
//        //System.out.println(list.toString());
//
//        System.out.println("-------------------------------");
//        List<Map<String,Object>> list1 = select_dept.selectDeptAndEmps2();
//        System.out.println(list1.toString());
//
//
//
//          System.out.println(select_if.getUserAll());


        System.out.println(select_dept.findList1(new Dept("123")));
        System.out.println("-----------------------------");

        System.out.println(select_dept.findList2(new Dept("222111")));
        System.out.println("-----------------------------");

        //System.out.println(new Dept("222111","张三"));
        select_dept.update(new Dept("222111","李四"));
        sqlSession.commit();
        System.out.println("-----------------------------");

        System.out.println(select_dept.findList3());
        System.out.println("-----------------------------");

        List<Integer> list= new LinkedList<Integer>();
        list.add(1111);
        list.add(123);
        System.out.println(select_dept.findList4(list));
        System.out.println("-----------------------------");



        Map<String,Integer> map = new HashMap<>();
        map.put("key1",1111);
        map.put("key2",9);
        List<Dept> list1=select_dept.findList6((HashMap<String, Integer>) map);
        list1.forEach(item -> System.out.println(item));

    }
}
