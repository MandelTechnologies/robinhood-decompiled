package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class IncludeAcatsDetailDividerBinding implements ViewBinding {
    public final View acatsInDetailDivider;
    private final View rootView;

    private IncludeAcatsDetailDividerBinding(View view, View view2) {
        this.rootView = view;
        this.acatsInDetailDivider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static IncludeAcatsDetailDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAcatsDetailDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.include_acats_detail_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAcatsDetailDividerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAcatsDetailDividerBinding(view, view);
    }
}
