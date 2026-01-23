package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.selfie.R$id;
import com.withpersona.sdk2.inquiry.selfie.R$layout;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;

/* loaded from: classes18.dex */
public final class Pi2OldSelfieOverlayBinding implements ViewBinding {
    public final View blindsView;
    public final Pi2CircleMaskView circleMask;
    public final ThemeableLottieAnimationView hintAnimation;
    public final ImageView hintImage;
    public final View hintOverlayView;
    public final View imageOverlayView;
    public final Pi2ProgressArcView progressArc;
    private final View rootView;

    private Pi2OldSelfieOverlayBinding(View view, View view2, Pi2CircleMaskView pi2CircleMaskView, ThemeableLottieAnimationView themeableLottieAnimationView, ImageView imageView, View view3, View view4, Pi2ProgressArcView pi2ProgressArcView) {
        this.rootView = view;
        this.blindsView = view2;
        this.circleMask = pi2CircleMaskView;
        this.hintAnimation = themeableLottieAnimationView;
        this.hintImage = imageView;
        this.hintOverlayView = view3;
        this.imageOverlayView = view4;
        this.progressArc = pi2ProgressArcView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static Pi2OldSelfieOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pi2_old_selfie_overlay, viewGroup);
        return bind(viewGroup);
    }

    public static Pi2OldSelfieOverlayBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.blinds_view;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = R$id.circle_mask;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) ViewBindings.findChildViewById(view, i);
            if (pi2CircleMaskView != null) {
                i = R$id.hint_animation;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (themeableLottieAnimationView != null) {
                    i = R$id.hint_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.hint_overlay_view))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.image_overlay_view))) != null) {
                        i = R$id.progress_arc;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) ViewBindings.findChildViewById(view, i);
                        if (pi2ProgressArcView != null) {
                            return new Pi2OldSelfieOverlayBinding(view, viewFindChildViewById3, pi2CircleMaskView, themeableLottieAnimationView, imageView, viewFindChildViewById, viewFindChildViewById2, pi2ProgressArcView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
