package com.robinhood.android.dashboard.lib.buyingpower;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioBuyingPower.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PortfolioBuyingPower6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Integer $buyingPowerSubtitleId;
    final /* synthetic */ SnapshotState<Offset> $subtitlePositionInWindow$delegate;

    PortfolioBuyingPower6(Integer num, SnapshotState<Offset> snapshotState) {
        this.$buyingPowerSubtitleId = num;
        this.$subtitlePositionInWindow$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2;
        TextStyle style;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1247007795, i, -1, "com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower.<anonymous>.<anonymous> (PortfolioBuyingPower.kt:205)");
        }
        Integer num = this.$buyingPowerSubtitleId;
        if (num != null) {
            String strStringResource = StringResources_androidKt.stringResource(num.intValue(), composer, 0);
            long jM21256getGoldDepositMaxAwareness0d7_KjU = BentoColor.INSTANCE.m21256getGoldDepositMaxAwareness0d7_KjU();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer2 = composer;
                composer2.startReplaceGroup(-1857332359);
                style = ((Styles) composer2.consume(Styles2.getLocalStyles())).getText(composer2, 0).getStyle();
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1857551436);
                composer2 = composer;
                style = TextStyle.m7654copyNs73l9s$default(bentoTheme.getTypography(composer, i2).getTextS(), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, PortfolioBuyingPower5.PortfolioBuyingPower$lambda$6(this.$subtitlePositionInWindow$delegate), null, composer2, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                composer2.endReplaceGroup();
            }
            TextStyle textStyle = style;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceGroup(5004770);
            final SnapshotState<Offset> snapshotState = this.$subtitlePositionInWindow$delegate;
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerKt$PortfolioBuyingPower$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioBuyingPower6.invoke$lambda$1$lambda$0(snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strStringResource, OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue), Color.m6701boximpl(jM21256getGoldDepositMaxAwareness0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textStyle, composer, 24624, 0, 8168);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        PortfolioBuyingPower5.PortfolioBuyingPower$lambda$7(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }
}
