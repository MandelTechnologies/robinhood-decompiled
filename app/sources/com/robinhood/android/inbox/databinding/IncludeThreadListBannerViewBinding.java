package com.robinhood.android.inbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.inbox.C18721R;

/* loaded from: classes10.dex */
public final class IncludeThreadListBannerViewBinding implements ViewBinding {
    private final RdsInfoBannerView rootView;

    private IncludeThreadListBannerViewBinding(RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsInfoBannerView getRoot() {
        return this.rootView;
    }

    public static IncludeThreadListBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeThreadListBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18721R.layout.include_thread_list_banner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeThreadListBannerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeThreadListBannerViewBinding((RdsInfoBannerView) view);
    }
}
