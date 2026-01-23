package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: TradingSessionAndTimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loaded;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loading;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface TradingSessionAndTimeInForceViewState {

    /* compiled from: TradingSessionAndTimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loading;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements TradingSessionAndTimeInForceViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1408391387;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: TradingSessionAndTimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState$Loaded;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState;", "orderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "tradeSessionSelectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "timeInForceSelectionOptions", "tradingSessionVisualizer", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;)V", "getOrderTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getTradeSessionSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getTimeInForceSelectionOptions", "getTradingSessionVisualizer", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements TradingSessionAndTimeInForceViewState {
        public static final int $stable;
        private final OrderTimeInForce orderTimeInForce;
        private final OrderMarketHours orderTradingSession;
        private final ImmutableList<SelectionRowState<OrderTimeInForce>> timeInForceSelectionOptions;
        private final ImmutableList<SelectionRowState<OrderMarketHours>> tradeSessionSelectionOptions;
        private final SetTradingHourVisualizerArgs tradingSessionVisualizer;

        static {
            int i = SetTradingHourVisualizerArgs.$stable;
            int i2 = StringResource.$stable;
            $stable = i | i2 | i2 | i2 | i2;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, OrderMarketHours orderMarketHours, OrderTimeInForce orderTimeInForce, ImmutableList immutableList, ImmutableList immutableList2, SetTradingHourVisualizerArgs setTradingHourVisualizerArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                orderMarketHours = loaded.orderTradingSession;
            }
            if ((i & 2) != 0) {
                orderTimeInForce = loaded.orderTimeInForce;
            }
            if ((i & 4) != 0) {
                immutableList = loaded.tradeSessionSelectionOptions;
            }
            if ((i & 8) != 0) {
                immutableList2 = loaded.timeInForceSelectionOptions;
            }
            if ((i & 16) != 0) {
                setTradingHourVisualizerArgs = loaded.tradingSessionVisualizer;
            }
            SetTradingHourVisualizerArgs setTradingHourVisualizerArgs2 = setTradingHourVisualizerArgs;
            ImmutableList immutableList3 = immutableList;
            return loaded.copy(orderMarketHours, orderTimeInForce, immutableList3, immutableList2, setTradingHourVisualizerArgs2);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderMarketHours getOrderTradingSession() {
            return this.orderTradingSession;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderMarketHours>> component3() {
            return this.tradeSessionSelectionOptions;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> component4() {
            return this.timeInForceSelectionOptions;
        }

        /* renamed from: component5, reason: from getter */
        public final SetTradingHourVisualizerArgs getTradingSessionVisualizer() {
            return this.tradingSessionVisualizer;
        }

        public final Loaded copy(OrderMarketHours orderTradingSession, OrderTimeInForce orderTimeInForce, ImmutableList<SelectionRowState<OrderMarketHours>> tradeSessionSelectionOptions, ImmutableList<SelectionRowState<OrderTimeInForce>> timeInForceSelectionOptions, SetTradingHourVisualizerArgs tradingSessionVisualizer) {
            Intrinsics.checkNotNullParameter(orderTradingSession, "orderTradingSession");
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            Intrinsics.checkNotNullParameter(tradeSessionSelectionOptions, "tradeSessionSelectionOptions");
            Intrinsics.checkNotNullParameter(timeInForceSelectionOptions, "timeInForceSelectionOptions");
            Intrinsics.checkNotNullParameter(tradingSessionVisualizer, "tradingSessionVisualizer");
            return new Loaded(orderTradingSession, orderTimeInForce, tradeSessionSelectionOptions, timeInForceSelectionOptions, tradingSessionVisualizer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.orderTradingSession == loaded.orderTradingSession && this.orderTimeInForce == loaded.orderTimeInForce && Intrinsics.areEqual(this.tradeSessionSelectionOptions, loaded.tradeSessionSelectionOptions) && Intrinsics.areEqual(this.timeInForceSelectionOptions, loaded.timeInForceSelectionOptions) && Intrinsics.areEqual(this.tradingSessionVisualizer, loaded.tradingSessionVisualizer);
        }

        public int hashCode() {
            return (((((((this.orderTradingSession.hashCode() * 31) + this.orderTimeInForce.hashCode()) * 31) + this.tradeSessionSelectionOptions.hashCode()) * 31) + this.timeInForceSelectionOptions.hashCode()) * 31) + this.tradingSessionVisualizer.hashCode();
        }

        public String toString() {
            return "Loaded(orderTradingSession=" + this.orderTradingSession + ", orderTimeInForce=" + this.orderTimeInForce + ", tradeSessionSelectionOptions=" + this.tradeSessionSelectionOptions + ", timeInForceSelectionOptions=" + this.timeInForceSelectionOptions + ", tradingSessionVisualizer=" + this.tradingSessionVisualizer + ")";
        }

        public Loaded(OrderMarketHours orderTradingSession, OrderTimeInForce orderTimeInForce, ImmutableList<SelectionRowState<OrderMarketHours>> tradeSessionSelectionOptions, ImmutableList<SelectionRowState<OrderTimeInForce>> timeInForceSelectionOptions, SetTradingHourVisualizerArgs tradingSessionVisualizer) {
            Intrinsics.checkNotNullParameter(orderTradingSession, "orderTradingSession");
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            Intrinsics.checkNotNullParameter(tradeSessionSelectionOptions, "tradeSessionSelectionOptions");
            Intrinsics.checkNotNullParameter(timeInForceSelectionOptions, "timeInForceSelectionOptions");
            Intrinsics.checkNotNullParameter(tradingSessionVisualizer, "tradingSessionVisualizer");
            this.orderTradingSession = orderTradingSession;
            this.orderTimeInForce = orderTimeInForce;
            this.tradeSessionSelectionOptions = tradeSessionSelectionOptions;
            this.timeInForceSelectionOptions = timeInForceSelectionOptions;
            this.tradingSessionVisualizer = tradingSessionVisualizer;
        }

        public final OrderMarketHours getOrderTradingSession() {
            return this.orderTradingSession;
        }

        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderMarketHours>> getTradeSessionSelectionOptions() {
            return this.tradeSessionSelectionOptions;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> getTimeInForceSelectionOptions() {
            return this.timeInForceSelectionOptions;
        }

        public final SetTradingHourVisualizerArgs getTradingSessionVisualizer() {
            return this.tradingSessionVisualizer;
        }
    }
}
