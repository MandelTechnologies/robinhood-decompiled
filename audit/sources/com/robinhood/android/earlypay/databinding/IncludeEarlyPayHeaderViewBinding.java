package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayHeaderView;

/* loaded from: classes7.dex */
public final class IncludeEarlyPayHeaderViewBinding implements ViewBinding {
    private final EarlyPayHeaderView rootView;

    private IncludeEarlyPayHeaderViewBinding(EarlyPayHeaderView earlyPayHeaderView) {
        this.rootView = earlyPayHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EarlyPayHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeEarlyPayHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEarlyPayHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14433R.layout.include_early_pay_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEarlyPayHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEarlyPayHeaderViewBinding((EarlyPayHeaderView) view);
    }
}
