package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.selfie.R$layout;

/* loaded from: classes18.dex */
public final class Pi2SelfieCameraRestartBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private Pi2SelfieCameraRestartBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2SelfieCameraRestartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_selfie_camera_restart, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SelfieCameraRestartBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new Pi2SelfieCameraRestartBinding((ConstraintLayout) view);
    }
}
