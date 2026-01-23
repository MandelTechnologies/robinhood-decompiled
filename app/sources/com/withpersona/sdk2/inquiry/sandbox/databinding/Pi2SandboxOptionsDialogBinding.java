package com.withpersona.sdk2.inquiry.sandbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.withpersona.sdk2.inquiry.sandbox.R$id;
import com.withpersona.sdk2.inquiry.sandbox.R$layout;

/* loaded from: classes18.dex */
public final class Pi2SandboxOptionsDialogBinding implements ViewBinding {
    public final MaterialSwitch govIdNfcSwitch;
    private final ConstraintLayout rootView;
    public final MaterialToolbar toolbar;

    private Pi2SandboxOptionsDialogBinding(ConstraintLayout constraintLayout, MaterialSwitch materialSwitch, MaterialToolbar materialToolbar) {
        this.rootView = constraintLayout;
        this.govIdNfcSwitch = materialSwitch;
        this.toolbar = materialToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2SandboxOptionsDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2SandboxOptionsDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_sandbox_options_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SandboxOptionsDialogBinding bind(View view) {
        int i = R$id.gov_id_nfc_switch;
        MaterialSwitch materialSwitch = (MaterialSwitch) ViewBindings.findChildViewById(view, i);
        if (materialSwitch != null) {
            i = R$id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
            if (materialToolbar != null) {
                return new Pi2SandboxOptionsDialogBinding((ConstraintLayout) view, materialSwitch, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
