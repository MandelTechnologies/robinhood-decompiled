package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;

/* loaded from: classes7.dex */
public final class FragmentDocUploadReviewPdfBinding implements ViewBinding {
    public final FrameLayout pdfReviewHeader;
    public final ComposeView pdfReviewHeaderSdui;
    public final ImageView pdfReviewImage;
    public final RdsButton pdfReviewNextBtn;
    public final ImageView pdfReviewNextPageBtn;
    public final ImageView pdfReviewPrevPageBtn;
    public final RdsButton pdfReviewRetryCta;
    public final RhTextView pdfReviewSubtitle;
    public final RhTextView pdfReviewTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadReviewPdfBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView, ImageView imageView, RdsButton rdsButton, ImageView imageView2, ImageView imageView3, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.pdfReviewHeader = frameLayout;
        this.pdfReviewHeaderSdui = composeView;
        this.pdfReviewImage = imageView;
        this.pdfReviewNextBtn = rdsButton;
        this.pdfReviewNextPageBtn = imageView2;
        this.pdfReviewPrevPageBtn = imageView3;
        this.pdfReviewRetryCta = rdsButton2;
        this.pdfReviewSubtitle = rhTextView;
        this.pdfReviewTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadReviewPdfBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadReviewPdfBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_review_pdf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadReviewPdfBinding bind(View view) {
        int i = C14254R.id.pdf_review_header;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C14254R.id.pdf_review_header_sdui;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C14254R.id.pdf_review_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C14254R.id.pdf_review_next_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C14254R.id.pdf_review_next_page_btn;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C14254R.id.pdf_review_prev_page_btn;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = C14254R.id.pdf_review_retry_cta;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    i = C14254R.id.pdf_review_subtitle;
                                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView != null) {
                                        i = C14254R.id.pdf_review_title;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            return new FragmentDocUploadReviewPdfBinding((ConstraintLayout) view, frameLayout, composeView, imageView, rdsButton, imageView2, imageView3, rdsButton2, rhTextView, rhTextView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
