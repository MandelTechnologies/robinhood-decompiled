package com.robinhood.android.transfers.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.transfers.recurring.C30439R;

/* loaded from: classes9.dex */
public final class IncludeAddAutomaticDepositBinding implements ViewBinding {
    private final RdsTextButton rootView;

    private IncludeAddAutomaticDepositBinding(RdsTextButton rdsTextButton) {
        this.rootView = rdsTextButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsTextButton getRoot() {
        return this.rootView;
    }

    public static IncludeAddAutomaticDepositBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAddAutomaticDepositBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30439R.layout.include_add_automatic_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAddAutomaticDepositBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAddAutomaticDepositBinding((RdsTextButton) view);
    }
}
