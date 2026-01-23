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

/* compiled from: FixedSlide.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\u00020\u0001:\u0005!\"#$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J2\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0016J2\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/FixedSlide;", "Landroid/transition/Visibility;", "slideEdge", "", "amount", "", "<init>", "(IF)V", "getAmount", "()F", "slideCalculator", "Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlide;", "getSlideEdge$annotations", "()V", "getSlideEdge", "()I", "setSlideEdge", "(I)V", "captureValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureStartValues", "captureEndValues", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "startValues", "endValues", "onDisappear", "GravityFlag", "CalculateSlide", "CalculateSlideHorizontal", "CalculateSlideVertical", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FixedSlide extends Visibility {
    private static final String PROPNAME_SCREEN_POSITION = "rh:simpleSlide:screenPosition";
    private final float amount;
    private CalculateSlide slideCalculator;
    private int slideEdge;
    public static final int $stable = 8;
    private static final FixedSlide4 calculateLeft = new FixedSlide4();
    private static final FixedSlide6 calculateStart = new CalculateSlideHorizontal() { // from class: com.robinhood.android.common.util.transition.FixedSlide$Companion$calculateStart$1
        @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
        public float getGoneX(ViewGroup sceneRoot, View view, float amount) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (sceneRoot == null || sceneRoot.getLayoutDirection() != 1) ? FixedSlide.calculateLeft.getGoneX(sceneRoot, view, amount) : FixedSlide.calculateRight.getGoneX(sceneRoot, view, amount);
        }
    };
    private static final FixedSlide7 calculateTop = new CalculateSlideVertical() { // from class: com.robinhood.android.common.util.transition.FixedSlide$Companion$calculateTop$1
        @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
        public float getGoneY(ViewGroup sceneRoot, View view, float amount) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (-view.getTranslationY()) - amount;
        }
    };
    private static final FixedSlide5 calculateRight = new FixedSlide5();
    private static final FixedSlide3 calculateEnd = new CalculateSlideHorizontal() { // from class: com.robinhood.android.common.util.transition.FixedSlide$Companion$calculateEnd$1
        @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
        public float getGoneX(ViewGroup sceneRoot, View view, float amount) {
            Intrinsics.checkNotNullParameter(view, "view");
            return (sceneRoot == null || sceneRoot.getLayoutDirection() != 1) ? FixedSlide.calculateRight.getGoneX(sceneRoot, view, amount) : FixedSlide.calculateLeft.getGoneX(sceneRoot, view, amount);
        }
    };
    private static final CalculateSlide calculateBottom = new CalculateSlideVertical() { // from class: com.robinhood.android.common.util.transition.FixedSlide$Companion$calculateBottom$1
        @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
        public float getGoneY(ViewGroup sceneRoot, View view, float amount) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationY() + amount;
        }
    };

    /* compiled from: FixedSlide.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\"\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlide;", "", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "amount", "getGoneY", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private interface CalculateSlide {
        float getGoneX(ViewGroup sceneRoot, View view, float amount);

        float getGoneY(ViewGroup sceneRoot, View view, float amount);
    }

    /* compiled from: FixedSlide.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/FixedSlide$GravityFlag;", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"RtlHardcoded"})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface GravityFlag {
    }

    public static /* synthetic */ void getSlideEdge$annotations() {
    }

    public /* synthetic */ FixedSlide(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 80 : i, f);
    }

    public final float getAmount() {
        return this.amount;
    }

    public FixedSlide(int i, float f) {
        this.amount = f;
        this.slideCalculator = calculateBottom;
        this.slideEdge = i;
        setSlideEdge(i);
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
    /* compiled from: FixedSlide.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlideHorizontal;", "Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlide;", "<init>", "()V", "getGoneY", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "amount", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class CalculateSlideHorizontal implements CalculateSlide {
        @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
        public float getGoneY(ViewGroup sceneRoot, View view, float amount) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getTranslationY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FixedSlide.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlideVertical;", "Lcom/robinhood/android/common/util/transition/FixedSlide$CalculateSlide;", "<init>", "()V", "getGoneX", "", "sceneRoot", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "amount", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class CalculateSlideVertical implements CalculateSlide {
        @Override // com.robinhood.android.common.util.transition.FixedSlide.CalculateSlide
        public float getGoneX(ViewGroup sceneRoot, View view, float amount) {
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
        return TranslationAnimationCreator.INSTANCE.createAnimation(view, endValues, iArr[0], iArr[1], this.slideCalculator.getGoneX(sceneRoot, view, this.amount), this.slideCalculator.getGoneY(sceneRoot, view, this.amount), translationX, translationY, getInterpolator());
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
        return TranslationAnimationCreator.INSTANCE.createAnimation(view, startValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(sceneRoot, view, this.amount), this.slideCalculator.getGoneY(sceneRoot, view, this.amount), getInterpolator());
    }
}
