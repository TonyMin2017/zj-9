package com.sz.yb.dao;

import com.sz.yb.model.YbMenu;

import java.util.List;

/**
 * Created by tony on 2018/8/21.
 */
public interface MenuDao {

    public List<YbMenu> getMenuByFid(int fid);
}
