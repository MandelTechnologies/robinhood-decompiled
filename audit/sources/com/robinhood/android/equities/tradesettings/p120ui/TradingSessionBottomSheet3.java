package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equities.tradesettings.TradingSessionViewState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: TradingSessionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$1804804032$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TradingSessionBottomSheet3 implements Function2<Composer, Integer, Unit> {
    public static final TradingSessionBottomSheet3 INSTANCE = new TradingSessionBottomSheet3();

    TradingSessionBottomSheet3() {
    }

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
            ComposerKt.traceEventStart(1804804032, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt.lambda$1804804032.<anonymous> (TradingSessionBottomSheet.kt:148)");
        }
        OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new SelectionRowState(orderMarketHours, companion.invoke("Market Hours"), companion.invoke("From 6:30 AM to 1:00 PM"), false, 8, null), new SelectionRowState(OrderMarketHours.EXTENDED_HOURS, companion.invoke("Extended Hours"), companion.invoke("From 4:00 AM to 5:00 PM"), false, 8, null), new SelectionRowState(OrderMarketHours.ALL_DAY_HOURS, companion.invoke("24 Hour Market"), companion.invoke("From 5:00 PM to 5:00 PM"), false, 8, null));
        ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf("leftEdgeText");
        ImmutableList3 immutableList3PersistentListOf3 = extensions2.persistentListOf("rightEdgeText");
        ImmutableList3 immutableList3PersistentListOf4 = extensions2.persistentListOf("leftBoundaryText");
        ImmutableList3 immutableList3PersistentListOf5 = extensions2.persistentListOf("rightBoundaryText");
        Instant EPOCH = Instant.EPOCH;
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        Instant instantPlus = EPOCH.plus((TemporalAmount) Days.m3991of(1));
        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
        TradingSessionViewState tradingSessionViewState = new TradingSessionViewState(orderMarketHours, immutableList3PersistentListOf, new SetTradingHourVisualizerArgs(immutableList3PersistentListOf2, immutableList3PersistentListOf3, immutableList3PersistentListOf4, immutableList3PersistentListOf5, 5, EPOCH, instantPlus, null, new Function2<Composer, Integer, ImmutableList3<? extends Color>>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$1804804032$1.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ ImmutableList3<? extends Color> invoke(Composer composer2, Integer num) {
                return invoke(composer2, num.intValue());
            }

            public final ImmutableList3<Color> invoke(Composer composer2, int i2) {
                composer2.startReplaceGroup(-2102254142);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2102254142, i2, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt.lambda$1804804032.<anonymous>.<anonymous> (TradingSessionBottomSheet.kt:178)");
                }
                ImmutableList3<Color> immutableList3PersistentListOf6 = extensions2.persistentListOf();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return immutableList3PersistentListOf6;
            }
        }), true, true);
        TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.TRADE_FLOW;
        TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(EquityPositionType.LONG);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function3() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$1804804032$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TradingSessionBottomSheet3.invoke$lambda$1$lambda$0((TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderMarketHours) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function3 function3 = (Function3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionBottomSheetKt$lambda$1804804032$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        TradingSessionBottomSheet5.TradingSessionComposable(tradingSessionViewState, tradeSettingsStore4, equity, function3, (Function0) objRememberedValue2, null, composer, StringResource.$stable | SetTradingHourVisualizerArgs.$stable | 27696, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderMarketHours orderMarketHours) {
        Intrinsics.checkNotNullParameter(tradeSettingsStore4, "<unused var>");
        Intrinsics.checkNotNullParameter(tradeSettingsStore3, "<unused var>");
        Intrinsics.checkNotNullParameter(orderMarketHours, "<unused var>");
        return Unit.INSTANCE;
    }
}
