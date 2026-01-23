package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeCuratedListItemsErrorViewBinding implements ViewBinding {
    private final ErrorView rootView;

    private IncludeCuratedListItemsErrorViewBinding(ErrorView errorView) {
        this.rootView = errorView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ErrorView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListItemsErrorViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListItemsErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_list_items_error_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListItemsErrorViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListItemsErrorViewBinding((ErrorView) view);
    }
}
