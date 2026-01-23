package com.robinhood.android.advisory.dashboard.overview;

import android.graphics.BlurMaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GlowingGradientBorderButton.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a@\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "GlowingGradientBorderButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "rotateAngle", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.GlowingGradientBorderButtonKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GlowingGradientBorderButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlowingGradientBorderButton$lambda$14(Function0 function0, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        GlowingGradientBorderButton(function0, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GlowingGradientBorderButton(final Function0<Unit> onClick, Modifier modifier, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final SnapshotState4<Float> snapshotState4AnimateFloat;
        final long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1181573033);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1181573033, i3, -1, "com.robinhood.android.advisory.dashboard.overview.GlowingGradientBorderButton (GlowingGradientBorderButton.kt:33)");
                }
                snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composerStartRestartGroup = composerStartRestartGroup;
                jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloat) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.GlowingGradientBorderButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GlowingGradientBorderButton.GlowingGradientBorderButton$lambda$13$lambda$12(snapshotState4AnimateFloat, jM21371getBg0d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = modifier4.then(DrawModifierKt.drawBehind(companion, (Function1) objRememberedValue));
                Modifier modifier5 = modifier4;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                Color.Companion companion2 = Color.INSTANCE;
                float f = 8;
                ButtonKt.Button(onClick, modifierThen, false, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)), buttonDefaults.m5719buttonColorsro_MJ88(companion2.m6725getTransparent0d7_KjU(), companion2.m6725getTransparent0d7_KjU(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, null, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(f)), null, content, composerStartRestartGroup, (i3 & 14) | 12582912 | ((i3 << 21) & 1879048192), 356);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.GlowingGradientBorderButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GlowingGradientBorderButton.GlowingGradientBorderButton$lambda$14(onClick, modifier3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            composerStartRestartGroup = composerStartRestartGroup;
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(snapshotState4AnimateFloat) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.GlowingGradientBorderButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlowingGradientBorderButton.GlowingGradientBorderButton$lambda$13$lambda$12(snapshotState4AnimateFloat, jM21371getBg0d7_KjU, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = modifier4.then(DrawModifierKt.drawBehind(companion3, (Function1) objRememberedValue));
                Modifier modifier52 = modifier4;
                ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                Color.Companion companion22 = Color.INSTANCE;
                float f2 = 8;
                ButtonKt.Button(onClick, modifierThen2, false, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2)), buttonDefaults2.m5719buttonColorsro_MJ88(companion22.m6725getTransparent0d7_KjU(), companion22.m6725getTransparent0d7_KjU(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, null, PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(f2)), null, content, composerStartRestartGroup, (i3 & 14) | 12582912 | ((i3 << 21) & 1879048192), 356);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float GlowingGradientBorderButton$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlowingGradientBorderButton$lambda$13$lambda$12(SnapshotState4 snapshotState4, long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
        float fMo5016toPx0680j_42 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(10));
        long jMo6962getCenterF1C5BW0 = drawBehind.mo6962getCenterF1C5BW0();
        float fMo5016toPx0680j_43 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(8));
        float f = 2.5f * fMo5016toPx0680j_4;
        RectF rectF = new RectF(f, f, Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) - f, Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) - f);
        long jColor = Color2.Color(4291624704L);
        long jColor2 = Color2.Color(4281611069L);
        float[] fArr = {0.0f, 0.25f, 0.4f, 0.6f, 0.75f, 1.0f};
        Canvas canvas = drawBehind.getDrawContext().getCanvas();
        int i = (int) (jMo6962getCenterF1C5BW0 >> 32);
        int i2 = (int) (jMo6962getCenterF1C5BW0 & 4294967295L);
        SweepGradient sweepGradient = new SweepGradient(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), new int[]{Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(jColor2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(jColor2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(jColor, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(jColor, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(jColor2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(jColor2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}, fArr);
        Matrix matrix = new Matrix();
        matrix.setRotate(GlowingGradientBorderButton$lambda$0(snapshotState4), Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        sweepGradient.setLocalMatrix(matrix);
        Paint Paint = AndroidPaint_androidKt.Paint();
        android.graphics.Paint internalPaint = Paint.getInternalPaint();
        internalPaint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        internalPaint.setStyle(style);
        internalPaint.setStrokeWidth(fMo5016toPx0680j_4);
        internalPaint.setShader(sweepGradient);
        internalPaint.setMaskFilter(new BlurMaskFilter(fMo5016toPx0680j_42, BlurMaskFilter.Blur.OUTER));
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint.getInternalPaint());
        Canvas canvas2 = drawBehind.getDrawContext().getCanvas();
        SweepGradient sweepGradient2 = new SweepGradient(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), new int[]{Color2.m6735toArgb8_81llA(jColor2), Color2.m6735toArgb8_81llA(jColor2), Color2.m6735toArgb8_81llA(jColor), Color2.m6735toArgb8_81llA(jColor), Color2.m6735toArgb8_81llA(jColor2), Color2.m6735toArgb8_81llA(jColor2)}, fArr);
        Matrix matrix2 = new Matrix();
        matrix2.setRotate(GlowingGradientBorderButton$lambda$0(snapshotState4), Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        sweepGradient2.setLocalMatrix(matrix2);
        androidx.compose.p011ui.graphics.Paint Paint2 = AndroidPaint_androidKt.Paint();
        android.graphics.Paint internalPaint2 = Paint2.getInternalPaint();
        internalPaint2.setAntiAlias(true);
        internalPaint2.setStyle(style);
        internalPaint2.setStrokeWidth(fMo5016toPx0680j_4);
        internalPaint2.setShader(sweepGradient2);
        AndroidCanvas_androidKt.getNativeCanvas(canvas2).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint2.getInternalPaint());
        Canvas canvas3 = drawBehind.getDrawContext().getCanvas();
        androidx.compose.p011ui.graphics.Paint Paint3 = AndroidPaint_androidKt.Paint();
        android.graphics.Paint internalPaint3 = Paint3.getInternalPaint();
        internalPaint3.setAntiAlias(true);
        internalPaint3.setStyle(Paint.Style.FILL);
        internalPaint3.setColor(Color2.m6735toArgb8_81llA(j));
        AndroidCanvas_androidKt.getNativeCanvas(canvas3).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint3.getInternalPaint());
        return Unit.INSTANCE;
    }
}
