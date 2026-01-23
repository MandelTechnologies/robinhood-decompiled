package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.equities.tradesettings.utils.MarketHours2;
import com.robinhood.android.tradinghourvisual.lib.p263ui.OrderTradingSessionVisualizerUtil;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;

/* compiled from: TradingSessionDataState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001bR\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000205048F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;", "", "Lcom/robinhood/models/db/OrderMarketHours;", "orderTradingSession", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/models/db/Instrument;", "orderInstrument", "Lcom/robinhood/models/db/Account;", "account", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "experimentVariant", "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lj$/time/Clock;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;)V", "component1", "()Lcom/robinhood/models/db/OrderMarketHours;", "component2", "()Lcom/robinhood/models/db/MarketHours;", "component3", "()Lcom/robinhood/models/db/Instrument;", "component4", "()Lcom/robinhood/models/db/Account;", "component5", "()Lj$/time/Clock;", "component6", "()Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "copy", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lj$/time/Clock;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;)Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/OrderMarketHours;", "getOrderTradingSession", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Lcom/robinhood/models/db/Instrument;", "getOrderInstrument", "Lcom/robinhood/models/db/Account;", "getAccount", "Lj$/time/Clock;", "getClock", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "getExperimentVariant", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "getSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "selectionOptions", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingSessionVisualizer", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "tradingSessionVisualizer", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TradingSessionDataState {
    public static final int $stable = 8;
    private final Account account;
    private final Clock clock;
    private final TradingSessionSubtitleExperiment.Variant experimentVariant;
    private final MarketHours marketHours;
    private final Instrument orderInstrument;
    private final OrderMarketHours orderTradingSession;

    public static /* synthetic */ TradingSessionDataState copy$default(TradingSessionDataState tradingSessionDataState, OrderMarketHours orderMarketHours, MarketHours marketHours, Instrument instrument, Account account, Clock clock, TradingSessionSubtitleExperiment.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            orderMarketHours = tradingSessionDataState.orderTradingSession;
        }
        if ((i & 2) != 0) {
            marketHours = tradingSessionDataState.marketHours;
        }
        if ((i & 4) != 0) {
            instrument = tradingSessionDataState.orderInstrument;
        }
        if ((i & 8) != 0) {
            account = tradingSessionDataState.account;
        }
        if ((i & 16) != 0) {
            clock = tradingSessionDataState.clock;
        }
        if ((i & 32) != 0) {
            variant = tradingSessionDataState.experimentVariant;
        }
        Clock clock2 = clock;
        TradingSessionSubtitleExperiment.Variant variant2 = variant;
        return tradingSessionDataState.copy(orderMarketHours, marketHours, instrument, account, clock2, variant2);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    /* renamed from: component2, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component3, reason: from getter */
    public final Instrument getOrderInstrument() {
        return this.orderInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component5, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    /* renamed from: component6, reason: from getter */
    public final TradingSessionSubtitleExperiment.Variant getExperimentVariant() {
        return this.experimentVariant;
    }

    public final TradingSessionDataState copy(OrderMarketHours orderTradingSession, MarketHours marketHours, Instrument orderInstrument, Account account, Clock clock, TradingSessionSubtitleExperiment.Variant experimentVariant) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        return new TradingSessionDataState(orderTradingSession, marketHours, orderInstrument, account, clock, experimentVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingSessionDataState)) {
            return false;
        }
        TradingSessionDataState tradingSessionDataState = (TradingSessionDataState) other;
        return this.orderTradingSession == tradingSessionDataState.orderTradingSession && Intrinsics.areEqual(this.marketHours, tradingSessionDataState.marketHours) && Intrinsics.areEqual(this.orderInstrument, tradingSessionDataState.orderInstrument) && Intrinsics.areEqual(this.account, tradingSessionDataState.account) && Intrinsics.areEqual(this.clock, tradingSessionDataState.clock) && this.experimentVariant == tradingSessionDataState.experimentVariant;
    }

    public int hashCode() {
        OrderMarketHours orderMarketHours = this.orderTradingSession;
        int iHashCode = (orderMarketHours == null ? 0 : orderMarketHours.hashCode()) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode2 = (iHashCode + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        Instrument instrument = this.orderInstrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Account account = this.account;
        return ((((iHashCode3 + (account != null ? account.hashCode() : 0)) * 31) + this.clock.hashCode()) * 31) + this.experimentVariant.hashCode();
    }

    public String toString() {
        return "TradingSessionDataState(orderTradingSession=" + this.orderTradingSession + ", marketHours=" + this.marketHours + ", orderInstrument=" + this.orderInstrument + ", account=" + this.account + ", clock=" + this.clock + ", experimentVariant=" + this.experimentVariant + ")";
    }

    public TradingSessionDataState(OrderMarketHours orderMarketHours, MarketHours marketHours, Instrument instrument, Account account, Clock clock, TradingSessionSubtitleExperiment.Variant experimentVariant) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        this.orderTradingSession = orderMarketHours;
        this.marketHours = marketHours;
        this.orderInstrument = instrument;
        this.account = account;
        this.clock = clock;
        this.experimentVariant = experimentVariant;
    }

    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final Instrument getOrderInstrument() {
        return this.orderInstrument;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public /* synthetic */ TradingSessionDataState(OrderMarketHours orderMarketHours, MarketHours marketHours, Instrument instrument, Account account, Clock clock, TradingSessionSubtitleExperiment.Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderMarketHours, (i & 2) != 0 ? null : marketHours, (i & 4) != 0 ? null : instrument, (i & 8) != 0 ? null : account, clock, (i & 32) != 0 ? TradingSessionSubtitleExperiment.Variant.CONTROL : variant);
    }

    public final TradingSessionSubtitleExperiment.Variant getExperimentVariant() {
        return this.experimentVariant;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getSelectionOptions() {
        OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        SelectionRowState selectionRowState = new SelectionRowState(orderMarketHours, companion.invoke("Market Hours"), MarketHours2.getRegularHoursDetailText(this.marketHours), false, 8, null);
        SelectionRowState selectionRowState2 = new SelectionRowState(OrderMarketHours.EXTENDED_HOURS, companion.invoke("Extended Hours"), MarketHours2.getExtendedHoursDetailText(this.marketHours), false, 8, null);
        SelectionRowState selectionRowState3 = new SelectionRowState(OrderMarketHours.ALL_DAY_HOURS, companion.invoke("24 Hour Market"), MarketHours2.getAllDayHoursDetailText(this.marketHours, this.experimentVariant, this.clock), false, 8, null);
        Boolean boolCheckAdtTradability = CheckAdtTradability.checkAdtTradability(this.orderInstrument, this.account, EquityOrderSide.BUY);
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(boolCheckAdtTradability, bool) && !Intrinsics.areEqual(CheckAdtTradability.checkAdtTradability(this.orderInstrument, this.account, EquityOrderSide.SELL), bool)) {
            selectionRowState3 = null;
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new SelectionRowState[]{selectionRowState, selectionRowState2, selectionRowState3}));
    }

    public final SetTradingHourVisualizerArgs getTradingSessionVisualizer() {
        return OrderTradingSessionVisualizerUtil.INSTANCE.getVisualizerArg(this.orderTradingSession, this.marketHours);
    }
}
