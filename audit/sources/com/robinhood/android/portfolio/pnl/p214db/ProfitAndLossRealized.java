package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ProfitAndLossRealized.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "", "", "accountNumber", "Lcom/robinhood/models/util/Money;", "pastMonth", "yearToDate", "j$/time/Instant", "receivedAt", "Lcom/robinhood/rosetta/common/Currency;", "displayCurrency", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Currency;)V", "", "isStale", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/models/util/Money;", "component3", "component4", "()Lj$/time/Instant;", "component5", "()Lcom/robinhood/rosetta/common/Currency;", "copy", "(Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Currency;)Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/models/util/Money;", "getPastMonth", "getYearToDate", "Lj$/time/Instant;", "getReceivedAt", "Lcom/robinhood/rosetta/common/Currency;", "getDisplayCurrency", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfitAndLossRealized {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountNumber;
    private final Currency displayCurrency;
    private final Money pastMonth;
    private final Instant receivedAt;
    private final Money yearToDate;

    public static /* synthetic */ ProfitAndLossRealized copy$default(ProfitAndLossRealized profitAndLossRealized, String str, Money money, Money money2, Instant instant, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profitAndLossRealized.accountNumber;
        }
        if ((i & 2) != 0) {
            money = profitAndLossRealized.pastMonth;
        }
        if ((i & 4) != 0) {
            money2 = profitAndLossRealized.yearToDate;
        }
        if ((i & 8) != 0) {
            instant = profitAndLossRealized.receivedAt;
        }
        if ((i & 16) != 0) {
            currency = profitAndLossRealized.displayCurrency;
        }
        Currency currency2 = currency;
        Money money3 = money2;
        return profitAndLossRealized.copy(str, money, money3, instant, currency2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getPastMonth() {
        return this.pastMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getYearToDate() {
        return this.yearToDate;
    }

    /* renamed from: component4, reason: from getter */
    public final Instant getReceivedAt() {
        return this.receivedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final Currency getDisplayCurrency() {
        return this.displayCurrency;
    }

    public final ProfitAndLossRealized copy(String accountNumber, Money pastMonth, Money yearToDate, Instant receivedAt, Currency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(pastMonth, "pastMonth");
        Intrinsics.checkNotNullParameter(yearToDate, "yearToDate");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return new ProfitAndLossRealized(accountNumber, pastMonth, yearToDate, receivedAt, displayCurrency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossRealized)) {
            return false;
        }
        ProfitAndLossRealized profitAndLossRealized = (ProfitAndLossRealized) other;
        return Intrinsics.areEqual(this.accountNumber, profitAndLossRealized.accountNumber) && Intrinsics.areEqual(this.pastMonth, profitAndLossRealized.pastMonth) && Intrinsics.areEqual(this.yearToDate, profitAndLossRealized.yearToDate) && Intrinsics.areEqual(this.receivedAt, profitAndLossRealized.receivedAt) && this.displayCurrency == profitAndLossRealized.displayCurrency;
    }

    public int hashCode() {
        return (((((((this.accountNumber.hashCode() * 31) + this.pastMonth.hashCode()) * 31) + this.yearToDate.hashCode()) * 31) + this.receivedAt.hashCode()) * 31) + this.displayCurrency.hashCode();
    }

    public String toString() {
        return "ProfitAndLossRealized(accountNumber=" + this.accountNumber + ", pastMonth=" + this.pastMonth + ", yearToDate=" + this.yearToDate + ", receivedAt=" + this.receivedAt + ", displayCurrency=" + this.displayCurrency + ")";
    }

    public ProfitAndLossRealized(String accountNumber, Money pastMonth, Money yearToDate, Instant receivedAt, Currency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(pastMonth, "pastMonth");
        Intrinsics.checkNotNullParameter(yearToDate, "yearToDate");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        this.accountNumber = accountNumber;
        this.pastMonth = pastMonth;
        this.yearToDate = yearToDate;
        this.receivedAt = receivedAt;
        this.displayCurrency = displayCurrency;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Money getPastMonth() {
        return this.pastMonth;
    }

    public final Money getYearToDate() {
        return this.yearToDate;
    }

    public final Instant getReceivedAt() {
        return this.receivedAt;
    }

    public final Currency getDisplayCurrency() {
        return this.displayCurrency;
    }

    public final boolean isStale() {
        return Durations.since(this.receivedAt).compareTo(INSTANCE.getNormalStaleTimeout()) > 0;
    }

    /* compiled from: ProfitAndLossRealized.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized$Companion;", "Lcom/robinhood/models/db/StaleConfig;", "<init>", "()V", "j$/time/Duration", "getNormalStaleTimeout", "()Lj$/time/Duration;", "normalStaleTimeout", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StaleConfig {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getShortStaleTimeout() {
            return StaleConfig.DefaultImpls.getShortStaleTimeout(this);
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getNormalStaleTimeout() {
            Duration durationOfSeconds = Duration.ofSeconds(10L);
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
            return durationOfSeconds;
        }
    }
}
