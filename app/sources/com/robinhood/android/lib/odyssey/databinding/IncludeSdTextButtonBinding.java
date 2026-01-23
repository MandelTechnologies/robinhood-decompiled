package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdTextButton;

/* loaded from: classes8.dex */
public final class IncludeSdTextButtonBinding implements ViewBinding {
    private final SdTextButton rootView;
    public final SdTextButton sdTextButton;

    private IncludeSdTextButtonBinding(SdTextButton sdTextButton, SdTextButton sdTextButton2) {
        this.rootView = sdTextButton;
        this.sdTextButton = sdTextButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdTextButton getRoot() {
        return this.rootView;
    }

    public static IncludeSdTextButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdTextButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_text_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdTextButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdTextButton sdTextButton = (SdTextButton) view;
        return new IncludeSdTextButtonBinding(sdTextButton, sdTextButton);
    }
}
