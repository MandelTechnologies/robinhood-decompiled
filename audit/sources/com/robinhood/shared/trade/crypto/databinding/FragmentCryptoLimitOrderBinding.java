package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.views.PerspectiveTranslateLayout;
import com.robinhood.utils.p409ui.view.BlockableNestedScrollView;

/* loaded from: classes12.dex */
public final class FragmentCryptoLimitOrderBinding implements ViewBinding {
    public final CardView cardview;
    public final PerspectiveTranslateLayout constraintLayout;
    public final FrameLayout content;
    public final BlockableNestedScrollView contentScrollview;
    public final RdsButton cryptoSellAllBtn;
    public final RdsNumpadView numpad;
    public final ConstraintLayout numpadLayout;
    public final FrameLayout rebrandUnderlay;
    public final RdsButton reviewBtn;
    private final PerspectiveTranslateLayout rootView;
    public final CoordinatorLayout snackbarShim;
    public final IncludeSwipeHintBinding swipeHint;

    private FragmentCryptoLimitOrderBinding(PerspectiveTranslateLayout perspectiveTranslateLayout, CardView cardView, PerspectiveTranslateLayout perspectiveTranslateLayout2, FrameLayout frameLayout, BlockableNestedScrollView blockableNestedScrollView, RdsButton rdsButton, RdsNumpadView rdsNumpadView, ConstraintLayout constraintLayout, FrameLayout frameLayout2, RdsButton rdsButton2, CoordinatorLayout coordinatorLayout, IncludeSwipeHintBinding includeSwipeHintBinding) {
        this.rootView = perspectiveTranslateLayout;
        this.cardview = cardView;
        this.constraintLayout = perspectiveTranslateLayout2;
        this.content = frameLayout;
        this.contentScrollview = blockableNestedScrollView;
        this.cryptoSellAllBtn = rdsButton;
        this.numpad = rdsNumpadView;
        this.numpadLayout = constraintLayout;
        this.rebrandUnderlay = frameLayout2;
        this.reviewBtn = rdsButton2;
        this.snackbarShim = coordinatorLayout;
        this.swipeHint = includeSwipeHintBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PerspectiveTranslateLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoLimitOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoLimitOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.fragment_crypto_limit_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoLimitOrderBinding bind(View view) {
        View viewFindChildViewById;
        int i = C40095R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            PerspectiveTranslateLayout perspectiveTranslateLayout = (PerspectiveTranslateLayout) view;
            i = C40095R.id.content;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C40095R.id.content_scrollview;
                BlockableNestedScrollView blockableNestedScrollView = (BlockableNestedScrollView) ViewBindings.findChildViewById(view, i);
                if (blockableNestedScrollView != null) {
                    i = C40095R.id.crypto_sell_all_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C40095R.id.numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            i = C40095R.id.numpad_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C40095R.id.rebrand_underlay;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null) {
                                    i = C40095R.id.review_btn;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        i = C40095R.id.snackbar_shim;
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                        if (coordinatorLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C40095R.id.swipe_hint))) != null) {
                                            return new FragmentCryptoLimitOrderBinding(perspectiveTranslateLayout, cardView, perspectiveTranslateLayout, frameLayout, blockableNestedScrollView, rdsButton, rdsNumpadView, constraintLayout, frameLayout2, rdsButton2, coordinatorLayout, IncludeSwipeHintBinding.bind(viewFindChildViewById));
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
