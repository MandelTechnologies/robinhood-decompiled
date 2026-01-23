package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: CryptoOrderRecurringHookEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent;", "", "<init>", "()V", "ContinueWithSelectedRecurringOption", "ShowCryptoFeeUnsupportedRecurringAlert", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent$ContinueWithSelectedRecurringOption;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent$ShowCryptoFeeUnsupportedRecurringAlert;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderRecurringHookEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderRecurringHookEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoOrderRecurringHookEvent() {
    }

    /* compiled from: CryptoOrderRecurringHookEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent$ContinueWithSelectedRecurringOption;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)V", "component1", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component2", "()Lj$/time/LocalDate;", "copy", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent$ContinueWithSelectedRecurringOption;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "Lj$/time/LocalDate;", "getStartDate", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContinueWithSelectedRecurringOption extends CryptoOrderRecurringHookEvent {
        public static final int $stable = 8;
        private final ApiInvestmentSchedule.Frequency frequency;
        private final LocalDate startDate;

        public static /* synthetic */ ContinueWithSelectedRecurringOption copy$default(ContinueWithSelectedRecurringOption continueWithSelectedRecurringOption, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, int i, Object obj) {
            if ((i & 1) != 0) {
                frequency = continueWithSelectedRecurringOption.frequency;
            }
            if ((i & 2) != 0) {
                localDate = continueWithSelectedRecurringOption.startDate;
            }
            return continueWithSelectedRecurringOption.copy(frequency, localDate);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final ContinueWithSelectedRecurringOption copy(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            return new ContinueWithSelectedRecurringOption(frequency, startDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContinueWithSelectedRecurringOption)) {
                return false;
            }
            ContinueWithSelectedRecurringOption continueWithSelectedRecurringOption = (ContinueWithSelectedRecurringOption) other;
            return this.frequency == continueWithSelectedRecurringOption.frequency && Intrinsics.areEqual(this.startDate, continueWithSelectedRecurringOption.startDate);
        }

        public int hashCode() {
            ApiInvestmentSchedule.Frequency frequency = this.frequency;
            return ((frequency == null ? 0 : frequency.hashCode()) * 31) + this.startDate.hashCode();
        }

        public String toString() {
            return "ContinueWithSelectedRecurringOption(frequency=" + this.frequency + ", startDate=" + this.startDate + ")";
        }

        public final ApiInvestmentSchedule.Frequency getFrequency() {
            return this.frequency;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContinueWithSelectedRecurringOption(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate) {
            super(null);
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            this.frequency = frequency;
            this.startDate = startDate;
        }
    }

    /* compiled from: CryptoOrderRecurringHookEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent$ShowCryptoFeeUnsupportedRecurringAlert;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCryptoFeeUnsupportedRecurringAlert extends CryptoOrderRecurringHookEvent {
        public static final int $stable = 0;
        public static final ShowCryptoFeeUnsupportedRecurringAlert INSTANCE = new ShowCryptoFeeUnsupportedRecurringAlert();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowCryptoFeeUnsupportedRecurringAlert);
        }

        public int hashCode() {
            return -1527503924;
        }

        public String toString() {
            return "ShowCryptoFeeUnsupportedRecurringAlert";
        }

        private ShowCryptoFeeUnsupportedRecurringAlert() {
            super(null);
        }
    }
}
