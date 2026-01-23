package com.withpersona.sdk2.inquiry.steps.p423ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$id;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiFooterBinding implements ViewBinding {
    public final Guideline footerBeginMargin;
    public final LinearLayout footerContainer;
    public final ConstraintLayout footerContainerInner;
    public final Guideline footerEndMargin;
    public final View hairline;
    private final LinearLayout rootView;

    private Pi2UiFooterBinding(LinearLayout linearLayout, Guideline guideline, LinearLayout linearLayout2, ConstraintLayout constraintLayout, Guideline guideline2, View view) {
        this.rootView = linearLayout;
        this.footerBeginMargin = guideline;
        this.footerContainer = linearLayout2;
        this.footerContainerInner = constraintLayout;
        this.footerEndMargin = guideline2;
        this.hairline = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static Pi2UiFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2UiFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_ui_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2UiFooterBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.footer_begin_margin;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R$id.footer_container_inner;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R$id.footer_end_margin;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.hairline))) != null) {
                    return new Pi2UiFooterBinding(linearLayout, guideline, linearLayout, constraintLayout, guideline2, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
