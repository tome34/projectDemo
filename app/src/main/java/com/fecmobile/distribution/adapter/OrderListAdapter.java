package com.fecmobile.distribution.adapter;

import android.support.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/**
 * @author tome
 * @date 2018/7/24  15:14
 * @describe ${订单列表}
 */
public class OrderListAdapter extends BaseQuickAdapter<String,BaseViewHolder>{

    public OrderListAdapter(int layoutResId,@Nullable List<String> data) {
        super(layoutResId,data);
    }

    @Override
    protected void convert(BaseViewHolder helper,String item) {

    }
}
