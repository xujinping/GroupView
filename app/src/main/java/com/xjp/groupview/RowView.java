package com.xjp.groupview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Description:最小单元一行的布局RowView
 * User: xjp
 * Date: 2015/4/3
 * Time: 15:20
 */

public class RowView extends LinearLayout implements View.OnClickListener {

    private Context context;
    private ImageView imgTitle;
    private TextView txtContent;
    private ImageView imgRight;
    private OnRowClickListener mOnRowView;
    private RowViewEnum rowViewEnum;

    public RowView(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public RowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    public RowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    /**
     * 初始化
     */

    private void initView() {
        this.setOnClickListener(this);
        View viewRoot = LayoutInflater.from(context).inflate(R.layout.item_rowview, this);
        imgTitle = (ImageView) viewRoot.findViewById(R.id.imgTitle);
        txtContent = (TextView) viewRoot.findViewById(R.id.tv_content);
        imgRight = (ImageView) viewRoot.findViewById(R.id.imgRight);
    }

    /**
     * 设置资源
     *
     * @param imgTitleId
     * @param msg
     */
    public void setRes(int imgTitleId, String msg, OnRowClickListener mOnRowView, RowViewEnum rowViewEnum) {
        imgTitle.setImageResource(imgTitleId);
        txtContent.setText(msg);
        this.mOnRowView = mOnRowView;
        this.rowViewEnum = rowViewEnum;
        if (null != rowViewEnum) {
            setBackgroundResource(R.drawable.rowview_selector);
        } else {
            setBackgroundResource(R.color.no_press);
            imgRight.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        /**
         * 点击事件回调
         */
        if (null != rowViewEnum) {
            mOnRowView.onClick(rowViewEnum);
        }

    }
}
