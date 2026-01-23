package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.cards.C31879R;
import com.robinhood.shared.cards.CardStack;

/* loaded from: classes3.dex */
public final class MergeCardStackBinding implements ViewBinding {
    public final CardStack cardContainer;
    public final RhTextView cardStackGoldSplashUnreadCountTxt;
    public final FrameLayout cardStackUnreadCountContainer;
    public final RhTextView cardStackUnreadCountTxt;
    public final RhTextView errorView;
    public final LinearLayout loadingView;
    public final RdsProgressBar progressBar;
    private final View rootView;

    private MergeCardStackBinding(View view, CardStack cardStack, RhTextView rhTextView, FrameLayout frameLayout, RhTextView rhTextView2, RhTextView rhTextView3, LinearLayout linearLayout, RdsProgressBar rdsProgressBar) {
        this.rootView = view;
        this.cardContainer = cardStack;
        this.cardStackGoldSplashUnreadCountTxt = rhTextView;
        this.cardStackUnreadCountContainer = frameLayout;
        this.cardStackUnreadCountTxt = rhTextView2;
        this.errorView = rhTextView3;
        this.loadingView = linearLayout;
        this.progressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCardStackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C31879R.layout.merge_card_stack, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCardStackBinding bind(View view) {
        int i = C31879R.id.card_container;
        CardStack cardStack = (CardStack) ViewBindings.findChildViewById(view, i);
        if (cardStack != null) {
            i = C31879R.id.card_stack_gold_splash_unread_count_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C31879R.id.card_stack_unread_count_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C31879R.id.card_stack_unread_count_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C31879R.id.error_view;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C31879R.id.loading_view;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C31879R.id.progress_bar;
                                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                                if (rdsProgressBar != null) {
                                    return new MergeCardStackBinding(view, cardStack, rhTextView, frameLayout, rhTextView2, rhTextView3, linearLayout, rdsProgressBar);
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
