package com.robinhood.android.feature.margin.hub.sdui;

import android.os.Parcelable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.MarginBufferBarLarge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiMarginBufferBarLarge.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS", "", "MARGIN_BUFFER_BAR_LARGE_ANIMATION_DELAY_MILLIS", "marginBufferBarLargeEasing", "Landroidx/compose/animation/core/Easing;", "getMarginBufferBarLargeEasing", "()Landroidx/compose/animation/core/Easing;", "marginBufferBarLargeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getMarginBufferBarLargeAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "SduiMarginBufferBarLarge", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarginBufferBarLarge;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/MarginBufferBarLarge;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-margin-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLargeKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SduiMarginBufferBarLarge {
    public static final int MARGIN_BUFFER_BAR_LARGE_ANIMATION_DELAY_MILLIS = 1000;
    public static final int MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS = 650;
    private static final AnimationSpec<Float> marginBufferBarLargeAnimationSpec;
    private static final Easing marginBufferBarLargeEasing;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarginBufferBarLarge$lambda$4(MarginBufferBarLarge marginBufferBarLarge, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiMarginBufferBarLarge(marginBufferBarLarge, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.45f, 1.45f, 0.8f, 1.0f);
        marginBufferBarLargeEasing = cubicBezierEasing;
        marginBufferBarLargeAnimationSpec = AnimationSpecKt.tween(MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS, 1000, cubicBezierEasing);
    }

    public static final Easing getMarginBufferBarLargeEasing() {
        return marginBufferBarLargeEasing;
    }

    public static final AnimationSpec<Float> getMarginBufferBarLargeAnimationSpec() {
        return marginBufferBarLargeAnimationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiMarginBufferBarLarge(final MarginBufferBarLarge<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        float fill_percentage;
        Object objRememberedValue;
        Composer.Companion companion;
        final Animatable animatable;
        final long jM21371getBg0d7_KjU;
        long jM21456getPositive0d7_KjU;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        int i4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(2139928665);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2139928665, i3, -1, "com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLarge (SduiMarginBufferBarLarge.kt:46)");
                }
                fill_percentage = component.getFill_percentage();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                Color composeColor = SduiColors2.toComposeColor(component.getTint_color(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-817876196);
                jM21456getPositive0d7_KjU = composeColor != null ? bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fill_percentage);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SduiMarginBufferBarLarge2(animatable, fill_percentage, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(64)), jM21371getBg0d7_KjU, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(jM21456getPositive0d7_KjU) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    final long j = jM21456getPositive0d7_KjU;
                    i4 = 0;
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLargeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiMarginBufferBarLarge.SduiMarginBufferBarLarge$lambda$3$lambda$2(animatable, j, jM21371getBg0d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i4 = 0;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue3, composerStartRestartGroup, i4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLargeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiMarginBufferBarLarge.SduiMarginBufferBarLarge$lambda$4(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fill_percentage = component.getFill_percentage();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU();
            Color composeColor2 = SduiColors2.toComposeColor(component.getTint_color(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-817876196);
            if (composeColor2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fill_percentage);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new SduiMarginBufferBarLarge2(animatable, fill_percentage, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(64)), jM21371getBg0d7_KjU, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(jM21456getPositive0d7_KjU) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    final long j2 = jM21456getPositive0d7_KjU;
                    i4 = 0;
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLargeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiMarginBufferBarLarge.SduiMarginBufferBarLarge$lambda$3$lambda$2(animatable, j2, jM21371getBg0d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    Canvas2.Canvas(modifierM4872backgroundbw27NRU$default2, (Function1) objRememberedValue3, composerStartRestartGroup, i4);
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
    public static final Unit SduiMarginBufferBarLarge$lambda$3$lambda$2(Animatable animatable, long j, long j2, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float f = 2;
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f));
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1));
        float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4));
        float fFloatValue = fIntBitsToFloat * ((Number) animatable.getValue()).floatValue();
        float fMo5016toPx0680j_44 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f));
        int i = (int) (fIntBitsToFloat / fMo5016toPx0680j_43);
        int i2 = 0;
        while (i2 < i) {
            int i3 = 0;
            for (int i4 = (int) (fIntBitsToFloat2 / fMo5016toPx0680j_43); i3 < i4; i4 = i4) {
                DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, fMo5016toPx0680j_42, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4 + (i3 * fMo5016toPx0680j_43)) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_4 + (i2 * fMo5016toPx0680j_43)) << 32)), 0.0f, null, null, 0, 120, null);
                i3++;
                Canvas = drawScope;
                f = f;
                i = i;
                i2 = i2;
            }
            i2++;
            Canvas = drawScope;
        }
        float f2 = fIntBitsToFloat - fFloatValue;
        DrawScope.m6958drawRectnJ9OG0$default(drawScope, j2, Offset.m6535constructorimpl((Float.floatToRawIntBits(RangesKt.coerceAtLeast(f2 - (fMo5016toPx0680j_44 / f), 0.0f)) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_44) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m6958drawRectnJ9OG0$default(drawScope, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }
}
