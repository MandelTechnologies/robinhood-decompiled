package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes24.dex */
public final class FragmentAcatsInBrokerageSearchBinding implements ViewBinding {
    public final RdsInfoBannerView iacInfoBannerView;
    public final ShimmerLoadingView loadingView;
    public final RecyclerView recyclerview;
    private final LinearLayout rootView;
    public final RdsTextInputEditText searchToolbarEdt;

    private FragmentAcatsInBrokerageSearchBinding(LinearLayout linearLayout, RdsInfoBannerView rdsInfoBannerView, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, RdsTextInputEditText rdsTextInputEditText) {
        this.rootView = linearLayout;
        this.iacInfoBannerView = rdsInfoBannerView;
        this.loadingView = shimmerLoadingView;
        this.recyclerview = recyclerView;
        this.searchToolbarEdt = rdsTextInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInBrokerageSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInBrokerageSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_brokerage_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInBrokerageSearchBinding bind(View view) {
        int i = C7725R.id.iac_info_banner_view;
        RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
        if (rdsInfoBannerView != null) {
            i = C7725R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C7725R.id.recyclerview;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C7725R.id.search_toolbar_edt;
                    RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputEditText != null) {
                        return new FragmentAcatsInBrokerageSearchBinding((LinearLayout) view, rdsInfoBannerView, shimmerLoadingView, recyclerView, rdsTextInputEditText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
