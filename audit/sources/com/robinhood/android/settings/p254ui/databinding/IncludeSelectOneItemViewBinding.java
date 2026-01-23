package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.SelectOneItemView;

/* loaded from: classes5.dex */
public final class IncludeSelectOneItemViewBinding implements ViewBinding {
    private final SelectOneItemView rootView;

    private IncludeSelectOneItemViewBinding(SelectOneItemView selectOneItemView) {
        this.rootView = selectOneItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SelectOneItemView getRoot() {
        return this.rootView;
    }

    public static IncludeSelectOneItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSelectOneItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_select_one_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSelectOneItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSelectOneItemViewBinding((SelectOneItemView) view);
    }
}
