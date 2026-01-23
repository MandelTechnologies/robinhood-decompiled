package com.withpersona.sdk2.inquiry.permissions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.permissions.R$id;
import com.withpersona.sdk2.inquiry.permissions.R$layout;

/* loaded from: classes18.dex */
public final class Pi2RequestPermissionRationaleBinding implements ViewBinding {
    public final FrameLayout bottomSheet;
    public final ConstraintLayout bottomSheetContent;
    public final Flow flowLayout;
    public final TextView message;
    public final Button negativeButton;
    public final Button positiveButton;
    private final CoordinatorLayout rootView;
    public final View tintScreen;
    public final TextView title;

    private Pi2RequestPermissionRationaleBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, Flow flow, TextView textView, Button button, Button button2, View view, TextView textView2) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = frameLayout;
        this.bottomSheetContent = constraintLayout;
        this.flowLayout = flow;
        this.message = textView;
        this.negativeButton = button;
        this.positiveButton = button2;
        this.tintScreen = view;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2RequestPermissionRationaleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_request_permission_rationale, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2RequestPermissionRationaleBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.bottom_sheet;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R$id.bottom_sheet_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R$id.flow_layout;
                Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                if (flow != null) {
                    i = R$id.message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R$id.negative_button;
                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                        if (button != null) {
                            i = R$id.positive_button;
                            Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                            if (button2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.tint_screen))) != null) {
                                i = R$id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new Pi2RequestPermissionRationaleBinding((CoordinatorLayout) view, frameLayout, constraintLayout, flow, textView, button, button2, viewFindChildViewById, textView2);
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
