package com.robinhood.android.referral.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.referral.C26659R;

/* loaded from: classes5.dex */
public final class FragmentFractionalRewardClaimPreviewBinding implements ViewBinding {
    public final CardView cardview;
    public final RhTextView claimSummaryDescriptionTxt;
    public final RhTextView claimSummaryTitleTxt;
    public final RhTextView companyTxt;
    public final LinearLayout constraintLayout;
    public final ConstraintLayout content;
    public final RhTextView rewardAmountTxt;
    private final LinearLayout rootView;
    public final RhTextView sharesAmountTxt;
    public final RhTextView swipeHint;

    private FragmentFractionalRewardClaimPreviewBinding(LinearLayout linearLayout, CardView cardView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, LinearLayout linearLayout2, ConstraintLayout constraintLayout, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = linearLayout;
        this.cardview = cardView;
        this.claimSummaryDescriptionTxt = rhTextView;
        this.claimSummaryTitleTxt = rhTextView2;
        this.companyTxt = rhTextView3;
        this.constraintLayout = linearLayout2;
        this.content = constraintLayout;
        this.rewardAmountTxt = rhTextView4;
        this.sharesAmountTxt = rhTextView5;
        this.swipeHint = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentFractionalRewardClaimPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFractionalRewardClaimPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26659R.layout.fragment_fractional_reward_claim_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentFractionalRewardClaimPreviewBinding bind(View view) {
        int i = C26659R.id.cardview;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = C26659R.id.claim_summary_description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C26659R.id.claim_summary_title_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C26659R.id.company_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = C26659R.id.content;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C26659R.id.reward_amount_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C26659R.id.shares_amount_txt;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C26659R.id.swipe_hint;
                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView6 != null) {
                                        return new FragmentFractionalRewardClaimPreviewBinding(linearLayout, cardView, rhTextView, rhTextView2, rhTextView3, linearLayout, constraintLayout, rhTextView4, rhTextView5, rhTextView6);
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
