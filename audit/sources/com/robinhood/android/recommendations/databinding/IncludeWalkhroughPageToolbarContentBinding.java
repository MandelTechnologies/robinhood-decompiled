package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class IncludeWalkhroughPageToolbarContentBinding implements ViewBinding {
    private final RdsProgressBar rootView;
    public final RdsProgressBar walkhroughProgressBar;

    private IncludeWalkhroughPageToolbarContentBinding(RdsProgressBar rdsProgressBar, RdsProgressBar rdsProgressBar2) {
        this.rootView = rdsProgressBar;
        this.walkhroughProgressBar = rdsProgressBar2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsProgressBar getRoot() {
        return this.rootView;
    }

    public static IncludeWalkhroughPageToolbarContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeWalkhroughPageToolbarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.include_walkhrough_page_toolbar_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeWalkhroughPageToolbarContentBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RdsProgressBar rdsProgressBar = (RdsProgressBar) view;
        return new IncludeWalkhroughPageToolbarContentBinding(rdsProgressBar, rdsProgressBar);
    }
}
