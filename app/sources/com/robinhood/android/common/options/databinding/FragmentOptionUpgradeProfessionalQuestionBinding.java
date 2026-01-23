package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentOptionUpgradeProfessionalQuestionBinding implements ViewBinding {
    public final RhTextView optionUpgradeProfessionalQuestionDisclaimerTxt;
    public final RdsButton optionUpgradeProfessionalQuestionNoBtn;
    public final RhTextView optionUpgradeProfessionalQuestionQuestionTxt;
    public final RdsButton optionUpgradeProfessionalQuestionYesBtn;
    private final LinearLayoutCompat rootView;

    private FragmentOptionUpgradeProfessionalQuestionBinding(LinearLayoutCompat linearLayoutCompat, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RdsButton rdsButton2) {
        this.rootView = linearLayoutCompat;
        this.optionUpgradeProfessionalQuestionDisclaimerTxt = rhTextView;
        this.optionUpgradeProfessionalQuestionNoBtn = rdsButton;
        this.optionUpgradeProfessionalQuestionQuestionTxt = rhTextView2;
        this.optionUpgradeProfessionalQuestionYesBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    public static FragmentOptionUpgradeProfessionalQuestionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionUpgradeProfessionalQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.fragment_option_upgrade_professional_question, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionUpgradeProfessionalQuestionBinding bind(View view) {
        int i = C11303R.id.option_upgrade_professional_question_disclaimer_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11303R.id.option_upgrade_professional_question_no_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C11303R.id.option_upgrade_professional_question_question_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C11303R.id.option_upgrade_professional_question_yes_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        return new FragmentOptionUpgradeProfessionalQuestionBinding((LinearLayoutCompat) view, rhTextView, rdsButton, rhTextView2, rdsButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
