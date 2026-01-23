package com.robinhood.android.welcome;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.animation.PathInterpolator;
import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: WelcomeAnimationViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00041234B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJR\u0010 \u001a\u0004\u0018\u00010\u00152!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00050\"2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00070\"H\u0002J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J'\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000b¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState;", "", "hasPlayedInitialAnimation", "", "pageIdx", "", "pageOffset", "", "<init>", "(ZIF)V", "getHasPlayedInitialAnimation", "()Z", "getPageIdx", "()I", "getPageOffset", "()F", "lottieAnimationState", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState;", "getLottieAnimationState", "()Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState;", "backgroundColorInterpolation", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$ColorInterpolation;", "getBackgroundColorInterpolation", "()Lcom/robinhood/android/welcome/WelcomeAnimationViewState$ColorInterpolation;", "dotIndicatorBackgroundColorInterpolation", "getDotIndicatorBackgroundColorInterpolation", "motionLayoutAnimationState", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$MotionLayoutAnimationState;", "getMotionLayoutAnimationState", "()Lcom/robinhood/android/welcome/WelcomeAnimationViewState$MotionLayoutAnimationState;", "viewPagerBottomSheetVisible", "getViewPagerBottomSheetVisible", "deriveColorInterpolation", "frameToColor", "Lkotlin/Function1;", "Lcom/robinhood/android/welcome/WelcomeAnimationFrames;", "Lkotlin/ParameterName;", "name", "frame", "frameToAlpha", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "MotionLayoutAnimationState", "LottieAnimationState", "ColorInterpolation", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class WelcomeAnimationViewState {
    public static final int BOTTOM_SHEET_ANIMATE_FRAGMENT_IDX = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NUM_WELCOME_MAX_PAGES;
    private static final int SHOW_BOTTOM_SHEET_FRAME = 443;
    private static final float SHOW_BOTTOM_SHEET_PROPORTION;
    private static final List<WelcomeAnimationFrames> animationFrames;
    private static final PathInterpolator colorInterpolator;
    private final boolean hasPlayedInitialAnimation;
    private final int pageIdx;
    private final float pageOffset;
    private final boolean viewPagerBottomSheetVisible;

    public WelcomeAnimationViewState() {
        this(false, 0, 0.0f, 7, null);
    }

    public static /* synthetic */ WelcomeAnimationViewState copy$default(WelcomeAnimationViewState welcomeAnimationViewState, boolean z, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = welcomeAnimationViewState.hasPlayedInitialAnimation;
        }
        if ((i2 & 2) != 0) {
            i = welcomeAnimationViewState.pageIdx;
        }
        if ((i2 & 4) != 0) {
            f = welcomeAnimationViewState.pageOffset;
        }
        return welcomeAnimationViewState.copy(z, i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float deriveColorInterpolation$lambda$3(WelcomeAnimationFrames welcomeAnimationFrames) {
        Intrinsics.checkNotNullParameter(welcomeAnimationFrames, "<unused var>");
        return 1.0f;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasPlayedInitialAnimation() {
        return this.hasPlayedInitialAnimation;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageIdx() {
        return this.pageIdx;
    }

    /* renamed from: component3, reason: from getter */
    public final float getPageOffset() {
        return this.pageOffset;
    }

    public final WelcomeAnimationViewState copy(boolean hasPlayedInitialAnimation, int pageIdx, float pageOffset) {
        return new WelcomeAnimationViewState(hasPlayedInitialAnimation, pageIdx, pageOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeAnimationViewState)) {
            return false;
        }
        WelcomeAnimationViewState welcomeAnimationViewState = (WelcomeAnimationViewState) other;
        return this.hasPlayedInitialAnimation == welcomeAnimationViewState.hasPlayedInitialAnimation && this.pageIdx == welcomeAnimationViewState.pageIdx && Float.compare(this.pageOffset, welcomeAnimationViewState.pageOffset) == 0;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasPlayedInitialAnimation) * 31) + Integer.hashCode(this.pageIdx)) * 31) + Float.hashCode(this.pageOffset);
    }

    public String toString() {
        return "WelcomeAnimationViewState(hasPlayedInitialAnimation=" + this.hasPlayedInitialAnimation + ", pageIdx=" + this.pageIdx + ", pageOffset=" + this.pageOffset + ")";
    }

    public WelcomeAnimationViewState(boolean z, int i, float f) {
        this.hasPlayedInitialAnimation = z;
        this.pageIdx = i;
        this.pageOffset = f;
        boolean z2 = true;
        if (i < 1) {
            z2 = false;
        } else if (i == 1) {
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        }
        this.viewPagerBottomSheetVisible = z2;
    }

    public /* synthetic */ WelcomeAnimationViewState(boolean z, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0.0f : f);
    }

    public final boolean getHasPlayedInitialAnimation() {
        return this.hasPlayedInitialAnimation;
    }

    public final int getPageIdx() {
        return this.pageIdx;
    }

    public final float getPageOffset() {
        return this.pageOffset;
    }

    public final LottieAnimationState getLottieAnimationState() {
        if (this.pageOffset == 0.0f) {
            List<WelcomeAnimationFrames> list = animationFrames;
            return new LottieAnimationState.Looping(list.get(this.pageIdx).getInitialLoopingFrame(), list.get(this.pageIdx).getFinalLoopingFrame());
        }
        int i = this.pageIdx;
        if (i >= NUM_WELCOME_MAX_PAGES - 1) {
            return null;
        }
        WelcomeAnimationFrames welcomeAnimationFrames = animationFrames.get(i);
        return new LottieAnimationState.TargetFrame((int) ((this.pageOffset * (r1.get(this.pageIdx + 1).getInitialLoopingFrame() - welcomeAnimationFrames.getFinalLoopingFrame())) + welcomeAnimationFrames.getFinalLoopingFrame()));
    }

    public final ColorInterpolation getBackgroundColorInterpolation() {
        return deriveColorInterpolation$default(this, new Function1() { // from class: com.robinhood.android.welcome.WelcomeAnimationViewState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(WelcomeAnimationViewState._get_backgroundColorInterpolation_$lambda$0((WelcomeAnimationFrames) obj));
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _get_backgroundColorInterpolation_$lambda$0(WelcomeAnimationFrames it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getBackgroundColor();
    }

    public final ColorInterpolation getDotIndicatorBackgroundColorInterpolation() {
        return deriveColorInterpolation(new Function1() { // from class: com.robinhood.android.welcome.WelcomeAnimationViewState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(WelcomeAnimationViewState._get_dotIndicatorBackgroundColorInterpolation_$lambda$1((WelcomeAnimationFrames) obj));
            }
        }, new Function1() { // from class: com.robinhood.android.welcome.WelcomeAnimationViewState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(WelcomeAnimationViewState._get_dotIndicatorBackgroundColorInterpolation_$lambda$2((WelcomeAnimationFrames) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _get_dotIndicatorBackgroundColorInterpolation_$lambda$1(WelcomeAnimationFrames it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDotIndicatorBackgroundColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _get_dotIndicatorBackgroundColorInterpolation_$lambda$2(WelcomeAnimationFrames it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDotIndicatorBackgroundAlpha();
    }

    public final MotionLayoutAnimationState getMotionLayoutAnimationState() {
        int i = this.pageIdx;
        if (i == 0) {
            float f = this.pageOffset;
            float f2 = SHOW_BOTTOM_SHEET_PROPORTION;
            if (f < f2) {
                return new MotionLayoutAnimationState(C31456R.id.max_welcome_intro_animation_end, C31456R.id.max_welcome_bottom_sheet_appear, f / f2);
            }
        }
        if (i == 0) {
            float f3 = this.pageOffset;
            float f4 = SHOW_BOTTOM_SHEET_PROPORTION;
            if (f3 >= f4) {
                return new MotionLayoutAnimationState(C31456R.id.max_welcome_bottom_sheet_appear, C31456R.id.max_welcome_bottom_sheet_shown, (f3 - f4) / (1 - f4));
            }
        }
        if (i == 1 && this.pageOffset == 0.0f) {
            return new MotionLayoutAnimationState(C31456R.id.max_welcome_bottom_sheet_appear, C31456R.id.max_welcome_bottom_sheet_shown, 1.0f);
        }
        if (i > 0) {
            return new MotionLayoutAnimationState(C31456R.id.max_welcome_bottom_sheet_appear, C31456R.id.max_welcome_bottom_sheet_shown, 0.0f);
        }
        return null;
    }

    public final boolean getViewPagerBottomSheetVisible() {
        return this.viewPagerBottomSheetVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ ColorInterpolation deriveColorInterpolation$default(WelcomeAnimationViewState welcomeAnimationViewState, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = new Function1() { // from class: com.robinhood.android.welcome.WelcomeAnimationViewState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Float.valueOf(WelcomeAnimationViewState.deriveColorInterpolation$lambda$3((WelcomeAnimationFrames) obj2));
                }
            };
        }
        return welcomeAnimationViewState.deriveColorInterpolation(function1, function12);
    }

    private final ColorInterpolation deriveColorInterpolation(Function1<? super WelcomeAnimationFrames, Integer> frameToColor, Function1<? super WelcomeAnimationFrames, Float> frameToAlpha) {
        int i = this.pageIdx;
        int i2 = NUM_WELCOME_MAX_PAGES;
        if (i < i2 - 1) {
            List<WelcomeAnimationFrames> list = animationFrames;
            return new ColorInterpolation(frameToColor.invoke(list.get(i)).intValue(), frameToColor.invoke(list.get(this.pageIdx + 1)).intValue(), frameToAlpha.invoke(list.get(this.pageIdx)).floatValue(), frameToAlpha.invoke(list.get(this.pageIdx + 1)).floatValue(), 1.0f - this.pageOffset);
        }
        if (i != i2 - 1) {
            return null;
        }
        List<WelcomeAnimationFrames> list2 = animationFrames;
        return new ColorInterpolation(frameToColor.invoke(list2.get(i)).intValue(), frameToColor.invoke(list2.get(this.pageIdx)).intValue(), frameToAlpha.invoke(list2.get(this.pageIdx)).floatValue(), frameToAlpha.invoke(list2.get(this.pageIdx)).floatValue(), 0.0f);
    }

    /* compiled from: WelcomeAnimationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState$MotionLayoutAnimationState;", "", "startId", "", "endId", "progress", "", "<init>", "(IIF)V", "getStartId", "()I", "getEndId", "getProgress", "()F", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class MotionLayoutAnimationState {
        private final int endId;
        private final float progress;
        private final int startId;

        public MotionLayoutAnimationState(int i, int i2, float f) {
            this.startId = i;
            this.endId = i2;
            this.progress = f;
        }

        public final int getStartId() {
            return this.startId;
        }

        public final int getEndId() {
            return this.endId;
        }

        public final float getProgress() {
            return this.progress;
        }
    }

    /* compiled from: WelcomeAnimationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState;", "", "<init>", "()V", "Looping", "TargetFrame", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState$Looping;", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState$TargetFrame;", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static abstract class LottieAnimationState {
        public /* synthetic */ LottieAnimationState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LottieAnimationState() {
        }

        /* compiled from: WelcomeAnimationViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState$Looping;", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState;", "startFrame", "", "endFrame", "<init>", "(II)V", "getStartFrame", "()I", "getEndFrame", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Looping extends LottieAnimationState {
            private final int endFrame;
            private final int startFrame;

            public final int getStartFrame() {
                return this.startFrame;
            }

            public final int getEndFrame() {
                return this.endFrame;
            }

            public Looping(int i, int i2) {
                super(null);
                this.startFrame = i;
                this.endFrame = i2;
            }
        }

        /* compiled from: WelcomeAnimationViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState$TargetFrame;", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState;", "targetFrame", "", "<init>", "(I)V", "getTargetFrame", "()I", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TargetFrame extends LottieAnimationState {
            private final int targetFrame;

            public final int getTargetFrame() {
                return this.targetFrame;
            }

            public TargetFrame(int i) {
                super(null);
                this.targetFrame = i;
            }
        }
    }

    /* compiled from: WelcomeAnimationViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0002J8\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState$ColorInterpolation;", "", "firstColorRes", "", "secondColorRes", "firstColorAlpha", "", "secondColorAlpha", "firstProportion", "<init>", "(IIFFF)V", "getFirstColorRes", "()I", "getSecondColorRes", "getFirstColorAlpha", "()F", "getSecondColorAlpha", "getFirstProportion", "getColor", "context", "Landroid/content/Context;", "interpolateColors", "first", "second", "interpolateColor", "colorComponentOf", "Lkotlin/Function1;", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes9.dex */
    public static final class ColorInterpolation {
        private final float firstColorAlpha;
        private final int firstColorRes;
        private final float firstProportion;
        private final float secondColorAlpha;
        private final int secondColorRes;

        public ColorInterpolation(int i, int i2, float f, float f2, float f3) {
            this.firstColorRes = i;
            this.secondColorRes = i2;
            this.firstColorAlpha = f;
            this.secondColorAlpha = f2;
            this.firstProportion = f3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ColorInterpolation(int i, int i2, float f, float f2, float f3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            float f4;
            float f5;
            f = (i3 & 4) != 0 ? 1.0f : f;
            if ((i3 & 8) != 0) {
                f4 = f3;
                f5 = 1.0f;
            } else {
                f4 = f3;
                f5 = f2;
            }
            this(i, i2, f, f5, f4);
        }

        public final int getFirstColorRes() {
            return this.firstColorRes;
        }

        public final int getSecondColorRes() {
            return this.secondColorRes;
        }

        public final float getFirstColorAlpha() {
            return this.firstColorAlpha;
        }

        public final float getSecondColorAlpha() {
            return this.secondColorAlpha;
        }

        public final float getFirstProportion() {
            return this.firstProportion;
        }

        public final int getColor(Context context) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(context, "context");
            float f = 255;
            return interpolateColors((ThemeColors.getThemeColor(context, this.firstColorRes) & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(this.firstColorAlpha * f), 0, 255) << 24), (ThemeColors.getThemeColor(context, this.secondColorRes) & 16777215) | (RangesKt.coerceIn(MathKt.roundToInt(this.secondColorAlpha * f), 0, 255) << 24), this.firstProportion);
        }

        private final int interpolateColors(int first, int second, float firstProportion) {
            return Color.argb(interpolateColor(WelcomeAnimationViewState2.INSTANCE, first, second, firstProportion), interpolateColor(WelcomeAnimationViewState5.INSTANCE, first, second, firstProportion), interpolateColor(WelcomeAnimationViewState4.INSTANCE, first, second, firstProportion), interpolateColor(WelcomeAnimationViewState3.INSTANCE, first, second, firstProportion));
        }

        private final int interpolateColor(Function1<? super Integer, Integer> colorComponentOf, int first, int second, float firstProportion) {
            float interpolation = WelcomeAnimationViewState.colorInterpolator.getInterpolation(firstProportion);
            return (int) ((colorComponentOf.invoke(Integer.valueOf(first)).floatValue() * interpolation) + (colorComponentOf.invoke(Integer.valueOf(second)).floatValue() * (1 - interpolation)));
        }
    }

    /* compiled from: WelcomeAnimationViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeAnimationViewState$Companion;", "", "<init>", "()V", "animationFrames", "", "Lcom/robinhood/android/welcome/WelcomeAnimationFrames;", "getAnimationFrames", "()Ljava/util/List;", "SHOW_BOTTOM_SHEET_FRAME", "", "SHOW_BOTTOM_SHEET_PROPORTION", "", "BOTTOM_SHEET_ANIMATE_FRAGMENT_IDX", "colorInterpolator", "Landroid/view/animation/PathInterpolator;", "NUM_WELCOME_MAX_PAGES", "getNUM_WELCOME_MAX_PAGES", "()I", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<WelcomeAnimationFrames> getAnimationFrames() {
            return WelcomeAnimationViewState.animationFrames;
        }

        public final int getNUM_WELCOME_MAX_PAGES() {
            return WelcomeAnimationViewState.NUM_WELCOME_MAX_PAGES;
        }
    }

    static {
        List<WelcomeAnimationFrames> listListOf = CollectionsKt.listOf((Object[]) new WelcomeAnimationFrames[]{new WelcomeAnimationFrames(C13997R.attr.paletteColorXRay, C13997R.attr.paletteColorJade, 0.2f, 0, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 420), new WelcomeAnimationFrames(C13997R.attr.paletteColorXRay, C20690R.attr.colorForeground3, 1.0f, 421, 481, 720), new WelcomeAnimationFrames(C13997R.attr.paletteColorLumen, C20690R.attr.colorForeground3, 1.0f, 721, 766, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION), new WelcomeAnimationFrames(C13997R.attr.paletteColorHydro, C20690R.attr.colorForeground3, 1.0f, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 1051, 1290)});
        animationFrames = listListOf;
        SHOW_BOTTOM_SHEET_PROPORTION = (443 - listListOf.get(0).getFinalLoopingFrame()) / (listListOf.get(1).getInitialLoopingFrame() - listListOf.get(0).getFinalLoopingFrame());
        colorInterpolator = new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f);
        NUM_WELCOME_MAX_PAGES = listListOf.size();
    }
}
