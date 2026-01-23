package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionView;

/* loaded from: classes3.dex */
public final class IncludeEtpCompositionViewBinding implements ViewBinding {
    private final EtpCompositionView rootView;

    private IncludeEtpCompositionViewBinding(EtpCompositionView etpCompositionView) {
        this.rootView = etpCompositionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EtpCompositionView getRoot() {
        return this.rootView;
    }

    public static IncludeEtpCompositionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEtpCompositionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_etp_composition_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEtpCompositionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEtpCompositionViewBinding((EtpCompositionView) view);
    }
}
