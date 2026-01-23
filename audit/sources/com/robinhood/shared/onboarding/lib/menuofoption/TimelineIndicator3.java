package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TimelineIndicator.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"TimelineIndicator", "", "xOffset", "Landroidx/compose/ui/unit/Dp;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "dotFillColor", "modifier", "Landroidx/compose/ui/Modifier;", "TimelineIndicator-Sk5a5R4", "(FJJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TimelineIndicatorPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-menu-of-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicatorKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TimelineIndicator3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineIndicatorPreview$lambda$3(int i, Composer composer, int i2) {
        TimelineIndicatorPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineIndicator_Sk5a5R4$lambda$2(float f, long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25558TimelineIndicatorSk5a5R4(f, j, j2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: TimelineIndicator-Sk5a5R4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25558TimelineIndicatorSk5a5R4(final float f, final long j, final long j2, Modifier modifier, Composer composer, final int i, final int i2) {
        final float f2;
        int i3;
        final long j3;
        final long j4;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1468121858);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j4 = j2;
        } else {
            j4 = j2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468121858, i3, -1, "com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicator (TimelineIndicator.kt:22)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = ((i3 & 14) != 4) | ((i3 & 112) != 32) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicatorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TimelineIndicator3.TimelineIndicator_Sk5a5R4$lambda$1$lambda$0(j3, f2, j4, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierFillMaxWidth$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicatorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TimelineIndicator3.TimelineIndicator_Sk5a5R4$lambda$2(f, j, j2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 112) != 32) {
            }
            z = ((i3 & 14) != 4) | ((i3 & 112) != 32) | ((i3 & 896) == 256);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                Function1 function12 = new Function1() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TimelineIndicator3.TimelineIndicator_Sk5a5R4$lambda$1$lambda$0(j3, f2, j4, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierFillMaxWidth$default2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineIndicator_Sk5a5R4$lambda$1$lambda$0(long j, float f, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float f2 = 2;
        float f3 = fIntBitsToFloat / f2;
        DrawScope.m6950drawLine1RTmtNc$default(Canvas, Brush.Companion.m6677horizontalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf(0.9f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f2)), StrokeCap.INSTANCE.m6848getButtKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f);
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(10)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j2, Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(3)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    private static final void TimelineIndicatorPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-356248991);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-356248991, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicatorPreview (TimelineIndicator.kt:60)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, TimelineIndicator.INSTANCE.getLambda$438375961$lib_menu_of_options_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.TimelineIndicatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimelineIndicator3.TimelineIndicatorPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
