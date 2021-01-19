package dao;

import pojo.test01;

import java.util.List;

public interface Select_If {
    public test01 select_one(test01 test);
    public int insert_all(List list);

    public List getUserAll();
}
