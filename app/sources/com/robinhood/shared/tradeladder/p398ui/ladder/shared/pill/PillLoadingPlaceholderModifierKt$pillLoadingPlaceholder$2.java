package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Outline2;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.PathMeasures2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ float $alpha;
    final /* synthetic */ int $animationDurationMills;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ Brush $borderBrush;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ Shape $shape;

    PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2(int i, float f, Shape shape, float f2, Brush brush, long j) {
        this.$animationDurationMills = i;
        this.$borderWidth = f;
        this.$shape = shape;
        this.$alpha = f2;
        this.$borderBrush = brush;
        this.$backgroundColor = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(2125881966);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2125881966, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.pillLoadingPlaceholder.<anonymous> (PillLoadingPlaceholderModifier.kt:78)");
        }
        final SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("infinitePillLoadingTransition", composer, 6, 0), 1.0f, 0.0f, new InfiniteRepeatableSpec(AnimationSpecKt.tween$default(this.$animationDurationMills, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composer, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$borderWidth) | composer.changed(this.$shape) | composer.changed(this.$alpha) | composer.changed(snapshotState4AnimateFloat) | composer.changed(this.$borderBrush) | composer.changed(this.$backgroundColor);
        final float f = this.$borderWidth;
        final Shape shape = this.$shape;
        final float f2 = this.$alpha;
        final long j = this.$backgroundColor;
        final Brush brush = this.$borderBrush;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2.invoke$lambda$5$lambda$4(f, shape, f2, j, snapshotState4AnimateFloat, brush, (CacheDrawScope) obj2);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        composer.endReplaceGroup();
        Modifier modifierDrawWithCache = DrawModifierKt.drawWithCache(composed, (Function1) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawWithCache;
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult invoke$lambda$5$lambda$4(float f, Shape shape, final float f2, final long j, final SnapshotState4 snapshotState4, final Brush brush, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float fMo5016toPx0680j_4 = drawWithCache.mo5016toPx0680j_4(f);
        float f3 = 2;
        final float f4 = fMo5016toPx0680j_4 / f3;
        final float fM6582getMinDimensionimpl = Size.m6582getMinDimensionimpl(drawWithCache.m6459getSizeNHjbRc()) - (f3 * fMo5016toPx0680j_4);
        final Stroke stroke = new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() >> 32)) - fMo5016toPx0680j_4;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithCache.m6459getSizeNHjbRc() & 4294967295L)) - fMo5016toPx0680j_4;
        final Outline outlineMo4911createOutlinePq9zytI = shape.mo4911createOutlinePq9zytI(Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), drawWithCache.getLayoutDirection(), drawWithCache);
        final PathMeasure pathMeasure = PathMeasures2.toPathMeasure(outlineMo4911createOutlinePq9zytI);
        final float fM6582getMinDimensionimpl2 = Size.m6582getMinDimensionimpl(drawWithCache.m6459getSizeNHjbRc()) * 0.8f;
        final float fM6582getMinDimensionimpl3 = Size.m6582getMinDimensionimpl(drawWithCache.m6459getSizeNHjbRc());
        return drawWithCache.onDrawBehind(new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PillLoadingPlaceholderModifierKt$pillLoadingPlaceholder$2.invoke$lambda$5$lambda$4$lambda$3(f2, fM6582getMinDimensionimpl2, fM6582getMinDimensionimpl3, pathMeasure, f4, j, fM6582getMinDimensionimpl, snapshotState4, outlineMo4911createOutlinePq9zytI, brush, stroke, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(float f, float f2, float f3, PathMeasure pathMeasure, float f4, long j, float f5, SnapshotState4 snapshotState4, Outline outline, Brush brush, Stroke stroke, DrawScope onDrawBehind) {
        float fInvoke$lambda$0;
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        if (f == 0.0f) {
            return Unit.INSTANCE;
        }
        if (invoke$lambda$0(snapshotState4) < 0.5f) {
            fInvoke$lambda$0 = invoke$lambda$0(snapshotState4);
        } else {
            fInvoke$lambda$0 = 1 - invoke$lambda$0(snapshotState4);
        }
        float f6 = f2 + (f3 * fInvoke$lambda$0);
        long offsetAtCurrentProgress = PathMeasures2.getOffsetAtCurrentProgress(pathMeasure, invoke$lambda$0(snapshotState4));
        if ((9223372034707292159L & offsetAtCurrentProgress) == 9205357640488583168L) {
            offsetAtCurrentProgress = Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        long j2 = offsetAtCurrentProgress;
        onDrawBehind.getDrawContext().getTransform().translate(f4, f4);
        try {
            Outline2.m6797drawOutlinehn5TExg$default(onDrawBehind, outline, brush, f, stroke, null, 0, 48, null);
            float f7 = -f4;
            onDrawBehind.getDrawContext().getTransform().translate(f7, f7);
            DrawScope.m6946drawCircleV9BoPsw$default(onDrawBehind, PillLoadingPlaceholderModifierKt.m26164dotRadialGradientqcb84PM(j, j2, f6), f5, j2, 0.0f, null, null, BlendMode.INSTANCE.m6667getSrcAtop0nO6VwU(), 56, null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            float f8 = -f4;
            onDrawBehind.getDrawContext().getTransform().translate(f8, f8);
            throw th;
        }
    }
}
