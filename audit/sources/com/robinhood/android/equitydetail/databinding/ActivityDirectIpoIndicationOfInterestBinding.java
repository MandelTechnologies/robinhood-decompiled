package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class ActivityDirectIpoIndicationOfInterestBinding implements ViewBinding {
    private final FrameLayout rootView;

    private ActivityDirectIpoIndicationOfInterestBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDirectIpoIndicationOfInterestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDirectIpoIndicationOfInterestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.activity_direct_ipo_indication_of_interest, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDirectIpoIndicationOfInterestBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ActivityDirectIpoIndicationOfInterestBinding((FrameLayout) view);
    }
}
