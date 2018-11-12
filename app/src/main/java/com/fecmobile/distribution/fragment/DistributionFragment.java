package com.fecmobile.distribution.fragment;

import com.fec.core.base.mvc.BaseVcTabListFragment;
import com.fec.core.bean.TabListBean;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tome
 * @date 2018/7/24  11:22
 * @describe ${我的配送}
 */
public class DistributionFragment extends BaseVcTabListFragment {

    @Override
    protected void initTitle() {
        super.initTitle();
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected int getLayout() {
        return super.getLayout();
        //可重写布局
    }

    @Override
    protected List<TabListBean> tabTitles() {
        List<TabListBean> list = new ArrayList<>();
        TabListBean bean1 = new TabListBean("全部配送", OrderFragment.instance(""));
        TabListBean bean2 = new TabListBean("接单", OrderFragment.instance(""));
        TabListBean bean3 = new TabListBean("待配送", OrderFragment.instance(""));
        TabListBean bean4 = new TabListBean("配送中", OrderFragment.instance(""));
        TabListBean bean5 = new TabListBean("已完成", OrderFragment.instance(""));
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);
        list.add(bean4);
        list.add(bean5);
        return list;
    }

    @Override
    protected String setTitle() {
        return "我的配送";
    }
}
