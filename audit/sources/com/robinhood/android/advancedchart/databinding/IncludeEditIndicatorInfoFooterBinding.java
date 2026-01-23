package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class IncludeEditIndicatorInfoFooterBinding implements ViewBinding {
    public final RhTextView infoFooter;
    private final RhTextView rootView;

    private IncludeEditIndicatorInfoFooterBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.infoFooter = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeEditIndicatorInfoFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEditIndicatorInfoFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.include_edit_indicator_info_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEditIndicatorInfoFooterBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeEditIndicatorInfoFooterBinding(rhTextView, rhTextView);
    }
}
