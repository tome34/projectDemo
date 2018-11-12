package com.fecmobile.distribution.activity;

import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import butterknife.BindView;
import com.fec.core.base.mvc.BaseVcActivity;
import com.fecmobile.distribution.R;
import com.fecmobile.distribution.fragment.DistributionFragment;
import com.fecmobile.distribution.fragment.SelfFragment;
import com.fecmobile.distribution.widget.CenterButton;

public class MainActivity extends BaseVcActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.fl_content)
    FrameLayout mflContent;
    @BindView(R.id.rb_distribution)
    CenterButton mRbDistribution;
    @BindView(R.id.rb_self)
    CenterButton mRbSelf;
    @BindView(R.id.rg_tab)
    RadioGroup mRgTab;

    public DistributionFragment mDistributionFragment;
    public SelfFragment mSelfFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initTitle() {
    }

    @Override
    protected void initView() {
        //radiobutton监听
        mRgTab.setOnCheckedChangeListener(this);
        //选择商品tab
        mRgTab.check(R.id.rb_distribution);
    }

    @Override
    public void onCheckedChanged(RadioGroup group,int checkedId) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //物流列表
        if (mDistributionFragment == null) {
            mDistributionFragment = new DistributionFragment();
            transaction.add(R.id.fl_content, mDistributionFragment);
        }

        if (checkedId == R.id.rb_distribution) {
            transaction.show(mDistributionFragment);
        }else {
            transaction.hide(mDistributionFragment);
        }

        //我的
        if (mSelfFragment == null) {
            mSelfFragment = new SelfFragment();
            transaction.add(R.id.fl_content, mSelfFragment);
        }

        if (checkedId == R.id.rb_self) {
            transaction.show(mSelfFragment);
        }else {
            transaction.hide(mSelfFragment);
        }

        transaction.commitAllowingStateLoss();
    }
}
