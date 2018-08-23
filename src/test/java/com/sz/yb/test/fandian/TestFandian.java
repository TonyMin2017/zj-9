package com.sz.yb.test.fandian;

import com.sz.yb.dao.FanDianDao;
import com.sz.yb.model.FanDian;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by tony on 2018/8/20.
 */
public class TestFandian {


    @Test
    public void testAddFandian(){    //添加一条记录；
        FanDian fanDian = new FanDian();
        fanDian.setFname("拥抱饭店");
        //1. 读取mybatis核心配置文件；
        String file = "mybatis-config.xml";
        Reader reader = null;
        SqlSessionFactory factory = null;
        SqlSession sqlSession = null;
        try {
            reader = Resources.getResourceAsReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2. 得到SqlSessionFactory;
        factory = new SqlSessionFactoryBuilder().build(reader);

        //3. 得到SqlSession;
        sqlSession = factory.openSession(true);
        //true: 表示自动提交事务。否则默认为手动提交。

        //4. 得到Dao;
        FanDianDao dao = sqlSession.getMapper(FanDianDao.class);

        //5. Dao调用映射文件中的sql
        int n = dao.addFanDian(fanDian);
        System.out.println(n);  //返回的行数 ；
        int fid = fanDian.getFid();   //返回的是自增长id;
        System.out.println(fid);
        System.out.println("test end;");

    }



    @Test
    public void testGetAllFandian(){    //查询所有记录；
        //1. 读取mybatis核心配置文件；
        String file = "mybatis-config.xml";
        Reader reader = null;
        SqlSessionFactory factory = null;
        SqlSession sqlSession = null;
        try {
            reader = Resources.getResourceAsReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2. 得到SqlSessionFactory;
        factory = new SqlSessionFactoryBuilder().build(reader);

        //3. 得到SqlSession;
        sqlSession = factory.openSession(true);
        //true: 表示自动提交事务。否则默认为手动提交。

        //4. 得到Dao;
        FanDianDao dao = sqlSession.getMapper(FanDianDao.class);

        //5. Dao调用映射文件中的sql
        List<FanDian> list = dao.getAllFanDian2();
        for(FanDian fanDian : list){
            System.out.println(fanDian.toString());
        }
        System.out.println("test end;");

    }


    @Test
    public void testDeleteFandian(){    //删除一条记录；
        //1. 读取mybatis核心配置文件；
        String file = "mybatis-config.xml";
        Reader reader = null;
        SqlSessionFactory factory = null;
        SqlSession sqlSession = null;
        try {
            reader = Resources.getResourceAsReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2. 得到SqlSessionFactory;
        factory = new SqlSessionFactoryBuilder().build(reader);

        //3. 得到SqlSession;
        sqlSession = factory.openSession(true);
        //true: 表示自动提交事务。否则默认为手动提交。

        //4. 得到Dao;
        FanDianDao dao = sqlSession.getMapper(FanDianDao.class);

        //5. Dao调用映射文件中的sql
        int n = dao.deleteFandian(10);
        System.out.println(n);
        List<FanDian> list = dao.getAllFanDian2();
        for(FanDian fanDian : list){
            System.out.println(fanDian.toString());
        }
        System.out.println("test end;");
    }



    @Test
    public void testUpdateFandian(){    //修改一条记录；
        //1. 读取mybatis核心配置文件；
        String file = "mybatis-config.xml";
        Reader reader = null;
        SqlSessionFactory factory = null;
        SqlSession sqlSession = null;
        try {
            reader = Resources.getResourceAsReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2. 得到SqlSessionFactory;
        factory = new SqlSessionFactoryBuilder().build(reader);

        //3. 得到SqlSession;
        sqlSession = factory.openSession(true);
        //true: 表示自动提交事务。否则默认为手动提交。

        //4. 得到Dao;
        FanDianDao dao = sqlSession.getMapper(FanDianDao.class);

        //5. Dao调用映射文件中的sql
        FanDian fanDian = new FanDian(9,"拥抱饭店2");
        int n = dao.updateFanDian(fanDian);
        System.out.println(n);
        System.out.println("test end;");
    }

}
