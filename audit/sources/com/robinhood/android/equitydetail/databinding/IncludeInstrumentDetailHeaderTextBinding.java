package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeInstrumentDetailHeaderTextBinding implements ViewBinding {
    private final RdsHeaderRowView rootView;

    private IncludeInstrumentDetailHeaderTextBinding(RdsHeaderRowView rdsHeaderRowView) {
        this.rootView = rdsHeaderRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsHeaderRowView getRoot() {
        return this.rootView;
    }

    public static IncludeInstrumentDetailHeaderTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstrumentDetailHeaderTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_instrument_detail_header_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstrumentDetailHeaderTextBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInstrumentDetailHeaderTextBinding((RdsHeaderRowView) view);
    }
}
