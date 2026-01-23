package com.robinhood.android.charts.util;

import android.graphics.BlurMaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.p011ui.ComposedModifier2;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.charts.util.GlowingGradientBorder;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GlowingGradientBorder.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\t\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m3636d2 = {"glowingGradientBorder", "Landroidx/compose/ui/Modifier;", "enabled", "", "maxRotations", "", "(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;)Landroidx/compose/ui/Modifier;", "lib-charts_externalDebug", "finiteAnimationComplete", "finiteAnimationStarted", "finiteFillAnimationAlpha", "rotateAngle", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.util.GlowingGradientBorderKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GlowingGradientBorder {
    public static /* synthetic */ Modifier glowingGradientBorder$default(Modifier modifier, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return glowingGradientBorder(modifier, z, num);
    }

    /* compiled from: GlowingGradientBorder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.util.GlowingGradientBorderKt$glowingGradientBorder$1 */
    static final class C110401 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Integer $maxRotations;

        C110401(boolean z, Integer num) {
            this.$enabled = z;
            this.$maxRotations = num;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            SnapshotState4<Integer> snapshotState4;
            SnapshotState4<Float> snapshotState4AnimateFloat;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-1283290612);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1283290612, i, -1, "com.robinhood.android.charts.util.glowingGradientBorder.<anonymous> (GlowingGradientBorder.kt:34)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$enabled);
            boolean z = this.$enabled;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransition4.rememberInfiniteTransition(null, composer, 0, 1);
            SnapshotState4<Integer> snapshotState4AnimateIntAsState = AnimateAsState.animateIntAsState(!invoke$lambda$1(snapshotState) ? 0 : 255, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composer, 48, 12);
            if (this.$maxRotations != null) {
                composer.startReplaceGroup(-1006290207);
                float f = !invoke$lambda$4(snapshotState2) ? 0.0f : 360.0f;
                RepeatableSpec repeatableSpecM4817repeatable91I0pcU$default = AnimationSpecKt.m4817repeatable91I0pcU$default(this.$maxRotations.intValue(), AnimationSpecKt.tween$default(4000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 8, null);
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(snapshotState);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.util.GlowingGradientBorderKt$glowingGradientBorder$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GlowingGradientBorder.C110401.invoke$lambda$8$lambda$7(snapshotState, ((Float) obj).floatValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                snapshotState4AnimateFloat = AnimateAsState.animateFloatAsState(f, repeatableSpecM4817repeatable91I0pcU$default, 0.0f, null, (Function1) objRememberedValue3, composer, 0, 12);
                composer.endReplaceGroup();
                snapshotState4 = snapshotState4AnimateIntAsState;
            } else {
                composer.startReplaceGroup(-1005854967);
                snapshotState4 = snapshotState4AnimateIntAsState;
                snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 360.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composer, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                composer.endReplaceGroup();
            }
            Integer num = this.$maxRotations;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer.changed(this.$maxRotations);
            Integer num2 = this.$maxRotations;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new GlowingGradientBorder2(num2, snapshotState2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            final long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            final long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU();
            composer.startReplaceGroup(-1224400529);
            boolean zChanged4 = composer.changed(jM6705copywmQWz5c$default) | composer.changed(jM21368getAccent0d7_KjU) | composer.changed(snapshotState) | composer.changed(snapshotState4AnimateFloat) | composer.changed(snapshotState4) | composer.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                final SnapshotState4<Float> snapshotState42 = snapshotState4AnimateFloat;
                final SnapshotState4<Integer> snapshotState43 = snapshotState4;
                Object obj = new Function1() { // from class: com.robinhood.android.charts.util.GlowingGradientBorderKt$glowingGradientBorder$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GlowingGradientBorder.C110401.invoke$lambda$27$lambda$26(jM6705copywmQWz5c$default, jM21368getAccent0d7_KjU, snapshotState, snapshotState42, snapshotState43, jM21371getBg0d7_KjU, (DrawScope) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue5 = obj;
            }
            composer.endReplaceGroup();
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(composed, (Function1) objRememberedValue5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierDrawBehind;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(SnapshotState snapshotState, float f) {
            invoke$lambda$2(snapshotState, true);
            return Unit.INSTANCE;
        }

        private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$4(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        private static final int invoke$lambda$6(SnapshotState4<Integer> snapshotState4) {
            return snapshotState4.getValue().intValue();
        }

        private static final float invoke$lambda$9(SnapshotState4<Float> snapshotState4) {
            return snapshotState4.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$27$lambda$26(long j, long j2, SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, long j3, DrawScope drawBehind) {
            char c;
            long j4;
            boolean z;
            float[] fArr;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
            float fMo5016toPx0680j_42 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(10));
            long jMo6962getCenterF1C5BW0 = drawBehind.mo6962getCenterF1C5BW0();
            float fMo5016toPx0680j_43 = drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(8));
            int iM6735toArgb8_81llA = Color2.m6735toArgb8_81llA(j);
            int iM6735toArgb8_81llA2 = Color2.m6735toArgb8_81llA(j2);
            RectF rectF = new RectF(0.0f, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)));
            float[] fArr2 = {0.0f, 0.25f, 0.4f, 0.6f, 0.75f, 1.0f};
            if (invoke$lambda$1(snapshotState)) {
                c = ' ';
                j4 = 4294967295L;
                z = true;
            } else {
                Canvas canvas = drawBehind.getDrawContext().getCanvas();
                c = ' ';
                j4 = 4294967295L;
                int i = (int) (jMo6962getCenterF1C5BW0 >> 32);
                int i2 = (int) (jMo6962getCenterF1C5BW0 & 4294967295L);
                SweepGradient sweepGradient = new SweepGradient(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), new int[]{Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color2.m6735toArgb8_81llA(Color.m6705copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}, fArr2);
                Matrix matrix = new Matrix();
                matrix.setRotate(invoke$lambda$9(snapshotState4), Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                sweepGradient.setLocalMatrix(matrix);
                Paint Paint = AndroidPaint_androidKt.Paint();
                android.graphics.Paint internalPaint = Paint.getInternalPaint();
                z = true;
                internalPaint.setAntiAlias(true);
                internalPaint.setStyle(Paint.Style.STROKE);
                internalPaint.setStrokeWidth(fMo5016toPx0680j_4);
                internalPaint.setShader(sweepGradient);
                internalPaint.setMaskFilter(new BlurMaskFilter(fMo5016toPx0680j_42, BlurMaskFilter.Blur.OUTER));
                AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint.getInternalPaint());
            }
            if (invoke$lambda$1(snapshotState)) {
                Canvas canvas2 = drawBehind.getDrawContext().getCanvas();
                fArr = fArr2;
                int i3 = (int) (jMo6962getCenterF1C5BW0 >> c);
                int i4 = (int) (jMo6962getCenterF1C5BW0 & j4);
                SweepGradient sweepGradient2 = new SweepGradient(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), new int[]{iM6735toArgb8_81llA2, iM6735toArgb8_81llA2, iM6735toArgb8_81llA2, iM6735toArgb8_81llA2, iM6735toArgb8_81llA2, iM6735toArgb8_81llA2}, fArr);
                Matrix matrix2 = new Matrix();
                matrix2.setRotate(invoke$lambda$9(snapshotState4), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                sweepGradient2.setLocalMatrix(matrix2);
                androidx.compose.p011ui.graphics.Paint Paint2 = AndroidPaint_androidKt.Paint();
                android.graphics.Paint internalPaint2 = Paint2.getInternalPaint();
                internalPaint2.setAntiAlias(true);
                internalPaint2.setStyle(Paint.Style.STROKE);
                internalPaint2.setStrokeWidth(fMo5016toPx0680j_4);
                internalPaint2.setColor(iM6735toArgb8_81llA2);
                internalPaint2.setAlpha(invoke$lambda$6(snapshotState42));
                AndroidCanvas_androidKt.getNativeCanvas(canvas2).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint2.getInternalPaint());
            } else {
                fArr = fArr2;
            }
            if (invoke$lambda$6(snapshotState42) != 255) {
                Canvas canvas3 = drawBehind.getDrawContext().getCanvas();
                int i5 = (int) (jMo6962getCenterF1C5BW0 >> c);
                int i6 = (int) (jMo6962getCenterF1C5BW0 & j4);
                SweepGradient sweepGradient3 = new SweepGradient(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), new int[]{iM6735toArgb8_81llA, iM6735toArgb8_81llA, iM6735toArgb8_81llA2, iM6735toArgb8_81llA2, iM6735toArgb8_81llA, iM6735toArgb8_81llA}, fArr);
                Matrix matrix3 = new Matrix();
                matrix3.setRotate(invoke$lambda$9(snapshotState4), Float.intBitsToFloat(i5), Float.intBitsToFloat(i6));
                sweepGradient3.setLocalMatrix(matrix3);
                androidx.compose.p011ui.graphics.Paint Paint3 = AndroidPaint_androidKt.Paint();
                android.graphics.Paint internalPaint3 = Paint3.getInternalPaint();
                internalPaint3.setAntiAlias(true);
                internalPaint3.setStyle(Paint.Style.STROKE);
                internalPaint3.setStrokeWidth(fMo5016toPx0680j_4);
                internalPaint3.setShader(sweepGradient3);
                AndroidCanvas_androidKt.getNativeCanvas(canvas3).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint3.getInternalPaint());
            }
            Canvas canvas4 = drawBehind.getDrawContext().getCanvas();
            androidx.compose.p011ui.graphics.Paint Paint4 = AndroidPaint_androidKt.Paint();
            android.graphics.Paint internalPaint4 = Paint4.getInternalPaint();
            internalPaint4.setAntiAlias(true);
            internalPaint4.setStyle(Paint.Style.FILL);
            internalPaint4.setColor(Color2.m6735toArgb8_81llA(j3));
            AndroidCanvas_androidKt.getNativeCanvas(canvas4).drawRoundRect(rectF, fMo5016toPx0680j_43, fMo5016toPx0680j_43, Paint4.getInternalPaint());
            return Unit.INSTANCE;
        }
    }

    public static final Modifier glowingGradientBorder(Modifier modifier, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new C110401(z, num), 1, null);
    }
}
