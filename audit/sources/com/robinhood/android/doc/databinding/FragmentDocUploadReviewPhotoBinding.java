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
public final class FragmentDocUploadReviewPhotoBinding implements ViewBinding {
    public final ImageView photoReviewImage;
    public final RdsButton photoReviewNextBtn;
    public final RdsButton photoReviewRetryCta;
    public final RhTextView photoReviewSubtitle;
    public final RhTextView photoReviewTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadReviewPhotoBinding(ConstraintLayout constraintLayout, ImageView imageView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.photoReviewImage = imageView;
        this.photoReviewNextBtn = rdsButton;
        this.photoReviewRetryCta = rdsButton2;
        this.photoReviewSubtitle = rhTextView;
        this.photoReviewTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadReviewPhotoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadReviewPhotoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_review_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadReviewPhotoBinding bind(View view) {
        int i = C14254R.id.photo_review_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C14254R.id.photo_review_next_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C14254R.id.photo_review_retry_cta;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C14254R.id.photo_review_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C14254R.id.photo_review_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentDocUploadReviewPhotoBinding((ConstraintLayout) view, imageView, rdsButton, rdsButton2, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
