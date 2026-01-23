package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.preferences.AppearanceVisualizationView;

/* loaded from: classes5.dex */
public final class FragmentAppearancePreferencesBinding implements ViewBinding {
    public final RdsToggleView accessibleColorsToggle;
    public final AppearanceVisualizationView appearanceVisualizationView;
    public final View dividerTheme;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;
    public final RdsRowView themePreferenceRow;

    private FragmentAppearancePreferencesBinding(NestedScrollView nestedScrollView, RdsToggleView rdsToggleView, AppearanceVisualizationView appearanceVisualizationView, View view, NestedScrollView nestedScrollView2, RdsRowView rdsRowView) {
        this.rootView = nestedScrollView;
        this.accessibleColorsToggle = rdsToggleView;
        this.appearanceVisualizationView = appearanceVisualizationView;
        this.dividerTheme = view;
        this.scrollView = nestedScrollView2;
        this.themePreferenceRow = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAppearancePreferencesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAppearancePreferencesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28315R.layout.fragment_appearance_preferences, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAppearancePreferencesBinding bind(View view) {
        View viewFindChildViewById;
        int i = C28315R.id.accessible_colors_toggle;
        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
        if (rdsToggleView != null) {
            i = C28315R.id.appearance_visualization_view;
            AppearanceVisualizationView appearanceVisualizationView = (AppearanceVisualizationView) ViewBindings.findChildViewById(view, i);
            if (appearanceVisualizationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28315R.id.divider_theme))) != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = C28315R.id.theme_preference_row;
                RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView != null) {
                    return new FragmentAppearancePreferencesBinding(nestedScrollView, rdsToggleView, appearanceVisualizationView, viewFindChildViewById, nestedScrollView, rdsRowView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
