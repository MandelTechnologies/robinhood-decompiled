package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.util.Money;
import com.robinhood.shared.trading.tradecomponentscompose.input.AccountBuyingPowerDisplay2;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeAmountBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TradeAmountBottomSheet {
    public static final TradeAmountBottomSheet INSTANCE = new TradeAmountBottomSheet();

    /* renamed from: lambda$-1402042555, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8696lambda$1402042555 = ComposableLambda3.composableLambdaInstance(-1402042555, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt$lambda$-1402042555$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1402042555, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt.lambda$-1402042555.<anonymous> (TradeAmountBottomSheet.kt:128)");
            }
            Currency currency = Currencies.USD;
            BigDecimal TEN = BigDecimal.TEN;
            Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
            AccountBuyingPowerDisplay2.AccountBuyingPowerDisplay("Individual", new Money(currency, TEN), null, composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1221851012, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8695lambda$1221851012 = ComposableLambda3.composableLambdaInstance(-1221851012, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt$lambda$-1221851012$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1221851012, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt.lambda$-1221851012.<anonymous> (TradeAmountBottomSheet.kt:141)");
            }
            Currency currency = Currencies.USD;
            BigDecimal TEN = BigDecimal.TEN;
            Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
            AccountBuyingPowerDisplay2.AccountBuyingPowerDisplay("Individual", new Money(currency, TEN), null, composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1616254851, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8697lambda$1616254851 = ComposableLambda3.composableLambdaInstance(-1616254851, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt$lambda$-1616254851$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1616254851, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.tradeamount.ComposableSingletons$TradeAmountBottomSheetKt.lambda$-1616254851.<anonymous> (TradeAmountBottomSheet.kt:154)");
            }
            Currency currency = Currencies.USD;
            BigDecimal TEN = BigDecimal.TEN;
            Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
            Money money = new Money(currency, TEN);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            AccountBuyingPowerDisplay2.ShortingAccountBuyingPowerDisplay("Individual", money, new Money(currency, ONE), null, composer, 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$710893894 = ComposableLambda3.composableLambdaInstance(710893894, false, TradeAmountBottomSheet5.INSTANCE);

    /* renamed from: getLambda$-1221851012$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1771xb290bc39() {
        return f8695lambda$1221851012;
    }

    /* renamed from: getLambda$-1402042555$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1772x735a216a() {
        return f8696lambda$1402042555;
    }

    /* renamed from: getLambda$-1616254851$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1773x1be66e9() {
        return f8697lambda$1616254851;
    }

    /* renamed from: getLambda$710893894$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1774x294ac3cc() {
        return lambda$710893894;
    }
}
