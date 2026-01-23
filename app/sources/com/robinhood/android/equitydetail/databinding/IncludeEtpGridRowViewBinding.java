package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.etp.EtpItemGridRowView;

/* loaded from: classes3.dex */
public final class IncludeEtpGridRowViewBinding implements ViewBinding {
    private final EtpItemGridRowView rootView;

    private IncludeEtpGridRowViewBinding(EtpItemGridRowView etpItemGridRowView) {
        this.rootView = etpItemGridRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EtpItemGridRowView getRoot() {
        return this.rootView;
    }

    public static IncludeEtpGridRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEtpGridRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_etp_grid_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEtpGridRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEtpGridRowViewBinding((EtpItemGridRowView) view);
    }
}
