package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.equities.tradesettings.utils.MarketHours2;
import com.robinhood.android.equities.tradesettings.utils.TimeInForceUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.tradinghourvisual.lib.p263ui.OrderTradingSessionVisualizerUtil;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: TradingSessionAndTimeInForceDataState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0084\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010%R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010'R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010)R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020H0G8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0H0G8F¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;", "", "Lcom/robinhood/models/db/OrderMarketHours;", "orderTradingSession", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/models/db/Instrument;", "orderInstrument", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/OrderTimeInForce;", "orderTimeInForce", "nextMarketHours", "", "brokebackOrderExpireDateString", "Lcom/robinhood/models/db/EquityPositionType;", "positionType", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "experimentVariant", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/MarketHours;Ljava/lang/String;Lcom/robinhood/models/db/EquityPositionType;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;Lj$/time/Clock;)V", "component1", "()Lcom/robinhood/models/db/OrderMarketHours;", "component2", "()Lcom/robinhood/models/db/MarketHours;", "component3", "()Lcom/robinhood/models/db/Instrument;", "component4", "()Lcom/robinhood/models/db/Account;", "component5", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component6", "component7", "()Ljava/lang/String;", "component8", "()Lcom/robinhood/models/db/EquityPositionType;", "component9", "()Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "component10", "()Lj$/time/Clock;", "copy", "(Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/MarketHours;Ljava/lang/String;Lcom/robinhood/models/db/EquityPositionType;Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;Lj$/time/Clock;)Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/OrderMarketHours;", "getOrderTradingSession", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Lcom/robinhood/models/db/Instrument;", "getOrderInstrument", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/db/OrderTimeInForce;", "getOrderTimeInForce", "getNextMarketHours", "Ljava/lang/String;", "getBrokebackOrderExpireDateString", "Lcom/robinhood/models/db/EquityPositionType;", "getPositionType", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "getExperimentVariant", "Lj$/time/Clock;", "getClock", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "getTradingSessionSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "tradingSessionSelectionOptions", "getTimeInForceSelectionOptions", "timeInForceSelectionOptions", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingSessionVisualizer", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "tradingSessionVisualizer", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class TradingSessionAndTimeInForceDataState {
    public static final int $stable = 8;
    private final Account account;
    private final String brokebackOrderExpireDateString;
    private final Clock clock;
    private final TradingSessionSubtitleExperiment.Variant experimentVariant;
    private final MarketHours marketHours;
    private final MarketHours nextMarketHours;
    private final Instrument orderInstrument;
    private final OrderTimeInForce orderTimeInForce;
    private final OrderMarketHours orderTradingSession;
    private final EquityPositionType positionType;

    /* compiled from: TradingSessionAndTimeInForceDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ TradingSessionAndTimeInForceDataState copy$default(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, OrderMarketHours orderMarketHours, MarketHours marketHours, Instrument instrument, Account account, OrderTimeInForce orderTimeInForce, MarketHours marketHours2, String str, EquityPositionType equityPositionType, TradingSessionSubtitleExperiment.Variant variant, Clock clock, int i, Object obj) {
        if ((i & 1) != 0) {
            orderMarketHours = tradingSessionAndTimeInForceDataState.orderTradingSession;
        }
        if ((i & 2) != 0) {
            marketHours = tradingSessionAndTimeInForceDataState.marketHours;
        }
        if ((i & 4) != 0) {
            instrument = tradingSessionAndTimeInForceDataState.orderInstrument;
        }
        if ((i & 8) != 0) {
            account = tradingSessionAndTimeInForceDataState.account;
        }
        if ((i & 16) != 0) {
            orderTimeInForce = tradingSessionAndTimeInForceDataState.orderTimeInForce;
        }
        if ((i & 32) != 0) {
            marketHours2 = tradingSessionAndTimeInForceDataState.nextMarketHours;
        }
        if ((i & 64) != 0) {
            str = tradingSessionAndTimeInForceDataState.brokebackOrderExpireDateString;
        }
        if ((i & 128) != 0) {
            equityPositionType = tradingSessionAndTimeInForceDataState.positionType;
        }
        if ((i & 256) != 0) {
            variant = tradingSessionAndTimeInForceDataState.experimentVariant;
        }
        if ((i & 512) != 0) {
            clock = tradingSessionAndTimeInForceDataState.clock;
        }
        TradingSessionSubtitleExperiment.Variant variant2 = variant;
        Clock clock2 = clock;
        String str2 = str;
        EquityPositionType equityPositionType2 = equityPositionType;
        OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
        MarketHours marketHours3 = marketHours2;
        return tradingSessionAndTimeInForceDataState.copy(orderMarketHours, marketHours, instrument, account, orderTimeInForce2, marketHours3, str2, equityPositionType2, variant2, clock2);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    /* renamed from: component10, reason: from getter */
    public final Clock getClock() {
        return this.clock;
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
    public final OrderTimeInForce getOrderTimeInForce() {
        return this.orderTimeInForce;
    }

    /* renamed from: component6, reason: from getter */
    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    /* renamed from: component8, reason: from getter */
    public final EquityPositionType getPositionType() {
        return this.positionType;
    }

    /* renamed from: component9, reason: from getter */
    public final TradingSessionSubtitleExperiment.Variant getExperimentVariant() {
        return this.experimentVariant;
    }

    public final TradingSessionAndTimeInForceDataState copy(OrderMarketHours orderTradingSession, MarketHours marketHours, Instrument orderInstrument, Account account, OrderTimeInForce orderTimeInForce, MarketHours nextMarketHours, String brokebackOrderExpireDateString, EquityPositionType positionType, TradingSessionSubtitleExperiment.Variant experimentVariant, Clock clock) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new TradingSessionAndTimeInForceDataState(orderTradingSession, marketHours, orderInstrument, account, orderTimeInForce, nextMarketHours, brokebackOrderExpireDateString, positionType, experimentVariant, clock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingSessionAndTimeInForceDataState)) {
            return false;
        }
        TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState = (TradingSessionAndTimeInForceDataState) other;
        return this.orderTradingSession == tradingSessionAndTimeInForceDataState.orderTradingSession && Intrinsics.areEqual(this.marketHours, tradingSessionAndTimeInForceDataState.marketHours) && Intrinsics.areEqual(this.orderInstrument, tradingSessionAndTimeInForceDataState.orderInstrument) && Intrinsics.areEqual(this.account, tradingSessionAndTimeInForceDataState.account) && this.orderTimeInForce == tradingSessionAndTimeInForceDataState.orderTimeInForce && Intrinsics.areEqual(this.nextMarketHours, tradingSessionAndTimeInForceDataState.nextMarketHours) && Intrinsics.areEqual(this.brokebackOrderExpireDateString, tradingSessionAndTimeInForceDataState.brokebackOrderExpireDateString) && this.positionType == tradingSessionAndTimeInForceDataState.positionType && this.experimentVariant == tradingSessionAndTimeInForceDataState.experimentVariant && Intrinsics.areEqual(this.clock, tradingSessionAndTimeInForceDataState.clock);
    }

    public int hashCode() {
        OrderMarketHours orderMarketHours = this.orderTradingSession;
        int iHashCode = (orderMarketHours == null ? 0 : orderMarketHours.hashCode()) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode2 = (iHashCode + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        Instrument instrument = this.orderInstrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Account account = this.account;
        int iHashCode4 = (iHashCode3 + (account == null ? 0 : account.hashCode())) * 31;
        OrderTimeInForce orderTimeInForce = this.orderTimeInForce;
        int iHashCode5 = (iHashCode4 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31;
        MarketHours marketHours2 = this.nextMarketHours;
        int iHashCode6 = (iHashCode5 + (marketHours2 == null ? 0 : marketHours2.hashCode())) * 31;
        String str = this.brokebackOrderExpireDateString;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        EquityPositionType equityPositionType = this.positionType;
        return ((((iHashCode7 + (equityPositionType != null ? equityPositionType.hashCode() : 0)) * 31) + this.experimentVariant.hashCode()) * 31) + this.clock.hashCode();
    }

    public String toString() {
        return "TradingSessionAndTimeInForceDataState(orderTradingSession=" + this.orderTradingSession + ", marketHours=" + this.marketHours + ", orderInstrument=" + this.orderInstrument + ", account=" + this.account + ", orderTimeInForce=" + this.orderTimeInForce + ", nextMarketHours=" + this.nextMarketHours + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", positionType=" + this.positionType + ", experimentVariant=" + this.experimentVariant + ", clock=" + this.clock + ")";
    }

    public TradingSessionAndTimeInForceDataState(OrderMarketHours orderMarketHours, MarketHours marketHours, Instrument instrument, Account account, OrderTimeInForce orderTimeInForce, MarketHours marketHours2, String str, EquityPositionType equityPositionType, TradingSessionSubtitleExperiment.Variant experimentVariant, Clock clock) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.orderTradingSession = orderMarketHours;
        this.marketHours = marketHours;
        this.orderInstrument = instrument;
        this.account = account;
        this.orderTimeInForce = orderTimeInForce;
        this.nextMarketHours = marketHours2;
        this.brokebackOrderExpireDateString = str;
        this.positionType = equityPositionType;
        this.experimentVariant = experimentVariant;
        this.clock = clock;
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

    public final OrderTimeInForce getOrderTimeInForce() {
        return this.orderTimeInForce;
    }

    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    public final EquityPositionType getPositionType() {
        return this.positionType;
    }

    public /* synthetic */ TradingSessionAndTimeInForceDataState(OrderMarketHours orderMarketHours, MarketHours marketHours, Instrument instrument, Account account, OrderTimeInForce orderTimeInForce, MarketHours marketHours2, String str, EquityPositionType equityPositionType, TradingSessionSubtitleExperiment.Variant variant, Clock clock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderMarketHours, (i & 2) != 0 ? null : marketHours, (i & 4) != 0 ? null : instrument, (i & 8) != 0 ? null : account, (i & 16) != 0 ? null : orderTimeInForce, (i & 32) != 0 ? null : marketHours2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : equityPositionType, (i & 256) != 0 ? TradingSessionSubtitleExperiment.Variant.CONTROL : variant, clock);
    }

    public final TradingSessionSubtitleExperiment.Variant getExperimentVariant() {
        return this.experimentVariant;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getTradingSessionSelectionOptions() {
        OrderMarketHours orderMarketHours = OrderMarketHours.REGULAR_HOURS;
        StringResource.Companion companion = StringResource.INSTANCE;
        SelectionRowState selectionRowState = new SelectionRowState(orderMarketHours, companion.invoke("Market Hours"), MarketHours2.getRegularHoursDetailText(this.marketHours), false, 8, null);
        SelectionRowState selectionRowState2 = new SelectionRowState(OrderMarketHours.EXTENDED_HOURS, companion.invoke("Extended Hours"), MarketHours2.getExtendedHoursDetailText(this.marketHours), false, 8, null);
        SelectionRowState selectionRowState3 = new SelectionRowState(OrderMarketHours.ALL_DAY_HOURS, companion.invoke("24 Hour Market"), MarketHours2.getAllDayHoursDetailText(this.marketHours, this.experimentVariant, this.clock), false, 8, null);
        Boolean boolCheckAdtTradability = CheckAdtTradability.checkAdtTradability(this.orderInstrument, this.account, EquityOrderSide.BUY);
        Boolean bool = Boolean.TRUE;
        if ((!Intrinsics.areEqual(boolCheckAdtTradability, bool) && !Intrinsics.areEqual(CheckAdtTradability.checkAdtTradability(this.orderInstrument, this.account, EquityOrderSide.SELL), bool)) || this.positionType != EquityPositionType.LONG) {
            selectionRowState3 = null;
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new SelectionRowState[]{selectionRowState, selectionRowState2, selectionRowState3}));
    }

    public final ImmutableList<SelectionRowState<OrderTimeInForce>> getTimeInForceSelectionOptions() {
        StringResource stringResourceInvoke;
        Instant extendedClosesAt;
        String str;
        Instant regularClosesAt;
        String str2;
        TimeInForceUtils timeInForceUtils = TimeInForceUtils.INSTANCE;
        StringResource gfdTitle$default = TimeInForceUtils.getGfdTitle$default(timeInForceUtils, null, this.orderTradingSession, this.marketHours, this.nextMarketHours, null, 16, null);
        if (gfdTitle$default == null || this.orderTradingSession == null) {
            return extensions2.persistentListOf();
        }
        if (this.positionType == EquityPositionType.SHORT) {
            OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
            OrderMarketHours orderMarketHours = this.orderTradingSession;
            int i = orderMarketHours == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderMarketHours.ordinal()];
            String str3 = "";
            if (i == 1) {
                StringResource.Companion companion = StringResource.INSTANCE;
                MarketHours marketHours = this.marketHours;
                if (marketHours != null && (extendedClosesAt = marketHours.getExtendedClosesAt()) != null && (str = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format((InstantFormatter) extendedClosesAt)) != null) {
                    str3 = str;
                }
                stringResourceInvoke = companion.invoke(str3);
            } else {
                if (i != 2) {
                    if (i == 3 || i == 4 || i == 5) {
                        throw new IllegalStateException("Unsupported trading session");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StringResource.Companion companion2 = StringResource.INSTANCE;
                MarketHours marketHours2 = this.marketHours;
                if (marketHours2 != null && (regularClosesAt = marketHours2.getRegularClosesAt()) != null && (str2 = InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format((InstantFormatter) regularClosesAt)) != null) {
                    str3 = str2;
                }
                stringResourceInvoke = companion2.invoke(str3);
            }
            return extensions2.persistentListOf(new SelectionRowState(orderTimeInForce, new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{stringResourceInvoke, StringResource.INSTANCE.invoke(C41827R.string.localdate_format_today, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText), timeInForceUtils.getGfdDetailText(this.orderTradingSession), false, 8, null));
        }
        return extensions2.persistentListOf(new SelectionRowState(OrderTimeInForce.GFD, gfdTitle$default, timeInForceUtils.getGfdDetailText(this.orderTradingSession), false, 8, null), new SelectionRowState(OrderTimeInForce.GTC, TimeInForceUtils.getGtcTitle$default(timeInForceUtils, this.brokebackOrderExpireDateString, null, null, 6, null), timeInForceUtils.getGtcDetailText(), false, 8, null));
    }

    public final SetTradingHourVisualizerArgs getTradingSessionVisualizer() {
        return OrderTradingSessionVisualizerUtil.INSTANCE.getVisualizerArg(this.orderTradingSession, this.marketHours);
    }
}
