package com.robinhood.android.educationtour.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.C14469R;

/* loaded from: classes7.dex */
public final class IncludeEducationTourTooltipBinding implements ViewBinding {
    private final RdsTooltipView rootView;

    private IncludeEducationTourTooltipBinding(RdsTooltipView rdsTooltipView) {
        this.rootView = rdsTooltipView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsTooltipView getRoot() {
        return this.rootView;
    }

    public static IncludeEducationTourTooltipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEducationTourTooltipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14469R.layout.include_education_tour_tooltip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEducationTourTooltipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEducationTourTooltipBinding((RdsTooltipView) view);
    }
}
