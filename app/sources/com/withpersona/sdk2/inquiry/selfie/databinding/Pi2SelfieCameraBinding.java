package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.R$id;
import com.withpersona.sdk2.inquiry.selfie.R$layout;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;

/* loaded from: classes18.dex */
public final class Pi2SelfieCameraBinding implements ViewBinding {
    public final TextView autoCaptureDisclaimer;
    public final CircularProgressIndicator autoCaptureProgressBar;
    public final ImageView button;
    public final Camera2PreviewView camera2Preview;
    public final View cameraCover;
    public final TextView captureSuccess;
    public final TextView countdown;
    public final View cover;
    public final FrameLayout finalizingCover;
    public final TextView hintMessageBody;
    public final TextView hintMessageTitle;
    public final ProgressBar initializingProgressBar;
    public final Pi2NavigationBar navigationBar;
    public final ImageView nextCamera;
    public final Barrier previewBottomBarrier;
    public final FrameLayout previewContainer;
    public final PreviewView previewviewSelfieCamera;
    public final CircularProgressIndicator progressBar;
    public final TextView realTimeHint;
    public final ConstraintLayout rootView;
    private final ConstraintLayout rootView_;
    public final View selfieFlash;
    public final SelfieOverlayView selfieOverlay;
    public final TextView title;
    public final Space titleTopSpace;
    public final ImageView toggleFlash;

    private Pi2SelfieCameraBinding(ConstraintLayout constraintLayout, TextView textView, CircularProgressIndicator circularProgressIndicator, ImageView imageView, Camera2PreviewView camera2PreviewView, View view, TextView textView2, TextView textView3, View view2, FrameLayout frameLayout, TextView textView4, TextView textView5, ProgressBar progressBar, Pi2NavigationBar pi2NavigationBar, ImageView imageView2, Barrier barrier, FrameLayout frameLayout2, PreviewView previewView, CircularProgressIndicator circularProgressIndicator2, TextView textView6, ConstraintLayout constraintLayout2, View view3, SelfieOverlayView selfieOverlayView, TextView textView7, Space space, ImageView imageView3) {
        this.rootView_ = constraintLayout;
        this.autoCaptureDisclaimer = textView;
        this.autoCaptureProgressBar = circularProgressIndicator;
        this.button = imageView;
        this.camera2Preview = camera2PreviewView;
        this.cameraCover = view;
        this.captureSuccess = textView2;
        this.countdown = textView3;
        this.cover = view2;
        this.finalizingCover = frameLayout;
        this.hintMessageBody = textView4;
        this.hintMessageTitle = textView5;
        this.initializingProgressBar = progressBar;
        this.navigationBar = pi2NavigationBar;
        this.nextCamera = imageView2;
        this.previewBottomBarrier = barrier;
        this.previewContainer = frameLayout2;
        this.previewviewSelfieCamera = previewView;
        this.progressBar = circularProgressIndicator2;
        this.realTimeHint = textView6;
        this.rootView = constraintLayout2;
        this.selfieFlash = view3;
        this.selfieOverlay = selfieOverlayView;
        this.title = textView7;
        this.titleTopSpace = space;
        this.toggleFlash = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView_;
    }

    public static Pi2SelfieCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2SelfieCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_selfie_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SelfieCameraBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.auto_capture_disclaimer;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R$id.auto_capture_progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
            if (circularProgressIndicator != null) {
                i = R$id.button;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R$id.camera2_preview;
                    Camera2PreviewView camera2PreviewView = (Camera2PreviewView) ViewBindings.findChildViewById(view, i);
                    if (camera2PreviewView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.camera_cover))) != null) {
                        i = R$id.capture_success;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R$id.countdown;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.cover))) != null) {
                                i = R$id.finalizing_cover;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R$id.hint_message_body;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = R$id.hint_message_title;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = R$id.initializing_progress_bar;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                            if (progressBar != null) {
                                                i = R$id.navigation_bar;
                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                                                if (pi2NavigationBar != null) {
                                                    i = R$id.next_camera;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R$id.preview_bottom_barrier;
                                                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                                        if (barrier != null) {
                                                            i = R$id.preview_container;
                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                            if (frameLayout2 != null) {
                                                                i = R$id.previewview_selfie_camera;
                                                                PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                                                                if (previewView != null) {
                                                                    i = R$id.progress_bar;
                                                                    CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                                                                    if (circularProgressIndicator2 != null) {
                                                                        i = R$id.real_time_hint;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView6 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                            i = R$id.selfie_flash;
                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i = R$id.selfie_overlay;
                                                                                SelfieOverlayView selfieOverlayView = (SelfieOverlayView) ViewBindings.findChildViewById(view, i);
                                                                                if (selfieOverlayView != null) {
                                                                                    i = R$id.title;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView7 != null) {
                                                                                        i = R$id.title_top_space;
                                                                                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                                                        if (space != null) {
                                                                                            i = R$id.toggle_flash;
                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (imageView3 != null) {
                                                                                                return new Pi2SelfieCameraBinding(constraintLayout, textView, circularProgressIndicator, imageView, camera2PreviewView, viewFindChildViewById, textView2, textView3, viewFindChildViewById2, frameLayout, textView4, textView5, progressBar, pi2NavigationBar, imageView2, barrier, frameLayout2, previewView, circularProgressIndicator2, textView6, constraintLayout, viewFindChildViewById3, selfieOverlayView, textView7, space, imageView3);
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
