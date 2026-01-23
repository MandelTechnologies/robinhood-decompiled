package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MergeFraudPromptViewBinding implements ViewBinding {
    public final View fraudPromptBackground;
    public final RhTextView fraudPromptMessageTxt;
    public final RdsButton fraudPromptNegativeBtn;
    public final RdsButton fraudPromptPositiveBtn;
    public final View fraudPromptShadow;
    public final RhTextView fraudPromptTitleTxt;
    private final View rootView;

    private MergeFraudPromptViewBinding(View view, View view2, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, View view3, RhTextView rhTextView2) {
        this.rootView = view;
        this.fraudPromptBackground = view2;
        this.fraudPromptMessageTxt = rhTextView;
        this.fraudPromptNegativeBtn = rdsButton;
        this.fraudPromptPositiveBtn = rdsButton2;
        this.fraudPromptShadow = view3;
        this.fraudPromptTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeFraudPromptViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10421R.layout.merge_fraud_prompt_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeFraudPromptViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C10421R.id.fraud_prompt_background;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = C10421R.id.fraud_prompt_message_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10421R.id.fraud_prompt_negative_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C10421R.id.fraud_prompt_positive_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C10421R.id.fraud_prompt_shadow))) != null) {
                        i = C10421R.id.fraud_prompt_title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new MergeFraudPromptViewBinding(view, viewFindChildViewById2, rhTextView, rdsButton, rdsButton2, viewFindChildViewById, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
