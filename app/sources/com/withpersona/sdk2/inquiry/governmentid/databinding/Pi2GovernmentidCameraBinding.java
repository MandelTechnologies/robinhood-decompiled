package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidCameraBinding implements ViewBinding {
    public final Space bottomSpacer;
    public final Camera2PreviewView camera2Preview;
    public final ProgressBar cameraInitializingProgressBar;
    public final ConstraintLayout cameraView;
    public final Button captureButton;
    public final Space captureButtonSpacer;
    public final TextView captureTips;
    public final TextView disclaimer;
    public final LinearLayout disclaimerLayout;
    public final ToggleButton flashlightToggle;
    public final TextView hint;
    public final FrameLayout innerContentView;
    public final Pi2NavigationBar navigationBar;
    public final View overlay;
    public final ImageView overlayGuide;
    public final ConstraintLayout overlayHint;
    public final ThemeableLottieAnimationView overlayIcon;
    public final ConstraintLayout overlayIconContainer;
    public final TextView overlayText;
    public final Barrier previewBottom;
    public final FrameLayout previewContainer;
    public final View previewDim;
    public final Barrier previewTop;
    public final PreviewView previewView;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;
    public final LottieAnimationView scanningAnimation;
    public final ScanningView scanningView;
    public final SpotlightView spotlightView;
    public final TextView title;
    public final Space topSpacer;

    private Pi2GovernmentidCameraBinding(FrameLayout frameLayout, Space space, Camera2PreviewView camera2PreviewView, ProgressBar progressBar, ConstraintLayout constraintLayout, Button button, Space space2, TextView textView, TextView textView2, LinearLayout linearLayout, ToggleButton toggleButton, TextView textView3, FrameLayout frameLayout2, Pi2NavigationBar pi2NavigationBar, View view, ImageView imageView, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout3, TextView textView4, Barrier barrier, FrameLayout frameLayout3, View view2, Barrier barrier2, PreviewView previewView, ProgressBar progressBar2, LottieAnimationView lottieAnimationView, ScanningView scanningView, SpotlightView spotlightView, TextView textView5, Space space3) {
        this.rootView = frameLayout;
        this.bottomSpacer = space;
        this.camera2Preview = camera2PreviewView;
        this.cameraInitializingProgressBar = progressBar;
        this.cameraView = constraintLayout;
        this.captureButton = button;
        this.captureButtonSpacer = space2;
        this.captureTips = textView;
        this.disclaimer = textView2;
        this.disclaimerLayout = linearLayout;
        this.flashlightToggle = toggleButton;
        this.hint = textView3;
        this.innerContentView = frameLayout2;
        this.navigationBar = pi2NavigationBar;
        this.overlay = view;
        this.overlayGuide = imageView;
        this.overlayHint = constraintLayout2;
        this.overlayIcon = themeableLottieAnimationView;
        this.overlayIconContainer = constraintLayout3;
        this.overlayText = textView4;
        this.previewBottom = barrier;
        this.previewContainer = frameLayout3;
        this.previewDim = view2;
        this.previewTop = barrier2;
        this.previewView = previewView;
        this.progressBar = progressBar2;
        this.scanningAnimation = lottieAnimationView;
        this.scanningView = scanningView;
        this.spotlightView = spotlightView;
        this.title = textView5;
        this.topSpacer = space3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Pi2GovernmentidCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidCameraBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.bottom_spacer;
        Space space = (Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = R$id.camera2_preview;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) ViewBindings.findChildViewById(view, i);
            if (camera2PreviewView != null) {
                i = R$id.camera_initializing_progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R$id.camera_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R$id.capture_button;
                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                        if (button != null) {
                            i = R$id.capture_button_spacer;
                            Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                            if (space2 != null) {
                                i = R$id.capture_tips;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R$id.disclaimer;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R$id.disclaimer_layout;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R$id.flashlight_toggle;
                                            ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                                            if (toggleButton != null) {
                                                i = R$id.hint;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView3 != null) {
                                                    i = R$id.inner_content_view;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = R$id.navigation_bar;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                                                        if (pi2NavigationBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.overlay))) != null) {
                                                            i = R$id.overlay_guide;
                                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView != null) {
                                                                i = R$id.overlay_hint;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout2 != null) {
                                                                    i = R$id.overlay_icon;
                                                                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                                    if (themeableLottieAnimationView != null) {
                                                                        i = R$id.overlay_icon_container;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R$id.overlay_text;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView4 != null) {
                                                                                i = R$id.preview_bottom;
                                                                                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                                if (barrier != null) {
                                                                                    i = R$id.preview_container;
                                                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (frameLayout2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.preview_dim))) != null) {
                                                                                        i = R$id.preview_top;
                                                                                        Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                                        if (barrier2 != null) {
                                                                                            i = R$id.preview_view;
                                                                                            PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i);
                                                                                            if (previewView != null) {
                                                                                                i = R$id.progress_bar;
                                                                                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                                                                if (progressBar2 != null) {
                                                                                                    i = R$id.scanning_animation;
                                                                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (lottieAnimationView != null) {
                                                                                                        i = R$id.scanning_view;
                                                                                                        ScanningView scanningView = (ScanningView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (scanningView != null) {
                                                                                                            i = R$id.spotlight_view;
                                                                                                            SpotlightView spotlightView = (SpotlightView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (spotlightView != null) {
                                                                                                                i = R$id.title;
                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView5 != null) {
                                                                                                                    i = R$id.top_spacer;
                                                                                                                    Space space3 = (Space) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (space3 != null) {
                                                                                                                        return new Pi2GovernmentidCameraBinding((FrameLayout) view, space, camera2PreviewView, progressBar, constraintLayout, button, space2, textView, textView2, linearLayout, toggleButton, textView3, frameLayout, pi2NavigationBar, viewFindChildViewById, imageView, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView4, barrier, frameLayout2, viewFindChildViewById2, barrier2, previewView, progressBar2, lottieAnimationView, scanningView, spotlightView, textView5, space3);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
