package com.robinhood.shared.pathfinder.corepages.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.shared.pathfinder.corepages.C39352R;

/* loaded from: classes6.dex */
public final class ReviewAgreementFragmentBinding implements ViewBinding {
    public final RdsAgreementView baseAgreementView;
    private final RdsAgreementView rootView;

    private ReviewAgreementFragmentBinding(RdsAgreementView rdsAgreementView, RdsAgreementView rdsAgreementView2) {
        this.rootView = rdsAgreementView;
        this.baseAgreementView = rdsAgreementView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsAgreementView getRoot() {
        return this.rootView;
    }

    public static ReviewAgreementFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReviewAgreementFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39352R.layout.review_agreement_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ReviewAgreementFragmentBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsAgreementView rdsAgreementView = (RdsAgreementView) view;
        return new ReviewAgreementFragmentBinding(rdsAgreementView, rdsAgreementView);
    }
}
