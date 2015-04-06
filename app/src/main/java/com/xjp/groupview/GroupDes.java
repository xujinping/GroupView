package com.xjp.groupview;

import java.util.List;

/**
 * Description:对一个GroupView的描述
 * User: xjp
 * Date: 2015/4/6
 * Time: 9:39
 */

public class GroupDes {
    public String title;
    public List<RowViewDes> rowViewDesList;

    public GroupDes(String title, List<RowViewDes> rowViewDesList) {
        this.title = title;
        this.rowViewDesList = rowViewDesList;
    }
}
