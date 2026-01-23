package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class IncludeEquityQuoteDividerWithoutTopDividerBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RhTextView sectionHeaderTxt;

    private IncludeEquityQuoteDividerWithoutTopDividerBinding(LinearLayout linearLayout, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.sectionHeaderTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeEquityQuoteDividerWithoutTopDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEquityQuoteDividerWithoutTopDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.include_equity_quote_divider_without_top_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEquityQuoteDividerWithoutTopDividerBinding bind(View view) {
        int i = C11303R.id.section_header_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new IncludeEquityQuoteDividerWithoutTopDividerBinding((LinearLayout) view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
