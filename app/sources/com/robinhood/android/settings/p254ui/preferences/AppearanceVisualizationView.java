package com.robinhood.android.settings.p254ui.preferences;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.settings.C28315R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;

/* compiled from: AppearanceVisualizationView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0003R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/AppearanceVisualizationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "marqueeView", "Lcom/airbnb/lottie/LottieAnimationView;", "chartView", "sphereView", "capsuleView", "speedAnimator", "Landroid/animation/ValueAnimator;", "onDetachedFromWindow", "", "accelerateToNegativeState", "setSpeed", "speed", "", "evaluateColor", "", "specs", "", "Lcom/robinhood/android/settings/ui/preferences/AppearanceVisualizationView$FadeSpec;", "overallProgress", "FadeSpec", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AppearanceVisualizationView extends ConstraintLayout {
    public static final int $stable = 8;
    private final LottieAnimationView capsuleView;
    private final LottieAnimationView chartView;
    private final LottieAnimationView marqueeView;
    private ValueAnimator speedAnimator;
    private final LottieAnimationView sphereView;

    public /* synthetic */ AppearanceVisualizationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppearanceVisualizationView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28315R.layout.merge_appearance_visualization_view, true);
        View viewFindViewById = findViewById(C28315R.id.marquee_lottie_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.marqueeView = lottieAnimationView;
        View viewFindViewById2 = findViewById(C28315R.id.chart_lottie_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.chartView = (LottieAnimationView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C28315R.id.sphere_lottie_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.sphereView = (LottieAnimationView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C28315R.id.capsule_lottie_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.capsuleView = (LottieAnimationView) viewFindViewById4;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{LottieProperty.COLOR, LottieProperty.STROKE_COLOR});
        final List listListOf2 = CollectionsKt.listOf((Object[]) new FadeSpec[]{new FadeSpec(context, RangesKt.rangeTo(0.0f, 0.0278f), C20690R.attr.colorPositive, C20690R.attr.colorNegative), new FadeSpec(context, RangesKt.rangeTo(0.2681f, 0.2958f), C20690R.attr.colorNegative, C20690R.attr.colorPositive), new FadeSpec(context, RangesKt.rangeTo(0.5014f, 0.5292f), C20690R.attr.colorPositive, C20690R.attr.colorNegative), new FadeSpec(context, RangesKt.rangeTo(0.7694f, 0.7972f), C20690R.attr.colorNegative, C20690R.attr.colorPositive)});
        for (KeyPath keyPath : CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Inc_01", "**"), new KeyPath("Inc_02", "**"), new KeyPath("Inc_03", "**"), new KeyPath("Inc_04", "**"), new KeyPath("Arrow_01", "**"), new KeyPath("Arrow_02", "**"), new KeyPath("Arrow_03", "**"), new KeyPath("Arrow_04", "**"), new KeyPath("Price_01", "**"), new KeyPath("Price_02", "**"), new KeyPath("Price_03", "**"), new KeyPath("Price_04", "**"), new KeyPath("Crypto_01", "**"), new KeyPath("Crypto_Price_01", "**"), new KeyPath("Crypto_Arrow_01", "**")})) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                lottieAnimationView.addValueCallback(keyPath, (KeyPath) it.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$special$$inlined$addValueCallbacks$1
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        return (T) Integer.valueOf(this.this$0.evaluateColor(listListOf2, lottieFrameInfo.getOverallProgress()));
                    }
                });
            }
        }
        final List listListOf3 = CollectionsKt.listOf((Object[]) new FadeSpec[]{new FadeSpec(context, RangesKt.rangeTo(0.0f, 0.0555f), C20690R.attr.colorPositive, C20690R.attr.colorNegative), new FadeSpec(context, RangesKt.rangeTo(0.5362f, 0.5917f), C20690R.attr.colorNegative, C20690R.attr.colorPositive)});
        LottieAnimationView lottieAnimationView2 = this.chartView;
        for (KeyPath keyPath2 : CollectionsKt.listOf(new KeyPath("**"))) {
            Iterator it2 = listListOf.iterator();
            while (it2.hasNext()) {
                lottieAnimationView2.addValueCallback(keyPath2, (KeyPath) it2.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$special$$inlined$addValueCallbacks$2
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        return (T) Integer.valueOf(this.this$0.evaluateColor(listListOf3, lottieFrameInfo.getOverallProgress()));
                    }
                });
            }
        }
        final TypedValue typedValue = new TypedValue();
        LottieAnimationView lottieAnimationView3 = this.sphereView;
        for (KeyPath keyPath3 : CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Arrow1", "**"), new KeyPath("Arrow2", "**")})) {
            Iterator it3 = listListOf.iterator();
            while (it3.hasNext()) {
                lottieAnimationView3.addValueCallback(keyPath3, (KeyPath) it3.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$special$$inlined$addValueCallbacks$3
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        if (!context.getTheme().resolveAttribute(C20690R.attr.colorBackground1, typedValue, true)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        return (T) Integer.valueOf(typedValue.data);
                    }
                });
            }
        }
        LottieAnimationView lottieAnimationView4 = this.capsuleView;
        for (KeyPath keyPath4 : CollectionsKt.listOf((Object[]) new KeyPath[]{new KeyPath("Trade1", "**"), new KeyPath("Trade2", "**")})) {
            Iterator it4 = listListOf.iterator();
            while (it4.hasNext()) {
                lottieAnimationView4.addValueCallback(keyPath4, (KeyPath) it4.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$special$$inlined$addValueCallbacks$4
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                        Intrinsics.checkNotNull(lottieFrameInfo);
                        if (!context.getTheme().resolveAttribute(C20690R.attr.colorBackground1, typedValue, true)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        return (T) Integer.valueOf(typedValue.data);
                    }
                });
            }
        }
        LottieAnimationView[] lottieAnimationViewArr = {this.sphereView, this.capsuleView};
        for (int i = 0; i < 2; i++) {
            LottieAnimationView lottieAnimationView5 = lottieAnimationViewArr[i];
            for (KeyPath keyPath5 : CollectionsKt.listOf(new KeyPath("Base_Color_CHANGE-ME", "**"))) {
                Iterator it5 = listListOf.iterator();
                while (it5.hasNext()) {
                    lottieAnimationView5.addValueCallback(keyPath5, (KeyPath) it5.next(), (SimpleLottieValueCallback<KeyPath>) new SimpleLottieValueCallback() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$special$$inlined$addValueCallbacks$5
                        @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                        public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                            Intrinsics.checkNotNull(lottieFrameInfo);
                            if (!context.getTheme().resolveAttribute(C20690R.attr.colorNegative, typedValue, true)) {
                                throw new IllegalStateException("Check failed.");
                            }
                            return (T) Integer.valueOf(typedValue.data);
                        }
                    });
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.speedAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.speedAnimator = null;
    }

    public final void accelerateToNegativeState() {
        ValueAnimator valueAnimator = this.speedAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            float duration = this.marqueeView.getDuration();
            float progress = this.marqueeView.getProgress();
            if (0.0f > progress || progress > 0.3f) {
                if (0.5f > progress || progress > 0.8f) {
                    float f = ((progress >= 0.5f ? 1 : 0.5f) - progress) + 0.01f;
                    float f2 = 800.0f / duration;
                    if (f < f2) {
                        return;
                    }
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    float f3 = (2.0f * f) / f2;
                    floatRef.element = f3;
                    float f4 = f2 * duration;
                    if (f3 > 3.5f) {
                        floatRef.element = 3.5f;
                        f4 = ((2 * f) / 3.5f) * duration;
                    }
                    final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration((long) f4);
                    Intrinsics.checkNotNull(valueAnimatorOfFloat);
                    valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$accelerateToNegativeState$lambda$7$$inlined$addListener$default$1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            this.this$0.speedAnimator = null;
                            this.this$0.setSpeed(1.0f);
                        }
                    });
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.settings.ui.preferences.AppearanceVisualizationView$accelerateToNegativeState$2$2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator it) {
                            float f5;
                            float animatedFraction;
                            Intrinsics.checkNotNullParameter(it, "it");
                            float f6 = 0.3f;
                            if (valueAnimatorOfFloat.getAnimatedFraction() < 0.3f) {
                                f5 = 1;
                                animatedFraction = (floatRef.element - f5) * valueAnimatorOfFloat.getAnimatedFraction();
                            } else {
                                f5 = 1;
                                animatedFraction = (floatRef.element - f5) * (f5 - valueAnimatorOfFloat.getAnimatedFraction());
                                f6 = f5 - 0.3f;
                            }
                            this.setSpeed((animatedFraction * (f5 / f6)) + f5);
                        }
                    });
                    valueAnimatorOfFloat.start();
                    this.speedAnimator = valueAnimatorOfFloat;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpeed(float speed) {
        this.marqueeView.setSpeed(speed);
        this.chartView.setSpeed(speed);
        this.sphereView.setSpeed(speed);
        this.capsuleView.setSpeed(speed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int evaluateColor(List<FadeSpec> specs, float overallProgress) {
        int startColor = ((FadeSpec) CollectionsKt.first((List) specs)).getStartColor();
        AccelerateDecelerateInterpolator accelerateDecelerate = Interpolators.INSTANCE.getAccelerateDecelerate();
        for (FadeSpec fadeSpec : specs) {
            if (overallProgress < fadeSpec.getRange().getStart().floatValue()) {
                break;
            }
            if (fadeSpec.getRange().contains(Float.valueOf(overallProgress))) {
                return GammaEvaluator.INSTANCE.evaluate(accelerateDecelerate.getInterpolation((overallProgress - fadeSpec.getRange().getStart().floatValue()) / (fadeSpec.getRange().getEndInclusive().floatValue() - fadeSpec.getRange().getStart().floatValue())), fadeSpec.getStartColor(), fadeSpec.getEndColor()).intValue();
            }
            startColor = fadeSpec.getEndColor();
        }
        return startColor;
    }

    /* compiled from: AppearanceVisualizationView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0017\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/AppearanceVisualizationView$FadeSpec;", "", "context", "Landroid/content/Context;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "startColorAttrResId", "", "endColorAttrResId", "<init>", "(Landroid/content/Context;Lkotlin/ranges/ClosedFloatingPointRange;II)V", "getContext", "()Landroid/content/Context;", "getRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "getStartColorAttrResId", "()I", "getEndColorAttrResId", "typedValue", "Landroid/util/TypedValue;", "startColor", "getStartColor", "endColor", "getEndColor", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class FadeSpec {
        private final Context context;
        private final int endColorAttrResId;
        private final Ranges3<Float> range;
        private final int startColorAttrResId;
        private final TypedValue typedValue;

        public FadeSpec(Context context, Ranges3<Float> range, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(range, "range");
            this.context = context;
            this.range = range;
            this.startColorAttrResId = i;
            this.endColorAttrResId = i2;
            this.typedValue = new TypedValue();
        }

        public final Context getContext() {
            return this.context;
        }

        public final Ranges3<Float> getRange() {
            return this.range;
        }

        public final int getStartColorAttrResId() {
            return this.startColorAttrResId;
        }

        public final int getEndColorAttrResId() {
            return this.endColorAttrResId;
        }

        public final int getStartColor() {
            if (!this.context.getTheme().resolveAttribute(this.startColorAttrResId, this.typedValue, true)) {
                throw new IllegalStateException("Check failed.");
            }
            return this.typedValue.data;
        }

        public final int getEndColor() {
            if (!this.context.getTheme().resolveAttribute(this.endColorAttrResId, this.typedValue, true)) {
                throw new IllegalStateException("Check failed.");
            }
            return this.typedValue.data;
        }
    }
}
