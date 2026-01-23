package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdSettingsRow;

/* loaded from: classes8.dex */
public final class IncludeSdSettingsRowCondensedBinding implements ViewBinding {
    private final SdSettingsRow rootView;
    public final SdSettingsRow sdSettingsRow;

    private IncludeSdSettingsRowCondensedBinding(SdSettingsRow sdSettingsRow, SdSettingsRow sdSettingsRow2) {
        this.rootView = sdSettingsRow;
        this.sdSettingsRow = sdSettingsRow2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdSettingsRow getRoot() {
        return this.rootView;
    }

    public static IncludeSdSettingsRowCondensedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdSettingsRowCondensedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_settings_row_condensed, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdSettingsRowCondensedBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdSettingsRow sdSettingsRow = (SdSettingsRow) view;
        return new IncludeSdSettingsRowCondensedBinding(sdSettingsRow, sdSettingsRow);
    }
}
