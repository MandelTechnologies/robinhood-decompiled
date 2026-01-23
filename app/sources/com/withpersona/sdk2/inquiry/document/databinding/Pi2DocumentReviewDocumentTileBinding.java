package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.document.R$id;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2DocumentReviewDocumentTileBinding implements ViewBinding {
    public final MaterialCardView cardView;
    public final TextView filenameView;
    public final ImageView imageView;
    public final LinearLayout imageViewContainer;
    public final CircularProgressIndicator loadingAnimation;
    public final ThemeableLottieAnimationView removeButton;
    private final ConstraintLayout rootView;

    private Pi2DocumentReviewDocumentTileBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, TextView textView, ImageView imageView, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.rootView = constraintLayout;
        this.cardView = materialCardView;
        this.filenameView = textView;
        this.imageView = imageView;
        this.imageViewContainer = linearLayout;
        this.loadingAnimation = circularProgressIndicator;
        this.removeButton = themeableLottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2DocumentReviewDocumentTileBinding bind(View view) {
        int i = R$id.card_view;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
        if (materialCardView != null) {
            i = R$id.filename_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R$id.image_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R$id.image_view_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R$id.loading_animation;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(view, i);
                        if (circularProgressIndicator != null) {
                            i = R$id.remove_button;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (themeableLottieAnimationView != null) {
                                return new Pi2DocumentReviewDocumentTileBinding((ConstraintLayout) view, materialCardView, textView, imageView, linearLayout, circularProgressIndicator, themeableLottieAnimationView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
