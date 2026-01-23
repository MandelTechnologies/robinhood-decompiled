package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListLoadingViewBinding implements ViewBinding {
    private final FrameLayout rootView;

    private CuratedListLoadingViewBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListLoadingViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new CuratedListLoadingViewBinding((FrameLayout) view);
    }
}
