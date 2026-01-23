package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdSectionView;

/* loaded from: classes8.dex */
public final class IncludeSdSectionBinding implements ViewBinding {
    private final SdSectionView rootView;
    public final SdSectionView sdSectionView;

    private IncludeSdSectionBinding(SdSectionView sdSectionView, SdSectionView sdSectionView2) {
        this.rootView = sdSectionView;
        this.sdSectionView = sdSectionView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeSdSectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_section, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdSectionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdSectionView sdSectionView = (SdSectionView) view;
        return new IncludeSdSectionBinding(sdSectionView, sdSectionView);
    }
}
