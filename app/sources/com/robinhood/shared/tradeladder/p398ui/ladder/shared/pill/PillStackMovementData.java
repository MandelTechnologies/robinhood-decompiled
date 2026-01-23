package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp2;
import androidx.compose.p011ui.util.MathHelpers;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill.AnimationType;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001:\u0002:;B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u00100\u001a\u00020\u0003HÂ\u0003J\t\u00101\u001a\u00020\u0006HÂ\u0003J\t\u00102\u001a\u00020\bHÂ\u0003J3\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010!\u001a\u00020\"¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010&\u001a\u00020\"¢\u0006\n\n\u0002\u0010%\u001a\u0004\b'\u0010$R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+¨\u0006<"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData;", "", "lastPillStackState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;", "currentPillStackState", "animationState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$AnimationState;", "settings", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$Settings;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$AnimationState;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$Settings;)V", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "getSide", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "topPillPos", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/Point;", "getTopPillPos", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/Point;", "bottomPillPos", "getBottomPillPos", "topLabel", "Lcom/robinhood/utils/resource/StringResource;", "getTopLabel", "()Lcom/robinhood/utils/resource/StringResource;", "topPillStyle", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "getTopPillStyle", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/style/PillStyle$PillVisualState;", "bottomLabel", "getBottomLabel", "bottomPillStyle", "getBottomPillStyle", "topPillColor", "Landroidx/compose/ui/graphics/Color;", "getTopPillColor-0d7_KjU", "()J", "J", "bottomPillColor", "getBottomPillColor-0d7_KjU", "showLoadingShimmerForTop", "", "getShowLoadingShimmerForTop", "()Z", "showLoadingShimmerForBottom", "getShowLoadingShimmerForBottom", "isLadderClickable", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "AnimationState", "Settings", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final /* data */ class PillStackMovementData {
    private final AnimationState animationState;
    private final StringResource bottomLabel;
    private final long bottomPillColor;
    private final Point bottomPillPos;
    private final PillStyle.PillVisualState bottomPillStyle;
    private final PillStackState currentPillStackState;
    private final boolean isLadderClickable;
    private final PillStackState lastPillStackState;
    private final Settings settings;
    private final boolean showLoadingShimmerForBottom;
    private final boolean showLoadingShimmerForTop;
    private final Side side;
    private final StringResource topLabel;
    private final long topPillColor;
    private final Point topPillPos;
    private final PillStyle.PillVisualState topPillStyle;

    /* renamed from: component1, reason: from getter */
    private final PillStackState getLastPillStackState() {
        return this.lastPillStackState;
    }

    /* renamed from: component2, reason: from getter */
    private final PillStackState getCurrentPillStackState() {
        return this.currentPillStackState;
    }

    /* renamed from: component3, reason: from getter */
    private final AnimationState getAnimationState() {
        return this.animationState;
    }

    /* renamed from: component4, reason: from getter */
    private final Settings getSettings() {
        return this.settings;
    }

    public static /* synthetic */ PillStackMovementData copy$default(PillStackMovementData pillStackMovementData, PillStackState pillStackState, PillStackState pillStackState2, AnimationState animationState, Settings settings, int i, Object obj) {
        if ((i & 1) != 0) {
            pillStackState = pillStackMovementData.lastPillStackState;
        }
        if ((i & 2) != 0) {
            pillStackState2 = pillStackMovementData.currentPillStackState;
        }
        if ((i & 4) != 0) {
            animationState = pillStackMovementData.animationState;
        }
        if ((i & 8) != 0) {
            settings = pillStackMovementData.settings;
        }
        return pillStackMovementData.copy(pillStackState, pillStackState2, animationState, settings);
    }

    public final PillStackMovementData copy(PillStackState lastPillStackState, PillStackState currentPillStackState, AnimationState animationState, Settings settings) {
        Intrinsics.checkNotNullParameter(currentPillStackState, "currentPillStackState");
        Intrinsics.checkNotNullParameter(animationState, "animationState");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new PillStackMovementData(lastPillStackState, currentPillStackState, animationState, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PillStackMovementData)) {
            return false;
        }
        PillStackMovementData pillStackMovementData = (PillStackMovementData) other;
        return Intrinsics.areEqual(this.lastPillStackState, pillStackMovementData.lastPillStackState) && Intrinsics.areEqual(this.currentPillStackState, pillStackMovementData.currentPillStackState) && Intrinsics.areEqual(this.animationState, pillStackMovementData.animationState) && Intrinsics.areEqual(this.settings, pillStackMovementData.settings);
    }

    public int hashCode() {
        PillStackState pillStackState = this.lastPillStackState;
        return ((((((pillStackState == null ? 0 : pillStackState.hashCode()) * 31) + this.currentPillStackState.hashCode()) * 31) + this.animationState.hashCode()) * 31) + this.settings.hashCode();
    }

    public String toString() {
        return "PillStackMovementData(lastPillStackState=" + this.lastPillStackState + ", currentPillStackState=" + this.currentPillStackState + ", animationState=" + this.animationState + ", settings=" + this.settings + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PillStackMovementData(PillStackState pillStackState, PillStackState currentPillStackState, AnimationState animationState, Settings settings) {
        Point point;
        Point point2;
        Point point3;
        long jM6733lerpjxsXWHM;
        long jM6733lerpjxsXWHM2;
        Intrinsics.checkNotNullParameter(currentPillStackState, "currentPillStackState");
        Intrinsics.checkNotNullParameter(animationState, "animationState");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.lastPillStackState = pillStackState;
        this.currentPillStackState = currentPillStackState;
        this.animationState = animationState;
        this.settings = settings;
        this.side = settings.getSide$lib_trade_ladder_externalDebug();
        AnimationType animationType = animationState.getAnimationType();
        AnimationType.Shuffle shuffle = AnimationType.Shuffle.INSTANCE;
        boolean z = false;
        Point point4 = null;
        if (Intrinsics.areEqual(animationType, shuffle)) {
            point = AnimatedPendingOrderPillStackKt.m26144getPositionAtProgresslG28NQ4(settings.getIsStart() ? AnimatedPendingOrderPillStackKt.topPillShuffleRightPathMeasure : AnimatedPendingOrderPillStackKt.topPillShuffleLeftPathMeasure, settings.m2957xa1c62269(), animationState.getProgress());
        } else if (animationType instanceof AnimationType.MoveIn) {
            point = !animationState.isAnimating() ? new Point(C2002Dp.m7995constructorimpl(0), 0.0f, null) : null;
        } else if (animationType instanceof AnimationType.MoveOut) {
            point = !animationState.isAnimating() ? new Point(C2002Dp.m7995constructorimpl(0), 0.0f, null) : new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * Dp2.m8007lerpMdfbLM(C2002Dp.m7995constructorimpl(0), settings.m2956xdd22025(), animationState.getProgress())), MathHelpers.lerp(0.0f, -1.0f, animationState.getProgress()), null);
        } else if (!(animationType instanceof AnimationType.DragDeleteInProgress)) {
            if (!Intrinsics.areEqual(animationType, AnimationType.Split.INSTANCE) && !Intrinsics.areEqual(animationType, AnimationType.Group.INSTANCE) && animationType != null) {
                throw new NoWhenBranchMatchedException();
            }
            point = new Point(C2002Dp.m7995constructorimpl(0), 0.0f, null);
        }
        this.topPillPos = point;
        AnimationType animationType2 = animationState.getAnimationType();
        if (Intrinsics.areEqual(animationType2, shuffle)) {
            point4 = AnimatedPendingOrderPillStackKt.m26144getPositionAtProgresslG28NQ4(settings.getIsStart() ? AnimatedPendingOrderPillStackKt.bottomPillShuffleLeftPathMeasure : AnimatedPendingOrderPillStackKt.bottomPillShuffleRightPathMeasure, settings.m2957xa1c62269(), animationState.getProgress());
        } else if (Intrinsics.areEqual(animationType2, AnimationType.Split.INSTANCE)) {
            if (animationState.isAnimating()) {
                point3 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * Dp2.m8007lerpMdfbLM(settings.m2956xdd22025(), settings.m2957xa1c62269(), animationState.getProgress())), -1.0f, null);
                point4 = point3;
            } else {
                point2 = new Point(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(settings.m2957xa1c62269() * settings.getDirectionMultiplier()) * 1.0f), -1.0f, null);
                point4 = point2;
            }
        } else if (Intrinsics.areEqual(animationType2, AnimationType.Group.INSTANCE)) {
            if (animationState.isAnimating()) {
                point3 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * Dp2.m8007lerpMdfbLM(settings.m2957xa1c62269(), settings.m2956xdd22025(), animationState.getProgress())), -1.0f, null);
                point4 = point3;
            } else {
                point2 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * settings.m2956xdd22025()), -1.0f, null);
                point4 = point2;
            }
        } else if (animationType2 instanceof AnimationType.MoveIn) {
            if (animationState.isAnimating()) {
                point4 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * Dp2.m8007lerpMdfbLM(settings.m26178getBottomPillOffsetu2uoSUM(((AnimationType.MoveIn) animationType2).isInSplitState()), C2002Dp.m7995constructorimpl(0), animationState.getProgress())), MathHelpers.lerp(-1.0f, 0.0f, animationState.getProgress()), null);
            }
        } else if (!(animationType2 instanceof AnimationType.MoveOut)) {
            if (animationType2 instanceof AnimationType.DragDeleteInProgress) {
                point2 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * settings.m2957xa1c62269()), -1.0f, null);
            } else {
                if (animationType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                point2 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * settings.m26178getBottomPillOffsetu2uoSUM(currentPillStackState.getSelectedIndex() != null)), -1.0f, null);
            }
            point4 = point2;
        } else if (!animationState.isAnimating()) {
            point3 = new Point(C2002Dp.m7995constructorimpl(settings.getDirectionMultiplier() * settings.m26178getBottomPillOffsetu2uoSUM(false)), -1.0f, null);
            point4 = point3;
        }
        this.bottomPillPos = point4;
        this.topLabel = (!animationState.isAnimating() || pillStackState == null) ? currentPillStackState.getFirstLabel() : pillStackState.getFirstLabel();
        this.topPillStyle = (!animationState.isAnimating() || pillStackState == null) ? currentPillStackState.getFirstStyle() : pillStackState.getFirstStyle();
        this.bottomLabel = (!animationState.isAnimating() || pillStackState == null) ? currentPillStackState.getSecondLabel() : pillStackState.getSecondLabel();
        this.bottomPillStyle = (!animationState.isAnimating() || pillStackState == null) ? currentPillStackState.getSecondStyle() : pillStackState.getSecondStyle();
        if (animationState.isAnimating()) {
            jM6733lerpjxsXWHM = Color2.m6733lerpjxsXWHM(settings.m26179getTopPillColor0d7_KjU$lib_trade_ladder_externalDebug(), settings.m26177getBottomPillColor0d7_KjU$lib_trade_ladder_externalDebug(), Math.abs(point != null ? point.getZ() : 0.0f));
        } else {
            jM6733lerpjxsXWHM = settings.m26179getTopPillColor0d7_KjU$lib_trade_ladder_externalDebug();
        }
        this.topPillColor = jM6733lerpjxsXWHM;
        if (animationState.isAnimating()) {
            jM6733lerpjxsXWHM2 = Color2.m6733lerpjxsXWHM(settings.m26177getBottomPillColor0d7_KjU$lib_trade_ladder_externalDebug(), settings.m26179getTopPillColor0d7_KjU$lib_trade_ladder_externalDebug(), Math.abs(1 + (point4 != null ? point4.getZ() : -1.0f)));
        } else {
            jM6733lerpjxsXWHM2 = settings.m26177getBottomPillColor0d7_KjU$lib_trade_ladder_externalDebug();
        }
        this.bottomPillColor = jM6733lerpjxsXWHM2;
        boolean isFirstOrderPlaceholder = !animationState.isAnimating() ? currentPillStackState.getIsFirstOrderPlaceholder() : pillStackState != null ? pillStackState.getIsFirstOrderPlaceholder() : false;
        this.showLoadingShimmerForTop = isFirstOrderPlaceholder;
        boolean isSecondOrderPlaceholder = !animationState.isAnimating() ? currentPillStackState.getIsSecondOrderPlaceholder() : pillStackState != null ? pillStackState.getIsSecondOrderPlaceholder() : false;
        this.showLoadingShimmerForBottom = isSecondOrderPlaceholder;
        if (!isFirstOrderPlaceholder && !isSecondOrderPlaceholder) {
            z = true;
        }
        this.isLadderClickable = z;
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$AnimationState;", "", "isAnimating", "", "progress", "", "animationType", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/AnimationType;", "<init>", "(ZFLcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/AnimationType;)V", "()Z", "getProgress", "()F", "getAnimationType", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/AnimationType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AnimationState {
        public static final int $stable = 0;
        private final AnimationType animationType;
        private final boolean isAnimating;
        private final float progress;

        public static /* synthetic */ AnimationState copy$default(AnimationState animationState, boolean z, float f, AnimationType animationType, int i, Object obj) {
            if ((i & 1) != 0) {
                z = animationState.isAnimating;
            }
            if ((i & 2) != 0) {
                f = animationState.progress;
            }
            if ((i & 4) != 0) {
                animationType = animationState.animationType;
            }
            return animationState.copy(z, f, animationType);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAnimating() {
            return this.isAnimating;
        }

        /* renamed from: component2, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        /* renamed from: component3, reason: from getter */
        public final AnimationType getAnimationType() {
            return this.animationType;
        }

        public final AnimationState copy(boolean isAnimating, float progress, AnimationType animationType) {
            return new AnimationState(isAnimating, progress, animationType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimationState)) {
                return false;
            }
            AnimationState animationState = (AnimationState) other;
            return this.isAnimating == animationState.isAnimating && Float.compare(this.progress, animationState.progress) == 0 && Intrinsics.areEqual(this.animationType, animationState.animationType);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isAnimating) * 31) + Float.hashCode(this.progress)) * 31;
            AnimationType animationType = this.animationType;
            return iHashCode + (animationType == null ? 0 : animationType.hashCode());
        }

        public String toString() {
            return "AnimationState(isAnimating=" + this.isAnimating + ", progress=" + this.progress + ", animationType=" + this.animationType + ")";
        }

        public AnimationState(boolean z, float f, AnimationType animationType) {
            this.isAnimating = z;
            this.progress = f;
            this.animationType = animationType;
        }

        public final boolean isAnimating() {
            return this.isAnimating;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final AnimationType getAnimationType() {
            return this.animationType;
        }
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÀ\u0003¢\u0006\u0004\b#\u0010\rJ\u0010\u0010$\u001a\u00020\u0003HÀ\u0003¢\u0006\u0004\b%\u0010\rJ\u0010\u0010&\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b'\u0010\u0011J\u0010\u0010(\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b)\u0010\u0011J\u000e\u0010*\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b+JB\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u001bHÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$Settings;", "", "topPillColor", "Landroidx/compose/ui/graphics/Color;", "bottomPillColor", "splitStateBottomPillMaxOffset", "Landroidx/compose/ui/unit/Dp;", "groupedStateBottomPillMaxOffset", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "<init>", "(JJFFLcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTopPillColor-0d7_KjU$lib_trade_ladder_externalDebug", "()J", "J", "getBottomPillColor-0d7_KjU$lib_trade_ladder_externalDebug", "getSplitStateBottomPillMaxOffset-D9Ej5fM$lib_trade_ladder_externalDebug", "()F", "F", "getGroupedStateBottomPillMaxOffset-D9Ej5fM$lib_trade_ladder_externalDebug", "getSide$lib_trade_ladder_externalDebug", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "isStart", "", "isStart$lib_trade_ladder_externalDebug", "()Z", "directionMultiplier", "", "getDirectionMultiplier", "()I", "getBottomPillOffset", "isSplit", "getBottomPillOffset-u2uoSUM", "(Z)F", "component1", "component1-0d7_KjU$lib_trade_ladder_externalDebug", "component2", "component2-0d7_KjU$lib_trade_ladder_externalDebug", "component3", "component3-D9Ej5fM$lib_trade_ladder_externalDebug", "component4", "component4-D9Ej5fM$lib_trade_ladder_externalDebug", "component5", "component5$lib_trade_ladder_externalDebug", "copy", "copy-EE86baY", "(JJFFLcom/robinhood/shared/tradeladder/ui/ladder/models/Side;)Lcom/robinhood/shared/tradeladder/ui/ladder/shared/pill/PillStackMovementData$Settings;", "equals", "other", "hashCode", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Settings {
        public static final int $stable = 0;
        private final long bottomPillColor;
        private final int directionMultiplier;
        private final float groupedStateBottomPillMaxOffset;
        private final boolean isStart;
        private final Side side;
        private final float splitStateBottomPillMaxOffset;
        private final long topPillColor;

        public /* synthetic */ Settings(long j, long j2, float f, float f2, Side side, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, f, f2, side);
        }

        /* renamed from: copy-EE86baY$default, reason: not valid java name */
        public static /* synthetic */ Settings m26171copyEE86baY$default(Settings settings, long j, long j2, float f, float f2, Side side, int i, Object obj) {
            if ((i & 1) != 0) {
                j = settings.topPillColor;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = settings.bottomPillColor;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                f = settings.splitStateBottomPillMaxOffset;
            }
            float f3 = f;
            if ((i & 8) != 0) {
                f2 = settings.groupedStateBottomPillMaxOffset;
            }
            float f4 = f2;
            if ((i & 16) != 0) {
                side = settings.side;
            }
            return settings.m26176copyEE86baY(j3, j4, f3, f4, side);
        }

        /* renamed from: component1-0d7_KjU$lib_trade_ladder_externalDebug, reason: not valid java name and from getter */
        public final long getTopPillColor() {
            return this.topPillColor;
        }

        /* renamed from: component2-0d7_KjU$lib_trade_ladder_externalDebug, reason: not valid java name and from getter */
        public final long getBottomPillColor() {
            return this.bottomPillColor;
        }

        /* renamed from: component3-D9Ej5fM$lib_trade_ladder_externalDebug, reason: not valid java name and from getter */
        public final float getSplitStateBottomPillMaxOffset() {
            return this.splitStateBottomPillMaxOffset;
        }

        /* renamed from: component4-D9Ej5fM$lib_trade_ladder_externalDebug, reason: not valid java name and from getter */
        public final float getGroupedStateBottomPillMaxOffset() {
            return this.groupedStateBottomPillMaxOffset;
        }

        /* renamed from: component5$lib_trade_ladder_externalDebug, reason: from getter */
        public final Side getSide() {
            return this.side;
        }

        /* renamed from: copy-EE86baY, reason: not valid java name */
        public final Settings m26176copyEE86baY(long topPillColor, long bottomPillColor, float splitStateBottomPillMaxOffset, float groupedStateBottomPillMaxOffset, Side side) {
            Intrinsics.checkNotNullParameter(side, "side");
            return new Settings(topPillColor, bottomPillColor, splitStateBottomPillMaxOffset, groupedStateBottomPillMaxOffset, side, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return Color.m6707equalsimpl0(this.topPillColor, settings.topPillColor) && Color.m6707equalsimpl0(this.bottomPillColor, settings.bottomPillColor) && C2002Dp.m7997equalsimpl0(this.splitStateBottomPillMaxOffset, settings.splitStateBottomPillMaxOffset) && C2002Dp.m7997equalsimpl0(this.groupedStateBottomPillMaxOffset, settings.groupedStateBottomPillMaxOffset) && this.side == settings.side;
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.topPillColor) * 31) + Color.m6713hashCodeimpl(this.bottomPillColor)) * 31) + C2002Dp.m7998hashCodeimpl(this.splitStateBottomPillMaxOffset)) * 31) + C2002Dp.m7998hashCodeimpl(this.groupedStateBottomPillMaxOffset)) * 31) + this.side.hashCode();
        }

        public String toString() {
            return "Settings(topPillColor=" + Color.m6714toStringimpl(this.topPillColor) + ", bottomPillColor=" + Color.m6714toStringimpl(this.bottomPillColor) + ", splitStateBottomPillMaxOffset=" + C2002Dp.m7999toStringimpl(this.splitStateBottomPillMaxOffset) + ", groupedStateBottomPillMaxOffset=" + C2002Dp.m7999toStringimpl(this.groupedStateBottomPillMaxOffset) + ", side=" + this.side + ")";
        }

        private Settings(long j, long j2, float f, float f2, Side side) {
            Intrinsics.checkNotNullParameter(side, "side");
            this.topPillColor = j;
            this.bottomPillColor = j2;
            this.splitStateBottomPillMaxOffset = f;
            this.groupedStateBottomPillMaxOffset = f2;
            this.side = side;
            boolean z = side == Side.START;
            this.isStart = z;
            this.directionMultiplier = z ? 1 : -1;
        }

        /* renamed from: getTopPillColor-0d7_KjU$lib_trade_ladder_externalDebug, reason: not valid java name */
        public final long m26179getTopPillColor0d7_KjU$lib_trade_ladder_externalDebug() {
            return this.topPillColor;
        }

        /* renamed from: getBottomPillColor-0d7_KjU$lib_trade_ladder_externalDebug, reason: not valid java name */
        public final long m26177getBottomPillColor0d7_KjU$lib_trade_ladder_externalDebug() {
            return this.bottomPillColor;
        }

        /* renamed from: getSplitStateBottomPillMaxOffset-D9Ej5fM$lib_trade_ladder_externalDebug */
        public final float m2957xa1c62269() {
            return this.splitStateBottomPillMaxOffset;
        }

        /* renamed from: getGroupedStateBottomPillMaxOffset-D9Ej5fM$lib_trade_ladder_externalDebug */
        public final float m2956xdd22025() {
            return this.groupedStateBottomPillMaxOffset;
        }

        public final Side getSide$lib_trade_ladder_externalDebug() {
            return this.side;
        }

        /* renamed from: isStart$lib_trade_ladder_externalDebug, reason: from getter */
        public final boolean getIsStart() {
            return this.isStart;
        }

        public final int getDirectionMultiplier() {
            return this.directionMultiplier;
        }

        /* renamed from: getBottomPillOffset-u2uoSUM, reason: not valid java name */
        public final float m26178getBottomPillOffsetu2uoSUM(boolean isSplit) {
            if (isSplit) {
                return this.splitStateBottomPillMaxOffset;
            }
            return this.groupedStateBottomPillMaxOffset;
        }
    }

    public final Side getSide() {
        return this.side;
    }

    public final Point getTopPillPos() {
        return this.topPillPos;
    }

    public final Point getBottomPillPos() {
        return this.bottomPillPos;
    }

    public final StringResource getTopLabel() {
        return this.topLabel;
    }

    public final PillStyle.PillVisualState getTopPillStyle() {
        return this.topPillStyle;
    }

    public final StringResource getBottomLabel() {
        return this.bottomLabel;
    }

    public final PillStyle.PillVisualState getBottomPillStyle() {
        return this.bottomPillStyle;
    }

    /* renamed from: getTopPillColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTopPillColor() {
        return this.topPillColor;
    }

    /* renamed from: getBottomPillColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBottomPillColor() {
        return this.bottomPillColor;
    }

    public final boolean getShowLoadingShimmerForTop() {
        return this.showLoadingShimmerForTop;
    }

    public final boolean getShowLoadingShimmerForBottom() {
        return this.showLoadingShimmerForBottom;
    }

    /* renamed from: isLadderClickable, reason: from getter */
    public final boolean getIsLadderClickable() {
        return this.isLadderClickable;
    }
}
