package com.robinhood.android.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.waitlist.C31444R;

/* loaded from: classes9.dex */
public final class ActivityWaitlistBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final FrameLayout rootView;
    public final RhToolbar toolbarWrapper;

    private ActivityWaitlistBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout, RhToolbar rhToolbar) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerLayout;
        this.toolbarWrapper = rhToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWaitlistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWaitlistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31444R.layout.activity_waitlist, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityWaitlistBinding bind(View view) {
        int i = C31444R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            i = C31444R.id.toolbar_wrapper;
            RhToolbar rhToolbar = (RhToolbar) ViewBindings.findChildViewById(view, i);
            if (rhToolbar != null) {
                return new ActivityWaitlistBinding((FrameLayout) view, fragmentContainerLayout, rhToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
