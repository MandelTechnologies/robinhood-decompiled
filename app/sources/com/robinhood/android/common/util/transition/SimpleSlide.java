package com.robinhood.android.common.util.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleSlide.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0005\u001c\u001d\u001e\u001f B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J2\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J2\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/SimpleSlide;", "Landroid/transition/Visibility;", "slideEdge", "", "<init>", "(I)V", "slideCalculator", "Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlide;", "getSlideEdge$annotations", "()V", "getSlideEdge", "()I", "setSlideEdge", "captureValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureStartValues", "captureEndValues", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "startValues", "endValues", "onDisappear", "GravityFlag", "CalculateSlide", "CalculateSlideHorizontal", "CalculateSlideVertical", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SimpleSlide extends Visibility {
    private static final String PROPNAME_SCREEN_POSITION = "rh:simpleSlide:screenPosition";
    private CalculateSlide slideCalculator;
    private int slideEdge;
    public static final int $stable = 8;
    private static final SimpleSlide4 calculateLeft = new SimpleSlide4();
    private static final SimpleSlide6 calculateStart = new CalculateSlideHorizontal() { // from class: com.robinhood.android.common.util.transition.SimpleSlide$Companion$calculateStart$1
        @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
        public float getGoneX(ViewGroup sceneRoot, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (sceneRoot == null || sceneRoot.getLayoutDirection() != 1) ? SimpleSlide.calculateLeft.getGoneX(sceneRoot, view) : SimpleSlide.calculateRight.getGoneX(sceneRoot, view);
        }
    };
    private static final SimpleSlide7 calculateTop = new CalculateSlideVertical() { // from class: com.robinhood.android.common.util.transition.SimpleSlide$Companion$calculateTop$1
        @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
        public float getGoneY(ViewGroup sceneRoot, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (-view.getTranslationY()) - (view.getTop() + view.getHeight());
        }
    };
    private static final SimpleSlide5 calculateRight = new SimpleSlide5();
    private static final SimpleSlide3 calculateEnd = new CalculateSlideHorizontal() { // from class: com.robinhood.android.common.util.transition.SimpleSlide$Companion$calculateEnd$1
        @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
        public float getGoneX(ViewGroup sceneRoot, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (sceneRoot == null || sceneRoot.getLayoutDirection() != 1) ? SimpleSlide.calculateRight.getGoneX(sceneRoot, view) : SimpleSlide.calculateLeft.getGoneX(sceneRoot, view);
        }
    };
    private static final CalculateSlide calculateBottom = new CalculateSlideVertical() { // from class: com.robinhood.android.common.util.transition.SimpleSlide$Companion$calculateBottom$1
        @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
        public float getGoneY(ViewGroup sceneRoot, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            float translationY = view.getTranslationY();
            Intrinsics.checkNotNull(sceneRoot);
            return translationY + (sceneRoot.getHeight() - view.getTop());
        }
    };

    /* compiled from: SimpleSlide.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlide;", "", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "getGoneY", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private interface CalculateSlide {
        float getGoneX(ViewGroup sceneRoot, View view);

        float getGoneY(ViewGroup sceneRoot, View view);
    }

    /* compiled from: SimpleSlide.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/SimpleSlide$GravityFlag;", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"RtlHardcoded"})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface GravityFlag {
    }

    public SimpleSlide() {
        this(0, 1, null);
    }

    public static /* synthetic */ void getSlideEdge$annotations() {
    }

    public SimpleSlide(int i) {
        this.slideCalculator = calculateBottom;
        this.slideEdge = i;
        setSlideEdge(i);
    }

    public /* synthetic */ SimpleSlide(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 80 : i);
    }

    public final int getSlideEdge() {
        return this.slideEdge;
    }

    public final void setSlideEdge(int i) {
        CalculateSlide calculateSlide;
        if (i == 3) {
            calculateSlide = calculateLeft;
        } else if (i == 5) {
            calculateSlide = calculateRight;
        } else if (i == 48) {
            calculateSlide = calculateTop;
        } else if (i == 80) {
            calculateSlide = calculateBottom;
        } else if (i == 8388611) {
            calculateSlide = calculateStart;
        } else if (i == 8388613) {
            calculateSlide = calculateEnd;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.slideCalculator = calculateSlide;
        this.slideEdge = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SimpleSlide.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlideHorizontal;", "Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlide;", "<init>", "()V", "getGoneY", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class CalculateSlideHorizontal implements CalculateSlide {
        @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
        public float getGoneY(ViewGroup sceneRoot, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SimpleSlide.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlideVertical;", "Lcom/robinhood/android/common/util/transition/SimpleSlide$CalculateSlide;", "<init>", "()V", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class CalculateSlideVertical implements CalculateSlide {
        @Override // com.robinhood.android.common.util.transition.SimpleSlide.CalculateSlide
        public float getGoneX(ViewGroup sceneRoot, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationX();
        }
    }

    private final void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Map values = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(values, "values");
        values.put(PROPNAME_SCREEN_POSITION, iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        if (endValues == null) {
            return null;
        }
        Object obj = endValues.values.get(PROPNAME_SCREEN_POSITION);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNull(view);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.INSTANCE.createAnimation(view, endValues, iArr[0], iArr[1], this.slideCalculator.getGoneX(sceneRoot, view), this.slideCalculator.getGoneY(sceneRoot, view), translationX, translationY, getInterpolator());
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        if (startValues == null) {
            return null;
        }
        Object obj = startValues.values.get(PROPNAME_SCREEN_POSITION);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Intrinsics.checkNotNull(view);
        return TranslationAnimationCreator.INSTANCE.createAnimation(view, startValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(sceneRoot, view), this.slideCalculator.getGoneY(sceneRoot, view), getInterpolator());
    }
}
