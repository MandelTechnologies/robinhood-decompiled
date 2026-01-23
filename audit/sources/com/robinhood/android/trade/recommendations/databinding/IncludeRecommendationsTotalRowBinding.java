package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.trade.recommendations.C29895R;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsTotalRowView;

/* loaded from: classes9.dex */
public final class IncludeRecommendationsTotalRowBinding implements ViewBinding {
    private final RecommendationsTotalRowView rootView;

    private IncludeRecommendationsTotalRowBinding(RecommendationsTotalRowView recommendationsTotalRowView) {
        this.rootView = recommendationsTotalRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecommendationsTotalRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRecommendationsTotalRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecommendationsTotalRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.include_recommendations_total_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecommendationsTotalRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRecommendationsTotalRowBinding((RecommendationsTotalRowView) view);
    }
}
