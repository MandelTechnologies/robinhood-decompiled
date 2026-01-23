package com.robinhood.shared.onboarding.lib.menuofoption.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.onboarding.lib.menuofoption.C39252R;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderView;

/* loaded from: classes6.dex */
public final class IncludeMenuOfOptionsHeaderViewBinding implements ViewBinding {
    private final MenuOfOptionsHeaderView rootView;

    private IncludeMenuOfOptionsHeaderViewBinding(MenuOfOptionsHeaderView menuOfOptionsHeaderView) {
        this.rootView = menuOfOptionsHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MenuOfOptionsHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeMenuOfOptionsHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMenuOfOptionsHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39252R.layout.include_menu_of_options_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMenuOfOptionsHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMenuOfOptionsHeaderViewBinding((MenuOfOptionsHeaderView) view);
    }
}
