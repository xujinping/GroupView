package com.xjp.groupview;

/**
 * Description:每一个最小单元RowView的描述
 * User: xjp
 * Date: 2015/4/6
 * Time: 8:48
 */

public class RowViewDes {
    public int imgTitleId;
    public String msg;
    public RowViewEnum rowViewEnum;


    public RowViewDes(int imgTitleId, String msg, RowViewEnum rowViewEnum) {
        this.imgTitleId = imgTitleId;
        this.msg = msg;
        this.rowViewEnum = rowViewEnum;
    }
}
