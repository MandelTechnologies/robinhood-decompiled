package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: OptionsSimulatedReturnChartAxis.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxisKt$OptionsSimulatedReturnChartAxis$overlays$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSimulatedReturnChartAxis3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ float $alpha;
    final /* synthetic */ SnapshotStateMap<String, Rect> $bounds;
    final /* synthetic */ OptionsSimulatedReturnChartAxisLabel $label;
    final /* synthetic */ boolean $usePreTradeStyle;

    OptionsSimulatedReturnChartAxis3(OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel, float f, boolean z, SnapshotStateMap<String, Rect> snapshotStateMap) {
        this.$label = optionsSimulatedReturnChartAxisLabel;
        this.$alpha = f;
        this.$usePreTradeStyle = z;
        this.$bounds = snapshotStateMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TextStyle textStyleM7655copyp1EtxEg$default;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1364990884, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxis.<anonymous>.<anonymous> (OptionsSimulatedReturnChartAxis.kt:56)");
        }
        String text = this.$label.getText();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$label);
        final SnapshotStateMap<String, Rect> snapshotStateMap = this.$bounds;
        final OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel = this.$label;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxisKt$OptionsSimulatedReturnChartAxis$overlays$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSimulatedReturnChartAxis3.invoke$lambda$1$lambda$0(snapshotStateMap, optionsSimulatedReturnChartAxisLabel, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue);
        Color colorM6701boximpl = Color.m6701boximpl(Color.m6705copywmQWz5c$default(this.$label.m16939getTextColor0d7_KjU(), this.$alpha * Color.m6708getAlphaimpl(this.$label.m16939getTextColor0d7_KjU()), 0.0f, 0.0f, 0.0f, 14, null));
        FontWeight fontWeight = this.$label.getFontWeight();
        if (this.$usePreTradeStyle || StringsKt.contains$default((CharSequence) this.$label.getText(), '\n', false, 2, (Object) null)) {
            composer.startReplaceGroup(-306499933);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, bentoTheme.getTypography(composer, i2).getTextS().m7662getFontSizeXSAIIZE(), null, null, null, 0, 0, null, 16646143, null);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-306373608);
            textStyleM7655copyp1EtxEg$default = ((Styles) composer.consume(Styles2.getLocalStyles())).getText(composer, 0).getStyle();
            composer.endReplaceGroup();
        }
        BentoText2.m20747BentoText38GnDrw(text, modifierOnGloballyPositioned, colorM6701boximpl, null, fontWeight, null, null, 0, false, Integer.MAX_VALUE, 0, null, 0, textStyleM7655copyp1EtxEg$default, composer, 805306368, 0, 7656);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotStateMap snapshotStateMap, OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotStateMap.put(optionsSimulatedReturnChartAxisLabel.getText(), LayoutCoordinates2.boundsInWindow(it));
        return Unit.INSTANCE;
    }
}
