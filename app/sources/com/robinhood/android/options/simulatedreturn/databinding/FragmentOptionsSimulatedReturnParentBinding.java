package com.robinhood.android.options.simulatedreturn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.options.simulatedreturn.C23755R;

/* loaded from: classes11.dex */
public final class FragmentOptionsSimulatedReturnParentBinding implements ViewBinding {
    public final FrameLayout bodyFragment;
    private final FrameLayout rootView;
    public final FrameLayout tradeBarFragment;

    private FragmentOptionsSimulatedReturnParentBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.bodyFragment = frameLayout2;
        this.tradeBarFragment = frameLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsSimulatedReturnParentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsSimulatedReturnParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C23755R.layout.fragment_options_simulated_return_parent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsSimulatedReturnParentBinding bind(View view) {
        int i = C23755R.id.body_fragment;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23755R.id.trade_bar_fragment;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                return new FragmentOptionsSimulatedReturnParentBinding((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
