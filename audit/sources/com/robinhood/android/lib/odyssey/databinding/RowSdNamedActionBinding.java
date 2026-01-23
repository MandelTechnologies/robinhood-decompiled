package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdNamedActionRow;

/* loaded from: classes8.dex */
public final class RowSdNamedActionBinding implements ViewBinding {
    private final SdNamedActionRow rootView;
    public final SdNamedActionRow sdNamedActionRow;

    private RowSdNamedActionBinding(SdNamedActionRow sdNamedActionRow, SdNamedActionRow sdNamedActionRow2) {
        this.rootView = sdNamedActionRow;
        this.sdNamedActionRow = sdNamedActionRow2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdNamedActionRow getRoot() {
        return this.rootView;
    }

    public static RowSdNamedActionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdNamedActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_named_action, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdNamedActionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdNamedActionRow sdNamedActionRow = (SdNamedActionRow) view;
        return new RowSdNamedActionBinding(sdNamedActionRow, sdNamedActionRow);
    }
}
