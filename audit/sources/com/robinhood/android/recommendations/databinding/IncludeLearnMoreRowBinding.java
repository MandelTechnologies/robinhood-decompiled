package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.p224ui.walkthrough.learnmore.LearnMoreRowView;

/* loaded from: classes11.dex */
public final class IncludeLearnMoreRowBinding implements ViewBinding {
    private final LearnMoreRowView rootView;

    private IncludeLearnMoreRowBinding(LearnMoreRowView learnMoreRowView) {
        this.rootView = learnMoreRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LearnMoreRowView getRoot() {
        return this.rootView;
    }

    public static IncludeLearnMoreRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeLearnMoreRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.include_learn_more_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeLearnMoreRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeLearnMoreRowBinding((LearnMoreRowView) view);
    }
}
