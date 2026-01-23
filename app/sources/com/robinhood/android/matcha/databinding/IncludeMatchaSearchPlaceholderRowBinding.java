package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class IncludeMatchaSearchPlaceholderRowBinding implements ViewBinding {
    private final LinearLayout rootView;

    private IncludeMatchaSearchPlaceholderRowBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeMatchaSearchPlaceholderRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMatchaSearchPlaceholderRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.include_matcha_search_placeholder_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMatchaSearchPlaceholderRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMatchaSearchPlaceholderRowBinding((LinearLayout) view);
    }
}
