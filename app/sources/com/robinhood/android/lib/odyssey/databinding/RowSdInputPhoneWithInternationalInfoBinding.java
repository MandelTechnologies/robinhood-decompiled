package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdPhoneInputRow;
import com.robinhood.android.odyssey.lib.view.SdPhoneInputRowWithInternationalInfo;

/* loaded from: classes8.dex */
public final class RowSdInputPhoneWithInternationalInfoBinding implements ViewBinding {
    private final SdPhoneInputRowWithInternationalInfo rootView;
    public final RdsFormattedEditText sdInputRowEditText;
    public final RdsTextButton sdPhoneInputInternationalInfoButton;
    public final SdPhoneInputRow sdPhoneInputRow;
    public final SdPhoneInputRowWithInternationalInfo sdPhoneInputRowWithInternationalInfo;

    private RowSdInputPhoneWithInternationalInfoBinding(SdPhoneInputRowWithInternationalInfo sdPhoneInputRowWithInternationalInfo, RdsFormattedEditText rdsFormattedEditText, RdsTextButton rdsTextButton, SdPhoneInputRow sdPhoneInputRow, SdPhoneInputRowWithInternationalInfo sdPhoneInputRowWithInternationalInfo2) {
        this.rootView = sdPhoneInputRowWithInternationalInfo;
        this.sdInputRowEditText = rdsFormattedEditText;
        this.sdPhoneInputInternationalInfoButton = rdsTextButton;
        this.sdPhoneInputRow = sdPhoneInputRow;
        this.sdPhoneInputRowWithInternationalInfo = sdPhoneInputRowWithInternationalInfo2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdPhoneInputRowWithInternationalInfo getRoot() {
        return this.rootView;
    }

    public static RowSdInputPhoneWithInternationalInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdInputPhoneWithInternationalInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_input_phone_with_international_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdInputPhoneWithInternationalInfoBinding bind(View view) {
        int i = C20335R.id.sd_input_row_edit_text;
        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
        if (rdsFormattedEditText != null) {
            i = C20335R.id.sd_phone_input_international_info_button;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C20335R.id.sd_phone_input_row;
                SdPhoneInputRow sdPhoneInputRow = (SdPhoneInputRow) ViewBindings.findChildViewById(view, i);
                if (sdPhoneInputRow != null) {
                    SdPhoneInputRowWithInternationalInfo sdPhoneInputRowWithInternationalInfo = (SdPhoneInputRowWithInternationalInfo) view;
                    return new RowSdInputPhoneWithInternationalInfoBinding(sdPhoneInputRowWithInternationalInfo, rdsFormattedEditText, rdsTextButton, sdPhoneInputRow, sdPhoneInputRowWithInternationalInfo);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
