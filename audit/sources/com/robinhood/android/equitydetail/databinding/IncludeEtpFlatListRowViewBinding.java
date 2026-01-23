package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.etp.EtpItemFlatListRowView;

/* loaded from: classes3.dex */
public final class IncludeEtpFlatListRowViewBinding implements ViewBinding {
    private final EtpItemFlatListRowView rootView;

    private IncludeEtpFlatListRowViewBinding(EtpItemFlatListRowView etpItemFlatListRowView) {
        this.rootView = etpItemFlatListRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EtpItemFlatListRowView getRoot() {
        return this.rootView;
    }

    public static IncludeEtpFlatListRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEtpFlatListRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_etp_flat_list_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEtpFlatListRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEtpFlatListRowViewBinding((EtpItemFlatListRowView) view);
    }
}
