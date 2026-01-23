package com.robinhood.shared.onboarding.lib.menuofoption.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.onboarding.lib.menuofoption.C39252R;

/* loaded from: classes6.dex */
public final class MenuOfOptionsPathItemViewBinding implements ViewBinding {
    public final Guideline pathItemFooter;
    public final AppCompatImageView pathItemHero;
    public final View pathItemLeadingSegment;
    public final Guideline pathItemMidpoint;
    public final RhTextView pathItemText;
    public final View pathItemTrailingSegment;
    private final ConstraintLayout rootView;
    public final AppCompatImageView userJourneyNodeDecoration;

    private MenuOfOptionsPathItemViewBinding(ConstraintLayout constraintLayout, Guideline guideline, AppCompatImageView appCompatImageView, View view, Guideline guideline2, RhTextView rhTextView, View view2, AppCompatImageView appCompatImageView2) {
        this.rootView = constraintLayout;
        this.pathItemFooter = guideline;
        this.pathItemHero = appCompatImageView;
        this.pathItemLeadingSegment = view;
        this.pathItemMidpoint = guideline2;
        this.pathItemText = rhTextView;
        this.pathItemTrailingSegment = view2;
        this.userJourneyNodeDecoration = appCompatImageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MenuOfOptionsPathItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MenuOfOptionsPathItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39252R.layout.menu_of_options_path_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MenuOfOptionsPathItemViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C39252R.id.path_item_footer;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C39252R.id.path_item_hero;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C39252R.id.path_item_leading_segment))) != null) {
                i = C39252R.id.path_item_midpoint;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null) {
                    i = C39252R.id.path_item_text;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C39252R.id.path_item_trailing_segment))) != null) {
                        i = C39252R.id.user_journey_node_decoration;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            return new MenuOfOptionsPathItemViewBinding((ConstraintLayout) view, guideline, appCompatImageView, viewFindChildViewById, guideline2, rhTextView, viewFindChildViewById2, appCompatImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
