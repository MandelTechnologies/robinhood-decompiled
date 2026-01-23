package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;

/* loaded from: classes2.dex */
public final class FragmentDialogDesignSystemWrapperBinding implements ViewBinding {
    private final FrameLayout rootView;

    private FragmentDialogDesignSystemWrapperBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDialogDesignSystemWrapperBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDialogDesignSystemWrapperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.fragment_dialog_design_system_wrapper, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDialogDesignSystemWrapperBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentDialogDesignSystemWrapperBinding((FrameLayout) view);
    }
}
