package com.robinhood.android.serverclientcomponents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;

/* loaded from: classes5.dex */
public final class IncludeClientComponentActionButtonBinding implements ViewBinding {
    private final ClientComponentButtonView rootView;

    private IncludeClientComponentActionButtonBinding(ClientComponentButtonView clientComponentButtonView) {
        this.rootView = clientComponentButtonView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ClientComponentButtonView getRoot() {
        return this.rootView;
    }

    public static IncludeClientComponentActionButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeClientComponentActionButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28308R.layout.include_client_component_action_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeClientComponentActionButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeClientComponentActionButtonBinding((ClientComponentButtonView) view);
    }
}
