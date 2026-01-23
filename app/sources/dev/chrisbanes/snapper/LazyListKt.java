package dev.chrisbanes.snapper;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyList.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¿\u0001\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102<\u0010\u0015\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\t0\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aa\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u000028\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/Function2;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "Lkotlin/ParameterName;", "name", "layoutInfo", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "snapOffsetForItem", "Landroidx/compose/ui/unit/Dp;", "endContentPadding", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "springAnimationSpec", "Lkotlin/Function3;", "startIndex", "targetIndex", "snapIndex", "Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "rememberSnapperFlingBehavior-osbwsH8", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/SnapperFlingBehavior;", "rememberSnapperFlingBehavior", "Ldev/chrisbanes/snapper/LazyListSnapperLayoutInfo;", "rememberLazyListSnapperLayoutInfo-6a0pyJM", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;II)Ldev/chrisbanes/snapper/LazyListSnapperLayoutInfo;", "rememberLazyListSnapperLayoutInfo", "lib_release"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class LazyListKt {
    /* renamed from: rememberSnapperFlingBehavior-osbwsH8, reason: not valid java name */
    public static final SnapperFlingBehavior m27966rememberSnapperFlingBehaviorosbwsH8(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> snapIndex, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-632875458);
        if ((i2 & 2) != 0) {
            function2 = SnapOffsets.INSTANCE.getCenter();
        }
        Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function22 = function2;
        if ((i2 & 4) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i2 & 16) != 0) {
            animationSpec = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        SnapperFlingBehavior snapperFlingBehaviorRememberSnapperFlingBehavior = SnapperFlingBehaviorKt.rememberSnapperFlingBehavior(m27965rememberLazyListSnapperLayoutInfo6a0pyJM(lazyListState, function22, f2, composer, i & 1022, 0), decayAnimationSpec, animationSpec, snapIndex, composer, ((i >> 6) & 7168) | 576, 0);
        composer.endReplaceableGroup();
        return snapperFlingBehaviorRememberSnapperFlingBehavior;
    }

    /* renamed from: rememberLazyListSnapperLayoutInfo-6a0pyJM, reason: not valid java name */
    public static final LazyListSnapperLayoutInfo m27965rememberLazyListSnapperLayoutInfo6a0pyJM(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function2, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-1050829263);
        if ((i2 & 2) != 0) {
            function2 = SnapOffsets.INSTANCE.getCenter();
        }
        Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> function22 = function2;
        if ((i2 & 4) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(lazyListState) | composer.changed(function22);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo = new LazyListSnapperLayoutInfo(lazyListState, function22, 0, 4, null);
            composer.updateRememberedValue(lazyListSnapperLayoutInfo);
            objRememberedValue = lazyListSnapperLayoutInfo;
        }
        composer.endReplaceableGroup();
        LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo2 = (LazyListSnapperLayoutInfo) objRememberedValue;
        lazyListSnapperLayoutInfo2.setEndContentPadding$lib_release(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5010roundToPx0680j_4(f));
        composer.endReplaceableGroup();
        return lazyListSnapperLayoutInfo2;
    }
}
