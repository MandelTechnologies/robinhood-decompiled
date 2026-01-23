package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;

/* loaded from: classes2.dex */
public final class IncludeUnifiedHistoryBinding implements ViewBinding {
    private final UnifiedHistoryView rootView;

    private IncludeUnifiedHistoryBinding(UnifiedHistoryView unifiedHistoryView) {
        this.rootView = unifiedHistoryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public UnifiedHistoryView getRoot() {
        return this.rootView;
    }

    public static IncludeUnifiedHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeUnifiedHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11183R.layout.include_unified_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeUnifiedHistoryBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeUnifiedHistoryBinding((UnifiedHistoryView) view);
    }
}
