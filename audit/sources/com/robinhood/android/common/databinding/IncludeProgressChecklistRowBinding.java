package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.view.ProgressChecklistRowView;

/* loaded from: classes2.dex */
public final class IncludeProgressChecklistRowBinding implements ViewBinding {
    private final ProgressChecklistRowView rootView;

    private IncludeProgressChecklistRowBinding(ProgressChecklistRowView progressChecklistRowView) {
        this.rootView = progressChecklistRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProgressChecklistRowView getRoot() {
        return this.rootView;
    }

    public static IncludeProgressChecklistRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeProgressChecklistRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.include_progress_checklist_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeProgressChecklistRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeProgressChecklistRowBinding((ProgressChecklistRowView) view);
    }
}
