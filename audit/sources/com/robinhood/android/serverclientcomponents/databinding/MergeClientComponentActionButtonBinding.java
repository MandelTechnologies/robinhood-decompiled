package com.robinhood.android.serverclientcomponents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.serverclientcomponents.C28308R;

/* loaded from: classes5.dex */
public final class MergeClientComponentActionButtonBinding implements ViewBinding {
    public final RdsButton button;
    private final View rootView;

    private MergeClientComponentActionButtonBinding(View view, RdsButton rdsButton) {
        this.rootView = view;
        this.button = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeClientComponentActionButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28308R.layout.merge_client_component_action_button, viewGroup);
        return bind(viewGroup);
    }

    public static MergeClientComponentActionButtonBinding bind(View view) {
        int i = C28308R.id.button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            return new MergeClientComponentActionButtonBinding(view, rdsButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
