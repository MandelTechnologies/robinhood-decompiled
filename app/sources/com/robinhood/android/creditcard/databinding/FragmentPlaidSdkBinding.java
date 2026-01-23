package com.robinhood.android.creditcard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.RdsLoadingView;
import com.robinhood.android.creditcard.C12201R;

/* loaded from: classes2.dex */
public final class FragmentPlaidSdkBinding implements ViewBinding {
    private final RdsLoadingView rootView;

    private FragmentPlaidSdkBinding(RdsLoadingView rdsLoadingView) {
        this.rootView = rdsLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentPlaidSdkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlaidSdkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12201R.layout.fragment_plaid_sdk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPlaidSdkBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentPlaidSdkBinding((RdsLoadingView) view);
    }
}
