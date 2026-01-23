package com.robinhood.android.options.tradability;

import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionMarketHoursParam2;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: UiOptionInstrumentTradability.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000eB1\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001d\u0010*\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/options/tradability/UiOptionInstrumentTradability;", "", "j$/time/LocalDate", "currentOrNextMarketDateForTradability", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "<init>", "(Lj$/time/LocalDate;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionInstrument;)V", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "(Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/ui/UiOptionChain;)V", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "(Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "component3", "()Lcom/robinhood/models/db/OptionInstrument;", "copy", "(Lj$/time/LocalDate;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionInstrument;)Lcom/robinhood/android/options/tradability/UiOptionInstrumentTradability;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "Lcom/robinhood/models/db/OptionInstrument;", "Lcom/robinhood/models/db/Tradability;", "adjustedTradability", "Lcom/robinhood/models/db/Tradability;", "getAdjustedTradability", "()Lcom/robinhood/models/db/Tradability;", "getAdjustedTradability$annotations", "()V", "lib-options-tradability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiOptionInstrumentTradability {
    public static final int $stable = 8;
    private final Tradability adjustedTradability;
    private final LocalDate currentOrNextMarketDateForTradability;
    private final OptionInstrument optionInstrument;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationSettings;

    /* renamed from: component1, reason: from getter */
    private final LocalDate getCurrentOrNextMarketDateForTradability() {
        return this.currentOrNextMarketDateForTradability;
    }

    /* renamed from: component2, reason: from getter */
    private final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
        return this.tradeOnExpirationSettings;
    }

    /* renamed from: component3, reason: from getter */
    private final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public static /* synthetic */ UiOptionInstrumentTradability copy$default(UiOptionInstrumentTradability uiOptionInstrumentTradability, LocalDate localDate, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionInstrument optionInstrument, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = uiOptionInstrumentTradability.currentOrNextMarketDateForTradability;
        }
        if ((i & 2) != 0) {
            tradingOnExpirationState = uiOptionInstrumentTradability.tradeOnExpirationSettings;
        }
        if ((i & 4) != 0) {
            optionInstrument = uiOptionInstrumentTradability.optionInstrument;
        }
        return uiOptionInstrumentTradability.copy(localDate, tradingOnExpirationState, optionInstrument);
    }

    public static /* synthetic */ void getAdjustedTradability$annotations() {
    }

    public final UiOptionInstrumentTradability copy(LocalDate currentOrNextMarketDateForTradability, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionInstrument optionInstrument) {
        Intrinsics.checkNotNullParameter(currentOrNextMarketDateForTradability, "currentOrNextMarketDateForTradability");
        Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        return new UiOptionInstrumentTradability(currentOrNextMarketDateForTradability, tradeOnExpirationSettings, optionInstrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiOptionInstrumentTradability)) {
            return false;
        }
        UiOptionInstrumentTradability uiOptionInstrumentTradability = (UiOptionInstrumentTradability) other;
        return Intrinsics.areEqual(this.currentOrNextMarketDateForTradability, uiOptionInstrumentTradability.currentOrNextMarketDateForTradability) && this.tradeOnExpirationSettings == uiOptionInstrumentTradability.tradeOnExpirationSettings && Intrinsics.areEqual(this.optionInstrument, uiOptionInstrumentTradability.optionInstrument);
    }

    public int hashCode() {
        return (((this.currentOrNextMarketDateForTradability.hashCode() * 31) + this.tradeOnExpirationSettings.hashCode()) * 31) + this.optionInstrument.hashCode();
    }

    public String toString() {
        return "UiOptionInstrumentTradability(currentOrNextMarketDateForTradability=" + this.currentOrNextMarketDateForTradability + ", tradeOnExpirationSettings=" + this.tradeOnExpirationSettings + ", optionInstrument=" + this.optionInstrument + ")";
    }

    public UiOptionInstrumentTradability(LocalDate currentOrNextMarketDateForTradability, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionInstrument optionInstrument) {
        Tradability tradability;
        Intrinsics.checkNotNullParameter(currentOrNextMarketDateForTradability, "currentOrNextMarketDateForTradability");
        Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        this.currentOrNextMarketDateForTradability = currentOrNextMarketDateForTradability;
        this.tradeOnExpirationSettings = tradeOnExpirationSettings;
        this.optionInstrument = optionInstrument;
        if (!tradeOnExpirationSettings.isEnabled() && optionInstrument.getTradability() == Tradability.TRADABLE && optionInstrument.getExpirationDate().compareTo((ChronoLocalDate) currentOrNextMarketDateForTradability) <= 0) {
            tradability = Tradability.POSITION_CLOSING_ONLY;
        } else {
            tradability = optionInstrument.getTradability();
        }
        this.adjustedTradability = tradability;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UiOptionInstrumentTradability(OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionInstrument optionInstrument, UiOptionChain uiOptionChain) {
        this(currentOrNextMarketDates.getDate(OptionMarketHoursParam2.getOptionMarketHoursParam$default(uiOptionChain, optionInstrument.getExpirationDate(), null, 4, null)), tradeOnExpirationSettings, optionInstrument);
        Intrinsics.checkNotNullParameter(currentOrNextMarketDates, "currentOrNextMarketDates");
        Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UiOptionInstrumentTradability(OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionInstrument optionInstrument, OptionChain optionChain, OptionChain.UnderlyingType underlyingType) {
        this(currentOrNextMarketDates.getDate(OptionMarketHoursParam2.getOptionMarketHoursParam$default(optionChain, underlyingType, optionInstrument.getExpirationDate(), null, 8, null)), tradeOnExpirationSettings, optionInstrument);
        Intrinsics.checkNotNullParameter(currentOrNextMarketDates, "currentOrNextMarketDates");
        Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
    }

    public final Tradability getAdjustedTradability() {
        return this.adjustedTradability;
    }
}
