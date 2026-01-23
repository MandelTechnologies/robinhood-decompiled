package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.shared.R$id;
import com.withpersona.sdk2.inquiry.shared.R$layout;

/* loaded from: classes18.dex */
public final class Pi2GenericUiStepBottomSheetBinding implements ViewBinding {
    public final ConstraintLayout bottomSheet;
    public final FrameLayout contentContainer;
    public final NestedScrollView contentScrollView;
    private final CoordinatorLayout rootView;
    public final View tintScreen;

    private Pi2GenericUiStepBottomSheetBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, View view) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = constraintLayout;
        this.contentContainer = frameLayout;
        this.contentScrollView = nestedScrollView;
        this.tintScreen = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GenericUiStepBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_generic_ui_step_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GenericUiStepBottomSheetBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.bottom_sheet;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R$id.content_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R$id.content_scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.tint_screen))) != null) {
                    return new Pi2GenericUiStepBottomSheetBinding((CoordinatorLayout) view, constraintLayout, frameLayout, nestedScrollView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
