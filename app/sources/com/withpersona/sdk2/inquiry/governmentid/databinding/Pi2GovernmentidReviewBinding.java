package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidReviewBinding implements ViewBinding {
    public final Button acceptButton;
    public final CheckBox animationsPlayed;
    public final CoordinatorLayout cameraScreenContent;
    public final ConstraintLayout cameraView;
    public final TextView disclaimer;
    public final ImageView disclaimerIcon;
    public final LinearLayout disclaimerView;
    public final View flashScreen;
    public final Flow flowLayout;
    public final Pi2NavigationBar navigationBar;
    public final View overlay;
    public final ImageView overlayGuide;
    public final ConstraintLayout overlayHint;
    public final ThemeableLottieAnimationView overlayIcon;
    public final ConstraintLayout overlayIconContainer;
    public final TextView overlayText;
    public final FrameLayout processing;
    public final ProgressBar progressBar;
    public final Button retryButton;
    public final ImageView reviewImage;
    private final FrameLayout rootView;
    public final SpotlightView spotlightView;
    public final SpotlightView spotlightView2;
    public final TextView title;

    private Pi2GovernmentidReviewBinding(FrameLayout frameLayout, Button button, CheckBox checkBox, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, LinearLayout linearLayout, View view, Flow flow, Pi2NavigationBar pi2NavigationBar, View view2, ImageView imageView2, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout3, TextView textView2, FrameLayout frameLayout2, ProgressBar progressBar, Button button2, ImageView imageView3, SpotlightView spotlightView, SpotlightView spotlightView2, TextView textView3) {
        this.rootView = frameLayout;
        this.acceptButton = button;
        this.animationsPlayed = checkBox;
        this.cameraScreenContent = coordinatorLayout;
        this.cameraView = constraintLayout;
        this.disclaimer = textView;
        this.disclaimerIcon = imageView;
        this.disclaimerView = linearLayout;
        this.flashScreen = view;
        this.flowLayout = flow;
        this.navigationBar = pi2NavigationBar;
        this.overlay = view2;
        this.overlayGuide = imageView2;
        this.overlayHint = constraintLayout2;
        this.overlayIcon = themeableLottieAnimationView;
        this.overlayIconContainer = constraintLayout3;
        this.overlayText = textView2;
        this.processing = frameLayout2;
        this.progressBar = progressBar;
        this.retryButton = button2;
        this.reviewImage = imageView3;
        this.spotlightView = spotlightView;
        this.spotlightView2 = spotlightView2;
        this.title = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidReviewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.accept_button;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R$id.animations_played;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
            if (checkBox != null) {
                i = R$id.camera_screen_content;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                if (coordinatorLayout != null) {
                    i = R$id.camera_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R$id.disclaimer;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R$id.disclaimer_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R$id.disclaimer_view;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.flash_screen))) != null) {
                                    i = R$id.flow_layout;
                                    Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                                    if (flow != null) {
                                        i = R$id.navigation_bar;
                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                                        if (pi2NavigationBar != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.overlay))) != null) {
                                            i = R$id.overlay_guide;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
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
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = R$id.processing;
                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                if (frameLayout != null) {
                                                                    i = R$id.progress_bar;
                                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                                    if (progressBar != null) {
                                                                        i = R$id.retry_button;
                                                                        Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                                                                        if (button2 != null) {
                                                                            i = R$id.review_image;
                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView3 != null) {
                                                                                i = R$id.spotlight_view;
                                                                                SpotlightView spotlightView = (SpotlightView) ViewBindings.findChildViewById(view, i);
                                                                                if (spotlightView != null) {
                                                                                    i = R$id.spotlight_view2;
                                                                                    SpotlightView spotlightView2 = (SpotlightView) ViewBindings.findChildViewById(view, i);
                                                                                    if (spotlightView2 != null) {
                                                                                        i = R$id.title;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView3 != null) {
                                                                                            return new Pi2GovernmentidReviewBinding((FrameLayout) view, button, checkBox, coordinatorLayout, constraintLayout, textView, imageView, linearLayout, viewFindChildViewById, flow, pi2NavigationBar, viewFindChildViewById2, imageView2, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView2, frameLayout, progressBar, button2, imageView3, spotlightView, spotlightView2, textView3);
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
