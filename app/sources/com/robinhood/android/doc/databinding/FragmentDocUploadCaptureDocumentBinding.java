package com.robinhood.android.doc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.photo.CameraOverlayView;

/* loaded from: classes7.dex */
public final class FragmentDocUploadCaptureDocumentBinding implements ViewBinding {
    public final CameraOverlayView cameraOverlayView;
    public final PreviewView cameraPreviewView;
    public final RdsIconButton capturePhotoPrimaryCta;
    public final RdsProgressBar capturePhotoProgressCircle;
    public final RdsTextButton capturePhotoRequirementsBtn;
    public final RhTextView capturePhotoSubtitle;
    public final RhTextView capturePhotoTitle;
    private final ConstraintLayout rootView;

    private FragmentDocUploadCaptureDocumentBinding(ConstraintLayout constraintLayout, CameraOverlayView cameraOverlayView, PreviewView previewView, RdsIconButton rdsIconButton, RdsProgressBar rdsProgressBar, RdsTextButton rdsTextButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.cameraOverlayView = cameraOverlayView;
        this.cameraPreviewView = previewView;
        this.capturePhotoPrimaryCta = rdsIconButton;
        this.capturePhotoProgressCircle = rdsProgressBar;
        this.capturePhotoRequirementsBtn = rdsTextButton;
        this.capturePhotoSubtitle = rhTextView;
        this.capturePhotoTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDocUploadCaptureDocumentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDocUploadCaptureDocumentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14254R.layout.fragment_doc_upload_capture_document, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDocUploadCaptureDocumentBinding bind(View view) {
        int i = C14254R.id.camera_overlay_view;
        CameraOverlayView cameraOverlayView = (CameraOverlayView) ViewBindings.findChildViewById(view, i);
        if (cameraOverlayView != null) {
            i = C14254R.id.camera_preview_view;
            PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
            if (previewView != null) {
                i = C14254R.id.capture_photo_primary_cta;
                RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                if (rdsIconButton != null) {
                    i = C14254R.id.capture_photo_progress_circle;
                    RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                    if (rdsProgressBar != null) {
                        i = C14254R.id.capture_photo_requirements_btn;
                        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                        if (rdsTextButton != null) {
                            i = C14254R.id.capture_photo_subtitle;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C14254R.id.capture_photo_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    return new FragmentDocUploadCaptureDocumentBinding((ConstraintLayout) view, cameraOverlayView, previewView, rdsIconButton, rdsProgressBar, rdsTextButton, rhTextView, rhTextView2);
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
