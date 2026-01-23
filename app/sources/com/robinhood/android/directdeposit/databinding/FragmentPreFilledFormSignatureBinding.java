package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.signature.SignatureView;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormSignatureBinding implements ViewBinding {
    public final RdsIconButton preFilledFormSignatureAccept;
    public final RdsIconButton preFilledFormSignatureClear;
    public final RhTextView preFilledFormSignatureDetail;
    public final View preFilledFormSignatureLine;
    public final SignatureView preFilledFormSignaturePad;
    public final ConstraintLayout preFilledFormSignatureRoot;
    public final RhTextView preFilledFormSignatureSignHere;
    public final RhTextView preFilledFormSignatureTitle;
    private final ConstraintLayout rootView;

    private FragmentPreFilledFormSignatureBinding(ConstraintLayout constraintLayout, RdsIconButton rdsIconButton, RdsIconButton rdsIconButton2, RhTextView rhTextView, View view, SignatureView signatureView, ConstraintLayout constraintLayout2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.preFilledFormSignatureAccept = rdsIconButton;
        this.preFilledFormSignatureClear = rdsIconButton2;
        this.preFilledFormSignatureDetail = rhTextView;
        this.preFilledFormSignatureLine = view;
        this.preFilledFormSignaturePad = signatureView;
        this.preFilledFormSignatureRoot = constraintLayout2;
        this.preFilledFormSignatureSignHere = rhTextView2;
        this.preFilledFormSignatureTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormSignatureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormSignatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_signature, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormSignatureBinding bind(View view) {
        View viewFindChildViewById;
        int i = C14044R.id.pre_filled_form_signature_accept;
        RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
        if (rdsIconButton != null) {
            i = C14044R.id.pre_filled_form_signature_clear;
            RdsIconButton rdsIconButton2 = (RdsIconButton) ViewBindings.findChildViewById(view, i);
            if (rdsIconButton2 != null) {
                i = C14044R.id.pre_filled_form_signature_detail;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C14044R.id.pre_filled_form_signature_line))) != null) {
                    i = C14044R.id.pre_filled_form_signature_pad;
                    SignatureView signatureView = (SignatureView) ViewBindings.findChildViewById(view, i);
                    if (signatureView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C14044R.id.pre_filled_form_signature_sign_here;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C14044R.id.pre_filled_form_signature_title;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentPreFilledFormSignatureBinding(constraintLayout, rdsIconButton, rdsIconButton2, rhTextView, viewFindChildViewById, signatureView, constraintLayout, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
