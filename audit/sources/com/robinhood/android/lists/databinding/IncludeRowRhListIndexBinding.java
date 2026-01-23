package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.views.index.IndexRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeRowRhListIndexBinding implements ViewBinding {
    private final IndexRowView rootView;

    private IncludeRowRhListIndexBinding(IndexRowView indexRowView) {
        this.rootView = indexRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IndexRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRowRhListIndexBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowRhListIndexBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_row_rh_list_index, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowRhListIndexBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowRhListIndexBinding((IndexRowView) view);
    }
}
