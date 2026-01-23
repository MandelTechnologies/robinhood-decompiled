package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderRowPriceText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class LadderRowPriceTextKt$LadderRowPriceText$5 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
    final /* synthetic */ boolean $bold;
    final /* synthetic */ SnapshotState<String> $displayText$delegate;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $rotation;

    LadderRowPriceTextKt$LadderRowPriceText$5(boolean z, Animatable<Float, AnimationVectors2> animatable, boolean z2, SnapshotState<String> snapshotState) {
        this.$bold = z;
        this.$rotation = animatable;
        this.$isVisible = z2;
        this.$displayText$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
        invoke(boxWithConstraints4, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2019054271, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceText.<anonymous> (LadderRowPriceText.kt:117)");
        }
        TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composer, 0, 1);
        TextStyle textM = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
        if (this.$bold) {
            textM = TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        }
        TextStyle textStyle = textM;
        float fM26211measureMaxWidthInDpuDkuXs = LadderRowPriceTextKt.m26211measureMaxWidthInDpuDkuXs(textMeasurerRememberTextMeasurer, LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$2(this.$displayText$delegate), textStyle, BoxWithConstraints.getConstraints(), composer, 0);
        if (this.$rotation.getValue().floatValue() < 90.0f) {
            composer.startReplaceGroup(1371601050);
            BentoText2.m20747BentoText38GnDrw(this.$isVisible ? LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$2(this.$displayText$delegate) : "", SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, fM26211measureMaxWidthInDpuDkuXs), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composer, 0, 0, 8124);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1371870998);
            String strLadderRowPriceText_mxsUjTo$lambda$2 = this.$isVisible ? LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$2(this.$displayText$delegate) : "";
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, fM26211measureMaxWidthInDpuDkuXs);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$LadderRowPriceText$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LadderRowPriceTextKt$LadderRowPriceText$5.invoke$lambda$2$lambda$1((GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strLadderRowPriceText_mxsUjTo$lambda$2, GraphicsLayerModifier6.graphicsLayer(modifierM5174width3ABfNKs, (Function1) objRememberedValue), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textStyle, composer, 0, 0, 8124);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(180.0f);
        return Unit.INSTANCE;
    }
}
