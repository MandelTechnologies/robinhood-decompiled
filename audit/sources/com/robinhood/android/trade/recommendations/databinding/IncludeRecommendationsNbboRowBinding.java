package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.trade.recommendations.C29895R;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsNbboRowView;

/* loaded from: classes9.dex */
public final class IncludeRecommendationsNbboRowBinding implements ViewBinding {
    private final RecommendationsNbboRowView rootView;

    private IncludeRecommendationsNbboRowBinding(RecommendationsNbboRowView recommendationsNbboRowView) {
        this.rootView = recommendationsNbboRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecommendationsNbboRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRecommendationsNbboRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecommendationsNbboRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.include_recommendations_nbbo_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecommendationsNbboRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRecommendationsNbboRowBinding((RecommendationsNbboRowView) view);
    }
}
