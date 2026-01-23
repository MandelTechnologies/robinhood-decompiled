package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.SettingsHeaderView;

/* loaded from: classes5.dex */
public final class IncludeSettingsHeaderViewBinding implements ViewBinding {
    private final SettingsHeaderView rootView;

    private IncludeSettingsHeaderViewBinding(SettingsHeaderView settingsHeaderView) {
        this.rootView = settingsHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SettingsHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeSettingsHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSettingsHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_settings_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSettingsHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSettingsHeaderViewBinding((SettingsHeaderView) view);
    }
}
