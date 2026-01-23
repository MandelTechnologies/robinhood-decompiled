package com.robinhood.android.cash.cushion.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.cushion.C9970R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class CashCushionSettingDialogBinding implements ViewBinding {
    public final RdsButton cancelBtn;
    public final RhTextView messageTxt;
    public final RdsButton primaryBtn;
    private final LinearLayout rootView;
    public final RhTextView titleTxt;

    private CashCushionSettingDialogBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.cancelBtn = rdsButton;
        this.messageTxt = rhTextView;
        this.primaryBtn = rdsButton2;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CashCushionSettingDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CashCushionSettingDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9970R.layout.cash_cushion_setting_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CashCushionSettingDialogBinding bind(View view) {
        int i = C9970R.id.cancel_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C9970R.id.message_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C9970R.id.primary_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C9970R.id.title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new CashCushionSettingDialogBinding((LinearLayout) view, rdsButton, rhTextView, rdsButton2, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
