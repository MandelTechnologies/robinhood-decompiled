package com.robinhood.android.feature_instant_info.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.feature.instantinfo.p137ui.InstantInfoCtaView;
import com.robinhood.android.feature_instant_info.C16914R;

/* loaded from: classes3.dex */
public final class IncludeInstantInfoCtaViewBinding implements ViewBinding {
    private final InstantInfoCtaView rootView;

    private IncludeInstantInfoCtaViewBinding(InstantInfoCtaView instantInfoCtaView) {
        this.rootView = instantInfoCtaView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InstantInfoCtaView getRoot() {
        return this.rootView;
    }

    public static IncludeInstantInfoCtaViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInstantInfoCtaViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16914R.layout.include_instant_info_cta_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInstantInfoCtaViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInstantInfoCtaViewBinding((InstantInfoCtaView) view);
    }
}
