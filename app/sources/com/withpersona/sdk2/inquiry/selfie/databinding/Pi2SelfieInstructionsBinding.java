package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.selfie.R$id;
import com.withpersona.sdk2.inquiry.selfie.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2SelfieInstructionsBinding implements ViewBinding {
    public final Guideline bottomGuideline;
    public final ConstraintLayout contentView;
    public final ImageView imageviewSelfieHeaderImage;
    public final ThemeableLottieAnimationView instructionAnimation;
    public final Guideline leftGuideline;
    public final Pi2NavigationBar navigationBar;
    public final ConstraintLayout nestedUiContainer;
    public final Guideline rightGuideline;
    private final ScrollView rootView;
    public final Button startButton;
    public final TextView textviewSelfieDisclosure;
    public final TextView textviewSelfieStartBody;
    public final TextView textviewSelfieStartTitle;

    private Pi2SelfieInstructionsBinding(ScrollView scrollView, Guideline guideline, ConstraintLayout constraintLayout, ImageView imageView, ThemeableLottieAnimationView themeableLottieAnimationView, Guideline guideline2, Pi2NavigationBar pi2NavigationBar, ConstraintLayout constraintLayout2, Guideline guideline3, Button button, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.bottomGuideline = guideline;
        this.contentView = constraintLayout;
        this.imageviewSelfieHeaderImage = imageView;
        this.instructionAnimation = themeableLottieAnimationView;
        this.leftGuideline = guideline2;
        this.navigationBar = pi2NavigationBar;
        this.nestedUiContainer = constraintLayout2;
        this.rightGuideline = guideline3;
        this.startButton = button;
        this.textviewSelfieDisclosure = textView;
        this.textviewSelfieStartBody = textView2;
        this.textviewSelfieStartTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static Pi2SelfieInstructionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_selfie_instructions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2SelfieInstructionsBinding bind(View view) {
        int i = R$id.bottom_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R$id.content_view;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R$id.imageview_selfie_header_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R$id.instruction_animation;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (themeableLottieAnimationView != null) {
                        i = R$id.left_guideline;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            i = R$id.navigation_bar;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                            if (pi2NavigationBar != null) {
                                i = R$id.nested_ui_container;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = R$id.right_guideline;
                                    Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline3 != null) {
                                        i = R$id.start_button;
                                        Button button = (Button) ViewBindings.findChildViewById(view, i);
                                        if (button != null) {
                                            i = R$id.textview_selfie_disclosure;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R$id.textview_selfie_start_body;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R$id.textview_selfie_start_title;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        return new Pi2SelfieInstructionsBinding((ScrollView) view, guideline, constraintLayout, imageView, themeableLottieAnimationView, guideline2, pi2NavigationBar, constraintLayout2, guideline3, button, textView, textView2, textView3);
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
