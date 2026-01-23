package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class ActivityReferenceManualBinding implements ViewBinding {
    public final LinearLayout activityReferenceManual;
    public final RhTextView errorTxt;
    private final LinearLayout rootView;
    public final RhTabLayout tabLayout;
    public final LinearLayout toolbarContainer;
    public final ViewPager viewpager;

    private ActivityReferenceManualBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RhTextView rhTextView, RhTabLayout rhTabLayout, LinearLayout linearLayout3, ViewPager viewPager) {
        this.rootView = linearLayout;
        this.activityReferenceManual = linearLayout2;
        this.errorTxt = rhTextView;
        this.tabLayout = rhTabLayout;
        this.toolbarContainer = linearLayout3;
        this.viewpager = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityReferenceManualBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityReferenceManualBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.activity_reference_manual, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityReferenceManualBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C11048R.id.error_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11048R.id.tab_layout;
            RhTabLayout rhTabLayout = (RhTabLayout) ViewBindings.findChildViewById(view, i);
            if (rhTabLayout != null) {
                i = C11048R.id.toolbar_container;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = C11048R.id.viewpager;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                    if (viewPager != null) {
                        return new ActivityReferenceManualBinding(linearLayout, linearLayout, rhTextView, rhTabLayout, linearLayout2, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
