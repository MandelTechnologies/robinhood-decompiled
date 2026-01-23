package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdButton;

/* loaded from: classes8.dex */
public final class IncludeSdButtonBinding implements ViewBinding {
    private final SdButton rootView;
    public final SdButton sdButton;

    private IncludeSdButtonBinding(SdButton sdButton, SdButton sdButton2) {
        this.rootView = sdButton;
        this.sdButton = sdButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdButton getRoot() {
        return this.rootView;
    }

    public static IncludeSdButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdButton sdButton = (SdButton) view;
        return new IncludeSdButtonBinding(sdButton, sdButton);
    }
}
