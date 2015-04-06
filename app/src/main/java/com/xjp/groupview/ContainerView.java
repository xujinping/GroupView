package com.xjp.groupview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Description:
 * User: xjp
 * Date: 2015/4/6
 * Time: 9:27
 */

public class ContainerView extends LinearLayout {

    private Context context;

    public ContainerView(Context context) {
        super(context);
        this.context = context;
    }

    public ContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public ContainerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public void initView(List<GroupDes> groupDesList, OnRowClickListener listener) {
        setOrientation(VERTICAL);
        int size = groupDesList.size();
        for (int i = 0; i < size; i++) {
            LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            lp.topMargin = 20;
            GroupView groupView = new GroupView(context);
            groupView.initView(groupDesList.get(i).rowViewDesList, listener);
            addView(groupView,lp);
        }
    }
}
