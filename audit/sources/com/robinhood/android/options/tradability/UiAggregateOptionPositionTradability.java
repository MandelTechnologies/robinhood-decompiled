package com.robinhood.android.options.tradability;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiAggregateOptionPositionTradability.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00013B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010-\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/options/tradability/UiAggregateOptionPositionTradability;", "", "account", "Lcom/robinhood/models/db/Account;", "uiAggregateOptionPositionFull", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getUiAggregateOptionPositionFull", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getTradeOnExpirationSettings", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "singleUiLeg", "Lcom/robinhood/models/ui/UiAggregateOptionPositionLeg;", "instrumentTradability", "Lcom/robinhood/models/db/Tradability;", "getInstrumentTradability$lib_options_tradability_externalDebug", "()Lcom/robinhood/models/db/Tradability;", "canOpen", "", "getCanOpen", "()Z", "canClose", "getCanClose", "cannotTradePositionReason", "Lcom/robinhood/android/options/tradability/UiAggregateOptionPositionTradability$CannotTradePositionReason;", "getCannotTradePositionReason$annotations", "()V", "getCannotTradePositionReason", "()Lcom/robinhood/android/options/tradability/UiAggregateOptionPositionTradability$CannotTradePositionReason;", "cannotClosePositionReason", "getCannotClosePositionReason", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "CannotTradePositionReason", "lib-options-tradability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiAggregateOptionPositionTradability {
    public static final int $stable = 8;
    private final Account account;
    private final boolean canClose;
    private final boolean canOpen;
    private final CannotTradePositionReason cannotClosePositionReason;
    private final CannotTradePositionReason cannotTradePositionReason;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final Tradability instrumentTradability;
    private final UiAggregateOptionPositionLeg singleUiLeg;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationSettings;
    private final UiAggregateOptionPositionFull uiAggregateOptionPositionFull;

    public static /* synthetic */ UiAggregateOptionPositionTradability copy$default(UiAggregateOptionPositionTradability uiAggregateOptionPositionTradability, Account account, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.TradingOnExpirationState tradingOnExpirationState, int i, Object obj) {
        if ((i & 1) != 0) {
            account = uiAggregateOptionPositionTradability.account;
        }
        if ((i & 2) != 0) {
            uiAggregateOptionPositionFull = uiAggregateOptionPositionTradability.uiAggregateOptionPositionFull;
        }
        if ((i & 4) != 0) {
            optionCurrentOrNextMarketDates = uiAggregateOptionPositionTradability.currentOrNextMarketDates;
        }
        if ((i & 8) != 0) {
            tradingOnExpirationState = uiAggregateOptionPositionTradability.tradeOnExpirationSettings;
        }
        return uiAggregateOptionPositionTradability.copy(account, uiAggregateOptionPositionFull, optionCurrentOrNextMarketDates, tradingOnExpirationState);
    }

    public static /* synthetic */ void getCannotTradePositionReason$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAggregateOptionPositionFull getUiAggregateOptionPositionFull() {
        return this.uiAggregateOptionPositionFull;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    public final UiAggregateOptionPositionTradability copy(Account account, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings) {
        Intrinsics.checkNotNullParameter(uiAggregateOptionPositionFull, "uiAggregateOptionPositionFull");
        return new UiAggregateOptionPositionTradability(account, uiAggregateOptionPositionFull, currentOrNextMarketDates, tradeOnExpirationSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiAggregateOptionPositionTradability)) {
            return false;
        }
        UiAggregateOptionPositionTradability uiAggregateOptionPositionTradability = (UiAggregateOptionPositionTradability) other;
        return Intrinsics.areEqual(this.account, uiAggregateOptionPositionTradability.account) && Intrinsics.areEqual(this.uiAggregateOptionPositionFull, uiAggregateOptionPositionTradability.uiAggregateOptionPositionFull) && Intrinsics.areEqual(this.currentOrNextMarketDates, uiAggregateOptionPositionTradability.currentOrNextMarketDates) && this.tradeOnExpirationSettings == uiAggregateOptionPositionTradability.tradeOnExpirationSettings;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + this.uiAggregateOptionPositionFull.hashCode()) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode2 = (iHashCode + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState = this.tradeOnExpirationSettings;
        return iHashCode2 + (tradingOnExpirationState != null ? tradingOnExpirationState.hashCode() : 0);
    }

    public String toString() {
        return "UiAggregateOptionPositionTradability(account=" + this.account + ", uiAggregateOptionPositionFull=" + this.uiAggregateOptionPositionFull + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", tradeOnExpirationSettings=" + this.tradeOnExpirationSettings + ")";
    }

    public UiAggregateOptionPositionTradability(Account account, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.TradingOnExpirationState tradingOnExpirationState) {
        Tradability adjustedTradability;
        CannotTradePositionReason cannotTradePositionReason;
        Intrinsics.checkNotNullParameter(uiAggregateOptionPositionFull, "uiAggregateOptionPositionFull");
        this.account = account;
        this.uiAggregateOptionPositionFull = uiAggregateOptionPositionFull;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.tradeOnExpirationSettings = tradingOnExpirationState;
        UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg = uiAggregateOptionPositionFull.isSingleLeg() ? (UiAggregateOptionPositionLeg) CollectionsKt.first((List) uiAggregateOptionPositionFull.getUiLegs()) : null;
        this.singleUiLeg = uiAggregateOptionPositionLeg;
        if (uiAggregateOptionPositionLeg == null || optionCurrentOrNextMarketDates == null || tradingOnExpirationState == null) {
            adjustedTradability = Tradability.TRADABLE;
        } else {
            adjustedTradability = new UiOptionInstrumentTradability(optionCurrentOrNextMarketDates, tradingOnExpirationState, uiAggregateOptionPositionLeg.getOptionInstrument(), uiAggregateOptionPositionFull.getUiOptionChain()).getAdjustedTradability();
        }
        this.instrumentTradability = adjustedTradability;
        this.canOpen = (account == null || !account.getOnlyPositionClosingTrades()) && adjustedTradability == Tradability.TRADABLE;
        this.canClose = uiAggregateOptionPositionFull.getQuantity().compareTo(BigDecimal.ZERO) != 0;
        if (account != null && account.getOnlyPositionClosingTrades()) {
            cannotTradePositionReason = CannotTradePositionReason.ACCOUNT_PCO;
        } else if (uiAggregateOptionPositionLeg != null && uiAggregateOptionPositionLeg.getOptionInstrument().getTradability() != adjustedTradability) {
            cannotTradePositionReason = CannotTradePositionReason.TRADE_ON_EXPIRATION_DISABLED;
        } else if (adjustedTradability == Tradability.POSITION_CLOSING_ONLY) {
            cannotTradePositionReason = CannotTradePositionReason.INSTRUMENT_PCO;
        } else {
            cannotTradePositionReason = adjustedTradability == Tradability.UNTRADABLE ? CannotTradePositionReason.INSTRUMENT_UNTRADABLE : null;
        }
        this.cannotTradePositionReason = cannotTradePositionReason;
        this.cannotClosePositionReason = adjustedTradability == Tradability.UNTRADABLE ? CannotTradePositionReason.INSTRUMENT_UNTRADABLE : null;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final UiAggregateOptionPositionFull getUiAggregateOptionPositionFull() {
        return this.uiAggregateOptionPositionFull;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UiAggregateOptionPositionTradability.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/tradability/UiAggregateOptionPositionTradability$CannotTradePositionReason;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_PCO", "INSTRUMENT_PCO", "INSTRUMENT_UNTRADABLE", "TRADE_ON_EXPIRATION_DISABLED", "lib-options-tradability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CannotTradePositionReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CannotTradePositionReason[] $VALUES;
        public static final CannotTradePositionReason ACCOUNT_PCO = new CannotTradePositionReason("ACCOUNT_PCO", 0);
        public static final CannotTradePositionReason INSTRUMENT_PCO = new CannotTradePositionReason("INSTRUMENT_PCO", 1);
        public static final CannotTradePositionReason INSTRUMENT_UNTRADABLE = new CannotTradePositionReason("INSTRUMENT_UNTRADABLE", 2);
        public static final CannotTradePositionReason TRADE_ON_EXPIRATION_DISABLED = new CannotTradePositionReason("TRADE_ON_EXPIRATION_DISABLED", 3);

        private static final /* synthetic */ CannotTradePositionReason[] $values() {
            return new CannotTradePositionReason[]{ACCOUNT_PCO, INSTRUMENT_PCO, INSTRUMENT_UNTRADABLE, TRADE_ON_EXPIRATION_DISABLED};
        }

        public static EnumEntries<CannotTradePositionReason> getEntries() {
            return $ENTRIES;
        }

        private CannotTradePositionReason(String str, int i) {
        }

        static {
            CannotTradePositionReason[] cannotTradePositionReasonArr$values = $values();
            $VALUES = cannotTradePositionReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cannotTradePositionReasonArr$values);
        }

        public static CannotTradePositionReason valueOf(String str) {
            return (CannotTradePositionReason) Enum.valueOf(CannotTradePositionReason.class, str);
        }

        public static CannotTradePositionReason[] values() {
            return (CannotTradePositionReason[]) $VALUES.clone();
        }
    }

    /* renamed from: getInstrumentTradability$lib_options_tradability_externalDebug, reason: from getter */
    public final Tradability getInstrumentTradability() {
        return this.instrumentTradability;
    }

    public final boolean getCanOpen() {
        return this.canOpen;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final CannotTradePositionReason getCannotTradePositionReason() {
        return this.cannotTradePositionReason;
    }

    public final CannotTradePositionReason getCannotClosePositionReason() {
        return this.cannotClosePositionReason;
    }
}
