package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class FragmentCryptoLimitOrderReviewingBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final RdsButton cryptoSellAllBtn;
    public final ConstraintLayout numpadLayout;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final IncludeSwipeHintBinding swipeHint;

    private FragmentCryptoLimitOrderReviewingBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, RdsButton rdsButton, ConstraintLayout constraintLayout3, RdsButton rdsButton2, IncludeSwipeHintBinding includeSwipeHintBinding) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.cryptoSellAllBtn = rdsButton;
        this.numpadLayout = constraintLayout3;
        this.reviewBtn = rdsButton2;
        this.swipeHint = includeSwipeHintBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoLimitOrderReviewingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoLimitOrderReviewingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.fragment_crypto_limit_order_reviewing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoLimitOrderReviewingBinding bind(View view) {
        View viewFindChildViewById;
        int i = C40095R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C40095R.id.crypto_sell_all_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C40095R.id.numpad_layout;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C40095R.id.review_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C40095R.id.swipe_hint))) != null) {
                        return new FragmentCryptoLimitOrderReviewingBinding(constraintLayout, cardView, constraintLayout, rdsButton, constraintLayout2, rdsButton2, IncludeSwipeHintBinding.bind(viewFindChildViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
