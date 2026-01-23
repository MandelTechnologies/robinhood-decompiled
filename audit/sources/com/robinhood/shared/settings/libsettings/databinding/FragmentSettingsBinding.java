package com.robinhood.shared.settings.libsettings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.settings.libsettings.C39787R;

/* loaded from: classes6.dex */
public final class FragmentSettingsBinding implements ViewBinding {
    public final ComposeView composeView;
    private final ConstraintLayout rootView;
    public final RecyclerView settingsRecyclerView;

    private FragmentSettingsBinding(ConstraintLayout constraintLayout, ComposeView composeView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.composeView = composeView;
        this.settingsRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39787R.layout.fragment_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSettingsBinding bind(View view) {
        int i = C39787R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C39787R.id.settings_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new FragmentSettingsBinding((ConstraintLayout) view, composeView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
