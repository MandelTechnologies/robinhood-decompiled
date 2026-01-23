package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdFancyAgreementView;

/* loaded from: classes8.dex */
public final class RowSdFancyAgreementBinding implements ViewBinding {
    private final SdFancyAgreementView rootView;
    public final SdFancyAgreementView sdMarkdownSubComponentView;

    private RowSdFancyAgreementBinding(SdFancyAgreementView sdFancyAgreementView, SdFancyAgreementView sdFancyAgreementView2) {
        this.rootView = sdFancyAgreementView;
        this.sdMarkdownSubComponentView = sdFancyAgreementView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdFancyAgreementView getRoot() {
        return this.rootView;
    }

    public static RowSdFancyAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdFancyAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_fancy_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdFancyAgreementBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdFancyAgreementView sdFancyAgreementView = (SdFancyAgreementView) view;
        return new RowSdFancyAgreementBinding(sdFancyAgreementView, sdFancyAgreementView);
    }
}
