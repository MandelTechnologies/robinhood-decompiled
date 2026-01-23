package com.robinhood.shared.crypto.p375ui.modifiers;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
final class ModifiersKt$scrim$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Color $color;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0<Unit> $onClick;

    ModifiersKt$scrim$1(boolean z, Color color, Function0<Unit> function0) {
        this.$enabled = z;
        this.$color = color;
        this.$onClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        float fM6708getAlphaimpl;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1898294672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1898294672, i, -1, "com.robinhood.shared.crypto.ui.modifiers.scrim.<anonymous> (Modifiers.kt:30)");
        }
        if (this.$enabled) {
            Color color = this.$color;
            fM6708getAlphaimpl = color != null ? Color.m6708getAlphaimpl(color.getValue()) : 0.8f;
        } else {
            fM6708getAlphaimpl = 0.0f;
        }
        SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(fM6708getAlphaimpl, AnimationSpecKt.tween$default(200, 0, Easing3.getLinearEasing(), 2, null), 0.0f, "ScrimColorAnimation", null, composer, 3072, 20);
        Color color2 = this.$color;
        composer.startReplaceGroup(-1099909875);
        long jM21371getBg0d7_KjU = color2 == null ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU() : color2.getValue();
        composer.endReplaceGroup();
        final long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(jM21371getBg0d7_KjU, invoke$lambda$0(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 14, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(jM6705copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.modifiers.ModifiersKt$scrim$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModifiersKt$scrim$1.invoke$lambda$3$lambda$2(jM6705copywmQWz5c$default, (ContentDrawScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierBlockAllChildTouchEvents = ModifiersKt.blockAllChildTouchEvents(DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue), this.$enabled, this.$onClick);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierBlockAllChildTouchEvents;
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(long j, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        Canvas canvas = drawWithContent.getDrawContext().getCanvas();
        canvas.saveLayer(Rect2.m6565Recttz77jQw(Offset.INSTANCE.m6553getZeroF1C5BW0(), drawWithContent.mo6963getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
        drawWithContent.drawContent();
        DrawScope.m6958drawRectnJ9OG0$default(drawWithContent, j, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        canvas.restore();
        return Unit.INSTANCE;
    }
}
