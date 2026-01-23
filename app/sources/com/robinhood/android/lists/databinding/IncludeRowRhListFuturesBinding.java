package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.views.futures.FuturesRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeRowRhListFuturesBinding implements ViewBinding {
    private final FuturesRowView rootView;

    private IncludeRowRhListFuturesBinding(FuturesRowView futuresRowView) {
        this.rootView = futuresRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FuturesRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRowRhListFuturesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowRhListFuturesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_row_rh_list_futures, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowRhListFuturesBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowRhListFuturesBinding((FuturesRowView) view);
    }
}
