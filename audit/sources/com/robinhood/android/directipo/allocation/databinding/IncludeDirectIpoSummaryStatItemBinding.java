package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoSummaryStatItemView;

/* loaded from: classes27.dex */
public final class IncludeDirectIpoSummaryStatItemBinding implements ViewBinding {
    private final DirectIpoSummaryStatItemView rootView;

    private IncludeDirectIpoSummaryStatItemBinding(DirectIpoSummaryStatItemView directIpoSummaryStatItemView) {
        this.rootView = directIpoSummaryStatItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DirectIpoSummaryStatItemView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoSummaryStatItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoSummaryStatItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.include_direct_ipo_summary_stat_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoSummaryStatItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoSummaryStatItemBinding((DirectIpoSummaryStatItemView) view);
    }
}
