package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class MergeRecommendationsTotalRowBinding implements ViewBinding {
    public final RhTextView labelTxt;
    private final ConstraintLayout rootView;
    public final ConstraintLayout totalRowContainer;
    public final RhTextView valueTxt;

    private MergeRecommendationsTotalRowBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ConstraintLayout constraintLayout2, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.labelTxt = rhTextView;
        this.totalRowContainer = constraintLayout2;
        this.valueTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeRecommendationsTotalRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeRecommendationsTotalRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.merge_recommendations_total_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeRecommendationsTotalRowBinding bind(View view) {
        int i = C29895R.id.label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C29895R.id.value_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i2);
            if (rhTextView2 != null) {
                return new MergeRecommendationsTotalRowBinding(constraintLayout, rhTextView, constraintLayout, rhTextView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
