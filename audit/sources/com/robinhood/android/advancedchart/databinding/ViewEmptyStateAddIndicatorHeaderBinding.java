package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class ViewEmptyStateAddIndicatorHeaderBinding implements ViewBinding {
    private final RhTextView rootView;

    private ViewEmptyStateAddIndicatorHeaderBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static ViewEmptyStateAddIndicatorHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewEmptyStateAddIndicatorHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.view_empty_state_add_indicator_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewEmptyStateAddIndicatorHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewEmptyStateAddIndicatorHeaderBinding((RhTextView) view);
    }
}
