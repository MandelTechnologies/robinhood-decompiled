package com.robinhood.shared.unverifiedaccountrecovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;

/* loaded from: classes12.dex */
public final class UarPhoneInputBinding implements ViewBinding {
    private final RdsTextInputContainerView rootView;
    public final RdsFormattedEditText uarPhoneEditInput;
    public final RdsTextInputContainerView uarPhoneEditInputContainer;

    private UarPhoneInputBinding(RdsTextInputContainerView rdsTextInputContainerView, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView2) {
        this.rootView = rdsTextInputContainerView;
        this.uarPhoneEditInput = rdsFormattedEditText;
        this.uarPhoneEditInputContainer = rdsTextInputContainerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsTextInputContainerView getRoot() {
        return this.rootView;
    }

    public static UarPhoneInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UarPhoneInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C41128R.layout.uar_phone_input, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UarPhoneInputBinding bind(View view) {
        int i = C41128R.id.uar_phone_edit_input;
        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
        if (rdsFormattedEditText != null) {
            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) view;
            return new UarPhoneInputBinding(rdsTextInputContainerView, rdsFormattedEditText, rdsTextInputContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
