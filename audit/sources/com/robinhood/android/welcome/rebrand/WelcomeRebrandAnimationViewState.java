package com.robinhood.android.welcome.rebrand;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.welcome.WelcomeAnimationFrames;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: WelcomeRebrandAnimationViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState;", "", "hasPlayedInitialAnimation", "", "pageIdx", "", "pageOffset", "", "<init>", "(ZIF)V", "getHasPlayedInitialAnimation", "()Z", "getPageIdx", "()I", "getPageOffset", "()F", "lottieAnimationState", "Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState$LottieAnimationState;", "getLottieAnimationState", "()Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState$LottieAnimationState;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "LottieAnimationState", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WelcomeRebrandAnimationViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int NUM_WELCOME_MAX_PAGES;
    private static final List<WelcomeAnimationFrames> animationFrames;
    private final boolean hasPlayedInitialAnimation;
    private final int pageIdx;
    private final float pageOffset;

    public WelcomeRebrandAnimationViewState() {
        this(false, 0, 0.0f, 7, null);
    }

    public static /* synthetic */ WelcomeRebrandAnimationViewState copy$default(WelcomeRebrandAnimationViewState welcomeRebrandAnimationViewState, boolean z, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = welcomeRebrandAnimationViewState.hasPlayedInitialAnimation;
        }
        if ((i2 & 2) != 0) {
            i = welcomeRebrandAnimationViewState.pageIdx;
        }
        if ((i2 & 4) != 0) {
            f = welcomeRebrandAnimationViewState.pageOffset;
        }
        return welcomeRebrandAnimationViewState.copy(z, i, f);
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

    public final WelcomeRebrandAnimationViewState copy(boolean hasPlayedInitialAnimation, int pageIdx, float pageOffset) {
        return new WelcomeRebrandAnimationViewState(hasPlayedInitialAnimation, pageIdx, pageOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeRebrandAnimationViewState)) {
            return false;
        }
        WelcomeRebrandAnimationViewState welcomeRebrandAnimationViewState = (WelcomeRebrandAnimationViewState) other;
        return this.hasPlayedInitialAnimation == welcomeRebrandAnimationViewState.hasPlayedInitialAnimation && this.pageIdx == welcomeRebrandAnimationViewState.pageIdx && Float.compare(this.pageOffset, welcomeRebrandAnimationViewState.pageOffset) == 0;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasPlayedInitialAnimation) * 31) + Integer.hashCode(this.pageIdx)) * 31) + Float.hashCode(this.pageOffset);
    }

    public String toString() {
        return "WelcomeRebrandAnimationViewState(hasPlayedInitialAnimation=" + this.hasPlayedInitialAnimation + ", pageIdx=" + this.pageIdx + ", pageOffset=" + this.pageOffset + ")";
    }

    public WelcomeRebrandAnimationViewState(boolean z, int i, float f) {
        this.hasPlayedInitialAnimation = z;
        this.pageIdx = i;
        this.pageOffset = f;
    }

    public /* synthetic */ WelcomeRebrandAnimationViewState(boolean z, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        if (this.pageOffset != 0.0f) {
            return null;
        }
        List<WelcomeAnimationFrames> list = animationFrames;
        return new LottieAnimationState(list.get(this.pageIdx).getInitialLoopingFrame(), list.get(this.pageIdx).getFinalLoopingFrame());
    }

    /* compiled from: WelcomeRebrandAnimationViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState$LottieAnimationState;", "", "startFrame", "", "endFrame", "<init>", "(II)V", "getStartFrame", "()I", "getEndFrame", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LottieAnimationState {
        private final int endFrame;
        private final int startFrame;

        public static /* synthetic */ LottieAnimationState copy$default(LottieAnimationState lottieAnimationState, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = lottieAnimationState.startFrame;
            }
            if ((i3 & 2) != 0) {
                i2 = lottieAnimationState.endFrame;
            }
            return lottieAnimationState.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStartFrame() {
            return this.startFrame;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEndFrame() {
            return this.endFrame;
        }

        public final LottieAnimationState copy(int startFrame, int endFrame) {
            return new LottieAnimationState(startFrame, endFrame);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LottieAnimationState)) {
                return false;
            }
            LottieAnimationState lottieAnimationState = (LottieAnimationState) other;
            return this.startFrame == lottieAnimationState.startFrame && this.endFrame == lottieAnimationState.endFrame;
        }

        public int hashCode() {
            return (Integer.hashCode(this.startFrame) * 31) + Integer.hashCode(this.endFrame);
        }

        public String toString() {
            return "LottieAnimationState(startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ")";
        }

        public LottieAnimationState(int i, int i2) {
            this.startFrame = i;
            this.endFrame = i2;
        }

        public final int getStartFrame() {
            return this.startFrame;
        }

        public final int getEndFrame() {
            return this.endFrame;
        }
    }

    /* compiled from: WelcomeRebrandAnimationViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState$Companion;", "", "<init>", "()V", "animationFrames", "", "Lcom/robinhood/android/welcome/WelcomeAnimationFrames;", "getAnimationFrames", "()Ljava/util/List;", "NUM_WELCOME_MAX_PAGES", "", "getNUM_WELCOME_MAX_PAGES", "()I", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<WelcomeAnimationFrames> getAnimationFrames() {
            return WelcomeRebrandAnimationViewState.animationFrames;
        }

        public final int getNUM_WELCOME_MAX_PAGES() {
            return WelcomeRebrandAnimationViewState.NUM_WELCOME_MAX_PAGES;
        }
    }

    static {
        List<WelcomeAnimationFrames> listListOf = CollectionsKt.listOf((Object[]) new WelcomeAnimationFrames[]{new WelcomeAnimationFrames(C13997R.attr.paletteColorJet, C13997R.attr.paletteColorNova, 0.2f, 0, 0, 57), new WelcomeAnimationFrames(C13997R.attr.paletteColorJet, C20690R.attr.colorForeground3, 1.0f, 57, 57, 156), new WelcomeAnimationFrames(C13997R.attr.paletteColorJet, C20690R.attr.colorForeground3, 1.0f, 156, 156, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE), new WelcomeAnimationFrames(C13997R.attr.paletteColorJet, C20690R.attr.colorForeground3, 1.0f, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 348)});
        animationFrames = listListOf;
        NUM_WELCOME_MAX_PAGES = listListOf.size();
    }
}
