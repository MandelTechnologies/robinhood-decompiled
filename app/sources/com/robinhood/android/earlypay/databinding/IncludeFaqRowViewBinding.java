package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.earlypay.enrollment.p110ui.FaqRowView;

/* loaded from: classes7.dex */
public final class IncludeFaqRowViewBinding implements ViewBinding {
    private final FaqRowView rootView;

    private IncludeFaqRowViewBinding(FaqRowView faqRowView) {
        this.rootView = faqRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FaqRowView getRoot() {
        return this.rootView;
    }

    public static IncludeFaqRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeFaqRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14433R.layout.include_faq_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeFaqRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeFaqRowViewBinding((FaqRowView) view);
    }
}
