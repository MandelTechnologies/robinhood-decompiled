package com.robinhood.android.rhweb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.rhweb.C27330R;

/* loaded from: classes5.dex */
public final class ActivityRhwebBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final FrameLayout rootView;

    private ActivityRhwebBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRhwebBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRhwebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27330R.layout.activity_rhweb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRhwebBinding bind(View view) {
        int i = C27330R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            return new ActivityRhwebBinding((FrameLayout) view, fragmentContainerLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
