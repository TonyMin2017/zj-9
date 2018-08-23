package com.sz.yb.controller;

import com.sz.yb.dao.FanDianDao;
import com.sz.yb.dao.MenuDao;
import com.sz.yb.model.FanCai;
import com.sz.yb.model.FanDian;
import com.sz.yb.model.YbMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by tony on 2018/8/21.
 */
@Controller
public class FanDianController {
    @Autowired
    private FanDianDao fanDianDao;

    @Autowired
    private MenuDao menuDao;

    @RequestMapping("/getAllFanDian")
    @ResponseBody
    public List<FanDian> getAllFanDian(Model model){
        List<FanDian> list = fanDianDao.getAllFanDian2();
        for(FanDian f : list){
            int fid = f.getFid();
            List<YbMenu> list2 = menuDao.getMenuByFid(fid);
            f.setList(list2);
        }
        return list;
    }

    @RequestMapping("/getAllFanDian2")
    @ResponseBody
    public List<FanDian> getAllFanDian2(){
        List<FanDian> list = fanDianDao.getAllFanDian2();
        return list;
    }


    @RequestMapping("/getAllFanDian3")
    @ResponseBody
    public List<FanDian> getAllFanDian3(String fname,String mname){
        FanCai fanCai = new FanCai();
        if(fname!=null){
            fanCai.setFname(fname);
        }
        if(mname!=null){
            fanCai.setMname(mname);
        }
        System.out.println(fname+":"+mname);
        List<FanDian> list = fanDianDao.getAllFanDian(fanCai);
        return list;
    }


    @RequestMapping("/getAllFanDian4")
    @ResponseBody
    public List<FanDian> getAllFanDian4(String fname,String mname){
        FanCai fanCai = new FanCai();
        if(fname!=null){
            fanCai.setFname(fname);
        }
        if(mname!=null){
            fanCai.setMname(mname);
        }
        System.out.println(fname+":"+mname);
        List<FanDian> list = fanDianDao.getAllFanDian(fanCai);
        return list;
    }


    @RequestMapping("/getAllFanDian5")
    public String getAllFanDian5(Model model){
        int [] arr = {1,2,3,8};
        List<FanDian> list = fanDianDao.getAllFanDian5(arr);
        model.addAttribute("list",list);
        return "fandian";
    }
}
