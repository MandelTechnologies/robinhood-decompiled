package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdInformationalRow;

/* loaded from: classes8.dex */
public final class RowSdInformationalListBinding implements ViewBinding {
    private final SdInformationalRow rootView;
    public final SdInformationalRow sdInformationalRow;

    private RowSdInformationalListBinding(SdInformationalRow sdInformationalRow, SdInformationalRow sdInformationalRow2) {
        this.rootView = sdInformationalRow;
        this.sdInformationalRow = sdInformationalRow2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdInformationalRow getRoot() {
        return this.rootView;
    }

    public static RowSdInformationalListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdInformationalListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_informational_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdInformationalListBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdInformationalRow sdInformationalRow = (SdInformationalRow) view;
        return new RowSdInformationalListBinding(sdInformationalRow, sdInformationalRow);
    }
}
