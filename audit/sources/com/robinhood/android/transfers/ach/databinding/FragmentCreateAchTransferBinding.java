package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class FragmentCreateAchTransferBinding implements ViewBinding {
    public final LinearLayout accountInfo;
    public final RhTextView accountNameTxt;
    public final RhEditText amountEdt;
    public final RdsButton amountOneBtn;
    public final RdsButton amountOneBtnV2;
    public final RdsButton amountThreeBtn;
    public final RdsButton amountThreeBtnV2;
    public final RdsButton amountTwoBtn;
    public final RdsButton amountTwoBtnV2;
    public final RdsButton changeAchBtn;
    public final RhTextView changeAchBtnRevamp;
    public final LinearLayout createAchTransferFragment;
    public final RhTextView currentBalanceTxt;
    public final ComposeView goldEarningsPotentialCalculator;
    public final ComposeView goldEarningsPotentialCalculatorDisclosure;
    public final ShimmerLoadingView loadingView;
    public final RdsNumpadView numpad;
    public final ImageView questionImg;
    public final RhTextView recommendedAmountDisclaimerTxt;
    private final FrameLayout rootView;
    public final LinearLayout setAutomaticDepositBtn;
    public final ImageView setAutomaticDepositImg;
    public final RhTextView setAutomaticDepositTxt;
    public final CoordinatorLayout snackbarShim;
    public final RdsButton submitBtn;
    public final View suggestedAmountsDivider;
    public final LinearLayout suggestedAmountsView;
    public final LinearLayout suggestedAmountsViewV2;
    public final RhTextView titleText;

    private FragmentCreateAchTransferBinding(FrameLayout frameLayout, LinearLayout linearLayout, RhTextView rhTextView, RhEditText rhEditText, RdsButton rdsButton, RdsButton rdsButton2, RdsButton rdsButton3, RdsButton rdsButton4, RdsButton rdsButton5, RdsButton rdsButton6, RdsButton rdsButton7, RhTextView rhTextView2, LinearLayout linearLayout2, RhTextView rhTextView3, ComposeView composeView, ComposeView composeView2, ShimmerLoadingView shimmerLoadingView, RdsNumpadView rdsNumpadView, ImageView imageView, RhTextView rhTextView4, LinearLayout linearLayout3, ImageView imageView2, RhTextView rhTextView5, CoordinatorLayout coordinatorLayout, RdsButton rdsButton8, View view, LinearLayout linearLayout4, LinearLayout linearLayout5, RhTextView rhTextView6) {
        this.rootView = frameLayout;
        this.accountInfo = linearLayout;
        this.accountNameTxt = rhTextView;
        this.amountEdt = rhEditText;
        this.amountOneBtn = rdsButton;
        this.amountOneBtnV2 = rdsButton2;
        this.amountThreeBtn = rdsButton3;
        this.amountThreeBtnV2 = rdsButton4;
        this.amountTwoBtn = rdsButton5;
        this.amountTwoBtnV2 = rdsButton6;
        this.changeAchBtn = rdsButton7;
        this.changeAchBtnRevamp = rhTextView2;
        this.createAchTransferFragment = linearLayout2;
        this.currentBalanceTxt = rhTextView3;
        this.goldEarningsPotentialCalculator = composeView;
        this.goldEarningsPotentialCalculatorDisclosure = composeView2;
        this.loadingView = shimmerLoadingView;
        this.numpad = rdsNumpadView;
        this.questionImg = imageView;
        this.recommendedAmountDisclaimerTxt = rhTextView4;
        this.setAutomaticDepositBtn = linearLayout3;
        this.setAutomaticDepositImg = imageView2;
        this.setAutomaticDepositTxt = rhTextView5;
        this.snackbarShim = coordinatorLayout;
        this.submitBtn = rdsButton8;
        this.suggestedAmountsDivider = view;
        this.suggestedAmountsView = linearLayout4;
        this.suggestedAmountsViewV2 = linearLayout5;
        this.titleText = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCreateAchTransferBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCreateAchTransferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_create_ach_transfer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCreateAchTransferBinding bind(View view) {
        View viewFindChildViewById;
        int i = C30082R.id.account_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C30082R.id.account_name_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C30082R.id.amount_edt;
                RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                if (rhEditText != null) {
                    i = C30082R.id.amount_one_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C30082R.id.amount_one_btn_v2;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C30082R.id.amount_three_btn;
                            RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton3 != null) {
                                i = C30082R.id.amount_three_btn_v2;
                                RdsButton rdsButton4 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton4 != null) {
                                    i = C30082R.id.amount_two_btn;
                                    RdsButton rdsButton5 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton5 != null) {
                                        i = C30082R.id.amount_two_btn_v2;
                                        RdsButton rdsButton6 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                        if (rdsButton6 != null) {
                                            i = C30082R.id.change_ach_btn;
                                            RdsButton rdsButton7 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton7 != null) {
                                                i = C30082R.id.change_ach_btn_revamp;
                                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView2 != null) {
                                                    i = C30082R.id.create_ach_transfer_fragment;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout2 != null) {
                                                        i = C30082R.id.current_balance_txt;
                                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView3 != null) {
                                                            i = C30082R.id.gold_earnings_potential_calculator;
                                                            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                            if (composeView != null) {
                                                                i = C30082R.id.gold_earnings_potential_calculator_disclosure;
                                                                ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                                if (composeView2 != null) {
                                                                    i = C30082R.id.loading_view;
                                                                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                                                    if (shimmerLoadingView != null) {
                                                                        i = C30082R.id.numpad;
                                                                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                                                        if (rdsNumpadView != null) {
                                                                            i = C30082R.id.question_img;
                                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView != null) {
                                                                                i = C30082R.id.recommended_amount_disclaimer_txt;
                                                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (rhTextView4 != null) {
                                                                                    i = C30082R.id.set_automatic_deposit_btn;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (linearLayout3 != null) {
                                                                                        i = C30082R.id.set_automatic_deposit_img;
                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                        if (imageView2 != null) {
                                                                                            i = C30082R.id.set_automatic_deposit_txt;
                                                                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (rhTextView5 != null) {
                                                                                                i = C30082R.id.snackbar_shim;
                                                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (coordinatorLayout != null) {
                                                                                                    i = C30082R.id.submit_btn;
                                                                                                    RdsButton rdsButton8 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                                                                    if (rdsButton8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C30082R.id.suggested_amounts_divider))) != null) {
                                                                                                        i = C30082R.id.suggested_amounts_view;
                                                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (linearLayout4 != null) {
                                                                                                            i = C30082R.id.suggested_amounts_view_v2;
                                                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                            if (linearLayout5 != null) {
                                                                                                                i = C30082R.id.title_text;
                                                                                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (rhTextView6 != null) {
                                                                                                                    return new FragmentCreateAchTransferBinding((FrameLayout) view, linearLayout, rhTextView, rhEditText, rdsButton, rdsButton2, rdsButton3, rdsButton4, rdsButton5, rdsButton6, rdsButton7, rhTextView2, linearLayout2, rhTextView3, composeView, composeView2, shimmerLoadingView, rdsNumpadView, imageView, rhTextView4, linearLayout3, imageView2, rhTextView5, coordinatorLayout, rdsButton8, viewFindChildViewById, linearLayout4, linearLayout5, rhTextView6);
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
