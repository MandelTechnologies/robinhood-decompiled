package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.settings.p254ui.C28356R;
import com.robinhood.android.settings.p254ui.ToggleView;

/* loaded from: classes5.dex */
public final class IncludeToggleViewBinding implements ViewBinding {
    private final ToggleView rootView;
    public final RdsToggleView toggle;

    private IncludeToggleViewBinding(ToggleView toggleView, RdsToggleView rdsToggleView) {
        this.rootView = toggleView;
        this.toggle = rdsToggleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ToggleView getRoot() {
        return this.rootView;
    }

    public static IncludeToggleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeToggleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_toggle_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeToggleViewBinding bind(View view) {
        int i = C28356R.id.toggle;
        RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
        if (rdsToggleView != null) {
            return new IncludeToggleViewBinding((ToggleView) view, rdsToggleView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
