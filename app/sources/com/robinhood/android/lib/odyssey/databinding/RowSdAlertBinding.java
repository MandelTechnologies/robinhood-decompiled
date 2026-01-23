package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdAlert;

/* loaded from: classes8.dex */
public final class RowSdAlertBinding implements ViewBinding {
    private final SdAlert rootView;
    public final SdAlert sdAlert;

    private RowSdAlertBinding(SdAlert sdAlert, SdAlert sdAlert2) {
        this.rootView = sdAlert;
        this.sdAlert = sdAlert2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdAlert getRoot() {
        return this.rootView;
    }

    public static RowSdAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdAlertBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdAlert sdAlert = (SdAlert) view;
        return new RowSdAlertBinding(sdAlert, sdAlert);
    }
}
