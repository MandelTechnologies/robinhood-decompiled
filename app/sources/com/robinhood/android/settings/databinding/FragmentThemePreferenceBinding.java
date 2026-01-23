package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class FragmentThemePreferenceBinding implements ViewBinding {
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;
    public final LegacyRdsRadioGroup themePreference;
    public final LegacyRdsRadioButton themePreferenceDay;
    public final LegacyRdsRadioButton themePreferenceMarket;
    public final View themePreferenceMarketDivider;
    public final LegacyRdsRadioButton themePreferenceNight;
    public final LegacyRdsRadioButton themePreferenceSystem;
    public final View themePreferenceSystemDivider;

    private FragmentThemePreferenceBinding(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, LegacyRdsRadioGroup legacyRdsRadioGroup, LegacyRdsRadioButton legacyRdsRadioButton, LegacyRdsRadioButton legacyRdsRadioButton2, View view, LegacyRdsRadioButton legacyRdsRadioButton3, LegacyRdsRadioButton legacyRdsRadioButton4, View view2) {
        this.rootView = nestedScrollView;
        this.scrollView = nestedScrollView2;
        this.themePreference = legacyRdsRadioGroup;
        this.themePreferenceDay = legacyRdsRadioButton;
        this.themePreferenceMarket = legacyRdsRadioButton2;
        this.themePreferenceMarketDivider = view;
        this.themePreferenceNight = legacyRdsRadioButton3;
        this.themePreferenceSystem = legacyRdsRadioButton4;
        this.themePreferenceSystemDivider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentThemePreferenceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentThemePreferenceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.fragment_theme_preference, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentThemePreferenceBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        int i = C28315R.id.theme_preference;
        LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
        if (legacyRdsRadioGroup != null) {
            i = C28315R.id.theme_preference_day;
            LegacyRdsRadioButton legacyRdsRadioButton = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
            if (legacyRdsRadioButton != null) {
                i = C28315R.id.theme_preference_market;
                LegacyRdsRadioButton legacyRdsRadioButton2 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                if (legacyRdsRadioButton2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28315R.id.theme_preference_market_divider))) != null) {
                    i = C28315R.id.theme_preference_night;
                    LegacyRdsRadioButton legacyRdsRadioButton3 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                    if (legacyRdsRadioButton3 != null) {
                        i = C28315R.id.theme_preference_system;
                        LegacyRdsRadioButton legacyRdsRadioButton4 = (LegacyRdsRadioButton) ViewBindings.findChildViewById(view, i);
                        if (legacyRdsRadioButton4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C28315R.id.theme_preference_system_divider))) != null) {
                            return new FragmentThemePreferenceBinding(nestedScrollView, nestedScrollView, legacyRdsRadioGroup, legacyRdsRadioButton, legacyRdsRadioButton2, viewFindChildViewById, legacyRdsRadioButton3, legacyRdsRadioButton4, viewFindChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
