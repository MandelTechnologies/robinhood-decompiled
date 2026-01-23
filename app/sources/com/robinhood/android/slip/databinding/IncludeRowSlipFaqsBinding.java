package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.onboarding.faqs.SlipFaqsAccordionRow;

/* loaded from: classes5.dex */
public final class IncludeRowSlipFaqsBinding implements ViewBinding {
    private final SlipFaqsAccordionRow rootView;

    private IncludeRowSlipFaqsBinding(SlipFaqsAccordionRow slipFaqsAccordionRow) {
        this.rootView = slipFaqsAccordionRow;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SlipFaqsAccordionRow getRoot() {
        return this.rootView;
    }

    public static IncludeRowSlipFaqsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowSlipFaqsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28532R.layout.include_row_slip_faqs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowSlipFaqsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowSlipFaqsBinding((SlipFaqsAccordionRow) view);
    }
}
