package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.directipo.allocation.C14171R;

/* loaded from: classes27.dex */
public final class IncludeDirectIpoShareButtonBinding implements ViewBinding {
    private final RdsButton rootView;

    private IncludeDirectIpoShareButtonBinding(RdsButton rdsButton) {
        this.rootView = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsButton getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoShareButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoShareButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.include_direct_ipo_share_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoShareButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoShareButtonBinding((RdsButton) view);
    }
}
