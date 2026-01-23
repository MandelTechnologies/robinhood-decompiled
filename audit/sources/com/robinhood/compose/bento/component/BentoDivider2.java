package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoDivider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoDividerKt$topHorizontalDivider$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoDivider2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $thickness;

    BentoDivider2(long j, float f) {
        this.$color = j;
        this.$thickness = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1904765002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1904765002, i, -1, "com.robinhood.compose.bento.component.topHorizontalDivider.<anonymous> (BentoDivider.kt:45)");
        }
        composer.startReplaceGroup(823099853);
        final long jM21425getFg0d7_KjU = this.$color;
        if (jM21425getFg0d7_KjU == 16) {
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, 6).m21425getFg0d7_KjU();
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$thickness) | composer.changed(jM21425getFg0d7_KjU);
        final float f = this.$thickness;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoDividerKt$topHorizontalDivider$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BentoDivider2.invoke$lambda$2$lambda$1(f, jM21425getFg0d7_KjU, (ContentDrawScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawWithContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(float f, long j, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        float fMo5016toPx0680j_4 = drawWithContent.mo5016toPx0680j_4(f);
        float f2 = 2;
        float fMo5016toPx0680j_42 = drawWithContent.mo5016toPx0680j_4(f) / f2;
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() >> 32));
        float fMo5016toPx0680j_43 = drawWithContent.mo5016toPx0680j_4(f) / f2;
        DrawScope.m6951drawLineNGM6Ib0$default(drawWithContent, j, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), fMo5016toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }
}
