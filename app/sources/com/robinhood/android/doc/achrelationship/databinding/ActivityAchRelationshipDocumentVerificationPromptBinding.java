package com.robinhood.android.doc.achrelationship.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.databinding.IncludeToolbarBinding;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.doc.achrelationship.C14255R;

/* loaded from: classes7.dex */
public final class ActivityAchRelationshipDocumentVerificationPromptBinding implements ViewBinding {
    public final ConstraintLayout achRelationshipDocumentVerificationPromptRoot;
    public final LottieAnimationView iavVerificationAnimation;
    public final LinearLayout iavVerificationHeader;
    public final RhTextView iavVerificationHeaderTxt;
    public final ImageView iavVerificationImage;
    private final ConstraintLayout rootView;
    public final RdsButton skipButton;
    public final RhTextView subtitle;
    public final IncludeToolbarBinding toolbarWrapper;
    public final RdsButton uploadStatementButton;

    private ActivityAchRelationshipDocumentVerificationPromptBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, RhTextView rhTextView, ImageView imageView, RdsButton rdsButton, RhTextView rhTextView2, IncludeToolbarBinding includeToolbarBinding, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.achRelationshipDocumentVerificationPromptRoot = constraintLayout2;
        this.iavVerificationAnimation = lottieAnimationView;
        this.iavVerificationHeader = linearLayout;
        this.iavVerificationHeaderTxt = rhTextView;
        this.iavVerificationImage = imageView;
        this.skipButton = rdsButton;
        this.subtitle = rhTextView2;
        this.toolbarWrapper = includeToolbarBinding;
        this.uploadStatementButton = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAchRelationshipDocumentVerificationPromptBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAchRelationshipDocumentVerificationPromptBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14255R.layout.activity_ach_relationship_document_verification_prompt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAchRelationshipDocumentVerificationPromptBinding bind(View view) {
        View viewFindChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C14255R.id.iav_verification_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C14255R.id.iav_verification_header;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C14255R.id.iav_verification_header_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14255R.id.iav_verification_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C14255R.id.skip_button;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C14255R.id.subtitle;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C14255R.id.toolbar_wrapper))) != null) {
                                IncludeToolbarBinding includeToolbarBindingBind = IncludeToolbarBinding.bind(viewFindChildViewById);
                                i = C14255R.id.upload_statement_button;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    return new ActivityAchRelationshipDocumentVerificationPromptBinding(constraintLayout, constraintLayout, lottieAnimationView, linearLayout, rhTextView, imageView, rdsButton, rhTextView2, includeToolbarBindingBind, rdsButton2);
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
