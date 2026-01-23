package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class FragmentCryptoQuoteOrderReviewingBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final FrameLayout ctaContainer;
    public final RdsNumpadView numpad;
    public final ComposeView numpadComposeView;
    private final ConstraintLayout rootView;
    public final IncludeSwipeHintBinding swipeHint;

    private FragmentCryptoQuoteOrderReviewingBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, FrameLayout frameLayout, RdsNumpadView rdsNumpadView, ComposeView composeView, IncludeSwipeHintBinding includeSwipeHintBinding) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.ctaContainer = frameLayout;
        this.numpad = rdsNumpadView;
        this.numpadComposeView = composeView;
        this.swipeHint = includeSwipeHintBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoQuoteOrderReviewingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoQuoteOrderReviewingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.fragment_crypto_quote_order_reviewing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoQuoteOrderReviewingBinding bind(View view) {
        View viewFindChildViewById;
        int i = C40095R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C40095R.id.cta_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C40095R.id.numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C40095R.id.numpad_compose_view;
                    ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                    if (composeView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C40095R.id.swipe_hint))) != null) {
                        return new FragmentCryptoQuoteOrderReviewingBinding(constraintLayout, cardView, constraintLayout, frameLayout, rdsNumpadView, composeView, IncludeSwipeHintBinding.bind(viewFindChildViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
