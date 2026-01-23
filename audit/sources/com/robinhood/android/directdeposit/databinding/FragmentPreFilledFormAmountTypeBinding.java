package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormAmountTypeBinding implements ViewBinding {
    public final RdsButton amountTypeContinueBtn;
    public final RhTextView amountTypeDescription;
    public final LegacyRdsRadioButton amountTypeDollar;
    public final LegacyRdsRadioButton amountTypeEntire;
    public final LegacyRdsRadioButton amountTypePercent;
    public final LegacyRdsRadioGroup amountTypeRadioGroup;
    public final RhTextView amountTypeTitle;
    private final LinearLayout rootView;

    private FragmentPreFilledFormAmountTypeBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, LegacyRdsRadioButton legacyRdsRadioButton, LegacyRdsRadioButton legacyRdsRadioButton2, LegacyRdsRadioButton legacyRdsRadioButton3, LegacyRdsRadioGroup legacyRdsRadioGroup, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.amountTypeContinueBtn = rdsButton;
        this.amountTypeDescription = rhTextView;
        this.amountTypeDollar = legacyRdsRadioButton;
        this.amountTypeEntire = legacyRdsRadioButton2;
        this.amountTypePercent = legacyRdsRadioButton3;
        this.amountTypeRadioGroup = legacyRdsRadioGroup;
        this.amountTypeTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormAmountTypeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormAmountTypeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_amount_type, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormAmountTypeBinding bind(View view) {
        int i = C14044R.id.amount_type_continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14044R.id.amount_type_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.amount_type_dollar;
                LegacyRdsRadioButton legacyRdsRadioButton = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                if (legacyRdsRadioButton != null) {
                    i = C14044R.id.amount_type_entire;
                    LegacyRdsRadioButton legacyRdsRadioButton2 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                    if (legacyRdsRadioButton2 != null) {
                        i = C14044R.id.amount_type_percent;
                        LegacyRdsRadioButton legacyRdsRadioButton3 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                        if (legacyRdsRadioButton3 != null) {
                            i = C14044R.id.amount_type_radio_group;
                            LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                            if (legacyRdsRadioGroup != null) {
                                i = C14044R.id.amount_type_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentPreFilledFormAmountTypeBinding((LinearLayout) view, rdsButton, rhTextView, legacyRdsRadioButton, legacyRdsRadioButton2, legacyRdsRadioButton3, legacyRdsRadioGroup, rhTextView2);
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
