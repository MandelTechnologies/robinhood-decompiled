package com.robinhood.android.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.settings.C28315R;

/* loaded from: classes5.dex */
public final class MergeAppearanceVisualizationViewBinding implements ViewBinding {
    public final LottieAnimationView capsuleLottieView;
    public final View chartFadeStart;
    public final LottieAnimationView chartLottieView;
    public final View dividerChart;
    public final View dividerMarquee;
    public final View dividerSphere;
    public final View dividerTop;
    public final View dividerVisualization;
    public final View marqueeFadeEnd;
    public final View marqueeFadeStart;
    public final LottieAnimationView marqueeLottieView;
    private final View rootView;
    public final LottieAnimationView sphereLottieView;

    private MergeAppearanceVisualizationViewBinding(View view, LottieAnimationView lottieAnimationView, View view2, LottieAnimationView lottieAnimationView2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, LottieAnimationView lottieAnimationView3, LottieAnimationView lottieAnimationView4) {
        this.rootView = view;
        this.capsuleLottieView = lottieAnimationView;
        this.chartFadeStart = view2;
        this.chartLottieView = lottieAnimationView2;
        this.dividerChart = view3;
        this.dividerMarquee = view4;
        this.dividerSphere = view5;
        this.dividerTop = view6;
        this.dividerVisualization = view7;
        this.marqueeFadeEnd = view8;
        this.marqueeFadeStart = view9;
        this.marqueeLottieView = lottieAnimationView3;
        this.sphereLottieView = lottieAnimationView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAppearanceVisualizationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28315R.layout.merge_appearance_visualization_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAppearanceVisualizationViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        int i = C28315R.id.capsule_lottie_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C28315R.id.chart_fade_start))) != null) {
            i = C28315R.id.chart_lottie_view;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C28315R.id.divider_chart))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C28315R.id.divider_marquee))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = C28315R.id.divider_sphere))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = C28315R.id.divider_top))) != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i = C28315R.id.divider_visualization))) != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i = C28315R.id.marquee_fade_end))) != null && (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i = C28315R.id.marquee_fade_start))) != null) {
                i = C28315R.id.marquee_lottie_view;
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView3 != null) {
                    i = C28315R.id.sphere_lottie_view;
                    LottieAnimationView lottieAnimationView4 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView4 != null) {
                        return new MergeAppearanceVisualizationViewBinding(view, lottieAnimationView, viewFindChildViewById, lottieAnimationView2, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, lottieAnimationView3, lottieAnimationView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
