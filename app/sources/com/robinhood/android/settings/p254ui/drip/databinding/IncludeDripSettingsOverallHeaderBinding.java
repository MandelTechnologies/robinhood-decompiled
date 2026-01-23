package com.robinhood.android.settings.p254ui.drip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.drip.C28363R;
import com.robinhood.android.settings.p254ui.drip.DripSettingsOverallHeader;

/* loaded from: classes5.dex */
public final class IncludeDripSettingsOverallHeaderBinding implements ViewBinding {
    private final DripSettingsOverallHeader rootView;

    private IncludeDripSettingsOverallHeaderBinding(DripSettingsOverallHeader dripSettingsOverallHeader) {
        this.rootView = dripSettingsOverallHeader;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DripSettingsOverallHeader getRoot() {
        return this.rootView;
    }

    public static IncludeDripSettingsOverallHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDripSettingsOverallHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28363R.layout.include_drip_settings_overall_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDripSettingsOverallHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDripSettingsOverallHeaderBinding((DripSettingsOverallHeader) view);
    }
}
