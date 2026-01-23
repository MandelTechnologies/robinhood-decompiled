package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.earlypay.C14433R;

/* loaded from: classes7.dex */
public final class FragmentEarlyPayToggleBinding implements ViewBinding {
    private final RdsToggleView rootView;
    public final RdsToggleView toggleView;

    private FragmentEarlyPayToggleBinding(RdsToggleView rdsToggleView, RdsToggleView rdsToggleView2) {
        this.rootView = rdsToggleView;
        this.toggleView = rdsToggleView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsToggleView getRoot() {
        return this.rootView;
    }

    public static FragmentEarlyPayToggleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEarlyPayToggleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14433R.layout.fragment_early_pay_toggle, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEarlyPayToggleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsToggleView rdsToggleView = (RdsToggleView) view;
        return new FragmentEarlyPayToggleBinding(rdsToggleView, rdsToggleView);
    }
}
