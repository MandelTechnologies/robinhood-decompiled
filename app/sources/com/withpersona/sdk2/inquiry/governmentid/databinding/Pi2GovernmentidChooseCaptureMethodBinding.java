package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.governmentid.R$id;
import com.withpersona.sdk2.inquiry.governmentid.R$layout;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2GovernmentidChooseCaptureMethodBinding implements ViewBinding {
    public final TextView body;
    public final MaterialButton cameraButton;
    public final ThemeableLottieAnimationView idImage;
    public final View idImageContainer;
    public final ConstraintLayout imageViewContainer;
    public final CardView localImage;
    public final Pi2NavigationBar navigationBar;
    private final CoordinatorLayout rootView;
    public final TextView title;
    public final Button uploadButton;

    private Pi2GovernmentidChooseCaptureMethodBinding(CoordinatorLayout coordinatorLayout, TextView textView, MaterialButton materialButton, ThemeableLottieAnimationView themeableLottieAnimationView, View view, ConstraintLayout constraintLayout, CardView cardView, Pi2NavigationBar pi2NavigationBar, TextView textView2, Button button) {
        this.rootView = coordinatorLayout;
        this.body = textView;
        this.cameraButton = materialButton;
        this.idImage = themeableLottieAnimationView;
        this.idImageContainer = view;
        this.imageViewContainer = constraintLayout;
        this.localImage = cardView;
        this.navigationBar = pi2NavigationBar;
        this.title = textView2;
        this.uploadButton = button;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static Pi2GovernmentidChooseCaptureMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.pi2_governmentid_choose_capture_method, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static Pi2GovernmentidChooseCaptureMethodBinding bind(View view) {
        View viewFindChildViewById;
        int i = R$id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R$id.camera_button;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, i);
            if (materialButton != null) {
                i = R$id.id_image;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (themeableLottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.id_image_container))) != null) {
                    i = R$id.image_view_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R$id.local_image;
                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                        if (cardView != null) {
                            i = R$id.navigation_bar;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(view, i);
                            if (pi2NavigationBar != null) {
                                i = R$id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R$id.upload_button;
                                    Button button = (Button) ViewBindings.findChildViewById(view, i);
                                    if (button != null) {
                                        return new Pi2GovernmentidChooseCaptureMethodBinding((CoordinatorLayout) view, textView, materialButton, themeableLottieAnimationView, viewFindChildViewById, constraintLayout, cardView, pi2NavigationBar, textView2, button);
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
