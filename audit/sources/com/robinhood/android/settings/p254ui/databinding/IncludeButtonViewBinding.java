package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.settings.p254ui.ButtonView;
import com.robinhood.android.settings.p254ui.C28356R;

/* loaded from: classes5.dex */
public final class IncludeButtonViewBinding implements ViewBinding {
    public final RdsButton button;
    private final ButtonView rootView;

    private IncludeButtonViewBinding(ButtonView buttonView, RdsButton rdsButton) {
        this.rootView = buttonView;
        this.button = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ButtonView getRoot() {
        return this.rootView;
    }

    public static IncludeButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.include_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeButtonViewBinding bind(View view) {
        int i = C28356R.id.button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new IncludeButtonViewBinding((ButtonView) view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
