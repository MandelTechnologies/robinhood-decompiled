package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes24.dex */
public final class FragmentAcatsInDtcEntryBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RdsTextInputEditText dtcNumberEdt;
    public final RdsTextInputContainerView dtcNumberTextContainer;
    public final RdsTextButton learnDtcNumberTxt;
    public final RdsNumpadView numpad;
    private final LinearLayout rootView;

    private FragmentAcatsInDtcEntryBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsTextButton rdsTextButton, RdsNumpadView rdsNumpadView) {
        this.rootView = linearLayout;
        this.continueBtn = rdsButton;
        this.dtcNumberEdt = rdsTextInputEditText;
        this.dtcNumberTextContainer = rdsTextInputContainerView;
        this.learnDtcNumberTxt = rdsTextButton;
        this.numpad = rdsNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInDtcEntryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInDtcEntryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_dtc_entry, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInDtcEntryBinding bind(View view) {
        int i = C7725R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7725R.id.dtc_number_edt;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                i = C7725R.id.dtc_number_text_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C7725R.id.learn_dtc_number_txt;
                    RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                    if (rdsTextButton != null) {
                        i = C7725R.id.numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            return new FragmentAcatsInDtcEntryBinding((LinearLayout) view, rdsButton, rdsTextInputEditText, rdsTextInputContainerView, rdsTextButton, rdsNumpadView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
