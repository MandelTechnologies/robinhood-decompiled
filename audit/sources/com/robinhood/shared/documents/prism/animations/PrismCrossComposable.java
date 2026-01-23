package com.robinhood.shared.documents.prism.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Canvas2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PrismCrossComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"PrismCrossComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CrossStrokeRatio", "", "feature-prism_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.documents.prism.animations.PrismCrossComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PrismCrossComposable {
    private static final float CrossStrokeRatio = 0.06666667f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrismCrossComposable$lambda$8(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PrismCrossComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PrismCrossComposable(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-645507637);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-645507637, i3, -1, "com.robinhood.shared.documents.prism.animations.PrismCrossComposable (PrismCrossComposable.kt:20)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final long joule = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJoule();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PrismCrossComposable2(animatable, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(joule);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.documents.prism.animations.PrismCrossComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PrismCrossComposable.PrismCrossComposable$lambda$7$lambda$6(animatable, joule, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifier, (Function1) objRememberedValue3, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.documents.prism.animations.PrismCrossComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrismCrossComposable.PrismCrossComposable$lambda$8(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrismCrossComposable$lambda$7$lambda$6(Animatable animatable, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        Path Path = AndroidPath_androidKt.Path();
        float f = fIntBitsToFloat * 0.2f;
        float f2 = 0.2f * fIntBitsToFloat2;
        Path.moveTo(f, f2);
        float f3 = fIntBitsToFloat * 0.8f;
        float f4 = fIntBitsToFloat2 * 0.8f;
        Path.lineTo(f3, f4);
        Path Path2 = AndroidPath_androidKt.Path();
        Path2.moveTo(f, f4);
        Path2.lineTo(f3, f2);
        float fCoerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue() * 2.0f, 0.0f, 1.0f);
        float fCoerceIn2 = RangesKt.coerceIn((((Number) animatable.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f, 1.0f);
        PathMeasure PathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        PathMeasure.setPath(Path, false);
        float length = PathMeasure.getLength();
        Path Path3 = AndroidPath_androidKt.Path();
        PathMeasure.getSegment(0.0f, length * fCoerceIn, Path3, true);
        PathMeasure PathMeasure2 = AndroidPathMeasure_androidKt.PathMeasure();
        PathMeasure2.setPath(Path2, false);
        float length2 = PathMeasure2.getLength();
        Path Path4 = AndroidPath_androidKt.Path();
        PathMeasure2.getSegment(0.0f, length2 * fCoerceIn2, Path4, true);
        Stroke stroke = new Stroke(fIntBitsToFloat * CrossStrokeRatio, 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), null, 18, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path3, j, 0.0f, stroke, null, 0, 52, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path4, j, 0.0f, stroke, null, 0, 52, null);
        return Unit.INSTANCE;
    }
}
