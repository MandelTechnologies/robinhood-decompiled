package com.robinhood.android.futures.sharedfuturesui;

import androidx.compose.animation.SingleValueAnimation;
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
/* loaded from: classes3.dex */
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
        Composer composer2;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(667272690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(667272690, i, -1, "com.robinhood.android.futures.sharedfuturesui.scrim.<anonymous> (Modifiers.kt:28)");
        }
        if (this.$enabled) {
            Color color = this.$color;
            composer.startReplaceGroup(1298932002);
            long jM6705copywmQWz5c$default = color == null ? Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : color.getValue();
            composer.endReplaceGroup();
            composer2 = composer;
            final SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM6705copywmQWz5c$default, null, "ScrimColorAnimation", null, composer2, 384, 10);
            composer2.startReplaceGroup(5004770);
            boolean zChanged = composer2.changed(snapshotState4M4805animateColorAsStateeuL9pac);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.sharedfuturesui.ModifiersKt$scrim$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt$scrim$1.invoke$lambda$3$lambda$2(snapshotState4M4805animateColorAsStateeuL9pac, (ContentDrawScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            composed = ModifiersKt.blockAllChildTouchEvents$default(DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue), false, this.$onClick, 1, null);
        } else {
            composer2 = composer;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return composed;
    }

    private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState4 snapshotState4, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        Canvas canvas = drawWithContent.getDrawContext().getCanvas();
        canvas.saveLayer(Rect2.m6565Recttz77jQw(Offset.INSTANCE.m6553getZeroF1C5BW0(), drawWithContent.mo6963getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
        drawWithContent.drawContent();
        DrawScope.m6958drawRectnJ9OG0$default(drawWithContent, invoke$lambda$0(snapshotState4), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        canvas.restore();
        return Unit.INSTANCE;
    }
}
