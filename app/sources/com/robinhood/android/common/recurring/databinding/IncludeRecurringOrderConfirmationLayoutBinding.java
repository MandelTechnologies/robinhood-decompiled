package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class IncludeRecurringOrderConfirmationLayoutBinding implements ViewBinding {
    public final RdsCardView cardView;
    public final FrameLayout orderConfirmationLayoutRoot;
    public final LinearLayout orderContentContainer;
    public final RhTextView orderDescriptionTxt;
    public final RhTextView orderTitleTxt;
    public final RdsButton primaryBtn;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;
    public final RdsButton secondaryBtn;

    private IncludeRecurringOrderConfirmationLayoutBinding(FrameLayout frameLayout, RdsCardView rdsCardView, FrameLayout frameLayout2, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RecyclerView recyclerView, RdsButton rdsButton2) {
        this.rootView = frameLayout;
        this.cardView = rdsCardView;
        this.orderConfirmationLayoutRoot = frameLayout2;
        this.orderContentContainer = linearLayout;
        this.orderDescriptionTxt = rhTextView;
        this.orderTitleTxt = rhTextView2;
        this.primaryBtn = rdsButton;
        this.recyclerView = recyclerView;
        this.secondaryBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRecurringOrderConfirmationLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecurringOrderConfirmationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.include_recurring_order_confirmation_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecurringOrderConfirmationLayoutBinding bind(View view) {
        int i = C11595R.id.card_view;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = C11595R.id.order_content_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C11595R.id.order_description_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C11595R.id.order_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C11595R.id.primary_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C11595R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C11595R.id.secondary_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    return new IncludeRecurringOrderConfirmationLayoutBinding(frameLayout, rdsCardView, frameLayout, linearLayout, rhTextView, rhTextView2, rdsButton, recyclerView, rdsButton2);
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
