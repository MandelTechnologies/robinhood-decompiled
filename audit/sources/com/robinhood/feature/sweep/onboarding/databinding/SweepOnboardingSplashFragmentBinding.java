package com.robinhood.feature.sweep.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.feature.sweep.onboarding.C33184R;

/* loaded from: classes15.dex */
public final class SweepOnboardingSplashFragmentBinding implements ViewBinding {
    public final ImageView bannerImage;
    public final RdsButtonBarView continueBtnBar;
    public final RhTextView description;
    public final LinearLayout disclosure;
    public final RhTextView disclosureInterestText;
    public final View divider;
    public final RdsInfoTag goldInfoTag;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RhTextView titleText;

    private SweepOnboardingSplashFragmentBinding(ConstraintLayout constraintLayout, ImageView imageView, RdsButtonBarView rdsButtonBarView, RhTextView rhTextView, LinearLayout linearLayout, RhTextView rhTextView2, View view, RdsInfoTag rdsInfoTag, ScrollView scrollView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.bannerImage = imageView;
        this.continueBtnBar = rdsButtonBarView;
        this.description = rhTextView;
        this.disclosure = linearLayout;
        this.disclosureInterestText = rhTextView2;
        this.divider = view;
        this.goldInfoTag = rdsInfoTag;
        this.scrollView = scrollView;
        this.titleText = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static SweepOnboardingSplashFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SweepOnboardingSplashFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C33184R.layout.sweep_onboarding_splash_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SweepOnboardingSplashFragmentBinding bind(View view) {
        View viewFindChildViewById;
        int i = C33184R.id.banner_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C33184R.id.continue_btn_bar;
            RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
            if (rdsButtonBarView != null) {
                i = C33184R.id.description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C33184R.id.disclosure;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C33184R.id.disclosure_interest_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C33184R.id.divider))) != null) {
                            i = C33184R.id.gold_info_tag;
                            RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
                            if (rdsInfoTag != null) {
                                i = C33184R.id.scroll_view;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    i = C33184R.id.title_text;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new SweepOnboardingSplashFragmentBinding((ConstraintLayout) view, imageView, rdsButtonBarView, rhTextView, linearLayout, rhTextView2, viewFindChildViewById, rdsInfoTag, scrollView, rhTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
