package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.selfie.R$id;
import com.withpersona.sdk2.inquiry.selfie.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2SelfieReviewCapturesBinding implements ViewBinding {
    public final TextView body;
    public final ConstraintLayout footerContainer;
    public final Pi2NavigationBar navigationBar;
    public final RecyclerView recyclerView;
    public final Button retakeButton;
    private final ConstraintLayout rootView;
    public final TextView title;
    public final Button usePhotosButton;

    private Pi2SelfieReviewCapturesBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, Button button, TextView textView2, Button button2) {
        this.rootView = constraintLayout;
        this.body = textView;
        this.footerContainer = constraintLayout2;
        this.navigationBar = pi2NavigationBar;
        this.recyclerView = recyclerView;
        this.retakeButton = button;
        this.title = textView2;
        this.usePhotosButton = button2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2SelfieReviewCapturesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_selfie_review_captures, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SelfieReviewCapturesBinding bind(View view) {
        int i = R$id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R$id.footer_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R$id.navigation_bar;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                if (pi2NavigationBar != null) {
                    i = R$id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R$id.retake_button;
                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                        if (button != null) {
                            i = R$id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R$id.use_photos_button;
                                Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                                if (button2 != null) {
                                    return new Pi2SelfieReviewCapturesBinding((ConstraintLayout) view, textView, constraintLayout, pi2NavigationBar, recyclerView, button, textView2, button2);
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
