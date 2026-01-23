package com.withpersona.sdk2.inquiry.internal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.internal.R$layout;

/* loaded from: classes18.dex */
public final class Pi2InquiryFragmentBinding implements ViewBinding {
    private final FrameLayout rootView;

    private Pi2InquiryFragmentBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Pi2InquiryFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_inquiry_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2InquiryFragmentBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new Pi2InquiryFragmentBinding((FrameLayout) view);
    }
}
