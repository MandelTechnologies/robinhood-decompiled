package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes5.dex */
public final class FragmentRhyReviewChangesBinding implements ViewBinding {
    public final RdsButton rhyReviewChangesContinueBtn;
    public final RecyclerView rhyReviewChangesFaqRecyclerView;
    public final RdsTextButton rhyReviewChangesFaqShowAll;
    public final RhTextView rhyReviewChangesFaqTitle;
    public final ImageView rhyReviewChangesIcon;
    public final RhTextView rhyReviewChangesTitle;
    public final RecyclerView rhyReviewChangesValuePropsRecyclerView;
    private final FocusSafeNestedScrollView rootView;

    private FragmentRhyReviewChangesBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RdsButton rdsButton, RecyclerView recyclerView, RdsTextButton rdsTextButton, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RecyclerView recyclerView2) {
        this.rootView = focusSafeNestedScrollView;
        this.rhyReviewChangesContinueBtn = rdsButton;
        this.rhyReviewChangesFaqRecyclerView = recyclerView;
        this.rhyReviewChangesFaqShowAll = rdsTextButton;
        this.rhyReviewChangesFaqTitle = rhTextView;
        this.rhyReviewChangesIcon = imageView;
        this.rhyReviewChangesTitle = rhTextView2;
        this.rhyReviewChangesValuePropsRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRhyReviewChangesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyReviewChangesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_review_changes, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyReviewChangesBinding bind(View view) {
        int i = C27577R.id.rhy_review_changes_continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C27577R.id.rhy_review_changes_faq_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C27577R.id.rhy_review_changes_faq_show_all;
                RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                if (rdsTextButton != null) {
                    i = C27577R.id.rhy_review_changes_faq_title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C27577R.id.rhy_review_changes_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C27577R.id.rhy_review_changes_title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C27577R.id.rhy_review_changes_value_props_recycler_view;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView2 != null) {
                                    return new FragmentRhyReviewChangesBinding((FocusSafeNestedScrollView) view, rdsButton, recyclerView, rdsTextButton, rhTextView, imageView, rhTextView2, recyclerView2);
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
