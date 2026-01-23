package com.withpersona.sdk2.inquiry.permissions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.permissions.R$layout;

/* loaded from: classes18.dex */
public final class Pi2CheckRequestPermissionRationaleStateBinding implements ViewBinding {
    private final View rootView;

    private Pi2CheckRequestPermissionRationaleStateBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static Pi2CheckRequestPermissionRationaleStateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_check_request_permission_rationale_state, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2CheckRequestPermissionRationaleStateBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new Pi2CheckRequestPermissionRationaleStateBinding(view);
    }
}
