package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.view.AddAlertButtonView;

/* loaded from: classes24.dex */
public final class IncludeAddAlertButtonViewBinding implements ViewBinding {
    private final AddAlertButtonView rootView;

    private IncludeAddAlertButtonViewBinding(AddAlertButtonView addAlertButtonView) {
        this.rootView = addAlertButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AddAlertButtonView getRoot() {
        return this.rootView;
    }

    public static IncludeAddAlertButtonViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAddAlertButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.include_add_alert_button_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAddAlertButtonViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeAddAlertButtonViewBinding((AddAlertButtonView) view);
    }
}
