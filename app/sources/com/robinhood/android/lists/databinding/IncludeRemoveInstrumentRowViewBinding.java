package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.RemoveInstrumentRowView;

/* loaded from: classes8.dex */
public final class IncludeRemoveInstrumentRowViewBinding implements ViewBinding {
    private final RemoveInstrumentRowView rootView;

    private IncludeRemoveInstrumentRowViewBinding(RemoveInstrumentRowView removeInstrumentRowView) {
        this.rootView = removeInstrumentRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RemoveInstrumentRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRemoveInstrumentRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRemoveInstrumentRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_remove_instrument_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRemoveInstrumentRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRemoveInstrumentRowViewBinding((RemoveInstrumentRowView) view);
    }
}
