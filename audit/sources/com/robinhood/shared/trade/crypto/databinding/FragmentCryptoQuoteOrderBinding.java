package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes12.dex */
public final class FragmentCryptoQuoteOrderBinding implements ViewBinding {
    public final CardView cardview;
    public final ConstraintLayout constraintLayout;
    public final ConstraintLayout content;
    public final BlockableNestedScrollView contentScrollview;
    public final FrameLayout ctaContainer;
    public final RdsNumpadView numpad;
    public final ComposeView numpadComposeView;
    public final RdsButton quickTrade1Button;
    public final RdsButton quickTrade2Button;
    public final RdsButton quickTrade3Button;
    public final LinearLayout quickTradeContainer;
    public final FrameLayout rebrandUnderlay;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final RdsButton sellAllButton;
    public final CoordinatorLayout snackbarShim;
    public final IncludeSwipeHintBinding swipeHint;

    private FragmentCryptoQuoteOrderBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, BlockableNestedScrollView blockableNestedScrollView, FrameLayout frameLayout, RdsNumpadView rdsNumpadView, ComposeView composeView, RdsButton rdsButton, RdsButton rdsButton2, RdsButton rdsButton3, LinearLayout linearLayout, FrameLayout frameLayout2, RdsButton rdsButton4, RdsButton rdsButton5, CoordinatorLayout coordinatorLayout, IncludeSwipeHintBinding includeSwipeHintBinding) {
        this.rootView = constraintLayout;
        this.cardview = cardView;
        this.constraintLayout = constraintLayout2;
        this.content = constraintLayout3;
        this.contentScrollview = blockableNestedScrollView;
        this.ctaContainer = frameLayout;
        this.numpad = rdsNumpadView;
        this.numpadComposeView = composeView;
        this.quickTrade1Button = rdsButton;
        this.quickTrade2Button = rdsButton2;
        this.quickTrade3Button = rdsButton3;
        this.quickTradeContainer = linearLayout;
        this.rebrandUnderlay = frameLayout2;
        this.reviewBtn = rdsButton4;
        this.sellAllButton = rdsButton5;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = includeSwipeHintBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoQuoteOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoQuoteOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.fragment_crypto_quote_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoQuoteOrderBinding bind(View view) {
        View viewFindChildViewById;
        int i = C40095R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C40095R.id.content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C40095R.id.content_scrollview;
                BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                if (blockableNestedScrollView != null) {
                    i = C40095R.id.cta_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = C40095R.id.numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            i = C40095R.id.numpad_compose_view;
                            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView != null) {
                                i = C40095R.id.quick_trade_1_button;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    i = C40095R.id.quick_trade_2_button;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        i = C40095R.id.quick_trade_3_button;
                                        RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsButton3 != null) {
                                            i = C40095R.id.quick_trade_container;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C40095R.id.rebrand_underlay;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                if (frameLayout2 != null) {
                                                    i = C40095R.id.review_btn;
                                                    RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                    if (rdsButton4 != null) {
                                                        i = C40095R.id.sell_all_button;
                                                        RdsButton rdsButton5 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                        if (rdsButton5 != null) {
                                                            i = C40095R.id.snackbar_shim;
                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                            if (coordinatorLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C40095R.id.swipe_hint))) != null) {
                                                                return new FragmentCryptoQuoteOrderBinding(constraintLayout, cardView, constraintLayout, constraintLayout2, blockableNestedScrollView, frameLayout, rdsNumpadView, composeView, rdsButton, rdsButton2, rdsButton3, linearLayout, frameLayout2, rdsButton4, rdsButton5, coordinatorLayout, IncludeSwipeHintBinding.bind(viewFindChildViewById));
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
