package com.robinhood.android.settings.p254ui.drip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.drip.C28363R;
import com.robinhood.android.settings.p254ui.drip.DripSettingsDisclaimer;

/* loaded from: classes5.dex */
public final class IncludeDripSettingsDisclaimerBinding implements ViewBinding {
    private final DripSettingsDisclaimer rootView;

    private IncludeDripSettingsDisclaimerBinding(DripSettingsDisclaimer dripSettingsDisclaimer) {
        this.rootView = dripSettingsDisclaimer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DripSettingsDisclaimer getRoot() {
        return this.rootView;
    }

    public static IncludeDripSettingsDisclaimerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDripSettingsDisclaimerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28363R.layout.include_drip_settings_disclaimer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDripSettingsDisclaimerBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDripSettingsDisclaimerBinding((DripSettingsDisclaimer) view);
    }
}
