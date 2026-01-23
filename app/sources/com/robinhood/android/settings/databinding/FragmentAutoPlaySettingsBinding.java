package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class FragmentAutoPlaySettingsBinding implements ViewBinding {
    public final LegacyRdsRadioButton mobileAndWifiRadio;
    public final LegacyRdsRadioButton neverRadio;
    private final ScrollView rootView;
    public final LegacyRdsRadioGroup videoAutoplayRadioGroup;
    public final LegacyRdsRadioButton wifiOnlyRadio;

    private FragmentAutoPlaySettingsBinding(ScrollView scrollView, LegacyRdsRadioButton legacyRdsRadioButton, LegacyRdsRadioButton legacyRdsRadioButton2, LegacyRdsRadioGroup legacyRdsRadioGroup, LegacyRdsRadioButton legacyRdsRadioButton3) {
        this.rootView = scrollView;
        this.mobileAndWifiRadio = legacyRdsRadioButton;
        this.neverRadio = legacyRdsRadioButton2;
        this.videoAutoplayRadioGroup = legacyRdsRadioGroup;
        this.wifiOnlyRadio = legacyRdsRadioButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAutoPlaySettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAutoPlaySettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.fragment_auto_play_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAutoPlaySettingsBinding bind(View view) {
        int i = C28315R.id.mobile_and_wifi_radio;
        LegacyRdsRadioButton legacyRdsRadioButton = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
        if (legacyRdsRadioButton != null) {
            i = C28315R.id.never_radio;
            LegacyRdsRadioButton legacyRdsRadioButton2 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
            if (legacyRdsRadioButton2 != null) {
                i = C28315R.id.video_autoplay_radio_group;
                LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                if (legacyRdsRadioGroup != null) {
                    i = C28315R.id.wifi_only_radio;
                    LegacyRdsRadioButton legacyRdsRadioButton3 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                    if (legacyRdsRadioButton3 != null) {
                        return new FragmentAutoPlaySettingsBinding((ScrollView) view, legacyRdsRadioButton, legacyRdsRadioButton2, legacyRdsRadioGroup, legacyRdsRadioButton3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
