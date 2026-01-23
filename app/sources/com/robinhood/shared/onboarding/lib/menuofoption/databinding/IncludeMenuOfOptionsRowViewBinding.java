package com.robinhood.shared.onboarding.lib.menuofoption.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.onboarding.lib.menuofoption.C39252R;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsRowView;

/* loaded from: classes6.dex */
public final class IncludeMenuOfOptionsRowViewBinding implements ViewBinding {
    private final MenuOfOptionsRowView rootView;

    private IncludeMenuOfOptionsRowViewBinding(MenuOfOptionsRowView menuOfOptionsRowView) {
        this.rootView = menuOfOptionsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MenuOfOptionsRowView getRoot() {
        return this.rootView;
    }

    public static IncludeMenuOfOptionsRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMenuOfOptionsRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39252R.layout.include_menu_of_options_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMenuOfOptionsRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMenuOfOptionsRowViewBinding((MenuOfOptionsRowView) view);
    }
}
