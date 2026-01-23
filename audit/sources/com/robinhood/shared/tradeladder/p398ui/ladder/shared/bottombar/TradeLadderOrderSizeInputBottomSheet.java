package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.OrderSizeInputBottomSheetState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.ComposableSingletons$TradeLadderOrderSizeInputBottomSheetKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeLadderOrderSizeInputBottomSheet {
    public static final TradeLadderOrderSizeInputBottomSheet INSTANCE = new TradeLadderOrderSizeInputBottomSheet();
    private static Function4<AnimatedContentScope, OrderSizeInputBottomSheetState.SubtitleContent, Composer, Integer, Unit> lambda$2098765913 = ComposableLambda3.composableLambdaInstance(2098765913, false, new Function4<AnimatedContentScope, OrderSizeInputBottomSheetState.SubtitleContent, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.ComposableSingletons$TradeLadderOrderSizeInputBottomSheetKt$lambda$2098765913$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, OrderSizeInputBottomSheetState.SubtitleContent subtitleContent, Composer composer, Integer num) {
            invoke(animatedContentScope, subtitleContent, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, OrderSizeInputBottomSheetState.SubtitleContent subtitleContent, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2098765913, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.ComposableSingletons$TradeLadderOrderSizeInputBottomSheetKt.lambda$2098765913.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:148)");
            }
            if (subtitleContent instanceof OrderSizeInputBottomSheetState.SubtitleContent.StandardText) {
                composer.startReplaceGroup(-1798434632);
                String text = ((OrderSizeInputBottomSheetState.SubtitleContent.StandardText) subtitleContent).getText();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
                composer.endReplaceGroup();
            } else if (subtitleContent instanceof OrderSizeInputBottomSheetState.SubtitleContent.ErrorText) {
                composer.startReplaceGroup(-1798113379);
                String text2 = ((OrderSizeInputBottomSheetState.SubtitleContent.ErrorText) subtitleContent).getText();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                long jM21452getNegative0d7_KjU = bentoTheme2.getColors(composer, i3).m21452getNegative0d7_KjU();
                TextStyle textS = bentoTheme2.getTypography(composer, i3).getTextS();
                BentoText2.m20747BentoText38GnDrw(text2, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8170);
                composer.endReplaceGroup();
            } else {
                if (subtitleContent != null) {
                    composer.startReplaceGroup(-1720584851);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1797797706);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<AnimatedContentScope, OrderSizeInputBottomSheetState.SubtitleContent, Composer, Integer, Unit> getLambda$2098765913$lib_trade_ladder_externalDebug() {
        return lambda$2098765913;
    }
}
