package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class ActivityCryptoOrderBinding implements ViewBinding {
    public final FrameLayout fragmentContainer;
    private final ConstraintLayout rootView;
    public final ConstraintLayout tooltipContainerFeat;

    private ActivityCryptoOrderBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.fragmentContainer = frameLayout;
        this.tooltipContainerFeat = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCryptoOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCryptoOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.activity_crypto_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCryptoOrderBinding bind(View view) {
        int i = C40095R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C40095R.id.tooltip_container_feat;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                return new ActivityCryptoOrderBinding((ConstraintLayout) view, frameLayout, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
