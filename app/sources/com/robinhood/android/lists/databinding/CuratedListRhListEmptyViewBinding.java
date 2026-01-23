package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListRhListEmptyViewBinding implements ViewBinding {
    private final LinearLayout rootView;

    private CuratedListRhListEmptyViewBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListRhListEmptyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListRhListEmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_rh_list_empty_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListRhListEmptyViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new CuratedListRhListEmptyViewBinding((LinearLayout) view);
    }
}
