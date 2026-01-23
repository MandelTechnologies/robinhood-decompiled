package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdDivider;

/* loaded from: classes8.dex */
public final class IncludeSdDividerBinding implements ViewBinding {
    private final SdDivider rootView;
    public final SdDivider sdDivider;

    private IncludeSdDividerBinding(SdDivider sdDivider, SdDivider sdDivider2) {
        this.rootView = sdDivider;
        this.sdDivider = sdDivider2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdDivider getRoot() {
        return this.rootView;
    }

    public static IncludeSdDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_divider, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdDividerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdDivider sdDivider = (SdDivider) view;
        return new IncludeSdDividerBinding(sdDivider, sdDivider);
    }
}
