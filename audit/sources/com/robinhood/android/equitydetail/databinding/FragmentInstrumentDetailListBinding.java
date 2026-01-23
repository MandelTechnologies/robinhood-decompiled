package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentInstrumentDetailListBinding implements ViewBinding {
    public final FrameLayout fragmentContainer;
    private final ConstraintLayout rootView;
    public final ViewPager2 viewPager;

    private FragmentInstrumentDetailListBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.fragmentContainer = frameLayout;
        this.viewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInstrumentDetailListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInstrumentDetailListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_instrument_detail_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInstrumentDetailListBinding bind(View view) {
        int i = C15314R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C15314R.id.view_pager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new FragmentInstrumentDetailListBinding((ConstraintLayout) view, frameLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
