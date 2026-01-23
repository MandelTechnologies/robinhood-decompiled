package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.R$id;
import com.withpersona.sdk2.inquiry.selfie.R$layout;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2OldSelfieCameraBinding implements ViewBinding {
    public final Button button;
    public final Camera2PreviewView camera2Preview;
    public final View cameraCover;
    public final TextView countdown;
    public final TextView hintMessage;
    public final ProgressBar initializingProgressBar;
    public final Pi2NavigationBar navigationBar;
    public final Barrier previewBottomBarrier;
    public final FrameLayout previewContainer;
    public final PreviewView previewviewSelfieCamera;
    private final ConstraintLayout rootView;
    public final OldSelfieOverlayView selfieWindow;
    public final TextView title;

    private Pi2OldSelfieCameraBinding(ConstraintLayout constraintLayout, Button button, Camera2PreviewView camera2PreviewView, View view, TextView textView, TextView textView2, ProgressBar progressBar, Pi2NavigationBar pi2NavigationBar, Barrier barrier, FrameLayout frameLayout, PreviewView previewView, OldSelfieOverlayView oldSelfieOverlayView, TextView textView3) {
        this.rootView = constraintLayout;
        this.button = button;
        this.camera2Preview = camera2PreviewView;
        this.cameraCover = view;
        this.countdown = textView;
        this.hintMessage = textView2;
        this.initializingProgressBar = progressBar;
        this.navigationBar = pi2NavigationBar;
        this.previewBottomBarrier = barrier;
        this.previewContainer = frameLayout;
        this.previewviewSelfieCamera = previewView;
        this.selfieWindow = oldSelfieOverlayView;
        this.title = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2OldSelfieCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2OldSelfieCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_old_selfie_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2OldSelfieCameraBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.button;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R$id.camera2_preview;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) ViewBindings.findChildViewById(view, i);
            if (camera2PreviewView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.camera_cover))) != null) {
                i = R$id.countdown;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R$id.hint_message;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R$id.initializing_progress_bar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                        if (progressBar != null) {
                            i = R$id.navigation_bar;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                            if (pi2NavigationBar != null) {
                                i = R$id.preview_bottom_barrier;
                                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                if (barrier != null) {
                                    i = R$id.preview_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = R$id.previewview_selfie_camera;
                                        PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                                        if (previewView != null) {
                                            i = R$id.selfie_window;
                                            OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) ViewBindings.findChildViewById(view, i);
                                            if (oldSelfieOverlayView != null) {
                                                i = R$id.title;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    return new Pi2OldSelfieCameraBinding((ConstraintLayout) view, button, camera2PreviewView, viewFindChildViewById, textView, textView2, progressBar, pi2NavigationBar, barrier, frameLayout, previewView, oldSelfieOverlayView, textView3);
                                                }
                                            }
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
