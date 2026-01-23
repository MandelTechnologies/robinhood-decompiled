package com.robinhood.android.debitcard.linking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.stripe.android.view.CardInputWidget;

/* loaded from: classes2.dex */
public final class FragmentDebitCardNumbersInputBinding implements ViewBinding {
    public final RdsTextButton alternativeActionBtn;
    public final CardInputWidget cardInputWidget;
    public final RdsButton continueButton;
    public final RhTextView debitCardDisclosure;
    public final RhTextView enterDebitCardNumberTitle;
    public final RhTextView matchaDisclosure;
    public final RdsNumpadView numpad;
    private final LinearLayout rootView;

    private FragmentDebitCardNumbersInputBinding(LinearLayout linearLayout, RdsTextButton rdsTextButton, CardInputWidget cardInputWidget, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsNumpadView rdsNumpadView) {
        this.rootView = linearLayout;
        this.alternativeActionBtn = rdsTextButton;
        this.cardInputWidget = cardInputWidget;
        this.continueButton = rdsButton;
        this.debitCardDisclosure = rhTextView;
        this.enterDebitCardNumberTitle = rhTextView2;
        this.matchaDisclosure = rhTextView3;
        this.numpad = rdsNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDebitCardNumbersInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDebitCardNumbersInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C13894R.layout.fragment_debit_card_numbers_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDebitCardNumbersInputBinding bind(View view) {
        int i = C13894R.id.alternative_action_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C13894R.id.card_input_widget;
            CardInputWidget cardInputWidget = (CardInputWidget) ViewBindings.findChildViewById(view, i);
            if (cardInputWidget != null) {
                i = C13894R.id.continue_button;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C13894R.id.debit_card_disclosure;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C13894R.id.enter_debit_card_number_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C13894R.id.matcha_disclosure;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C13894R.id.numpad;
                                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                if (rdsNumpadView != null) {
                                    return new FragmentDebitCardNumbersInputBinding((LinearLayout) view, rdsTextButton, cardInputWidget, rdsButton, rhTextView, rhTextView2, rhTextView3, rdsNumpadView);
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
