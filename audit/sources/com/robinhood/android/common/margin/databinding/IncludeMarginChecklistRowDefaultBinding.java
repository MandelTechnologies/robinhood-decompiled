package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.view.ProgressChecklistRowView;

/* loaded from: classes2.dex */
public final class IncludeMarginChecklistRowDefaultBinding implements ViewBinding {
    private final ProgressChecklistRowView rootView;

    private IncludeMarginChecklistRowDefaultBinding(ProgressChecklistRowView progressChecklistRowView) {
        this.rootView = progressChecklistRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProgressChecklistRowView getRoot() {
        return this.rootView;
    }

    public static IncludeMarginChecklistRowDefaultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMarginChecklistRowDefaultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.include_margin_checklist_row_default, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMarginChecklistRowDefaultBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMarginChecklistRowDefaultBinding((ProgressChecklistRowView) view);
    }
}
