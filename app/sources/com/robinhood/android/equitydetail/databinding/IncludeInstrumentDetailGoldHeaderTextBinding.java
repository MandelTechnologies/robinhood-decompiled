package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class IncludeInstrumentDetailGoldHeaderTextBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final RdsHeaderRowView sectionHeaderTxt;

    private IncludeInstrumentDetailGoldHeaderTextBinding(FrameLayout frameLayout, RdsHeaderRowView rdsHeaderRowView) {
        this.rootView = frameLayout;
        this.sectionHeaderTxt = rdsHeaderRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeInstrumentDetailGoldHeaderTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstrumentDetailGoldHeaderTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_instrument_detail_gold_header_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstrumentDetailGoldHeaderTextBinding bind(View view) {
        int i = C15314R.id.section_header_txt;
        RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
        if (rdsHeaderRowView != null) {
            return new IncludeInstrumentDetailGoldHeaderTextBinding((FrameLayout) view, rdsHeaderRowView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
