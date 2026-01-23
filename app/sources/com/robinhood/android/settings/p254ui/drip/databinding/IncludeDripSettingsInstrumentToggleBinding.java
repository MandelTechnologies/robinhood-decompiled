package com.robinhood.android.settings.p254ui.drip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.drip.C28363R;
import com.robinhood.android.settings.p254ui.drip.DripSettingsInstrumentToggle;

/* loaded from: classes5.dex */
public final class IncludeDripSettingsInstrumentToggleBinding implements ViewBinding {
    private final DripSettingsInstrumentToggle rootView;

    private IncludeDripSettingsInstrumentToggleBinding(DripSettingsInstrumentToggle dripSettingsInstrumentToggle) {
        this.rootView = dripSettingsInstrumentToggle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DripSettingsInstrumentToggle getRoot() {
        return this.rootView;
    }

    public static IncludeDripSettingsInstrumentToggleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDripSettingsInstrumentToggleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28363R.layout.include_drip_settings_instrument_toggle, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDripSettingsInstrumentToggleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDripSettingsInstrumentToggleBinding((DripSettingsInstrumentToggle) view);
    }
}
