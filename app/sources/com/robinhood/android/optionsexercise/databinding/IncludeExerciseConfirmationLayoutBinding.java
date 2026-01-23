package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class IncludeExerciseConfirmationLayoutBinding implements ViewBinding {
    public final RdsButton doneBtn;
    public final View exerciseConfirmationContractQuantityBottomDivider;
    public final RhTextView exerciseConfirmationContractQuantityTxt;
    public final RhTextView exerciseConfirmationContractsMultiplierTxt;
    public final RhTextView exerciseConfirmationContractsTxt;
    public final RhTextView exerciseConfirmationDescriptionTxt;
    public final View exerciseConfirmationStrikePriceBottomDivider;
    public final RhTextView exerciseConfirmationStrikePriceLabelTxt;
    public final RhTextView exerciseConfirmationStrikePriceTxt;
    public final RhTextView exerciseConfirmationTitleTxt;
    public final View exerciseConfirmationTotalBottomDivider;
    public final ComposeView exerciseConfirmationTotalValueComposeView;
    private final RdsCardView rootView;
    public final RdsButton viewExerciseBtn;

    private IncludeExerciseConfirmationLayoutBinding(RdsCardView rdsCardView, RdsButton rdsButton, View view, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, View view2, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, View view3, ComposeView composeView, RdsButton rdsButton2) {
        this.rootView = rdsCardView;
        this.doneBtn = rdsButton;
        this.exerciseConfirmationContractQuantityBottomDivider = view;
        this.exerciseConfirmationContractQuantityTxt = rhTextView;
        this.exerciseConfirmationContractsMultiplierTxt = rhTextView2;
        this.exerciseConfirmationContractsTxt = rhTextView3;
        this.exerciseConfirmationDescriptionTxt = rhTextView4;
        this.exerciseConfirmationStrikePriceBottomDivider = view2;
        this.exerciseConfirmationStrikePriceLabelTxt = rhTextView5;
        this.exerciseConfirmationStrikePriceTxt = rhTextView6;
        this.exerciseConfirmationTitleTxt = rhTextView7;
        this.exerciseConfirmationTotalBottomDivider = view3;
        this.exerciseConfirmationTotalValueComposeView = composeView;
        this.viewExerciseBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsCardView getRoot() {
        return this.rootView;
    }

    public static IncludeExerciseConfirmationLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeExerciseConfirmationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24704R.layout.include_exercise_confirmation_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeExerciseConfirmationLayoutBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C24704R.id.done_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24704R.id.exercise_confirmation_contract_quantity_bottom_divider))) != null) {
            i = C24704R.id.exercise_confirmation_contract_quantity_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C24704R.id.exercise_confirmation_contracts_multiplier_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C24704R.id.exercise_confirmation_contracts_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C24704R.id.exercise_confirmation_description_txt;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C24704R.id.exercise_confirmation_strike_price_bottom_divider))) != null) {
                            i = C24704R.id.exercise_confirmation_strike_price_label_txt;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null) {
                                i = C24704R.id.exercise_confirmation_strike_price_txt;
                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView6 != null) {
                                    i = C24704R.id.exercise_confirmation_title_txt;
                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView7 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C24704R.id.exercise_confirmation_total_bottom_divider))) != null) {
                                        i = C24704R.id.exercise_confirmation_total_value_compose_view;
                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                        if (composeView != null) {
                                            i = C24704R.id.view_exercise_btn;
                                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                            if (rdsButton2 != null) {
                                                return new IncludeExerciseConfirmationLayoutBinding((RdsCardView) view, rdsButton, viewFindChildViewById, rhTextView, rhTextView2, rhTextView3, rhTextView4, viewFindChildViewById2, rhTextView5, rhTextView6, rhTextView7, viewFindChildViewById3, composeView, rdsButton2);
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
