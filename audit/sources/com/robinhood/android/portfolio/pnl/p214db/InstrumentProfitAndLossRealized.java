package com.robinhood.android.portfolio.pnl.p214db;

import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InstrumentProfitAndLossRealized.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "", "", "accountNumber", "instrumentId", "Lcom/robinhood/models/util/Money;", "pastMonth", "yearToDate", "j$/time/Instant", "receivedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lj$/time/Instant;)V", "", "isStale", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/robinhood/models/util/Money;", "component4", "component5", "()Lj$/time/Instant;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lj$/time/Instant;)Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "getInstrumentId", "Lcom/robinhood/models/util/Money;", "getPastMonth", "getYearToDate", "Lj$/time/Instant;", "getReceivedAt", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstrumentProfitAndLossRealized {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountNumber;
    private final String instrumentId;
    private final Money pastMonth;
    private final Instant receivedAt;
    private final Money yearToDate;

    public static /* synthetic */ InstrumentProfitAndLossRealized copy$default(InstrumentProfitAndLossRealized instrumentProfitAndLossRealized, String str, String str2, Money money, Money money2, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instrumentProfitAndLossRealized.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = instrumentProfitAndLossRealized.instrumentId;
        }
        if ((i & 4) != 0) {
            money = instrumentProfitAndLossRealized.pastMonth;
        }
        if ((i & 8) != 0) {
            money2 = instrumentProfitAndLossRealized.yearToDate;
        }
        if ((i & 16) != 0) {
            instant = instrumentProfitAndLossRealized.receivedAt;
        }
        Instant instant2 = instant;
        Money money3 = money;
        return instrumentProfitAndLossRealized.copy(str, str2, money3, money2, instant2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getPastMonth() {
        return this.pastMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getYearToDate() {
        return this.yearToDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Instant getReceivedAt() {
        return this.receivedAt;
    }

    public final InstrumentProfitAndLossRealized copy(String accountNumber, String instrumentId, Money pastMonth, Money yearToDate, Instant receivedAt) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(pastMonth, "pastMonth");
        Intrinsics.checkNotNullParameter(yearToDate, "yearToDate");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        return new InstrumentProfitAndLossRealized(accountNumber, instrumentId, pastMonth, yearToDate, receivedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstrumentProfitAndLossRealized)) {
            return false;
        }
        InstrumentProfitAndLossRealized instrumentProfitAndLossRealized = (InstrumentProfitAndLossRealized) other;
        return Intrinsics.areEqual(this.accountNumber, instrumentProfitAndLossRealized.accountNumber) && Intrinsics.areEqual(this.instrumentId, instrumentProfitAndLossRealized.instrumentId) && Intrinsics.areEqual(this.pastMonth, instrumentProfitAndLossRealized.pastMonth) && Intrinsics.areEqual(this.yearToDate, instrumentProfitAndLossRealized.yearToDate) && Intrinsics.areEqual(this.receivedAt, instrumentProfitAndLossRealized.receivedAt);
    }

    public int hashCode() {
        return (((((((this.accountNumber.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.pastMonth.hashCode()) * 31) + this.yearToDate.hashCode()) * 31) + this.receivedAt.hashCode();
    }

    public String toString() {
        return "InstrumentProfitAndLossRealized(accountNumber=" + this.accountNumber + ", instrumentId=" + this.instrumentId + ", pastMonth=" + this.pastMonth + ", yearToDate=" + this.yearToDate + ", receivedAt=" + this.receivedAt + ")";
    }

    public InstrumentProfitAndLossRealized(String accountNumber, String instrumentId, Money pastMonth, Money yearToDate, Instant receivedAt) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(pastMonth, "pastMonth");
        Intrinsics.checkNotNullParameter(yearToDate, "yearToDate");
        Intrinsics.checkNotNullParameter(receivedAt, "receivedAt");
        this.accountNumber = accountNumber;
        this.instrumentId = instrumentId;
        this.pastMonth = pastMonth;
        this.yearToDate = yearToDate;
        this.receivedAt = receivedAt;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
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

    public final boolean isStale() {
        return Durations.since(this.receivedAt).compareTo(INSTANCE.getNormalStaleTimeout()) > 0;
    }

    /* compiled from: InstrumentProfitAndLossRealized.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized$Companion;", "Lcom/robinhood/models/db/StaleConfig;", "<init>", "()V", "j$/time/Duration", "getNormalStaleTimeout", "()Lj$/time/Duration;", "normalStaleTimeout", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
