package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentPersonalDataRequestConfirmationBinding implements ViewBinding {
    public final RdsButton personalDataRequestConfirmationCta;
    public final ImageView personalDataRequestConfirmationImg;
    public final RhTextView personalDataRequestConfirmationSubtitle;
    public final RhTextView personalDataRequestConfirmationTitle;
    private final ConstraintLayout rootView;

    private FragmentPersonalDataRequestConfirmationBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.personalDataRequestConfirmationCta = rdsButton;
        this.personalDataRequestConfirmationImg = imageView;
        this.personalDataRequestConfirmationSubtitle = rhTextView;
        this.personalDataRequestConfirmationTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPersonalDataRequestConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPersonalDataRequestConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_personal_data_request_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPersonalDataRequestConfirmationBinding bind(View view) {
        int i = C28186R.id.personal_data_request_confirmation_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28186R.id.personal_data_request_confirmation_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C28186R.id.personal_data_request_confirmation_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28186R.id.personal_data_request_confirmation_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentPersonalDataRequestConfirmationBinding((ConstraintLayout) view, rdsButton, imageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
