package com.robinhood.android.optionsexercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;

/* loaded from: classes11.dex */
public final class MergeOptionExerciseBinding implements ViewBinding {
    public final View accountInfoBottomDivider;
    public final RhTextView accountTxt;
    public final RhEditText contractQuantityEdt;
    public final View contractQuantityEdtBottomDivider;
    public final RhTextView contractsLabelTxt;
    public final RhTextView contractsMultiplierTxt;
    public final LinearLayout exerciseReviewContainer;
    public final RhTextView exerciseReviewTxt;
    public final RhTextView optionExerciseDescription;
    public final RhTextView optionExerciseTitle;
    private final View rootView;
    public final RhTextView selectedAccountSubtitle;
    public final View strikePriceBottomDivider;
    public final RhTextView strikePriceLabelTxt;
    public final RhTextView strikePriceTxt;
    public final View totalBottomDivider;
    public final ComposeView totalValueRowComposeView;

    private MergeOptionExerciseBinding(View view, View view2, RhTextView rhTextView, RhEditText rhEditText, View view3, RhTextView rhTextView2, RhTextView rhTextView3, LinearLayout linearLayout, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, View view4, RhTextView rhTextView8, RhTextView rhTextView9, View view5, ComposeView composeView) {
        this.rootView = view;
        this.accountInfoBottomDivider = view2;
        this.accountTxt = rhTextView;
        this.contractQuantityEdt = rhEditText;
        this.contractQuantityEdtBottomDivider = view3;
        this.contractsLabelTxt = rhTextView2;
        this.contractsMultiplierTxt = rhTextView3;
        this.exerciseReviewContainer = linearLayout;
        this.exerciseReviewTxt = rhTextView4;
        this.optionExerciseDescription = rhTextView5;
        this.optionExerciseTitle = rhTextView6;
        this.selectedAccountSubtitle = rhTextView7;
        this.strikePriceBottomDivider = view4;
        this.strikePriceLabelTxt = rhTextView8;
        this.strikePriceTxt = rhTextView9;
        this.totalBottomDivider = view5;
        this.totalValueRowComposeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionExerciseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24704R.layout.merge_option_exercise, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionExerciseBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C24704R.id.account_info_bottom_divider;
        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById4 != null) {
            i = C24704R.id.account_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C24704R.id.contract_quantity_edt;
                RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
                if (rhEditText != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24704R.id.contract_quantity_edt_bottom_divider))) != null) {
                    i = C24704R.id.contracts_label_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C24704R.id.contracts_multiplier_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C24704R.id.exercise_review_container;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C24704R.id.exercise_review_txt;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    i = C24704R.id.option_exercise_description;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null) {
                                        i = C24704R.id.option_exercise_title;
                                        RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView6 != null) {
                                            i = C24704R.id.selected_account_subtitle;
                                            RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView7 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C24704R.id.strike_price_bottom_divider))) != null) {
                                                i = C24704R.id.strike_price_label_txt;
                                                RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView8 != null) {
                                                    i = C24704R.id.strike_price_txt;
                                                    RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView9 != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C24704R.id.total_bottom_divider))) != null) {
                                                        i = C24704R.id.total_value_row_compose_view;
                                                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                                                        if (composeView != null) {
                                                            return new MergeOptionExerciseBinding(view, viewFindChildViewById4, rhTextView, rhEditText, viewFindChildViewById, rhTextView2, rhTextView3, linearLayout, rhTextView4, rhTextView5, rhTextView6, rhTextView7, viewFindChildViewById2, rhTextView8, rhTextView9, viewFindChildViewById3, composeView);
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
