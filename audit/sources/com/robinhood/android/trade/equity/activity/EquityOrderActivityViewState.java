package com.robinhood.android.trade.equity.activity;

import com.robinhood.android.trade.equity.util.DefaultOrderType;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareOrder;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.TradingSession;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: EquityOrderActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010N\u001a\u00020\u000bHÆ\u0003J\t\u0010O\u001a\u00020\u000bHÆ\u0003JÈ\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020UHÖ\u0001J\t\u0010V\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\n\u0010&R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\f\u0010&R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010(R\u0011\u0010\u001b\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0013\u00104\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u0013\u00106\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b6\u0010&R\u0011\u00107\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010(R\u0014\u00108\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0014\u00109\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010(R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;", "", "instrumentId", "Ljava/util/UUID;", "instrument", "Lcom/robinhood/models/db/Instrument;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "completionUrl", "", "isPreIpo", "", "isOtc", "isTwentyFourHourMarketSession", "individualAccountNumber", "providedAccountNumber", "accountPosition", "Lcom/robinhood/models/db/Position;", "tradingSession", "Lcom/robinhood/models/db/TradingSession;", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "equityOrderFlowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "defaultableOrderConfiguration", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "isMarketBuysEnabled", "buyToCloseExperimentEnabled", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/models/db/DefaultableOrderConfiguration;ZZ)V", "getInstrumentId", "()Ljava/util/UUID;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getCompletionUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getIndividualAccountNumber", "getProvidedAccountNumber", "getAccountPosition", "()Lcom/robinhood/models/db/Position;", "getTradingSession", "()Lcom/robinhood/models/db/TradingSession;", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "getDefaultableOrderConfiguration", "()Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "getBuyToCloseExperimentEnabled", "accountNumber", "getAccountNumber", "isDefaultShares", "isSubOneShareShortPosition", "isSellToOpen", "isBuyToClose", "currentOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "getCurrentOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "defaultBuySellOrderConfiguration", "getDefaultBuySellOrderConfiguration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/models/db/DefaultableOrderConfiguration;ZZ)Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;", "equals", "other", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EquityOrderActivityViewState {
    public static final int $stable = 8;
    private final Position accountPosition;
    private final boolean buyToCloseExperimentEnabled;
    private final String completionUrl;
    private final DefaultableOrderConfiguration defaultableOrderConfiguration;
    private final EquityOrderFlowSource equityOrderFlowSource;
    private final String individualAccountNumber;
    private final Instrument instrument;
    private final UUID instrumentId;
    private final boolean isMarketBuysEnabled;
    private final Boolean isOtc;
    private final Boolean isPreIpo;
    private final boolean isTwentyFourHourMarketSession;
    private final EquityOrderConfiguration orderConfiguration;
    private final String providedAccountNumber;
    private final EquityOrderSide side;
    private final TradingSession tradingSession;

    public EquityOrderActivityViewState() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* renamed from: component13, reason: from getter */
    private final EquityOrderFlowSource getEquityOrderFlowSource() {
        return this.equityOrderFlowSource;
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final Position getAccountPosition() {
        return this.accountPosition;
    }

    /* renamed from: component11, reason: from getter */
    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component12, reason: from getter */
    public final EquityOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component14, reason: from getter */
    public final DefaultableOrderConfiguration getDefaultableOrderConfiguration() {
        return this.defaultableOrderConfiguration;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsMarketBuysEnabled() {
        return this.isMarketBuysEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getBuyToCloseExperimentEnabled() {
        return this.buyToCloseExperimentEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component3, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCompletionUrl() {
        return this.completionUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsPreIpo() {
        return this.isPreIpo;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsOtc() {
        return this.isOtc;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsTwentyFourHourMarketSession() {
        return this.isTwentyFourHourMarketSession;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final String getProvidedAccountNumber() {
        return this.providedAccountNumber;
    }

    public final EquityOrderActivityViewState copy(UUID instrumentId, Instrument instrument, EquityOrderSide side, String completionUrl, Boolean isPreIpo, Boolean isOtc, boolean isTwentyFourHourMarketSession, String individualAccountNumber, String providedAccountNumber, Position accountPosition, TradingSession tradingSession, EquityOrderConfiguration orderConfiguration, EquityOrderFlowSource equityOrderFlowSource, DefaultableOrderConfiguration defaultableOrderConfiguration, boolean isMarketBuysEnabled, boolean buyToCloseExperimentEnabled) {
        return new EquityOrderActivityViewState(instrumentId, instrument, side, completionUrl, isPreIpo, isOtc, isTwentyFourHourMarketSession, individualAccountNumber, providedAccountNumber, accountPosition, tradingSession, orderConfiguration, equityOrderFlowSource, defaultableOrderConfiguration, isMarketBuysEnabled, buyToCloseExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderActivityViewState)) {
            return false;
        }
        EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) other;
        return Intrinsics.areEqual(this.instrumentId, equityOrderActivityViewState.instrumentId) && Intrinsics.areEqual(this.instrument, equityOrderActivityViewState.instrument) && this.side == equityOrderActivityViewState.side && Intrinsics.areEqual(this.completionUrl, equityOrderActivityViewState.completionUrl) && Intrinsics.areEqual(this.isPreIpo, equityOrderActivityViewState.isPreIpo) && Intrinsics.areEqual(this.isOtc, equityOrderActivityViewState.isOtc) && this.isTwentyFourHourMarketSession == equityOrderActivityViewState.isTwentyFourHourMarketSession && Intrinsics.areEqual(this.individualAccountNumber, equityOrderActivityViewState.individualAccountNumber) && Intrinsics.areEqual(this.providedAccountNumber, equityOrderActivityViewState.providedAccountNumber) && Intrinsics.areEqual(this.accountPosition, equityOrderActivityViewState.accountPosition) && Intrinsics.areEqual(this.tradingSession, equityOrderActivityViewState.tradingSession) && Intrinsics.areEqual(this.orderConfiguration, equityOrderActivityViewState.orderConfiguration) && this.equityOrderFlowSource == equityOrderActivityViewState.equityOrderFlowSource && this.defaultableOrderConfiguration == equityOrderActivityViewState.defaultableOrderConfiguration && this.isMarketBuysEnabled == equityOrderActivityViewState.isMarketBuysEnabled && this.buyToCloseExperimentEnabled == equityOrderActivityViewState.buyToCloseExperimentEnabled;
    }

    public int hashCode() {
        UUID uuid = this.instrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        EquityOrderSide equityOrderSide = this.side;
        int iHashCode3 = (iHashCode2 + (equityOrderSide == null ? 0 : equityOrderSide.hashCode())) * 31;
        String str = this.completionUrl;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isPreIpo;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOtc;
        int iHashCode6 = (((iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.isTwentyFourHourMarketSession)) * 31;
        String str2 = this.individualAccountNumber;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.providedAccountNumber;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Position position = this.accountPosition;
        int iHashCode9 = (iHashCode8 + (position == null ? 0 : position.hashCode())) * 31;
        TradingSession tradingSession = this.tradingSession;
        int iHashCode10 = (iHashCode9 + (tradingSession == null ? 0 : tradingSession.hashCode())) * 31;
        EquityOrderConfiguration equityOrderConfiguration = this.orderConfiguration;
        int iHashCode11 = (iHashCode10 + (equityOrderConfiguration == null ? 0 : equityOrderConfiguration.hashCode())) * 31;
        EquityOrderFlowSource equityOrderFlowSource = this.equityOrderFlowSource;
        int iHashCode12 = (iHashCode11 + (equityOrderFlowSource == null ? 0 : equityOrderFlowSource.hashCode())) * 31;
        DefaultableOrderConfiguration defaultableOrderConfiguration = this.defaultableOrderConfiguration;
        return ((((iHashCode12 + (defaultableOrderConfiguration != null ? defaultableOrderConfiguration.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMarketBuysEnabled)) * 31) + Boolean.hashCode(this.buyToCloseExperimentEnabled);
    }

    public String toString() {
        return "EquityOrderActivityViewState(instrumentId=" + this.instrumentId + ", instrument=" + this.instrument + ", side=" + this.side + ", completionUrl=" + this.completionUrl + ", isPreIpo=" + this.isPreIpo + ", isOtc=" + this.isOtc + ", isTwentyFourHourMarketSession=" + this.isTwentyFourHourMarketSession + ", individualAccountNumber=" + this.individualAccountNumber + ", providedAccountNumber=" + this.providedAccountNumber + ", accountPosition=" + this.accountPosition + ", tradingSession=" + this.tradingSession + ", orderConfiguration=" + this.orderConfiguration + ", equityOrderFlowSource=" + this.equityOrderFlowSource + ", defaultableOrderConfiguration=" + this.defaultableOrderConfiguration + ", isMarketBuysEnabled=" + this.isMarketBuysEnabled + ", buyToCloseExperimentEnabled=" + this.buyToCloseExperimentEnabled + ")";
    }

    public EquityOrderActivityViewState(UUID uuid, Instrument instrument, EquityOrderSide equityOrderSide, String str, Boolean bool, Boolean bool2, boolean z, String str2, String str3, Position position, TradingSession tradingSession, EquityOrderConfiguration equityOrderConfiguration, EquityOrderFlowSource equityOrderFlowSource, DefaultableOrderConfiguration defaultableOrderConfiguration, boolean z2, boolean z3) {
        this.instrumentId = uuid;
        this.instrument = instrument;
        this.side = equityOrderSide;
        this.completionUrl = str;
        this.isPreIpo = bool;
        this.isOtc = bool2;
        this.isTwentyFourHourMarketSession = z;
        this.individualAccountNumber = str2;
        this.providedAccountNumber = str3;
        this.accountPosition = position;
        this.tradingSession = tradingSession;
        this.orderConfiguration = equityOrderConfiguration;
        this.equityOrderFlowSource = equityOrderFlowSource;
        this.defaultableOrderConfiguration = defaultableOrderConfiguration;
        this.isMarketBuysEnabled = z2;
        this.buyToCloseExperimentEnabled = z3;
    }

    public /* synthetic */ EquityOrderActivityViewState(UUID uuid, Instrument instrument, EquityOrderSide equityOrderSide, String str, Boolean bool, Boolean bool2, boolean z, String str2, String str3, Position position, TradingSession tradingSession, EquityOrderConfiguration equityOrderConfiguration, EquityOrderFlowSource equityOrderFlowSource, DefaultableOrderConfiguration defaultableOrderConfiguration, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : equityOrderSide, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : position, (i & 1024) != 0 ? null : tradingSession, (i & 2048) != 0 ? null : equityOrderConfiguration, (i & 4096) != 0 ? null : equityOrderFlowSource, (i & 8192) != 0 ? null : defaultableOrderConfiguration, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? false : z3);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final EquityOrderSide getSide() {
        return this.side;
    }

    public final String getCompletionUrl() {
        return this.completionUrl;
    }

    public final Boolean isPreIpo() {
        return this.isPreIpo;
    }

    public final Boolean isOtc() {
        return this.isOtc;
    }

    public final boolean isTwentyFourHourMarketSession() {
        return this.isTwentyFourHourMarketSession;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final String getProvidedAccountNumber() {
        return this.providedAccountNumber;
    }

    public final Position getAccountPosition() {
        return this.accountPosition;
    }

    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    public final EquityOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    public final DefaultableOrderConfiguration getDefaultableOrderConfiguration() {
        return this.defaultableOrderConfiguration;
    }

    public final boolean isMarketBuysEnabled() {
        return this.isMarketBuysEnabled;
    }

    public final boolean getBuyToCloseExperimentEnabled() {
        return this.buyToCloseExperimentEnabled;
    }

    public final String getAccountNumber() {
        String str = this.providedAccountNumber;
        return str == null ? this.individualAccountNumber : str;
    }

    public final Boolean isDefaultShares() {
        Boolean bool = this.isPreIpo;
        if (bool != null) {
            return Boolean.valueOf(this.defaultableOrderConfiguration == DefaultableOrderConfiguration.SHARE || bool.booleanValue());
        }
        return null;
    }

    public final boolean isSubOneShareShortPosition() {
        Position position = this.accountPosition;
        return position != null && position.getQuantity().compareTo(BigDecimal.ONE.negate()) > 0 && this.accountPosition.getQuantity().compareTo(BigDecimal.ZERO) < 0;
    }

    private final boolean isSellToOpen() {
        return this.side == EquityOrderSide.SELL_SHORT;
    }

    private final boolean isBuyToClose() {
        Position position;
        return this.side == EquityOrderSide.BUY && (position = this.accountPosition) != null && Position5.isShortPosition(position) && this.buyToCloseExperimentEnabled;
    }

    public final EquityOrderConfiguration.Resolved getCurrentOrderConfiguration() {
        EquityOrderConfiguration equityOrderConfiguration = this.orderConfiguration;
        EquityOrderConfiguration.Resolved resolved = equityOrderConfiguration instanceof EquityOrderConfiguration.Resolved ? (EquityOrderConfiguration.Resolved) equityOrderConfiguration : null;
        return resolved == null ? getDefaultBuySellOrderConfiguration() : resolved;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final EquityOrderConfiguration.Resolved getDefaultBuySellOrderConfiguration() {
        Boolean boolIsDefaultShares;
        boolean z;
        Instrument instrument;
        Boolean bool = this.isOtc;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            String accountNumber = getAccountNumber();
            if (accountNumber != null && (boolIsDefaultShares = isDefaultShares()) != null) {
                boolean zBooleanValue2 = boolIsDefaultShares.booleanValue();
                EquityOrderSide equityOrderSide = this.side;
                if (equityOrderSide == null) {
                    return null;
                }
                if (isSellToOpen() || Position5.isShortPosition(this.accountPosition)) {
                    z = true;
                } else {
                    EquityOrderConfiguration equityOrderConfiguration = this.orderConfiguration;
                    if ((equityOrderConfiguration != null ? equityOrderConfiguration.getOrderAmountType() : null) != DefaultableOrderConfiguration.SHARE && !zBooleanValue2) {
                        z = false;
                    }
                }
                boolean z2 = z;
                TradingSession tradingSession = this.tradingSession;
                if (tradingSession == null || (instrument = this.instrument) == null) {
                    return null;
                }
                EquityOrderConfiguration equityOrderConfiguration2 = this.orderConfiguration;
                ShareOrder shareOrder = equityOrderConfiguration2 instanceof ShareOrder ? (ShareOrder) equityOrderConfiguration2 : null;
                return DefaultOrderType.determineDefaultOrderType(tradingSession, instrument, z2, equityOrderSide, accountNumber, shareOrder != null ? shareOrder.getShareQuantity() : null, zBooleanValue, this.isMarketBuysEnabled, isBuyToClose(), isSubOneShareShortPosition());
            }
        }
        return null;
    }
}
