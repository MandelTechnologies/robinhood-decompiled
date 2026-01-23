package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.crypto.C12757R;

/* loaded from: classes2.dex */
public final class FragmentCryptoDetailListBinding implements ViewBinding {
    public final ConstraintLayout cryptoDetailContainer;
    public final FrameLayout cryptoDetailRoot;
    public final ViewPager2 cryptoViewPager;
    private final FrameLayout rootView;

    private FragmentCryptoDetailListBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout2, ViewPager2 viewPager2) {
        this.rootView = frameLayout;
        this.cryptoDetailContainer = constraintLayout;
        this.cryptoDetailRoot = frameLayout2;
        this.cryptoViewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoDetailListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoDetailListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12757R.layout.fragment_crypto_detail_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoDetailListBinding bind(View view) {
        int i = C12757R.id.crypto_detail_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i2 = C12757R.id.crypto_view_pager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i2);
            if (viewPager2 != null) {
                return new FragmentCryptoDetailListBinding(frameLayout, constraintLayout, frameLayout, viewPager2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
