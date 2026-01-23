package com.robinhood.android.indexes.detail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.indexes.detail.C18813R;

/* loaded from: classes10.dex */
public final class FragmentIndexDetailPageParentBinding implements ViewBinding {
    public final FrameLayout bodyFragment;
    private final FrameLayout rootView;
    public final FrameLayout tradeBarFragment;

    private FragmentIndexDetailPageParentBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.bodyFragment = frameLayout2;
        this.tradeBarFragment = frameLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentIndexDetailPageParentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndexDetailPageParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18813R.layout.fragment_index_detail_page_parent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndexDetailPageParentBinding bind(View view) {
        int i = C18813R.id.body_fragment;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C18813R.id.trade_bar_fragment;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                return new FragmentIndexDetailPageParentBinding((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
