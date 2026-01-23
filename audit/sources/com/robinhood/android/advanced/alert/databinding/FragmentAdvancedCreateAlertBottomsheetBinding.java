package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;

/* loaded from: classes24.dex */
public final class FragmentAdvancedCreateAlertBottomsheetBinding implements ViewBinding {
    public final RhTextView advancedAlertSettingTitle;
    public final ImageView backBtn;
    public final RhTextView currentPriceTxt;
    public final RhMoneyInputView priceEditText;
    public final RdsTextInputContainerView priceEditTextContainer;
    public final RdsNumpadView priceNumpad;
    private final ConstraintLayout rootView;
    public final RdsButton saveBtn;

    private FragmentAdvancedCreateAlertBottomsheetBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RhMoneyInputView rhMoneyInputView, RdsTextInputContainerView rdsTextInputContainerView, RdsNumpadView rdsNumpadView, RdsButton rdsButton) {
        this.rootView = constraintLayout;
        this.advancedAlertSettingTitle = rhTextView;
        this.backBtn = imageView;
        this.currentPriceTxt = rhTextView2;
        this.priceEditText = rhMoneyInputView;
        this.priceEditTextContainer = rdsTextInputContainerView;
        this.priceNumpad = rdsNumpadView;
        this.saveBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAdvancedCreateAlertBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAdvancedCreateAlertBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.fragment_advanced_create_alert_bottomsheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAdvancedCreateAlertBottomsheetBinding bind(View view) {
        int i = C8387R.id.advanced_alert_setting_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C8387R.id.back_btn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8387R.id.current_price_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C8387R.id.price_edit_text;
                    RhMoneyInputView rhMoneyInputView = (RhMoneyInputView) ViewBindings.findChildViewById(view, i);
                    if (rhMoneyInputView != null) {
                        i = C8387R.id.price_edit_text_container;
                        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView != null) {
                            i = C8387R.id.price_numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                i = C8387R.id.save_btn;
                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton != null) {
                                    return new FragmentAdvancedCreateAlertBottomsheetBinding((ConstraintLayout) view, rhTextView, imageView, rhTextView2, rhMoneyInputView, rdsTextInputContainerView, rdsNumpadView, rdsButton);
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
