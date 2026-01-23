package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MergeRhyDebitCardViewBinding implements ViewBinding {
    public final ImageView dotsRight;
    public final LottieAnimationView rhyDebitCardAnimation;
    public final ConstraintLayout rhyDebitCardBackOverlay;
    public final Guideline rhyDebitCardEndGuideline;
    public final RhTextView rhyDebitCardHeader;
    public final ConstraintLayout rhyDebitCardHeaderContainer;
    public final Guideline rhyDebitCardStartGuideline;
    public final Guideline rhyDebitCardTopGuideline;
    public final RhTextView rhyDebitCardViewCardNumberPlaceholder;
    public final RhTextView rhyDebitCardViewCvvLabel;
    public final RhTextView rhyDebitCardViewCvvPlaceholder;
    public final RhTextView rhyDebitCardViewExpirationLabel;
    public final RhTextView rhyDebitCardViewExpirationPlaceholder;
    public final RhTextView rhyDebitCardViewFirstName;
    public final RhTextView rhyDebitCardViewLastName;
    public final ImageView rhyDebitCardViewNumberImage;
    private final View rootView;

    private MergeRhyDebitCardViewBinding(View view, ImageView imageView, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, Guideline guideline, RhTextView rhTextView, ConstraintLayout constraintLayout2, Guideline guideline2, Guideline guideline3, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, ImageView imageView2) {
        this.rootView = view;
        this.dotsRight = imageView;
        this.rhyDebitCardAnimation = lottieAnimationView;
        this.rhyDebitCardBackOverlay = constraintLayout;
        this.rhyDebitCardEndGuideline = guideline;
        this.rhyDebitCardHeader = rhTextView;
        this.rhyDebitCardHeaderContainer = constraintLayout2;
        this.rhyDebitCardStartGuideline = guideline2;
        this.rhyDebitCardTopGuideline = guideline3;
        this.rhyDebitCardViewCardNumberPlaceholder = rhTextView2;
        this.rhyDebitCardViewCvvLabel = rhTextView3;
        this.rhyDebitCardViewCvvPlaceholder = rhTextView4;
        this.rhyDebitCardViewExpirationLabel = rhTextView5;
        this.rhyDebitCardViewExpirationPlaceholder = rhTextView6;
        this.rhyDebitCardViewFirstName = rhTextView7;
        this.rhyDebitCardViewLastName = rhTextView8;
        this.rhyDebitCardViewNumberImage = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhyDebitCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10285R.layout.merge_rhy_debit_card_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhyDebitCardViewBinding bind(View view) {
        int i = C10285R.id.dots_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C10285R.id.rhy_debit_card_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C10285R.id.rhy_debit_card_back_overlay;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C10285R.id.rhy_debit_card_end_guideline;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null) {
                        i = C10285R.id.rhy_debit_card_header;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C10285R.id.rhy_debit_card_header_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C10285R.id.rhy_debit_card_start_guideline;
                                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline2 != null) {
                                    i = C10285R.id.rhy_debit_card_top_guideline;
                                    Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline3 != null) {
                                        i = C10285R.id.rhy_debit_card_view_card_number_placeholder;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C10285R.id.rhy_debit_card_view_cvv_label;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C10285R.id.rhy_debit_card_view_cvv_placeholder;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    i = C10285R.id.rhy_debit_card_view_expiration_label;
                                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView5 != null) {
                                                        i = C10285R.id.rhy_debit_card_view_expiration_placeholder;
                                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView6 != null) {
                                                            i = C10285R.id.rhy_debit_card_view_first_name;
                                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView7 != null) {
                                                                i = C10285R.id.rhy_debit_card_view_last_name;
                                                                RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView8 != null) {
                                                                    i = C10285R.id.rhy_debit_card_view_number_image;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView2 != null) {
                                                                        return new MergeRhyDebitCardViewBinding(view, imageView, lottieAnimationView, constraintLayout, guideline, rhTextView, constraintLayout2, guideline2, guideline3, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6, rhTextView7, rhTextView8, imageView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
