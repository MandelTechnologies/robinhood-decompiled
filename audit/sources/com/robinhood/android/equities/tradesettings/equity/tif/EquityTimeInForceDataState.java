package com.robinhood.android.equities.tradesettings.equity.tif;

import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.equities.tradesettings.utils.TimeInForceUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
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
import p479j$.time.Instant;

/* compiled from: EquityTimeInForceDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0086\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070,0+8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070,0+8F¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceDataState;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "shortingExperimentEnabled", "", "longOrderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "shortOrderTimeInForce", "longOrderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "shortOrderTradingSession", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "nextMarketHours", "brokebackOrderExpireDateString", "", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/Boolean;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Ljava/lang/String;Lcom/robinhood/android/common/buysell/BuySellData;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getShortingExperimentEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLongOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getShortOrderTimeInForce", "getLongOrderTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getShortOrderTradingSession", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getNextMarketHours", "getBrokebackOrderExpireDateString", "()Ljava/lang/String;", "getBuySellData", "()Lcom/robinhood/android/common/buysell/BuySellData;", "shortingEnabled", "getShortingEnabled", "()Z", "longSelectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "getLongSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "shortSelectionOptions", "getShortSelectionOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/Boolean;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Ljava/lang/String;Lcom/robinhood/android/common/buysell/BuySellData;)Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceDataState;", "equals", "other", "hashCode", "", "toString", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EquityTimeInForceDataState {
    public static final int $stable = 8;
    private final String brokebackOrderExpireDateString;
    private final BuySellData buySellData;
    private final Instrument instrument;
    private final OrderTimeInForce longOrderTimeInForce;
    private final OrderMarketHours longOrderTradingSession;
    private final MarketHours marketHours;
    private final MarketHours nextMarketHours;
    private final OrderTimeInForce shortOrderTimeInForce;
    private final OrderMarketHours shortOrderTradingSession;
    private final boolean shortingEnabled;
    private final Boolean shortingExperimentEnabled;

    /* compiled from: EquityTimeInForceDataState.kt */
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

    public EquityTimeInForceDataState() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ EquityTimeInForceDataState copy$default(EquityTimeInForceDataState equityTimeInForceDataState, Instrument instrument, Boolean bool, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, MarketHours marketHours, MarketHours marketHours2, String str, BuySellData buySellData, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = equityTimeInForceDataState.instrument;
        }
        if ((i & 2) != 0) {
            bool = equityTimeInForceDataState.shortingExperimentEnabled;
        }
        if ((i & 4) != 0) {
            orderTimeInForce = equityTimeInForceDataState.longOrderTimeInForce;
        }
        if ((i & 8) != 0) {
            orderTimeInForce2 = equityTimeInForceDataState.shortOrderTimeInForce;
        }
        if ((i & 16) != 0) {
            orderMarketHours = equityTimeInForceDataState.longOrderTradingSession;
        }
        if ((i & 32) != 0) {
            orderMarketHours2 = equityTimeInForceDataState.shortOrderTradingSession;
        }
        if ((i & 64) != 0) {
            marketHours = equityTimeInForceDataState.marketHours;
        }
        if ((i & 128) != 0) {
            marketHours2 = equityTimeInForceDataState.nextMarketHours;
        }
        if ((i & 256) != 0) {
            str = equityTimeInForceDataState.brokebackOrderExpireDateString;
        }
        if ((i & 512) != 0) {
            buySellData = equityTimeInForceDataState.buySellData;
        }
        String str2 = str;
        BuySellData buySellData2 = buySellData;
        MarketHours marketHours3 = marketHours;
        MarketHours marketHours4 = marketHours2;
        OrderMarketHours orderMarketHours3 = orderMarketHours;
        OrderMarketHours orderMarketHours4 = orderMarketHours2;
        return equityTimeInForceDataState.copy(instrument, bool, orderTimeInForce, orderTimeInForce2, orderMarketHours3, orderMarketHours4, marketHours3, marketHours4, str2, buySellData2);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component10, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderTimeInForce getLongOrderTimeInForce() {
        return this.longOrderTimeInForce;
    }

    /* renamed from: component4, reason: from getter */
    public final OrderTimeInForce getShortOrderTimeInForce() {
        return this.shortOrderTimeInForce;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderMarketHours getLongOrderTradingSession() {
        return this.longOrderTradingSession;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderMarketHours getShortOrderTradingSession() {
        return this.shortOrderTradingSession;
    }

    /* renamed from: component7, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component8, reason: from getter */
    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    public final EquityTimeInForceDataState copy(Instrument instrument, Boolean shortingExperimentEnabled, OrderTimeInForce longOrderTimeInForce, OrderTimeInForce shortOrderTimeInForce, OrderMarketHours longOrderTradingSession, OrderMarketHours shortOrderTradingSession, MarketHours marketHours, MarketHours nextMarketHours, String brokebackOrderExpireDateString, BuySellData buySellData) {
        return new EquityTimeInForceDataState(instrument, shortingExperimentEnabled, longOrderTimeInForce, shortOrderTimeInForce, longOrderTradingSession, shortOrderTradingSession, marketHours, nextMarketHours, brokebackOrderExpireDateString, buySellData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTimeInForceDataState)) {
            return false;
        }
        EquityTimeInForceDataState equityTimeInForceDataState = (EquityTimeInForceDataState) other;
        return Intrinsics.areEqual(this.instrument, equityTimeInForceDataState.instrument) && Intrinsics.areEqual(this.shortingExperimentEnabled, equityTimeInForceDataState.shortingExperimentEnabled) && this.longOrderTimeInForce == equityTimeInForceDataState.longOrderTimeInForce && this.shortOrderTimeInForce == equityTimeInForceDataState.shortOrderTimeInForce && this.longOrderTradingSession == equityTimeInForceDataState.longOrderTradingSession && this.shortOrderTradingSession == equityTimeInForceDataState.shortOrderTradingSession && Intrinsics.areEqual(this.marketHours, equityTimeInForceDataState.marketHours) && Intrinsics.areEqual(this.nextMarketHours, equityTimeInForceDataState.nextMarketHours) && Intrinsics.areEqual(this.brokebackOrderExpireDateString, equityTimeInForceDataState.brokebackOrderExpireDateString) && Intrinsics.areEqual(this.buySellData, equityTimeInForceDataState.buySellData);
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        Boolean bool = this.shortingExperimentEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        OrderTimeInForce orderTimeInForce = this.longOrderTimeInForce;
        int iHashCode3 = (iHashCode2 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31;
        OrderTimeInForce orderTimeInForce2 = this.shortOrderTimeInForce;
        int iHashCode4 = (iHashCode3 + (orderTimeInForce2 == null ? 0 : orderTimeInForce2.hashCode())) * 31;
        OrderMarketHours orderMarketHours = this.longOrderTradingSession;
        int iHashCode5 = (iHashCode4 + (orderMarketHours == null ? 0 : orderMarketHours.hashCode())) * 31;
        OrderMarketHours orderMarketHours2 = this.shortOrderTradingSession;
        int iHashCode6 = (iHashCode5 + (orderMarketHours2 == null ? 0 : orderMarketHours2.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode7 = (iHashCode6 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        MarketHours marketHours2 = this.nextMarketHours;
        int iHashCode8 = (iHashCode7 + (marketHours2 == null ? 0 : marketHours2.hashCode())) * 31;
        String str = this.brokebackOrderExpireDateString;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        BuySellData buySellData = this.buySellData;
        return iHashCode9 + (buySellData != null ? buySellData.hashCode() : 0);
    }

    public String toString() {
        return "EquityTimeInForceDataState(instrument=" + this.instrument + ", shortingExperimentEnabled=" + this.shortingExperimentEnabled + ", longOrderTimeInForce=" + this.longOrderTimeInForce + ", shortOrderTimeInForce=" + this.shortOrderTimeInForce + ", longOrderTradingSession=" + this.longOrderTradingSession + ", shortOrderTradingSession=" + this.shortOrderTradingSession + ", marketHours=" + this.marketHours + ", nextMarketHours=" + this.nextMarketHours + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", buySellData=" + this.buySellData + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityTimeInForceDataState(Instrument instrument, Boolean bool, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, MarketHours marketHours, MarketHours marketHours2, String str, BuySellData buySellData) {
        boolean z;
        this.instrument = instrument;
        this.shortingExperimentEnabled = bool;
        this.longOrderTimeInForce = orderTimeInForce;
        this.shortOrderTimeInForce = orderTimeInForce2;
        this.longOrderTradingSession = orderMarketHours;
        this.shortOrderTradingSession = orderMarketHours2;
        this.marketHours = marketHours;
        this.nextMarketHours = marketHours2;
        this.brokebackOrderExpireDateString = str;
        this.buySellData = buySellData;
        if (!Intrinsics.areEqual(bool, Boolean.TRUE) || buySellData == null) {
            z = false;
        } else {
            z = true;
            if (!buySellData.isSellToOpenEnabled(true)) {
            }
        }
        this.shortingEnabled = z;
    }

    public /* synthetic */ EquityTimeInForceDataState(Instrument instrument, Boolean bool, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, MarketHours marketHours, MarketHours marketHours2, String str, BuySellData buySellData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : orderTimeInForce, (i & 8) != 0 ? null : orderTimeInForce2, (i & 16) != 0 ? null : orderMarketHours, (i & 32) != 0 ? null : orderMarketHours2, (i & 64) != 0 ? null : marketHours, (i & 128) != 0 ? null : marketHours2, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : buySellData);
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    public final OrderTimeInForce getLongOrderTimeInForce() {
        return this.longOrderTimeInForce;
    }

    public final OrderTimeInForce getShortOrderTimeInForce() {
        return this.shortOrderTimeInForce;
    }

    public final OrderMarketHours getLongOrderTradingSession() {
        return this.longOrderTradingSession;
    }

    public final OrderMarketHours getShortOrderTradingSession() {
        return this.shortOrderTradingSession;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    public final ImmutableList<SelectionRowState<OrderTimeInForce>> getLongSelectionOptions() {
        TimeInForceUtils timeInForceUtils = TimeInForceUtils.INSTANCE;
        StringResource gfdTitle$default = TimeInForceUtils.getGfdTitle$default(timeInForceUtils, null, this.longOrderTradingSession, this.marketHours, this.nextMarketHours, null, 16, null);
        if (gfdTitle$default == null) {
            return extensions2.persistentListOf();
        }
        return extensions2.persistentListOf(new SelectionRowState(OrderTimeInForce.GFD, gfdTitle$default, timeInForceUtils.getGfdDetailText(this.longOrderTradingSession), false, 8, null), new SelectionRowState(OrderTimeInForce.GTC, TimeInForceUtils.getGtcTitle$default(timeInForceUtils, this.brokebackOrderExpireDateString, null, null, 6, null), timeInForceUtils.getGtcDetailText(), false, 8, null));
    }

    public final ImmutableList<SelectionRowState<OrderTimeInForce>> getShortSelectionOptions() {
        StringResource stringResourceInvoke;
        Instant extendedClosesAt;
        String str;
        Instant regularClosesAt;
        String str2;
        TimeInForceUtils timeInForceUtils = TimeInForceUtils.INSTANCE;
        if (TimeInForceUtils.getGfdTitle$default(timeInForceUtils, null, this.shortOrderTradingSession, this.marketHours, this.nextMarketHours, null, 16, null) == null || this.shortOrderTradingSession == null) {
            return extensions2.persistentListOf();
        }
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
        OrderMarketHours orderMarketHours = this.shortOrderTradingSession;
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
        return extensions2.persistentListOf(new SelectionRowState(orderTimeInForce, new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{stringResourceInvoke, StringResource.INSTANCE.invoke(C41827R.string.localdate_format_today, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText), timeInForceUtils.getGfdDetailText(this.shortOrderTradingSession), false, 8, null));
    }
}
