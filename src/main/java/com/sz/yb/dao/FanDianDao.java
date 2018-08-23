package com.sz.yb.dao;

import com.sz.yb.model.FanCai;
import com.sz.yb.model.FanDian;
import com.sz.yb.model.Pager;

import java.util.List;

/**
 * Created by tony on 2018/8/20.
 */
public interface FanDianDao {

    //1.增加一个饭店名称；
    public int addFanDian(FanDian fanDian);

    //2.查询所有饭店名称；
    public List<FanDian> getAllFanDian2();

    //2.查询所有饭店名称；
    public List<FanDian> getAllFanDian(FanCai fanCai);

    //2.1.查询所有饭店名称；带查询条件的；
    public List<FanDian> getAllFanDianByName(String fname);

    //2.2.查询所有饭店名称；带查询条件的；
    public List<FanDian> getAllFanDianByID(int fid);

    //2.3.查询所有饭店名称；带分页
    public List<FanDian> getAllFanDianByPage(Pager pager);

    //3.删除一条记录
    public int deleteFandian(int fid);

    //4.修改一条记录；
    public int updateFanDian(FanDian fanDian);



    //5.查询所有饭店名称；传入的是一个数组、集合
    public List<FanDian> getAllFanDian5(int [] arr);

}
