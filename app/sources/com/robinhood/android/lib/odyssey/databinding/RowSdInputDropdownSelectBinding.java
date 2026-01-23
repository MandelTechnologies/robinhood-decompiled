package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow;

/* loaded from: classes8.dex */
public final class RowSdInputDropdownSelectBinding implements ViewBinding {
    private final SdDropdownSelectRow rootView;
    public final SdDropdownSelectRow sdDropdownSelectRow;

    private RowSdInputDropdownSelectBinding(SdDropdownSelectRow sdDropdownSelectRow, SdDropdownSelectRow sdDropdownSelectRow2) {
        this.rootView = sdDropdownSelectRow;
        this.sdDropdownSelectRow = sdDropdownSelectRow2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdDropdownSelectRow getRoot() {
        return this.rootView;
    }

    public static RowSdInputDropdownSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdInputDropdownSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_input_dropdown_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdInputDropdownSelectBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdDropdownSelectRow sdDropdownSelectRow = (SdDropdownSelectRow) view;
        return new RowSdInputDropdownSelectBinding(sdDropdownSelectRow, sdDropdownSelectRow);
    }
}
