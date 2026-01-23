package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.crypto.gifting.C12906R;

/* loaded from: classes2.dex */
public final class ActivityCryptoGiftingBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final FrameLayout rootView;
    public final RhToolbar toolbarWrapper;

    private ActivityCryptoGiftingBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout, RhToolbar rhToolbar) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerLayout;
        this.toolbarWrapper = rhToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCryptoGiftingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCryptoGiftingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.activity_crypto_gifting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCryptoGiftingBinding bind(View view) {
        int i = C12906R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            i = C12906R.id.toolbar_wrapper;
            RhToolbar rhToolbar = (RhToolbar) ViewBindings.findChildViewById(view, i);
            if (rhToolbar != null) {
                return new ActivityCryptoGiftingBinding((FrameLayout) view, fragmentContainerLayout, rhToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
