package com.robinhood.android.equities.tradesettings.equity.p119ts;

import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.equities.tradesettings.utils.MarketHours2;
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

/* compiled from: EquityTradingSessionDataState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%Jx\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010#R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010%R\u0017\u0010B\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020G0F8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001d\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020G0F8F¢\u0006\u0006\u001a\u0004\bK\u0010I¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;", "", "Lcom/robinhood/models/db/OrderMarketHours;", "longOrderTradingSession", "shortOrderTradingSession", "", "shortingExperimentEnabled", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/android/common/buysell/BuySellData;", "buySellData", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "subtitleVariant", "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Ljava/lang/Boolean;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/common/buysell/BuySellData;Lj$/time/Clock;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;)V", "component1", "()Lcom/robinhood/models/db/OrderMarketHours;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/robinhood/models/db/MarketHours;", "component5", "()Lcom/robinhood/models/db/Instrument;", "component6", "()Lcom/robinhood/models/db/Account;", "component7", "()Lcom/robinhood/android/common/buysell/BuySellData;", "component8", "()Lj$/time/Clock;", "component9", "()Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "copy", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Ljava/lang/Boolean;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/common/buysell/BuySellData;Lj$/time/Clock;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;)Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/OrderMarketHours;", "getLongOrderTradingSession", "getShortOrderTradingSession", "Ljava/lang/Boolean;", "getShortingExperimentEnabled", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/android/common/buysell/BuySellData;", "getBuySellData", "Lj$/time/Clock;", "getClock", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "getSubtitleVariant", "shortingEnabled", "Z", "getShortingEnabled", "()Z", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "getLongSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "longSelectionOptions", "getShortSelectionOptions", "shortSelectionOptions", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityTradingSessionDataState {
    public static final int $stable = 8;
    private final Account account;
    private final BuySellData buySellData;
    private final Clock clock;
    private final Instrument instrument;
    private final OrderMarketHours longOrderTradingSession;
    private final MarketHours marketHours;
    private final OrderMarketHours shortOrderTradingSession;
    private final boolean shortingEnabled;
    private final Boolean shortingExperimentEnabled;
    private final TradingSessionSubtitleExperiment.Variant subtitleVariant;

    public static /* synthetic */ EquityTradingSessionDataState copy$default(EquityTradingSessionDataState equityTradingSessionDataState, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, Boolean bool, MarketHours marketHours, Instrument instrument, Account account, BuySellData buySellData, Clock clock, TradingSessionSubtitleExperiment.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            orderMarketHours = equityTradingSessionDataState.longOrderTradingSession;
        }
        if ((i & 2) != 0) {
            orderMarketHours2 = equityTradingSessionDataState.shortOrderTradingSession;
        }
        if ((i & 4) != 0) {
            bool = equityTradingSessionDataState.shortingExperimentEnabled;
        }
        if ((i & 8) != 0) {
            marketHours = equityTradingSessionDataState.marketHours;
        }
        if ((i & 16) != 0) {
            instrument = equityTradingSessionDataState.instrument;
        }
        if ((i & 32) != 0) {
            account = equityTradingSessionDataState.account;
        }
        if ((i & 64) != 0) {
            buySellData = equityTradingSessionDataState.buySellData;
        }
        if ((i & 128) != 0) {
            clock = equityTradingSessionDataState.clock;
        }
        if ((i & 256) != 0) {
            variant = equityTradingSessionDataState.subtitleVariant;
        }
        Clock clock2 = clock;
        TradingSessionSubtitleExperiment.Variant variant2 = variant;
        Account account2 = account;
        BuySellData buySellData2 = buySellData;
        Instrument instrument2 = instrument;
        Boolean bool2 = bool;
        return equityTradingSessionDataState.copy(orderMarketHours, orderMarketHours2, bool2, marketHours, instrument2, account2, buySellData2, clock2, variant2);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderMarketHours getLongOrderTradingSession() {
        return this.longOrderTradingSession;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderMarketHours getShortOrderTradingSession() {
        return this.shortOrderTradingSession;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component5, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component6, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component7, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component8, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    /* renamed from: component9, reason: from getter */
    public final TradingSessionSubtitleExperiment.Variant getSubtitleVariant() {
        return this.subtitleVariant;
    }

    public final EquityTradingSessionDataState copy(OrderMarketHours longOrderTradingSession, OrderMarketHours shortOrderTradingSession, Boolean shortingExperimentEnabled, MarketHours marketHours, Instrument instrument, Account account, BuySellData buySellData, Clock clock, TradingSessionSubtitleExperiment.Variant subtitleVariant) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(subtitleVariant, "subtitleVariant");
        return new EquityTradingSessionDataState(longOrderTradingSession, shortOrderTradingSession, shortingExperimentEnabled, marketHours, instrument, account, buySellData, clock, subtitleVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTradingSessionDataState)) {
            return false;
        }
        EquityTradingSessionDataState equityTradingSessionDataState = (EquityTradingSessionDataState) other;
        return this.longOrderTradingSession == equityTradingSessionDataState.longOrderTradingSession && this.shortOrderTradingSession == equityTradingSessionDataState.shortOrderTradingSession && Intrinsics.areEqual(this.shortingExperimentEnabled, equityTradingSessionDataState.shortingExperimentEnabled) && Intrinsics.areEqual(this.marketHours, equityTradingSessionDataState.marketHours) && Intrinsics.areEqual(this.instrument, equityTradingSessionDataState.instrument) && Intrinsics.areEqual(this.account, equityTradingSessionDataState.account) && Intrinsics.areEqual(this.buySellData, equityTradingSessionDataState.buySellData) && Intrinsics.areEqual(this.clock, equityTradingSessionDataState.clock) && this.subtitleVariant == equityTradingSessionDataState.subtitleVariant;
    }

    public int hashCode() {
        OrderMarketHours orderMarketHours = this.longOrderTradingSession;
        int iHashCode = (orderMarketHours == null ? 0 : orderMarketHours.hashCode()) * 31;
        OrderMarketHours orderMarketHours2 = this.shortOrderTradingSession;
        int iHashCode2 = (iHashCode + (orderMarketHours2 == null ? 0 : orderMarketHours2.hashCode())) * 31;
        Boolean bool = this.shortingExperimentEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode4 = (iHashCode3 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode5 = (iHashCode4 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Account account = this.account;
        int iHashCode6 = (iHashCode5 + (account == null ? 0 : account.hashCode())) * 31;
        BuySellData buySellData = this.buySellData;
        return ((((iHashCode6 + (buySellData != null ? buySellData.hashCode() : 0)) * 31) + this.clock.hashCode()) * 31) + this.subtitleVariant.hashCode();
    }

    public String toString() {
        return "EquityTradingSessionDataState(longOrderTradingSession=" + this.longOrderTradingSession + ", shortOrderTradingSession=" + this.shortOrderTradingSession + ", shortingExperimentEnabled=" + this.shortingExperimentEnabled + ", marketHours=" + this.marketHours + ", instrument=" + this.instrument + ", account=" + this.account + ", buySellData=" + this.buySellData + ", clock=" + this.clock + ", subtitleVariant=" + this.subtitleVariant + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityTradingSessionDataState(OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, Boolean bool, MarketHours marketHours, Instrument instrument, Account account, BuySellData buySellData, Clock clock, TradingSessionSubtitleExperiment.Variant subtitleVariant) {
        boolean z;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(subtitleVariant, "subtitleVariant");
        this.longOrderTradingSession = orderMarketHours;
        this.shortOrderTradingSession = orderMarketHours2;
        this.shortingExperimentEnabled = bool;
        this.marketHours = marketHours;
        this.instrument = instrument;
        this.account = account;
        this.buySellData = buySellData;
        this.clock = clock;
        this.subtitleVariant = subtitleVariant;
        if (!Intrinsics.areEqual(bool, Boolean.TRUE) || buySellData == null) {
            z = false;
        } else {
            z = true;
            if (!buySellData.isSellToOpenEnabled(true)) {
            }
        }
        this.shortingEnabled = z;
    }

    public final OrderMarketHours getLongOrderTradingSession() {
        return this.longOrderTradingSession;
    }

    public final OrderMarketHours getShortOrderTradingSession() {
        return this.shortOrderTradingSession;
    }

    public final Boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public /* synthetic */ EquityTradingSessionDataState(OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, Boolean bool, MarketHours marketHours, Instrument instrument, Account account, BuySellData buySellData, Clock clock, TradingSessionSubtitleExperiment.Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderMarketHours, (i & 2) != 0 ? null : orderMarketHours2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : marketHours, (i & 16) != 0 ? null : instrument, (i & 32) != 0 ? null : account, (i & 64) != 0 ? null : buySellData, clock, (i & 256) != 0 ? TradingSessionSubtitleExperiment.Variant.CONTROL : variant);
    }

    public final TradingSessionSubtitleExperiment.Variant getSubtitleVariant() {
        return this.subtitleVariant;
    }

    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getLongSelectionOptions() {
        OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        SelectionRowState selectionRowState = new SelectionRowState(orderMarketHours, companion.invoke("Market Hours"), MarketHours2.getRegularHoursDetailText(this.marketHours), false, 8, null);
        SelectionRowState selectionRowState2 = new SelectionRowState(OrderMarketHours.EXTENDED_HOURS, companion.invoke("Extended Hours"), MarketHours2.getExtendedHoursDetailText(this.marketHours), false, 8, null);
        SelectionRowState selectionRowState3 = new SelectionRowState(OrderMarketHours.ALL_DAY_HOURS, companion.invoke("24 Hour Market"), MarketHours2.getAllDayHoursDetailText(this.marketHours, this.subtitleVariant, this.clock), false, 8, null);
        Boolean boolCheckAdtTradability = CheckAdtTradability.checkAdtTradability(this.instrument, this.account, EquityOrderSide.BUY);
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(boolCheckAdtTradability, bool) && !Intrinsics.areEqual(CheckAdtTradability.checkAdtTradability(this.instrument, this.account, EquityOrderSide.SELL), bool)) {
            selectionRowState3 = null;
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new SelectionRowState[]{selectionRowState, selectionRowState2, selectionRowState3}));
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getShortSelectionOptions() {
        OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        return extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new SelectionRowState[]{new SelectionRowState(orderMarketHours, companion.invoke("Market Hours"), MarketHours2.getRegularHoursDetailText(this.marketHours), false, 8, null), new SelectionRowState(OrderMarketHours.EXTENDED_HOURS, companion.invoke("Extended Hours"), MarketHours2.getExtendedHoursDetailText(this.marketHours), false, 8, null)}));
    }
}
