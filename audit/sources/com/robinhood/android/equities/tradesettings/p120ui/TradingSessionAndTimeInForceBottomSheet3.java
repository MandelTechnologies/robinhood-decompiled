package com.robinhood.android.equities.tradesettings.p120ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceViewState;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
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

/* compiled from: TradingSessionAndTimeInForceBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-165702401$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TradingSessionAndTimeInForceBottomSheet3 implements Function2<Composer, Integer, Unit> {
    public static final TradingSessionAndTimeInForceBottomSheet3 INSTANCE = new TradingSessionAndTimeInForceBottomSheet3();

    TradingSessionAndTimeInForceBottomSheet3() {
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
            ComposerKt.traceEventStart(-165702401, i, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt.lambda$-165702401.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:286)");
        }
        OrderMarketHours orderMarketHours = OrderMarketHours.ALL_DAY_HOURS;
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
        OrderMarketHours orderMarketHours2 = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new SelectionRowState(orderMarketHours2, companion.invoke("trading session primary text"), companion.invoke("trading session secondary text"), false, 8, null), new SelectionRowState(orderMarketHours, companion.invoke("trading session primary text"), companion.invoke("trading session secondary text"), false, 8, null));
        ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(new SelectionRowState(OrderTimeInForce.GTC, companion.invoke("tif primary text"), companion.invoke("tif secondary text"), false, 8, null), new SelectionRowState(orderTimeInForce, companion.invoke("tif primary text"), companion.invoke("tif secondary text"), false, 8, null));
        ImmutableList3 immutableList3PersistentListOf3 = extensions2.persistentListOf("leftEdgeText");
        ImmutableList3 immutableList3PersistentListOf4 = extensions2.persistentListOf("rightEdgeText");
        ImmutableList3 immutableList3PersistentListOf5 = extensions2.persistentListOf("leftBoundaryText");
        ImmutableList3 immutableList3PersistentListOf6 = extensions2.persistentListOf("rightBoundaryText");
        Instant EPOCH = Instant.EPOCH;
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        Instant instantPlus = EPOCH.plus((TemporalAmount) Days.m3991of(1));
        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
        TradingSessionAndTimeInForceViewState.Loaded loaded = new TradingSessionAndTimeInForceViewState.Loaded(orderMarketHours, orderTimeInForce, immutableList3PersistentListOf, immutableList3PersistentListOf2, new SetTradingHourVisualizerArgs(immutableList3PersistentListOf3, immutableList3PersistentListOf4, immutableList3PersistentListOf5, immutableList3PersistentListOf6, 5, EPOCH, instantPlus, null, new Function2<Composer, Integer, ImmutableList3<? extends Color>>() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-165702401$1.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ ImmutableList3<? extends Color> invoke(Composer composer2, Integer num) {
                return invoke(composer2, num.intValue());
            }

            public final ImmutableList3<Color> invoke(Composer composer2, int i2) {
                composer2.startReplaceGroup(-758985475);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-758985475, i2, -1, "com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt.lambda$-165702401.<anonymous>.<anonymous> (TradingSessionAndTimeInForceBottomSheet.kt:324)");
                }
                ImmutableList3<Color> immutableList3PersistentListOf7 = extensions2.persistentListOf();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return immutableList3PersistentListOf7;
            }
        }));
        TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.TRADE_FLOW;
        TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(EquityPositionType.LONG);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function3() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-165702401$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TradingSessionAndTimeInForceBottomSheet3.invoke$lambda$1$lambda$0((TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderMarketHours) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function3 function3 = (Function3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function3() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-165702401$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TradingSessionAndTimeInForceBottomSheet3.invoke$lambda$3$lambda$2((TradeSettingsStore4) obj, (TradeSettingsStore3) obj2, (OrderTimeInForce) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function3 function32 = (Function3) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.tradesettings.ui.ComposableSingletons$TradingSessionAndTimeInForceBottomSheetKt$lambda$-165702401$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        TradingSessionAndTimeInForceBottomSheet5.TradingSessionAndTimeInForceComposable(loaded, tradeSettingsStore4, equity, function3, function32, (Function0) objRememberedValue3, false, null, composer, StringResource.$stable | SetTradingHourVisualizerArgs.$stable | 1797168, 128);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(tradeSettingsStore4, "<unused var>");
        Intrinsics.checkNotNullParameter(tradeSettingsStore3, "<unused var>");
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<unused var>");
        return Unit.INSTANCE;
    }
}
