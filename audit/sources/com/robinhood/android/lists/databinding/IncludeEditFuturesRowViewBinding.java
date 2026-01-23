package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.EditFuturesRowView;

/* loaded from: classes8.dex */
public final class IncludeEditFuturesRowViewBinding implements ViewBinding {
    private final EditFuturesRowView rootView;

    private IncludeEditFuturesRowViewBinding(EditFuturesRowView editFuturesRowView) {
        this.rootView = editFuturesRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EditFuturesRowView getRoot() {
        return this.rootView;
    }

    public static IncludeEditFuturesRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEditFuturesRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_edit_futures_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEditFuturesRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEditFuturesRowViewBinding((EditFuturesRowView) view);
    }
}
