package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;

/* loaded from: classes2.dex */
public final class IncludeTopNavButtonViewBinding implements ViewBinding {
    private final TopNavButtonView rootView;

    private IncludeTopNavButtonViewBinding(TopNavButtonView topNavButtonView) {
        this.rootView = topNavButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TopNavButtonView getRoot() {
        return this.rootView;
    }

    public static IncludeTopNavButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTopNavButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.include_top_nav_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTopNavButtonViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeTopNavButtonViewBinding((TopNavButtonView) view);
    }
}
