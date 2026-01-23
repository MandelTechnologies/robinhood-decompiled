package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentGenericActionableInfoBinding implements ViewBinding {
    public final Barrier barrier;
    public final Barrier barrier2;
    public final RdsInfoBannerView genericActionableInfoBanner;
    public final RhTextView genericActionableInfoDetail;
    public final RhTextView genericActionableInfoDisclosureTitle;
    public final LottieAnimationView genericActionableInfoImage;
    public final IncludeGenericActionableInfoLoadingBinding genericActionableInfoLoading;
    public final RdsButton genericActionableInfoPrimaryAction;
    public final RdsButton genericActionableInfoSecondaryAction;
    public final RhTextView genericActionableInfoTitle;
    public final Guideline guideline;
    private final ConstraintLayout rootView;
    public final Space space;

    private FragmentGenericActionableInfoBinding(ConstraintLayout constraintLayout, Barrier barrier, Barrier barrier2, RdsInfoBannerView rdsInfoBannerView, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, IncludeGenericActionableInfoLoadingBinding includeGenericActionableInfoLoadingBinding, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView3, Guideline guideline, Space space) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.barrier2 = barrier2;
        this.genericActionableInfoBanner = rdsInfoBannerView;
        this.genericActionableInfoDetail = rhTextView;
        this.genericActionableInfoDisclosureTitle = rhTextView2;
        this.genericActionableInfoImage = lottieAnimationView;
        this.genericActionableInfoLoading = includeGenericActionableInfoLoadingBinding;
        this.genericActionableInfoPrimaryAction = rdsButton;
        this.genericActionableInfoSecondaryAction = rdsButton2;
        this.genericActionableInfoTitle = rhTextView3;
        this.guideline = guideline;
        this.space = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentGenericActionableInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGenericActionableInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.fragment_generic_actionable_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentGenericActionableInfoBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11048R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C11048R.id.barrier2;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C11048R.id.generic_actionable_info_banner;
                RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                if (rdsInfoBannerView != null) {
                    i = C11048R.id.generic_actionable_info_detail;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C11048R.id.generic_actionable_info_disclosure_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C11048R.id.generic_actionable_info_image;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11048R.id.generic_actionable_info_loading))) != null) {
                                IncludeGenericActionableInfoLoadingBinding includeGenericActionableInfoLoadingBindingBind = IncludeGenericActionableInfoLoadingBinding.bind(viewFindChildViewById);
                                i = C11048R.id.generic_actionable_info_primary_action;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C11048R.id.generic_actionable_info_secondary_action;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        i = C11048R.id.generic_actionable_info_title;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C11048R.id.guideline;
                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline != null) {
                                                i = C11048R.id.space;
                                                Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                if (space != null) {
                                                    return new FragmentGenericActionableInfoBinding((ConstraintLayout) view, barrier, barrier2, rdsInfoBannerView, rhTextView, rhTextView2, lottieAnimationView, includeGenericActionableInfoLoadingBindingBind, rdsButton, rdsButton2, rhTextView3, guideline, space);
                                                }
                                            }
                                        }
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
