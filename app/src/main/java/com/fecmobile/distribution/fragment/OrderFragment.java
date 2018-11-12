package com.fecmobile.distribution.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import com.fec.core.base.mvc.BaseVcListFragment;
import com.fecmobile.distribution.R;
import com.fecmobile.distribution.adapter.OrderListAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tome
 * @date 2018/7/24  14:42
 * @describe ${配送订单}
 */
public class OrderFragment extends BaseVcListFragment {
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.refresh_layout)
    SmartRefreshLayout mSrlLayout;

    private OrderListAdapter mAdapter ;
    private List<String> mDataList;

    @Override
    protected int getLayout() {
        return R.layout.fragment_order;
    }

    public static OrderFragment instance(String type) {
        OrderFragment orderFragment = new OrderFragment();
        Bundle bundle = new Bundle();
        bundle.putString("type",type);
        orderFragment.setArguments(bundle);
        return orderFragment;
    }

    @Override
    protected void initTitle() {
        Bundle bundle = getArguments();
        String type = bundle.getString("type");

    }

    @Override
    protected void initView() {
        super.rlRefreshLayout = mSrlLayout ;
        super.initView();
        mDataList = new ArrayList<>();
        mAdapter = new OrderListAdapter(R.layout.item_order_list, mDataList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setHasFixedSize(true);



    }

    @Override
    public void loadListData(SmartRefreshLayout rlRefreshLayout,int page,int pageSize) {

    }
}
