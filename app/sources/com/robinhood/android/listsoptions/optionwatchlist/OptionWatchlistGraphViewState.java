package com.robinhood.android.listsoptions.optionwatchlist;

import com.robinhood.android.graph.GraphLayoutViewModel;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.FakeDataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.UiOptionHistorical;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: OptionWatchlistGraphViewState.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J\u0084\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u0010$J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bL\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bN\u00100R\u0019\u0010P\u001a\u0004\u0018\u00010O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010T\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010X\u001a\u0004\u0018\u00010O8\u0006¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010SR\u0019\u0010Z\u001a\u0004\u0018\u0001088\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bZ\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020^0]8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0013\u0010e\u001a\u0004\u0018\u00010b8F¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;", "", "j$/time/Instant", "addedTime", "Lcom/robinhood/models/ui/UiOptionHistorical;", "historical", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "lateCloseState", "", "itemCount", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "Lcom/robinhood/models/db/OptionQuote;", "optionQuote", "Ljava/util/UUID;", "optionWatchlistId", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "<init>", "(Lj$/time/Instant;Lcom/robinhood/models/ui/UiOptionHistorical;Lcom/robinhood/models/db/OptionChain$LateCloseState;ILcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionQuote;Ljava/util/UUID;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "Lcom/robinhood/models/ui/GraphSelection;", "graphSelection", "Lcom/robinhood/android/graph/spark/GraphData;", "getGraphData", "(Lcom/robinhood/models/ui/GraphSelection;)Lcom/robinhood/android/graph/spark/GraphData;", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/models/ui/UiOptionHistorical;", "component3", "()Lcom/robinhood/models/db/OptionChain$LateCloseState;", "component4", "()I", "component5", "()Lcom/robinhood/models/db/MarketHours;", "component6", "()Lcom/robinhood/models/db/OptionChain;", "component7", "()Lcom/robinhood/models/db/OptionInstrument;", "component8", "()Lcom/robinhood/models/db/OptionQuote;", "component9", "()Ljava/util/UUID;", "component10", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "copy", "(Lj$/time/Instant;Lcom/robinhood/models/ui/UiOptionHistorical;Lcom/robinhood/models/db/OptionChain$LateCloseState;ILcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionQuote;Ljava/util/UUID;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getAddedTime", "Lcom/robinhood/models/ui/UiOptionHistorical;", "getHistorical", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "getLateCloseState", "I", "getItemCount", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Lcom/robinhood/models/db/OptionChain;", "getOptionChain", "Lcom/robinhood/models/db/OptionInstrument;", "getOptionInstrument", "Lcom/robinhood/models/db/OptionQuote;", "getOptionQuote", "Ljava/util/UUID;", "getOptionWatchlistId", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingType", "j$/time/LocalDate", "addedDate", "Lj$/time/LocalDate;", "getAddedDate", "()Lj$/time/LocalDate;", "daysSinceAddedToWatchlist", "Ljava/lang/Integer;", "getDaysSinceAddedToWatchlist", "()Ljava/lang/Integer;", "expirationDate", "getExpirationDate", "isOptionExpired", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "", "Lcom/robinhood/models/ui/DataPoint$Asset;", "getGraphDataPoints", "()Ljava/util/List;", "graphDataPoints", "Lcom/robinhood/android/graph/GraphLayoutViewModel;", "getGraphLayoutViewModel", "()Lcom/robinhood/android/graph/GraphLayoutViewModel;", "graphLayoutViewModel", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class OptionWatchlistGraphViewState {
    private final LocalDate addedDate;
    private final Instant addedTime;
    private final Integer daysSinceAddedToWatchlist;
    private final LocalDate expirationDate;
    private final UiOptionHistorical historical;
    private final Boolean isOptionExpired;
    private final int itemCount;
    private final OptionChain.LateCloseState lateCloseState;
    private final MarketHours marketHours;
    private final OptionChain optionChain;
    private final OptionInstrument optionInstrument;
    private final OptionQuote optionQuote;
    private final UUID optionWatchlistId;
    private final OptionChain.UnderlyingType underlyingType;

    public OptionWatchlistGraphViewState() {
        this(null, null, null, 0, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ OptionWatchlistGraphViewState copy$default(OptionWatchlistGraphViewState optionWatchlistGraphViewState, Instant instant, UiOptionHistorical uiOptionHistorical, OptionChain.LateCloseState lateCloseState, int i, MarketHours marketHours, OptionChain optionChain, OptionInstrument optionInstrument, OptionQuote optionQuote, UUID uuid, OptionChain.UnderlyingType underlyingType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            instant = optionWatchlistGraphViewState.addedTime;
        }
        if ((i2 & 2) != 0) {
            uiOptionHistorical = optionWatchlistGraphViewState.historical;
        }
        if ((i2 & 4) != 0) {
            lateCloseState = optionWatchlistGraphViewState.lateCloseState;
        }
        if ((i2 & 8) != 0) {
            i = optionWatchlistGraphViewState.itemCount;
        }
        if ((i2 & 16) != 0) {
            marketHours = optionWatchlistGraphViewState.marketHours;
        }
        if ((i2 & 32) != 0) {
            optionChain = optionWatchlistGraphViewState.optionChain;
        }
        if ((i2 & 64) != 0) {
            optionInstrument = optionWatchlistGraphViewState.optionInstrument;
        }
        if ((i2 & 128) != 0) {
            optionQuote = optionWatchlistGraphViewState.optionQuote;
        }
        if ((i2 & 256) != 0) {
            uuid = optionWatchlistGraphViewState.optionWatchlistId;
        }
        if ((i2 & 512) != 0) {
            underlyingType = optionWatchlistGraphViewState.underlyingType;
        }
        UUID uuid2 = uuid;
        OptionChain.UnderlyingType underlyingType2 = underlyingType;
        OptionInstrument optionInstrument2 = optionInstrument;
        OptionQuote optionQuote2 = optionQuote;
        MarketHours marketHours2 = marketHours;
        OptionChain optionChain2 = optionChain;
        return optionWatchlistGraphViewState.copy(instant, uiOptionHistorical, lateCloseState, i, marketHours2, optionChain2, optionInstrument2, optionQuote2, uuid2, underlyingType2);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getAddedTime() {
        return this.addedTime;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    /* renamed from: component2, reason: from getter */
    public final UiOptionHistorical getHistorical() {
        return this.historical;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChain.LateCloseState getLateCloseState() {
        return this.lateCloseState;
    }

    /* renamed from: component4, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    /* renamed from: component5, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getOptionWatchlistId() {
        return this.optionWatchlistId;
    }

    public final OptionWatchlistGraphViewState copy(Instant addedTime, UiOptionHistorical historical, OptionChain.LateCloseState lateCloseState, int itemCount, MarketHours marketHours, OptionChain optionChain, OptionInstrument optionInstrument, OptionQuote optionQuote, UUID optionWatchlistId, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
        return new OptionWatchlistGraphViewState(addedTime, historical, lateCloseState, itemCount, marketHours, optionChain, optionInstrument, optionQuote, optionWatchlistId, underlyingType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionWatchlistGraphViewState)) {
            return false;
        }
        OptionWatchlistGraphViewState optionWatchlistGraphViewState = (OptionWatchlistGraphViewState) other;
        return Intrinsics.areEqual(this.addedTime, optionWatchlistGraphViewState.addedTime) && Intrinsics.areEqual(this.historical, optionWatchlistGraphViewState.historical) && this.lateCloseState == optionWatchlistGraphViewState.lateCloseState && this.itemCount == optionWatchlistGraphViewState.itemCount && Intrinsics.areEqual(this.marketHours, optionWatchlistGraphViewState.marketHours) && Intrinsics.areEqual(this.optionChain, optionWatchlistGraphViewState.optionChain) && Intrinsics.areEqual(this.optionInstrument, optionWatchlistGraphViewState.optionInstrument) && Intrinsics.areEqual(this.optionQuote, optionWatchlistGraphViewState.optionQuote) && Intrinsics.areEqual(this.optionWatchlistId, optionWatchlistGraphViewState.optionWatchlistId) && this.underlyingType == optionWatchlistGraphViewState.underlyingType;
    }

    public int hashCode() {
        Instant instant = this.addedTime;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        UiOptionHistorical uiOptionHistorical = this.historical;
        int iHashCode2 = (((((iHashCode + (uiOptionHistorical == null ? 0 : uiOptionHistorical.hashCode())) * 31) + this.lateCloseState.hashCode()) * 31) + Integer.hashCode(this.itemCount)) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode3 = (iHashCode2 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        OptionChain optionChain = this.optionChain;
        int iHashCode4 = (iHashCode3 + (optionChain == null ? 0 : optionChain.hashCode())) * 31;
        OptionInstrument optionInstrument = this.optionInstrument;
        int iHashCode5 = (iHashCode4 + (optionInstrument == null ? 0 : optionInstrument.hashCode())) * 31;
        OptionQuote optionQuote = this.optionQuote;
        int iHashCode6 = (iHashCode5 + (optionQuote == null ? 0 : optionQuote.hashCode())) * 31;
        UUID uuid = this.optionWatchlistId;
        int iHashCode7 = (iHashCode6 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        OptionChain.UnderlyingType underlyingType = this.underlyingType;
        return iHashCode7 + (underlyingType != null ? underlyingType.hashCode() : 0);
    }

    public String toString() {
        return "OptionWatchlistGraphViewState(addedTime=" + this.addedTime + ", historical=" + this.historical + ", lateCloseState=" + this.lateCloseState + ", itemCount=" + this.itemCount + ", marketHours=" + this.marketHours + ", optionChain=" + this.optionChain + ", optionInstrument=" + this.optionInstrument + ", optionQuote=" + this.optionQuote + ", optionWatchlistId=" + this.optionWatchlistId + ", underlyingType=" + this.underlyingType + ")";
    }

    public OptionWatchlistGraphViewState(Instant instant, UiOptionHistorical uiOptionHistorical, OptionChain.LateCloseState lateCloseState, int i, MarketHours marketHours, OptionChain optionChain, OptionInstrument optionInstrument, OptionQuote optionQuote, UUID uuid, OptionChain.UnderlyingType underlyingType) {
        LocalDate localDate;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
        this.addedTime = instant;
        this.historical = uiOptionHistorical;
        this.lateCloseState = lateCloseState;
        this.itemCount = i;
        this.marketHours = marketHours;
        this.optionChain = optionChain;
        this.optionInstrument = optionInstrument;
        this.optionQuote = optionQuote;
        this.optionWatchlistId = uuid;
        this.underlyingType = underlyingType;
        if (instant != null) {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            localDate = Instants.toLocalDate(instant, zoneIdSystemDefault);
        } else {
            localDate = null;
        }
        this.addedDate = localDate;
        if (instant != null) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            numValueOf = Integer.valueOf(Instants.daysUntil(instant, localDateNow));
        } else {
            numValueOf = null;
        }
        this.daysSinceAddedToWatchlist = numValueOf;
        this.expirationDate = optionInstrument != null ? optionInstrument.getExpirationDate() : null;
        this.isOptionExpired = optionInstrument != null ? Boolean.valueOf(optionInstrument.isExpired()) : null;
    }

    public final Instant getAddedTime() {
        return this.addedTime;
    }

    public final UiOptionHistorical getHistorical() {
        return this.historical;
    }

    public /* synthetic */ OptionWatchlistGraphViewState(Instant instant, UiOptionHistorical uiOptionHistorical, OptionChain.LateCloseState lateCloseState, int i, MarketHours marketHours, OptionChain optionChain, OptionInstrument optionInstrument, OptionQuote optionQuote, UUID uuid, OptionChain.UnderlyingType underlyingType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : instant, (i2 & 2) != 0 ? null : uiOptionHistorical, (i2 & 4) != 0 ? (OptionChain.LateCloseState) OptionChain.LateCloseState.INSTANCE.getDefault() : lateCloseState, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : marketHours, (i2 & 32) != 0 ? null : optionChain, (i2 & 64) != 0 ? null : optionInstrument, (i2 & 128) != 0 ? null : optionQuote, (i2 & 256) != 0 ? null : uuid, (i2 & 512) != 0 ? null : underlyingType);
    }

    public final OptionChain.LateCloseState getLateCloseState() {
        return this.lateCloseState;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final OptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    public final UUID getOptionWatchlistId() {
        return this.optionWatchlistId;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final LocalDate getAddedDate() {
        return this.addedDate;
    }

    public final Integer getDaysSinceAddedToWatchlist() {
        return this.daysSinceAddedToWatchlist;
    }

    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: isOptionExpired, reason: from getter */
    public final Boolean getIsOptionExpired() {
        return this.isOptionExpired;
    }

    private final List<DataPoint.Asset> getGraphDataPoints() {
        Instant instantNow;
        LocalDate localDate;
        UiOptionHistorical uiOptionHistorical = this.historical;
        if (uiOptionHistorical == null || this.addedTime == null) {
            return CollectionsKt.emptyList();
        }
        List<DataPoint.Asset> dataPoints = uiOptionHistorical.getDataPoints();
        if (Intrinsics.areEqual(this.isOptionExpired, Boolean.TRUE) && (localDate = this.expirationDate) != null) {
            instantNow = localDate.plusDays(1L).atStartOfDay(ZoneId.systemDefault()).toInstant();
        } else {
            instantNow = Instant.now();
        }
        Iterator<DataPoint.Asset> it = dataPoints.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getTime(this.historical.getInterval()).isAfter(this.addedTime)) {
                break;
            }
            size++;
        }
        Iterator<DataPoint.Asset> it2 = dataPoints.iterator();
        int size2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                size2 = -1;
                break;
            }
            if (it2.next().getTime(this.historical.getInterval()).isAfter(instantNow)) {
                break;
            }
            size2++;
        }
        if (size == -1) {
            size = dataPoints.size();
        }
        if (size2 == -1) {
            size2 = dataPoints.size();
        }
        List<DataPoint.Asset> listSubList = size < size2 ? dataPoints.subList(size, size2) : CollectionsKt.emptyList();
        if (this.optionQuote != null && Intrinsics.areEqual(this.isOptionExpired, Boolean.FALSE)) {
            BigDecimal unsignedValue = this.optionQuote.getAdjustedMarkPrice().getUnsignedValue();
            List<DataPoint.Asset> list = listSubList;
            Currency currency = Currencies.USD;
            Money money = Money3.toMoney(unsignedValue, currency);
            Money money2 = Money3.toMoney(unsignedValue, currency);
            Instant receivedAt = this.optionQuote.getReceivedAt();
            DataPoint.Asset asset = (DataPoint.Asset) CollectionsKt.lastOrNull((List) this.historical.getDataPoints());
            listSubList = CollectionsKt.plus((Collection<? extends FakeDataPoint>) list, new FakeDataPoint(money, money2, receivedAt, asset != null ? asset.getSession() : null));
        }
        return listSubList.size() == 1 ? CollectionsKt.listOf((Object[]) new DataPoint.Asset[]{listSubList.get(0), listSubList.get(0)}) : listSubList;
    }

    public final GraphLayoutViewModel getGraphLayoutViewModel() {
        if (this.optionQuote == null) {
            return null;
        }
        return new GraphLayoutViewModel.Asset(this.optionQuote.isStaleForUi(), this.optionQuote.getAdjustedMarkPrice().getUnsignedValue(), null);
    }

    public final GraphData getGraphData(GraphSelection graphSelection) {
        MarketHours marketHours;
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        if (this.historical == null || (marketHours = this.marketHours) == null) {
            return null;
        }
        return GraphData.Companion.forOptionHistorical$default(GraphData.INSTANCE, null, marketHours, getGraphDataPoints(), Money3.getBigDecimalCompat(this.historical.getPreviousClose()), graphSelection, this.historical.getInterval(), this.lateCloseState.getIsLateClosing(), this.historical.isStaleForUi(), false, false, null, true, true, 1536, null);
    }
}
