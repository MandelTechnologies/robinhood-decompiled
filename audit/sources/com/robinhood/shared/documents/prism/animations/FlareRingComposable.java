package com.robinhood.shared.documents.prism.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.Canvas2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FlareRingComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\r\u001a\u00020\fX\u008a\u0084\u0002"}, m3636d2 = {"FlareRingComposable", "", "visible", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getDynamicRingPath", "Landroidx/compose/ui/graphics/Path;", "center", "Landroidx/compose/ui/geometry/Offset;", "canvasSize", "", "time", "", "phaseOffset", "getDynamicRingPath-M_7yMNQ", "(JFDD)Landroidx/compose/ui/graphics/Path;", "FlareRingBaseRatio", "WiggleRatio", "WiggleFrequency", "WiggleSpeed", "FlareCount", "", "FlareAngularWidth", "FlareSpeed", "FlareAmplitudeRatio", "RingLayerCount", "RingLayerPhaseOffset", "PointCount", "GlowWidthRatios", "", "GlowOpacities", "feature-prism_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.prism.animations.FlareRingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class FlareRingComposable {
    private static final double FlareAngularWidth = 1.0d;
    private static final int FlareCount = 3;
    public static final float FlareRingBaseRatio = 0.45f;
    private static final double FlareSpeed = 1.5d;
    private static final int PointCount = 180;
    private static final int RingLayerCount = 4;
    private static final double RingLayerPhaseOffset = 0.5235987755982988d;
    private static final double WiggleFrequency = 2.0d;
    private static final float WiggleRatio = 0.08f;
    private static final double WiggleSpeed = 0.8d;
    private static final List<Float> GlowWidthRatios = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.1f), Float.valueOf(0.0f), Float.valueOf(0.02f), Float.valueOf(0.005f)});
    private static final float FlareAmplitudeRatio = 0.2f;
    private static final List<Float> GlowOpacities = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.08f), Float.valueOf(FlareAmplitudeRatio), Float.valueOf(0.5f), Float.valueOf(1.0f)});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlareRingComposable$lambda$7(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FlareRingComposable(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlareRingComposable(final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        final SnapshotState4<Float> snapshotState4AnimateFloat;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        final long sol;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-541714645);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-541714645, i4, -1, "com.robinhood.shared.documents.prism.animations.FlareRingComposable (FlareRingComposable.kt:34)");
                }
                snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("flareRing", composerStartRestartGroup, 6, 0), 0.0f, 60.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(60000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "time", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                sol = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getSol();
                Boolean boolValueOf = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i4 & 14;
                zChangedInstance = (i6 != 4) | composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FlareRingComposable2(z, animatable, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i6);
                Modifier modifierAlpha = Alpha.alpha(modifier3, ((Number) animatable.getValue()).floatValue());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloat) | composerStartRestartGroup.changed(sol);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.documents.prism.animations.FlareRingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FlareRingComposable.FlareRingComposable$lambda$6$lambda$5(sol, snapshotState4AnimateFloat, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierAlpha, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.documents.prism.animations.FlareRingComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FlareRingComposable.FlareRingComposable$lambda$7(z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition("flareRing", composerStartRestartGroup, 6, 0), 0.0f, 60.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(60000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "time", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            sol = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getSol();
            Boolean boolValueOf2 = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i62 = i4 & 14;
            zChangedInstance = (i62 != 4) | composerStartRestartGroup.changedInstance(animatable);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new FlareRingComposable2(z, animatable, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i62);
                Modifier modifierAlpha2 = Alpha.alpha(modifier3, ((Number) animatable.getValue()).floatValue());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloat) | composerStartRestartGroup.changed(sol);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.documents.prism.animations.FlareRingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FlareRingComposable.FlareRingComposable$lambda$6$lambda$5(sol, snapshotState4AnimateFloat, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    Canvas2.Canvas(modifierAlpha2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlareRingComposable$lambda$6$lambda$5(long j, SnapshotState4 snapshotState4, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fMin = Math.min(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / 2.0f;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float f = fMin * 0.45f;
        float f2 = f * FlareAmplitudeRatio;
        int i = 0;
        while (i < 4) {
            Path pathM25322getDynamicRingPathM_7yMNQ = m25322getDynamicRingPathM_7yMNQ(jM6535constructorimpl, fMin, FlareRingComposable$lambda$0(snapshotState4), i * RingLayerPhaseOffset);
            float f3 = fMin;
            Brush brushM6680radialGradientP_VxKs$default = Brush.Companion.m6680radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), jM6535constructorimpl, f + (f2 * 2.0f), 0, 8, (Object) null);
            int i2 = 0;
            for (Object obj : GlowWidthRatios) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i4 = i;
                Path path = pathM25322getDynamicRingPathM_7yMNQ;
                Brush brush = brushM6680radialGradientP_VxKs$default;
                DrawScope.m6954drawPathGBMwjPU$default(Canvas, path, brush, GlowOpacities.get(i2).floatValue(), new Stroke(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * ((Number) obj).floatValue(), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), null, 18, null), null, 0, 48, null);
                Canvas = drawScope;
                brushM6680radialGradientP_VxKs$default = brush;
                i2 = i3;
                pathM25322getDynamicRingPathM_7yMNQ = path;
                i = i4;
            }
            i++;
            Canvas = drawScope;
            fMin = f3;
        }
        return Unit.INSTANCE;
    }

    private static final float FlareRingComposable$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* renamed from: getDynamicRingPath-M_7yMNQ, reason: not valid java name */
    private static final Path m25322getDynamicRingPathM_7yMNQ(long j, float f, double d, double d2) {
        int i;
        int i2;
        Path Path = AndroidPath_androidKt.Path();
        float f2 = 0.45f * f;
        float f3 = 0.08f * f2;
        float f4 = FlareAmplitudeRatio * f2;
        int i3 = 0;
        while (i3 < 180) {
            double d3 = 3.141592653589793d;
            double d4 = (i3 / 180.0d) * WiggleFrequency * 3.141592653589793d;
            double dSin = Math.sin((d4 * WiggleFrequency) + (WiggleSpeed * d) + d2) * f3;
            double dCos = 0.0d;
            int i4 = 0;
            while (i4 < 3) {
                double d5 = FlareSpeed * d;
                double d6 = d3;
                double dAbs = Math.abs(d4 - ((((i4 * 6.283185307179586d) / 3.0d) + d5) + d2)) % 6.283185307179586d;
                if (dAbs > d6) {
                    dAbs = 6.283185307179586d - dAbs;
                }
                if (dAbs < 1.0d) {
                    i = i4;
                    i2 = i3;
                    dCos += Math.cos(((dAbs / 1.0d) * d6) / WiggleFrequency) * f4 * Math.sin(d5);
                } else {
                    i = i4;
                    i2 = i3;
                }
                i4 = i + 1;
                d3 = d6;
                i3 = i2;
            }
            int i5 = i3;
            double d7 = f2 + dSin + dCos;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((float) (Math.cos(d4) * d7));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((float) (Math.sin(d4) * d7));
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
            if (i5 == 0) {
                Path.moveTo(Float.intBitsToFloat((int) (jM6535constructorimpl >> 32)), Float.intBitsToFloat((int) (jM6535constructorimpl & 4294967295L)));
            } else {
                Path.lineTo(Float.intBitsToFloat((int) (jM6535constructorimpl >> 32)), Float.intBitsToFloat((int) (jM6535constructorimpl & 4294967295L)));
            }
            i3 = i5 + 1;
        }
        Path.close();
        return Path;
    }
}
