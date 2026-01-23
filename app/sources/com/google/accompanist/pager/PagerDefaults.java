package com.google.accompanist.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import dev.chrisbanes.snapper.LazyListKt;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;
import dev.chrisbanes.snapper.SnapperLayoutInfo;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Pager.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0082\u0001\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2<\u0010\u0014\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001fRV\u0010!\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m3636d2 = {"Lcom/google/accompanist/pager/PagerDefaults;", "", "<init>", "()V", "Lcom/google/accompanist/pager/PagerState;", "state", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Dp;", "endContentPadding", "Lkotlin/Function3;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior-hGBTI10", "(Lcom/google/accompanist/pager/PagerState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "flingBehavior--jt2gSs", "(Lcom/google/accompanist/pager/PagerState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "Lkotlin/Function1;", "singlePageFlingDistance", "Lkotlin/jvm/functions/Function1;", "getSinglePageFlingDistance", "()Lkotlin/jvm/functions/Function1;", "getSinglePageFlingDistance$annotations", "singlePageSnapIndex", "Lkotlin/jvm/functions/Function3;", "getSinglePageSnapIndex", "()Lkotlin/jvm/functions/Function3;", "getSinglePageSnapIndex$annotations", "pager_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PagerDefaults {
    public static final PagerDefaults INSTANCE = new PagerDefaults();
    private static final Function1<SnapperLayoutInfo, Float> singlePageFlingDistance = new Function1<SnapperLayoutInfo, Float>() { // from class: com.google.accompanist.pager.PagerDefaults$singlePageFlingDistance$1
        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(SnapperLayoutInfo layoutInfo) {
            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
            return Float.valueOf(layoutInfo.getEndScrollOffset() - layoutInfo.getStartScrollOffset());
        }
    };
    private static final Function3<SnapperLayoutInfo, Integer, Integer, Integer> singlePageSnapIndex = new Function3<SnapperLayoutInfo, Integer, Integer, Integer>() { // from class: com.google.accompanist.pager.PagerDefaults$singlePageSnapIndex$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(SnapperLayoutInfo snapperLayoutInfo, Integer num, Integer num2) {
            return invoke(snapperLayoutInfo, num.intValue(), num2.intValue());
        }

        public final Integer invoke(SnapperLayoutInfo layoutInfo, int i, int i2) {
            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
            return Integer.valueOf(RangesKt.coerceIn(RangesKt.coerceIn(i2, i - 1, i + 1), 0, layoutInfo.getTotalItemsCount() - 1));
        }
    };

    private PagerDefaults() {
    }

    @Deprecated
    /* renamed from: flingBehavior-hGBTI10, reason: not valid java name */
    public final FlingBehavior m9198flingBehaviorhGBTI10(PagerState state, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, float f, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> snapIndex, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-776119664);
        if ((i2 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i2 & 4) != 0) {
            animationSpec = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i2 & 8) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        float f2 = f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776119664, i, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:181)");
        }
        SnapperFlingBehavior snapperFlingBehaviorM27966rememberSnapperFlingBehaviorosbwsH8 = LazyListKt.m27966rememberSnapperFlingBehaviorosbwsH8(state.getLazyListState(), SnapOffsets.INSTANCE.getStart(), f2, decayAnimationSpec, animationSpec2, snapIndex, composer, ((i >> 3) & 896) | 36864 | (458752 & (i << 3)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapperFlingBehaviorM27966rememberSnapperFlingBehaviorosbwsH8;
    }

    @Deprecated
    /* renamed from: flingBehavior--jt2gSs, reason: not valid java name */
    public final FlingBehavior m9197flingBehaviorjt2gSs(PagerState state, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(132228799);
        DecayAnimationSpec<Float> decayAnimationSpecRememberSplineBasedDecay = (i2 & 2) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> springAnimationSpec = (i2 & 4) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec() : animationSpec;
        float fM7995constructorimpl = (i2 & 8) != 0 ? C2002Dp.m7995constructorimpl(0) : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(132228799, i, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:220)");
        }
        FlingBehavior flingBehaviorM9198flingBehaviorhGBTI10 = m9198flingBehaviorhGBTI10(state, decayAnimationSpecRememberSplineBasedDecay, springAnimationSpec, fM7995constructorimpl, singlePageSnapIndex, composer, (i & 14) | 576 | (i & 7168) | ((i << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flingBehaviorM9198flingBehaviorhGBTI10;
    }
}
