package com.robinhood.android.cash.merchantrewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.designsystem.button.RdsIconButton;

/* loaded from: classes7.dex */
public final class IncludeMerchantrewardsOverviewHeaderBinding implements ViewBinding {
    public final RdsIconButton merchantrewardsOverviewInfoButton;
    private final RdsIconButton rootView;

    private IncludeMerchantrewardsOverviewHeaderBinding(RdsIconButton rdsIconButton, RdsIconButton rdsIconButton2) {
        this.rootView = rdsIconButton;
        this.merchantrewardsOverviewInfoButton = rdsIconButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsIconButton getRoot() {
        return this.rootView;
    }

    public static IncludeMerchantrewardsOverviewHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMerchantrewardsOverviewHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10127R.layout.include_merchantrewards_overview_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMerchantrewardsOverviewHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsIconButton rdsIconButton = (RdsIconButton) view;
        return new IncludeMerchantrewardsOverviewHeaderBinding(rdsIconButton, rdsIconButton);
    }
}
