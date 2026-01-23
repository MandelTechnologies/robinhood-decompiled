package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadVerifyResidencyBinding implements ViewBinding {
    public final RhTextView docUploadBodyTxt;
    public final ImageView docUploadStateImg;
    public final RdsButton docUploadVerifyResidencyContinueBtn;
    public final RdsButton docUploadVerifyResidencyNegativeBtn;
    public final RhTextView docUploadVerifyResidencyTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadVerifyResidencyBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.docUploadBodyTxt = rhTextView;
        this.docUploadStateImg = imageView;
        this.docUploadVerifyResidencyContinueBtn = rdsButton;
        this.docUploadVerifyResidencyNegativeBtn = rdsButton2;
        this.docUploadVerifyResidencyTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadVerifyResidencyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadVerifyResidencyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_verify_residency, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadVerifyResidencyBinding bind(View view) {
        int i = C14254R.id.doc_upload_body_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14254R.id.doc_upload_state_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C14254R.id.doc_upload_verify_residency_continue_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C14254R.id.doc_upload_verify_residency_negative_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C14254R.id.doc_upload_verify_residency_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentDocUploadVerifyResidencyBinding((ConstraintLayout) view, rhTextView, imageView, rdsButton, rdsButton2, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
