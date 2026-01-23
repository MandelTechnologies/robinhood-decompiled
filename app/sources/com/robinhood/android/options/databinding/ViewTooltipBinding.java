package com.robinhood.android.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.options.C22993R;

/* loaded from: classes11.dex */
public final class ViewTooltipBinding implements ViewBinding {
    private final RdsTooltipView rootView;

    private ViewTooltipBinding(RdsTooltipView rdsTooltipView) {
        this.rootView = rdsTooltipView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsTooltipView getRoot() {
        return this.rootView;
    }

    public static ViewTooltipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewTooltipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22993R.layout.view_tooltip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewTooltipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewTooltipBinding((RdsTooltipView) view);
    }
}
