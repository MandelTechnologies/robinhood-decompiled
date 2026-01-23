package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;

/* loaded from: classes2.dex */
public final class TransparentActivityFragmentContainerBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final FragmentContainerLayout rootView;

    private TransparentActivityFragmentContainerBinding(FragmentContainerLayout fragmentContainerLayout, FragmentContainerLayout fragmentContainerLayout2) {
        this.rootView = fragmentContainerLayout;
        this.fragmentContainer = fragmentContainerLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FragmentContainerLayout getRoot() {
        return this.rootView;
    }

    public static TransparentActivityFragmentContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TransparentActivityFragmentContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.transparent_activity_fragment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static TransparentActivityFragmentContainerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) view;
        return new TransparentActivityFragmentContainerBinding(fragmentContainerLayout, fragmentContainerLayout);
    }
}
