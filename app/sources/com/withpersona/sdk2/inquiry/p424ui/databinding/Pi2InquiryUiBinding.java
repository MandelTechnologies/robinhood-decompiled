package com.withpersona.sdk2.inquiry.p424ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.divider.MaterialDivider;
import com.withpersona.sdk2.inquiry.p424ui.R$id;
import com.withpersona.sdk2.inquiry.p424ui.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ShadowedNestedScrollView;

/* loaded from: classes18.dex */
public final class Pi2InquiryUiBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final FrameLayout footerContainer;
    public final MaterialDivider footerDivider;
    public final LinearLayout footerSheet;
    public final CoordinatorLayout footerSheetCoordinatorLayout;
    public final View footerSheetGrabber;
    public final NestedScrollView footerSheetScrollView;
    public final Pi2NavigationBar navigationBar;
    public final ShadowedNestedScrollView nestedScroll;
    public final ConstraintLayout rootLayout;
    private final CoordinatorLayout rootView;
    public final FrameLayout uiStepContainer;

    private Pi2InquiryUiBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialDivider materialDivider, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout2, View view, NestedScrollView nestedScrollView, Pi2NavigationBar pi2NavigationBar, ShadowedNestedScrollView shadowedNestedScrollView, ConstraintLayout constraintLayout2, FrameLayout frameLayout2) {
        this.rootView = coordinatorLayout;
        this.container = constraintLayout;
        this.footerContainer = frameLayout;
        this.footerDivider = materialDivider;
        this.footerSheet = linearLayout;
        this.footerSheetCoordinatorLayout = coordinatorLayout2;
        this.footerSheetGrabber = view;
        this.footerSheetScrollView = nestedScrollView;
        this.navigationBar = pi2NavigationBar;
        this.nestedScroll = shadowedNestedScrollView;
        this.rootLayout = constraintLayout2;
        this.uiStepContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2InquiryUiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2InquiryUiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_inquiry_ui, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2InquiryUiBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R$id.footer_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R$id.footer_divider;
                MaterialDivider materialDivider = (MaterialDivider) ViewBindings.findChildViewById(view, i);
                if (materialDivider != null) {
                    i = R$id.footer_sheet;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R$id.footer_sheet_coordinator_layout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.footer_sheet_grabber))) != null) {
                            i = R$id.footer_sheet_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R$id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                                if (pi2NavigationBar != null) {
                                    i = R$id.nestedScroll;
                                    ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (shadowedNestedScrollView != null) {
                                        i = R$id.root_layout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R$id.ui_step_container;
                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout2 != null) {
                                                return new Pi2InquiryUiBinding((CoordinatorLayout) view, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, viewFindChildViewById, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
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
