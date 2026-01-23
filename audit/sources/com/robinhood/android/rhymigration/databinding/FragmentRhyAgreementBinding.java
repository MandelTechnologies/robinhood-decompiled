package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.shared.common.agreementview.RdsAgreementView;

/* loaded from: classes5.dex */
public final class FragmentRhyAgreementBinding implements ViewBinding {
    public final RdsAgreementView rhyAgreementView;
    private final FrameLayout rootView;

    private FragmentRhyAgreementBinding(FrameLayout frameLayout, RdsAgreementView rdsAgreementView) {
        this.rootView = frameLayout;
        this.rhyAgreementView = rdsAgreementView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyAgreementBinding bind(View view) {
        int i = C27577R.id.rhy_agreement_view;
        RdsAgreementView rdsAgreementView = (RdsAgreementView) ViewBindings.findChildViewById(view, i);
        if (rdsAgreementView != null) {
            return new FragmentRhyAgreementBinding((FrameLayout) view, rdsAgreementView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
