package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class IncludeOrderConfirmationLayoutBinding implements ViewBinding {
    public final RdsCardView cardView;
    public final RdsButton doneBtn;
    public final FrameLayout orderConfirmationLayoutRoot;
    public final LinearLayout orderContentContainer;
    public final RhTextView orderDescriptionTxt;
    public final RhTextView orderTitleTxt;
    public final RecyclerView recyclerView;
    private final FrameLayout rootView;
    public final RdsButton setRecurringInvestmentBtn;
    public final LinearLayout upsellContentContainer;
    public final RhTextView upsellDescriptionTxt;
    public final RdsButton upsellDoneBtn;
    public final RdsButton upsellGetStartedBtn;
    public final ImageView upsellImage;
    public final RhTextView upsellTitleTxt;
    public final RdsButton viewOrderBtn;

    private IncludeOrderConfirmationLayoutBinding(FrameLayout frameLayout, RdsCardView rdsCardView, RdsButton rdsButton, FrameLayout frameLayout2, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView, RdsButton rdsButton2, LinearLayout linearLayout2, RhTextView rhTextView3, RdsButton rdsButton3, RdsButton rdsButton4, ImageView imageView, RhTextView rhTextView4, RdsButton rdsButton5) {
        this.rootView = frameLayout;
        this.cardView = rdsCardView;
        this.doneBtn = rdsButton;
        this.orderConfirmationLayoutRoot = frameLayout2;
        this.orderContentContainer = linearLayout;
        this.orderDescriptionTxt = rhTextView;
        this.orderTitleTxt = rhTextView2;
        this.recyclerView = recyclerView;
        this.setRecurringInvestmentBtn = rdsButton2;
        this.upsellContentContainer = linearLayout2;
        this.upsellDescriptionTxt = rhTextView3;
        this.upsellDoneBtn = rdsButton3;
        this.upsellGetStartedBtn = rdsButton4;
        this.upsellImage = imageView;
        this.upsellTitleTxt = rhTextView4;
        this.viewOrderBtn = rdsButton5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOrderConfirmationLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOrderConfirmationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.include_order_confirmation_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOrderConfirmationLayoutBinding bind(View view) {
        int i = C29365R.id.card_view;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            i = C29365R.id.done_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = C29365R.id.order_content_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C29365R.id.order_description_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C29365R.id.order_title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C29365R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C29365R.id.set_recurring_investment_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    i = C29365R.id.upsell_content_container;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = C29365R.id.upsell_description_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C29365R.id.upsell_done_btn;
                                            RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton3 != null) {
                                                i = C29365R.id.upsell_get_started_btn;
                                                RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton4 != null) {
                                                    i = C29365R.id.upsell_image;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView != null) {
                                                        i = C29365R.id.upsell_title_txt;
                                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView4 != null) {
                                                            i = C29365R.id.view_order_btn;
                                                            RdsButton rdsButton5 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                            if (rdsButton5 != null) {
                                                                return new IncludeOrderConfirmationLayoutBinding(frameLayout, rdsCardView, rdsButton, frameLayout, linearLayout, rhTextView, rhTextView2, recyclerView, rdsButton2, linearLayout2, rhTextView3, rdsButton3, rdsButton4, imageView, rhTextView4, rdsButton5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
