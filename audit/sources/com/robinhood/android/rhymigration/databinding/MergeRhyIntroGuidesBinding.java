package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class MergeRhyIntroGuidesBinding implements ViewBinding {
    public final Guideline rhyIntroContentEndGuideline;
    public final Guideline rhyIntroContentStartGuideline;
    public final Guideline rhyIntroContrastBottomGuideline;
    public final Guideline rhyIntroFeatureBottomGuideline;
    private final View rootView;

    private MergeRhyIntroGuidesBinding(View view, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4) {
        this.rootView = view;
        this.rhyIntroContentEndGuideline = guideline;
        this.rhyIntroContentStartGuideline = guideline2;
        this.rhyIntroContrastBottomGuideline = guideline3;
        this.rhyIntroFeatureBottomGuideline = guideline4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhyIntroGuidesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27577R.layout.merge_rhy_intro_guides, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhyIntroGuidesBinding bind(View view) {
        int i = C27577R.id.rhy_intro_content_end_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C27577R.id.rhy_intro_content_start_guideline;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                i = C27577R.id.rhy_intro_contrast_bottom_guideline;
                Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline3 != null) {
                    i = C27577R.id.rhy_intro_feature_bottom_guideline;
                    Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline4 != null) {
                        return new MergeRhyIntroGuidesBinding(view, guideline, guideline2, guideline3, guideline4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
