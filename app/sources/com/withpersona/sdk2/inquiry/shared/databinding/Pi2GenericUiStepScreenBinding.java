package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.shared.R$id;
import com.withpersona.sdk2.inquiry.shared.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2GenericUiStepScreenBinding implements ViewBinding {
    public final FrameLayout contentContainer;
    public final NestedScrollView contentScrollView;
    public final FrameLayout footerContainer;
    public final Pi2NavigationBar navigationBar;
    private final ConstraintLayout rootView;

    private Pi2GenericUiStepScreenBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, FrameLayout frameLayout2, Pi2NavigationBar pi2NavigationBar) {
        this.rootView = constraintLayout;
        this.contentContainer = frameLayout;
        this.contentScrollView = nestedScrollView;
        this.footerContainer = frameLayout2;
        this.navigationBar = pi2NavigationBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GenericUiStepScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_generic_ui_step_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GenericUiStepScreenBinding bind(View view) {
        int i = R$id.content_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R$id.content_scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                i = R$id.footer_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R$id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                    if (pi2NavigationBar != null) {
                        return new Pi2GenericUiStepScreenBinding((ConstraintLayout) view, frameLayout, nestedScrollView, frameLayout2, pi2NavigationBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
