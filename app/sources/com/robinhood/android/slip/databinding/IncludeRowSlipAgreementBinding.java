package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.agreements.SlipAgreementRow;

/* loaded from: classes5.dex */
public final class IncludeRowSlipAgreementBinding implements ViewBinding {
    private final SlipAgreementRow rootView;

    private IncludeRowSlipAgreementBinding(SlipAgreementRow slipAgreementRow) {
        this.rootView = slipAgreementRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SlipAgreementRow getRoot() {
        return this.rootView;
    }

    public static IncludeRowSlipAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowSlipAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28532R.layout.include_row_slip_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowSlipAgreementBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowSlipAgreementBinding((SlipAgreementRow) view);
    }
}
