package com.withpersona.sdk2.inquiry.document.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.document.R$id;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2DocumentReviewAddDocumentTileBinding implements ViewBinding {
    public final ThemeableLottieAnimationView addButton;
    public final MaterialCardView cardView;
    private final ConstraintLayout rootView;

    private Pi2DocumentReviewAddDocumentTileBinding(ConstraintLayout constraintLayout, ThemeableLottieAnimationView themeableLottieAnimationView, MaterialCardView materialCardView) {
        this.rootView = constraintLayout;
        this.addButton = themeableLottieAnimationView;
        this.cardView = materialCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static Pi2DocumentReviewAddDocumentTileBinding bind(View view) {
        int i = R$id.add_button;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (themeableLottieAnimationView != null) {
            i = R$id.card_view;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
            if (materialCardView != null) {
                return new Pi2DocumentReviewAddDocumentTileBinding((ConstraintLayout) view, themeableLottieAnimationView, materialCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
