package com.robinhood.android.serverclientcomponents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView;

/* loaded from: classes5.dex */
public final class FragmentClientComponentAlertSheetBinding implements ViewBinding {
    public final ClientComponentAlertView alertView;
    private final FrameLayout rootView;

    private FragmentClientComponentAlertSheetBinding(FrameLayout frameLayout, ClientComponentAlertView clientComponentAlertView) {
        this.rootView = frameLayout;
        this.alertView = clientComponentAlertView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentClientComponentAlertSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClientComponentAlertSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28308R.layout.fragment_client_component_alert_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClientComponentAlertSheetBinding bind(View view) {
        int i = C28308R.id.alert_view;
        ClientComponentAlertView clientComponentAlertView = (ClientComponentAlertView) ViewBindings.findChildViewById(view, i);
        if (clientComponentAlertView != null) {
            return new FragmentClientComponentAlertSheetBinding((FrameLayout) view, clientComponentAlertView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
