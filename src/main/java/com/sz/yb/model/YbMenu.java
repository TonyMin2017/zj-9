package com.sz.yb.model;

/**
 * Created by tony on 2018/8/21.
 */
public class YbMenu {
    private int mid;
    private String mname;
    private int fid;

    public YbMenu() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "YbMenu{" +
                "mid=" + mid +
                ", mname=" + mname +
                ", fid=" + fid +
                '}';
    }
}
