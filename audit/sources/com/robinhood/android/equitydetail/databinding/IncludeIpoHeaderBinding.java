package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoHeaderView;

/* loaded from: classes3.dex */
public final class IncludeIpoHeaderBinding implements ViewBinding {
    private final IpoHeaderView rootView;

    private IncludeIpoHeaderBinding(IpoHeaderView ipoHeaderView) {
        this.rootView = ipoHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public IpoHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeIpoHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIpoHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_ipo_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIpoHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeIpoHeaderBinding((IpoHeaderView) view);
    }
}
