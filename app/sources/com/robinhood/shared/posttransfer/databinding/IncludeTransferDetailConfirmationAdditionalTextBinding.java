package com.robinhood.shared.posttransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.posttransfer.C39496R;

/* loaded from: classes6.dex */
public final class IncludeTransferDetailConfirmationAdditionalTextBinding implements ViewBinding {
    public final RhTextView additionalDetailTxt;
    private final RhTextView rootView;

    private IncludeTransferDetailConfirmationAdditionalTextBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.additionalDetailTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeTransferDetailConfirmationAdditionalTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTransferDetailConfirmationAdditionalTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39496R.layout.include_transfer_detail_confirmation_additional_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTransferDetailConfirmationAdditionalTextBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new IncludeTransferDetailConfirmationAdditionalTextBinding(rhTextView, rhTextView);
    }
}
