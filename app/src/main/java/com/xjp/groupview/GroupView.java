package com.xjp.groupview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Description:一组最小单元组成的一个GroupView
 * User: xjp
 * Date: 2015/4/6
 * Time: 8:43
 */

public class GroupView extends LinearLayout {

    private Context context;

    public GroupView(Context context) {
        super(context);
        this.context = context;
    }

    public GroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public GroupView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public void initView(List<RowViewDes> rowViewDes, OnRowClickListener listener) {
        setOrientation(VERTICAL);
        int size = rowViewDes.size();
        for (int i = 0; i < size; i++) {
            View line = new View(context);
            line.setBackgroundResource(R.color.press);
            LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1);
            RowViewDes rowViewDes1 = rowViewDes.get(i);
            RowView rowView = new RowView(context);
            rowView.setRes(rowViewDes1.imgTitleId, rowViewDes1.msg, listener, rowViewDes1.rowViewEnum);
            addView(rowView);
            if (i != (size - 1)) {
                addView(line, lp);
            }
        }
    }
}
