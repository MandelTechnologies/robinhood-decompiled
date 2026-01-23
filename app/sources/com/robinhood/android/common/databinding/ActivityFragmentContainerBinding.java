package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;

/* loaded from: classes2.dex */
public final class ActivityFragmentContainerBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final FrameLayout rootView;

    private ActivityFragmentContainerBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFragmentContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFragmentContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.activity_fragment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityFragmentContainerBinding bind(View view) {
        int i = C11048R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            return new ActivityFragmentContainerBinding((FrameLayout) view, fragmentContainerLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
