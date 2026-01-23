package com.robinhood.android.common.buysell;

import com.robinhood.android.equities.ordertypeschedule.SupportedOrderTypes;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: BuySellData.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u008e\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010 R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\b\f\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010+R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bG\u0010+R\u0017\u0010H\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010\u0018R\u0017\u0010J\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010\u0018R\u0017\u0010L\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010\u0018R\u0017\u0010N\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bO\u0010\u0018R\u0017\u0010P\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bP\u0010@\u001a\u0004\bQ\u0010\u0018R\u0014\u0010R\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010@R\u0017\u0010S\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bS\u0010\u0018R\u0019\u0010T\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010X\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bX\u0010@\u001a\u0004\bY\u0010\u0018R\u0017\u0010Z\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010@\u001a\u0004\bZ\u0010\u0018R\u0017\u0010[\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b[\u0010@\u001a\u0004\b[\u0010\u0018R\u0017\u0010\\\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\\\u0010@\u001a\u0004\b\\\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010@\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010]\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b]\u0010@\u001a\u0004\b^\u0010\u0018R\u0017\u0010_\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b_\u0010@\u001a\u0004\b`\u0010\u0018R\u0011\u0010a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\ba\u0010\u0018¨\u0006b"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/BuySellData;", "", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;", "positionOptional", "Lcom/robinhood/models/db/Quote;", "quote", "", "isInMarginCall", "Lcom/robinhood/models/db/TradingSession;", "tradingSession", "j$/time/Clock", Card.Icon.CLOCK, "equitiesSubzeroExperimentEnabled", "canUpgradeToOptions", "hasAccessToOptions", "marginInvestingEligible", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/utils/Optional;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/models/db/TradingSession;Lj$/time/Clock;Ljava/lang/Boolean;ZZLjava/lang/Boolean;)V", "component9", "()Z", "component10", "ignorePosition", "isSellToOpenEnabled", "(Z)Z", "component1", "()Lcom/robinhood/models/db/Account;", "component2", "()Lcom/robinhood/models/db/Instrument;", "component3", "()Lcom/robinhood/utils/Optional;", "component4", "()Lcom/robinhood/models/db/Quote;", "component5", "component6", "()Lcom/robinhood/models/db/TradingSession;", "component7", "()Lj$/time/Clock;", "component8", "()Ljava/lang/Boolean;", "component11", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/utils/Optional;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/models/db/TradingSession;Lj$/time/Clock;Ljava/lang/Boolean;ZZLjava/lang/Boolean;)Lcom/robinhood/android/common/buysell/BuySellData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "Lcom/robinhood/utils/Optional;", "getPositionOptional", "Lcom/robinhood/models/db/Quote;", "getQuote", "Z", "Lcom/robinhood/models/db/TradingSession;", "getTradingSession", "Lj$/time/Clock;", "getClock", "Ljava/lang/Boolean;", "getEquitiesSubzeroExperimentEnabled", "getMarginInvestingEligible", "hasAccount", "getHasAccount", "accountIsManaged", "getAccountIsManaged", "accountRestrictsOpeningPositions", "getAccountRestrictsOpeningPositions", "accountHasAccessToOptions", "getAccountHasAccessToOptions", "accountCanUpgradeToOptions", "getAccountCanUpgradeToOptions", "instrumentAllowsSells", "isTradingHalted", "position", "Lcom/robinhood/models/db/Position;", "getPosition", "()Lcom/robinhood/models/db/Position;", "userHasShares", "getUserHasShares", "isBuyToOpenEnabled", "isSellToCloseEnabled", "isBuyToCloseEnabled", "sellToOpenAnySessionActive", "getSellToOpenAnySessionActive", "sellToOpenMarketSessionActive", "getSellToOpenMarketSessionActive", "isLoaded", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BuySellData {
    private final Account account;
    private final boolean accountCanUpgradeToOptions;
    private final boolean accountHasAccessToOptions;
    private final boolean accountIsManaged;
    private final boolean accountRestrictsOpeningPositions;
    private final boolean canUpgradeToOptions;
    private final Clock clock;
    private final Boolean equitiesSubzeroExperimentEnabled;
    private final boolean hasAccessToOptions;
    private final boolean hasAccount;
    private final Instrument instrument;
    private final boolean instrumentAllowsSells;
    private final boolean isBuyToCloseEnabled;
    private final boolean isBuyToOpenEnabled;
    private final boolean isInMarginCall;
    private final boolean isSellToCloseEnabled;
    private final boolean isSellToOpenEnabled;
    private final boolean isTradingHalted;
    private final Boolean marginInvestingEligible;
    private final Position position;
    private final Optional<Position> positionOptional;
    private final Quote quote;
    private final boolean sellToOpenAnySessionActive;
    private final boolean sellToOpenMarketSessionActive;
    private final TradingSession tradingSession;
    private final boolean userHasShares;

    /* renamed from: component10, reason: from getter */
    private final boolean getHasAccessToOptions() {
        return this.hasAccessToOptions;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getCanUpgradeToOptions() {
        return this.canUpgradeToOptions;
    }

    public static /* synthetic */ BuySellData copy$default(BuySellData buySellData, Account account, Instrument instrument, Optional optional, Quote quote, boolean z, TradingSession tradingSession, Clock clock, Boolean bool, boolean z2, boolean z3, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            account = buySellData.account;
        }
        if ((i & 2) != 0) {
            instrument = buySellData.instrument;
        }
        if ((i & 4) != 0) {
            optional = buySellData.positionOptional;
        }
        if ((i & 8) != 0) {
            quote = buySellData.quote;
        }
        if ((i & 16) != 0) {
            z = buySellData.isInMarginCall;
        }
        if ((i & 32) != 0) {
            tradingSession = buySellData.tradingSession;
        }
        if ((i & 64) != 0) {
            clock = buySellData.clock;
        }
        if ((i & 128) != 0) {
            bool = buySellData.equitiesSubzeroExperimentEnabled;
        }
        if ((i & 256) != 0) {
            z2 = buySellData.canUpgradeToOptions;
        }
        if ((i & 512) != 0) {
            z3 = buySellData.hasAccessToOptions;
        }
        if ((i & 1024) != 0) {
            bool2 = buySellData.marginInvestingEligible;
        }
        boolean z4 = z3;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        boolean z5 = z2;
        TradingSession tradingSession2 = tradingSession;
        Clock clock2 = clock;
        boolean z6 = z;
        Optional optional2 = optional;
        return buySellData.copy(account, instrument, optional2, quote, z6, tradingSession2, clock2, bool4, z5, z4, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getMarginInvestingEligible() {
        return this.marginInvestingEligible;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Optional<Position> component3() {
        return this.positionOptional;
    }

    /* renamed from: component4, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInMarginCall() {
        return this.isInMarginCall;
    }

    /* renamed from: component6, reason: from getter */
    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component7, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getEquitiesSubzeroExperimentEnabled() {
        return this.equitiesSubzeroExperimentEnabled;
    }

    public final BuySellData copy(Account account, Instrument instrument, Optional<Position> positionOptional, Quote quote, boolean isInMarginCall, TradingSession tradingSession, Clock clock, Boolean equitiesSubzeroExperimentEnabled, boolean canUpgradeToOptions, boolean hasAccessToOptions, Boolean marginInvestingEligible) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return new BuySellData(account, instrument, positionOptional, quote, isInMarginCall, tradingSession, clock, equitiesSubzeroExperimentEnabled, canUpgradeToOptions, hasAccessToOptions, marginInvestingEligible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuySellData)) {
            return false;
        }
        BuySellData buySellData = (BuySellData) other;
        return Intrinsics.areEqual(this.account, buySellData.account) && Intrinsics.areEqual(this.instrument, buySellData.instrument) && Intrinsics.areEqual(this.positionOptional, buySellData.positionOptional) && Intrinsics.areEqual(this.quote, buySellData.quote) && this.isInMarginCall == buySellData.isInMarginCall && Intrinsics.areEqual(this.tradingSession, buySellData.tradingSession) && Intrinsics.areEqual(this.clock, buySellData.clock) && Intrinsics.areEqual(this.equitiesSubzeroExperimentEnabled, buySellData.equitiesSubzeroExperimentEnabled) && this.canUpgradeToOptions == buySellData.canUpgradeToOptions && this.hasAccessToOptions == buySellData.hasAccessToOptions && Intrinsics.areEqual(this.marginInvestingEligible, buySellData.marginInvestingEligible);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + this.instrument.hashCode()) * 31;
        Optional<Position> optional = this.positionOptional;
        int iHashCode2 = (iHashCode + (optional == null ? 0 : optional.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode3 = (((((((iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31) + Boolean.hashCode(this.isInMarginCall)) * 31) + this.tradingSession.hashCode()) * 31) + this.clock.hashCode()) * 31;
        Boolean bool = this.equitiesSubzeroExperimentEnabled;
        int iHashCode4 = (((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.canUpgradeToOptions)) * 31) + Boolean.hashCode(this.hasAccessToOptions)) * 31;
        Boolean bool2 = this.marginInvestingEligible;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "BuySellData(account=" + this.account + ", instrument=" + this.instrument + ", positionOptional=" + this.positionOptional + ", quote=" + this.quote + ", isInMarginCall=" + this.isInMarginCall + ", tradingSession=" + this.tradingSession + ", clock=" + this.clock + ", equitiesSubzeroExperimentEnabled=" + this.equitiesSubzeroExperimentEnabled + ", canUpgradeToOptions=" + this.canUpgradeToOptions + ", hasAccessToOptions=" + this.hasAccessToOptions + ", marginInvestingEligible=" + this.marginInvestingEligible + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BuySellData(Account account, Instrument instrument, Optional<Position> optional, Quote quote, boolean z, TradingSession tradingSession, Clock clock, Boolean bool, boolean z2, boolean z3, Boolean bool2) {
        boolean z4;
        boolean z5;
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.account = account;
        this.instrument = instrument;
        this.positionOptional = optional;
        this.quote = quote;
        this.isInMarginCall = z;
        this.tradingSession = tradingSession;
        this.clock = clock;
        this.equitiesSubzeroExperimentEnabled = bool;
        this.canUpgradeToOptions = z2;
        this.hasAccessToOptions = z3;
        this.marginInvestingEligible = bool2;
        boolean z6 = false;
        boolean z7 = account != null;
        this.hasAccount = z7;
        boolean zIsManaged = account != null ? account.isManaged() : false;
        this.accountIsManaged = zIsManaged;
        boolean onlyPositionClosingTrades = account != null ? account.getOnlyPositionClosingTrades() : true;
        this.accountRestrictsOpeningPositions = onlyPositionClosingTrades;
        this.accountHasAccessToOptions = z7 && !zIsManaged && z3;
        this.accountCanUpgradeToOptions = z7 && z2;
        boolean allowsSells = instrument.getAllowsSells();
        this.instrumentAllowsSells = allowsSells;
        boolean tradingHalted = quote != null ? quote.getTradingHalted() : false;
        this.isTradingHalted = tradingHalted;
        Position orNull = optional != null ? optional.getOrNull() : null;
        this.position = orNull;
        boolean hasPosition = Position5.getHasPosition(orNull);
        this.userHasShares = hasPosition;
        this.isBuyToOpenEnabled = (onlyPositionClosingTrades || zIsManaged || !instrument.getAllowsBuyToOpen() || tradingHalted || z || (Position5.isShortPositionOrPending(orNull) && (!Position5.isShortPosition(orNull) || Intrinsics.areEqual(bool, Boolean.TRUE)))) ? false : true;
        boolean z8 = z7 && !zIsManaged && allowsSells && !tradingHalted && orNull != null && Position5.isLongPosition(orNull);
        this.isSellToCloseEnabled = z8;
        boolean z9 = !zIsManaged && instrument.getAllowsBuyToClose() && !tradingHalted && orNull != null && Position5.isShortPosition(orNull) && Intrinsics.areEqual(bool, Boolean.TRUE);
        this.isBuyToCloseEnabled = z9;
        boolean zIsSellToOpenEnabled = isSellToOpenEnabled(false);
        this.isSellToOpenEnabled = zIsSellToOpenEnabled;
        if (zIsSellToOpenEnabled) {
            EquityOrderSide equityOrderSide = EquityOrderSide.SELL_SHORT;
            BigDecimal quantity2 = (orNull == null || (quantity2 = orNull.getQuantity()) == null) ? BigDecimal.ZERO : quantity2;
            Intrinsics.checkNotNull(quantity2);
            z4 = zIsSellToOpenEnabled;
            z5 = SupportedOrderTypes.supportedOrderTypes(tradingSession, equityOrderSide, quantity2, true, instrument.isOtc(), true, true).isEmpty() ? z5 : true;
            this.sellToOpenAnySessionActive = z5;
            if (z4) {
                EquityOrderSide equityOrderSide2 = EquityOrderSide.SELL_SHORT;
                BigDecimal bigDecimal = (orNull == null || (quantity = orNull.getQuantity()) == null) ? BigDecimal.ZERO : quantity;
                Intrinsics.checkNotNull(bigDecimal);
                if (SupportedOrderTypes.supportedOrderTypes(tradingSession, equityOrderSide2, bigDecimal, true, instrument.isOtc(), true, true).contains(Order.Configuration.MARKET)) {
                    z6 = true;
                }
            }
            this.sellToOpenMarketSessionActive = z6;
            if (orNull == null && hasPosition && instrument.isActive()) {
                if ((account == null || !account.isManaged()) && isLoaded()) {
                    try {
                        if (CollectionsKt.listOf((Object[]) new Tradability[]{Tradability.TRADABLE, Tradability.POSITION_CLOSING_ONLY}).contains(instrument.getAffiliateTradability()) && !z9 && !z8) {
                            throw new IllegalStateException(("Position exists without a valid way to close it. Position: " + orNull).toString());
                        }
                        return;
                    } catch (IllegalStateException e) {
                        if (BuySellData2.isDebug()) {
                            throw e;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        z4 = zIsSellToOpenEnabled;
        z5 = false;
        this.sellToOpenAnySessionActive = z5;
        if (z4) {
        }
        this.sellToOpenMarketSessionActive = z6;
        if (orNull == null) {
        }
    }

    public /* synthetic */ BuySellData(Account account, Instrument instrument, Optional optional, Quote quote, boolean z, TradingSession tradingSession, Clock clock, Boolean bool, boolean z2, boolean z3, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(account, instrument, optional, quote, z, tradingSession, clock, (i & 128) != 0 ? null : bool, z2, z3, bool2);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Optional<Position> getPositionOptional() {
        return this.positionOptional;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final boolean isInMarginCall() {
        return this.isInMarginCall;
    }

    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final Boolean getEquitiesSubzeroExperimentEnabled() {
        return this.equitiesSubzeroExperimentEnabled;
    }

    public final Boolean getMarginInvestingEligible() {
        return this.marginInvestingEligible;
    }

    public final boolean isLoaded() {
        return (this.positionOptional == null || this.equitiesSubzeroExperimentEnabled == null || this.marginInvestingEligible == null) ? false : true;
    }

    public final boolean getHasAccount() {
        return this.hasAccount;
    }

    public final boolean getAccountIsManaged() {
        return this.accountIsManaged;
    }

    public final boolean getAccountRestrictsOpeningPositions() {
        return this.accountRestrictsOpeningPositions;
    }

    public final boolean getAccountHasAccessToOptions() {
        return this.accountHasAccessToOptions;
    }

    public final boolean getAccountCanUpgradeToOptions() {
        return this.accountCanUpgradeToOptions;
    }

    /* renamed from: isTradingHalted, reason: from getter */
    public final boolean getIsTradingHalted() {
        return this.isTradingHalted;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final boolean getUserHasShares() {
        return this.userHasShares;
    }

    /* renamed from: isBuyToOpenEnabled, reason: from getter */
    public final boolean getIsBuyToOpenEnabled() {
        return this.isBuyToOpenEnabled;
    }

    /* renamed from: isSellToCloseEnabled, reason: from getter */
    public final boolean getIsSellToCloseEnabled() {
        return this.isSellToCloseEnabled;
    }

    /* renamed from: isBuyToCloseEnabled, reason: from getter */
    public final boolean getIsBuyToCloseEnabled() {
        return this.isBuyToCloseEnabled;
    }

    /* renamed from: isSellToOpenEnabled, reason: from getter */
    public final boolean getIsSellToOpenEnabled() {
        return this.isSellToOpenEnabled;
    }

    public static /* synthetic */ boolean isSellToOpenEnabled$default(BuySellData buySellData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return buySellData.isSellToOpenEnabled(z);
    }

    public final boolean isSellToOpenEnabled(boolean ignorePosition) {
        BrokerageAccountType brokerageAccountType;
        if (this.hasAccount && !Intrinsics.areEqual(this.marginInvestingEligible, Boolean.FALSE)) {
            Account account = this.account;
            if ((account != null ? account.getType() : null) != AccountType.CASH) {
                Account account2 = this.account;
                if (!((account2 == null || (brokerageAccountType = account2.getBrokerageAccountType()) == null) ? false : brokerageAccountType.isRetirement()) && !this.accountRestrictsOpeningPositions && !this.accountIsManaged && this.instrumentAllowsSells && this.instrument.getShortSaleTradability() == Tradability.TRADABLE && !this.isTradingHalted && !this.isInMarginCall && ((!Position5.isLongPositionOrPending(this.position) || ignorePosition) && Intrinsics.areEqual(this.equitiesSubzeroExperimentEnabled, Boolean.TRUE))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean getSellToOpenAnySessionActive() {
        return this.sellToOpenAnySessionActive;
    }

    public final boolean getSellToOpenMarketSessionActive() {
        return this.sellToOpenMarketSessionActive;
    }
}
