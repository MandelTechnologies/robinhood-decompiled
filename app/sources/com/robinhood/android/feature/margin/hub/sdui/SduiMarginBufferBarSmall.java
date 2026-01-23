package com.robinhood.android.feature.margin.hub.sdui;

import android.os.Parcelable;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.MarginBufferBarSmall;
import com.robinhood.models.serverdriven.experimental.api.MarginBufferPercentage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiMarginBufferBarSmall.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiMarginBufferBarSmall", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarginBufferBarSmall;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/MarginBufferBarSmall;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-margin-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarSmallKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SduiMarginBufferBarSmall {

    /* compiled from: SduiMarginBufferBarSmall.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarSmallKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarginBufferPercentage.values().length];
            try {
                iArr[MarginBufferPercentage.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginBufferPercentage.HALF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarginBufferPercentage.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarginBufferBarSmall$lambda$2(MarginBufferBarSmall marginBufferBarSmall, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiMarginBufferBarSmall(marginBufferBarSmall, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @SduiComposable
    public static final <ActionT extends Parcelable> void SduiMarginBufferBarSmall(final MarginBufferBarSmall<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final float f;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1466536845);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466536845, i3, -1, "com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarSmall (SduiMarginBufferBarSmall.kt:29)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[component.getMargin_buffer_percentage().ordinal()];
            if (i5 == 1) {
                f = 1.0f;
            } else if (i5 == 2) {
                f = 0.5f;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.0f;
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
            Color composeColor = SduiColors2.toComposeColor(component.getTint_color(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(592649424);
            final long jM21456getPositive0d7_KjU = composeColor == null ? bentoTheme.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU() : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5169size3ABfNKs(modifier, C2002Dp.m7995constructorimpl(14)), jM21371getBg0d7_KjU, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(f) | composerStartRestartGroup.changed(jM21456getPositive0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarSmallKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiMarginBufferBarSmall.SduiMarginBufferBarSmall$lambda$1$lambda$0(f, jM21456getPositive0d7_KjU, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarSmallKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiMarginBufferBarSmall.SduiMarginBufferBarSmall$lambda$2(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarginBufferBarSmall$lambda$1$lambda$0(float f, long j, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float f2 = 1;
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f2));
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f2));
        int i = 4;
        float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(4));
        float f3 = fIntBitsToFloat * f;
        int i2 = 0;
        while (i2 < i) {
            int i3 = 0;
            while (i3 < i) {
                DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, fMo5016toPx0680j_42, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4 + (i3 * fMo5016toPx0680j_43)) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_4 + (i2 * fMo5016toPx0680j_43)) << 32)), 0.0f, null, null, 0, 120, null);
                i3++;
                Canvas = drawScope;
                i2 = i2;
                i = i;
            }
            i2++;
            Canvas = drawScope;
        }
        DrawScope.m6958drawRectnJ9OG0$default(drawScope, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat - f3) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }
}
