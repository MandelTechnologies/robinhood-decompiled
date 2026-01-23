package com.robinhood.android.common.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.history.C11183R;

/* loaded from: classes2.dex */
public final class MergeNewHistorySecondaryRowBinding implements ViewBinding {
    private final View rootView;

    private MergeNewHistorySecondaryRowBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewHistorySecondaryRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11183R.layout.merge_new_history_secondary_row, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewHistorySecondaryRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new MergeNewHistorySecondaryRowBinding(view);
    }
}
