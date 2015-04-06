package com.xjp.groupview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements OnRowClickListener {

    private ContainerView containerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        containerView = (ContainerView) findViewById(R.id.containerView);


        List<GroupDes> groupDesList = new ArrayList<>();

        List<RowViewDes> list = new ArrayList<>();
        RowViewDes rowViewDes = new RowViewDes(R.drawable.ic_tel, "电话咨询", RowViewEnum.TEL);
        list.add(rowViewDes);
        RowViewDes rowViewDes1 = new RowViewDes(R.drawable.ic_doc, "询问医生", RowViewEnum.DOC);
        list.add(rowViewDes1);

        GroupDes groupDes = new GroupDes(null, list);
        groupDesList.add(groupDes);

        List<RowViewDes> list2 = new ArrayList<>();
        RowViewDes rowViewDes2 = new RowViewDes(R.drawable.ic_tel, "电话咨询", RowViewEnum.TI_JIAN);
        list2.add(rowViewDes2);
        RowViewDes rowViewDes3 = new RowViewDes(R.drawable.ic_doc, "询问医生", RowViewEnum.AA);
        list2.add(rowViewDes3);

        GroupDes groupDes1 = new GroupDes(null, list2);
        groupDesList.add(groupDes1);

        containerView.initView(groupDesList, this);

    }


    @Override
    public void onClick(RowViewEnum rowViewEnum) {

        switch (rowViewEnum) {
            case TEL:
                break;
            case DOC:
                break;
            case TI_JIAN:
                break;
            case AA:
                break;
        }

        Toast.makeText(this, "current position is" + rowViewEnum.name(), Toast.LENGTH_SHORT).show();
    }
}
