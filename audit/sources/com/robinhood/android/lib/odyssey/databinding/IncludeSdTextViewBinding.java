package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdTextView;

/* loaded from: classes8.dex */
public final class IncludeSdTextViewBinding implements ViewBinding {
    private final SdTextView rootView;
    public final SdTextView sdTextView;

    private IncludeSdTextViewBinding(SdTextView sdTextView, SdTextView sdTextView2) {
        this.rootView = sdTextView;
        this.sdTextView = sdTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdTextView getRoot() {
        return this.rootView;
    }

    public static IncludeSdTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_text_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdTextViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdTextView sdTextView = (SdTextView) view;
        return new IncludeSdTextViewBinding(sdTextView, sdTextView);
    }
}
