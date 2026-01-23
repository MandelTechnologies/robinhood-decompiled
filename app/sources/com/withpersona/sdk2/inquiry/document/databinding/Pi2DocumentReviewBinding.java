package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.document.R$id;
import com.withpersona.sdk2.inquiry.document.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2DocumentReviewBinding implements ViewBinding {
    public final TextView body;
    public final Guideline bottomGuideline;
    public final TextView disclaimer;
    public final Guideline leftGuideline;
    public final Pi2NavigationBar navigationBar;
    public final RecyclerView reviewItemList;
    public final Guideline rightGuideline;
    private final CoordinatorLayout rootView;
    public final Button submitButton;
    public final TextView title;

    private Pi2DocumentReviewBinding(CoordinatorLayout coordinatorLayout, TextView textView, Guideline guideline, TextView textView2, Guideline guideline2, Pi2NavigationBar pi2NavigationBar, RecyclerView recyclerView, Guideline guideline3, Button button, TextView textView3) {
        this.rootView = coordinatorLayout;
        this.body = textView;
        this.bottomGuideline = guideline;
        this.disclaimer = textView2;
        this.leftGuideline = guideline2;
        this.navigationBar = pi2NavigationBar;
        this.reviewItemList = recyclerView;
        this.rightGuideline = guideline3;
        this.submitButton = button;
        this.title = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2DocumentReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_document_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2DocumentReviewBinding bind(View view) {
        int i = R$id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R$id.bottom_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R$id.disclaimer;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R$id.left_guideline;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = R$id.navigation_bar;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                        if (pi2NavigationBar != null) {
                            i = R$id.review_item_list;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R$id.right_guideline;
                                Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline3 != null) {
                                    i = R$id.submit_button;
                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                    if (button != null) {
                                        i = R$id.title;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new Pi2DocumentReviewBinding((CoordinatorLayout) view, textView, guideline, textView2, guideline2, pi2NavigationBar, recyclerView, guideline3, button, textView3);
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
