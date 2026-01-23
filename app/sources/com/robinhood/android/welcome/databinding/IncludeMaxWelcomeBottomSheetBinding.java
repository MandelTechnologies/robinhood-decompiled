package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes20.dex */
public final class IncludeMaxWelcomeBottomSheetBinding implements ViewBinding {
    public final RhTextView maxWelcomeFeatureDisclosure;
    public final RhTextView maxWelcomeFeatureSubtitle;
    public final RhTextView maxWelcomeFeatureTitle;
    private final LinearLayout rootView;

    private IncludeMaxWelcomeBottomSheetBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.maxWelcomeFeatureDisclosure = rhTextView;
        this.maxWelcomeFeatureSubtitle = rhTextView2;
        this.maxWelcomeFeatureTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeMaxWelcomeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMaxWelcomeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.include_max_welcome_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMaxWelcomeBottomSheetBinding bind(View view) {
        int i = C31456R.id.max_welcome_feature_disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C31456R.id.max_welcome_feature_subtitle;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C31456R.id.max_welcome_feature_title;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    return new IncludeMaxWelcomeBottomSheetBinding((LinearLayout) view, rhTextView, rhTextView2, rhTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
