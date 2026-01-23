package com.robinhood.store.advisory;

import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: AdvisoryFirstDepositConfig.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "", "Acat", "Rollover", "InternalAssetTransfer", "Transfer", "IraMigration", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Acat;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$InternalAssetTransfer;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$IraMigration;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Rollover;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AdvisoryFirstDepositConfig {

    /* compiled from: AdvisoryFirstDepositConfig.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Acat;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Acat implements AdvisoryFirstDepositConfig {
        public static final Acat INSTANCE = new Acat();

        public boolean equals(Object other) {
            return this == other || (other instanceof Acat);
        }

        public int hashCode() {
            return -863840889;
        }

        public String toString() {
            return "Acat";
        }

        private Acat() {
        }
    }

    /* compiled from: AdvisoryFirstDepositConfig.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Rollover;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Rollover implements AdvisoryFirstDepositConfig {
        public static final Rollover INSTANCE = new Rollover();

        public boolean equals(Object other) {
            return this == other || (other instanceof Rollover);
        }

        public int hashCode() {
            return -272217213;
        }

        public String toString() {
            return "Rollover";
        }

        private Rollover() {
        }
    }

    /* compiled from: AdvisoryFirstDepositConfig.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$InternalAssetTransfer;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "minimumDeposit", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getMinimumDeposit", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InternalAssetTransfer implements AdvisoryFirstDepositConfig {
        private final Money minimumDeposit;

        public static /* synthetic */ InternalAssetTransfer copy$default(InternalAssetTransfer internalAssetTransfer, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = internalAssetTransfer.minimumDeposit;
            }
            return internalAssetTransfer.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }

        public final InternalAssetTransfer copy(Money minimumDeposit) {
            Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
            return new InternalAssetTransfer(minimumDeposit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InternalAssetTransfer) && Intrinsics.areEqual(this.minimumDeposit, ((InternalAssetTransfer) other).minimumDeposit);
        }

        public int hashCode() {
            return this.minimumDeposit.hashCode();
        }

        public String toString() {
            return "InternalAssetTransfer(minimumDeposit=" + this.minimumDeposit + ")";
        }

        public InternalAssetTransfer(Money minimumDeposit) {
            Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
            this.minimumDeposit = minimumDeposit;
        }

        public final Money getMinimumDeposit() {
            return this.minimumDeposit;
        }
    }

    /* compiled from: AdvisoryFirstDepositConfig.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "amount", "Lcom/robinhood/models/util/Money;", "getAmount", "()Lcom/robinhood/models/util/Money;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "Retirement", "Deposit", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer$Deposit;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer$Retirement;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Transfer extends AdvisoryFirstDepositConfig {
        Money getAmount();

        ApiCreateTransferRequest2 getFrequency();

        TransferAccount getSourceAccount();

        /* compiled from: AdvisoryFirstDepositConfig.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u0019¨\u00062"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer$Retirement;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "Lcom/robinhood/models/util/Money;", "amount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "contributionLimit", "j$/time/Year", "taxYear", "", "contributionRingPercentage", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/models/util/Money;Lj$/time/Year;F)V", "component1", "()Lcom/robinhood/models/util/Money;", "component2", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component3", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component4", "component5", "()Lj$/time/Year;", "component6", "()F", "copy", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/models/util/Money;Lj$/time/Year;F)Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer$Retirement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/util/Money;", "getAmount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceAccount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "getContributionLimit", "Lj$/time/Year;", "getTaxYear", "F", "getContributionRingPercentage", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Retirement implements Transfer {
            private final Money amount;
            private final Money contributionLimit;
            private final float contributionRingPercentage;
            private final ApiCreateTransferRequest2 frequency;
            private final TransferAccount sourceAccount;
            private final Year taxYear;

            public static /* synthetic */ Retirement copy$default(Retirement retirement, Money money, TransferAccount transferAccount, ApiCreateTransferRequest2 apiCreateTransferRequest2, Money money2, Year year, float f, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = retirement.amount;
                }
                if ((i & 2) != 0) {
                    transferAccount = retirement.sourceAccount;
                }
                if ((i & 4) != 0) {
                    apiCreateTransferRequest2 = retirement.frequency;
                }
                if ((i & 8) != 0) {
                    money2 = retirement.contributionLimit;
                }
                if ((i & 16) != 0) {
                    year = retirement.taxYear;
                }
                if ((i & 32) != 0) {
                    f = retirement.contributionRingPercentage;
                }
                Year year2 = year;
                float f2 = f;
                return retirement.copy(money, transferAccount, apiCreateTransferRequest2, money2, year2, f2);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            /* renamed from: component3, reason: from getter */
            public final ApiCreateTransferRequest2 getFrequency() {
                return this.frequency;
            }

            /* renamed from: component4, reason: from getter */
            public final Money getContributionLimit() {
                return this.contributionLimit;
            }

            /* renamed from: component5, reason: from getter */
            public final Year getTaxYear() {
                return this.taxYear;
            }

            /* renamed from: component6, reason: from getter */
            public final float getContributionRingPercentage() {
                return this.contributionRingPercentage;
            }

            public final Retirement copy(Money amount, TransferAccount sourceAccount, ApiCreateTransferRequest2 frequency, Money contributionLimit, Year taxYear, float contributionRingPercentage) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                Intrinsics.checkNotNullParameter(contributionLimit, "contributionLimit");
                Intrinsics.checkNotNullParameter(taxYear, "taxYear");
                return new Retirement(amount, sourceAccount, frequency, contributionLimit, taxYear, contributionRingPercentage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Retirement)) {
                    return false;
                }
                Retirement retirement = (Retirement) other;
                return Intrinsics.areEqual(this.amount, retirement.amount) && Intrinsics.areEqual(this.sourceAccount, retirement.sourceAccount) && this.frequency == retirement.frequency && Intrinsics.areEqual(this.contributionLimit, retirement.contributionLimit) && Intrinsics.areEqual(this.taxYear, retirement.taxYear) && Float.compare(this.contributionRingPercentage, retirement.contributionRingPercentage) == 0;
            }

            public int hashCode() {
                return (((((((((this.amount.hashCode() * 31) + this.sourceAccount.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.contributionLimit.hashCode()) * 31) + this.taxYear.hashCode()) * 31) + Float.hashCode(this.contributionRingPercentage);
            }

            public String toString() {
                return "Retirement(amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", frequency=" + this.frequency + ", contributionLimit=" + this.contributionLimit + ", taxYear=" + this.taxYear + ", contributionRingPercentage=" + this.contributionRingPercentage + ")";
            }

            public Retirement(Money amount, TransferAccount sourceAccount, ApiCreateTransferRequest2 frequency, Money contributionLimit, Year taxYear, float f) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                Intrinsics.checkNotNullParameter(contributionLimit, "contributionLimit");
                Intrinsics.checkNotNullParameter(taxYear, "taxYear");
                this.amount = amount;
                this.sourceAccount = sourceAccount;
                this.frequency = frequency;
                this.contributionLimit = contributionLimit;
                this.taxYear = taxYear;
                this.contributionRingPercentage = f;
            }

            @Override // com.robinhood.store.advisory.AdvisoryFirstDepositConfig.Transfer
            public Money getAmount() {
                return this.amount;
            }

            @Override // com.robinhood.store.advisory.AdvisoryFirstDepositConfig.Transfer
            public TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            @Override // com.robinhood.store.advisory.AdvisoryFirstDepositConfig.Transfer
            public ApiCreateTransferRequest2 getFrequency() {
                return this.frequency;
            }

            public final Money getContributionLimit() {
                return this.contributionLimit;
            }

            public final Year getTaxYear() {
                return this.taxYear;
            }

            public final float getContributionRingPercentage() {
                return this.contributionRingPercentage;
            }
        }

        /* compiled from: AdvisoryFirstDepositConfig.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer$Deposit;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "amount", "Lcom/robinhood/models/util/Money;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Deposit implements Transfer {
            private final Money amount;
            private final TransferAccount sourceAccount;

            public static /* synthetic */ Deposit copy$default(Deposit deposit, Money money, TransferAccount transferAccount, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = deposit.amount;
                }
                if ((i & 2) != 0) {
                    transferAccount = deposit.sourceAccount;
                }
                return deposit.copy(money, transferAccount);
            }

            /* renamed from: component1, reason: from getter */
            public final Money getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            public final Deposit copy(Money amount, TransferAccount sourceAccount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                return new Deposit(amount, sourceAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Deposit)) {
                    return false;
                }
                Deposit deposit = (Deposit) other;
                return Intrinsics.areEqual(this.amount, deposit.amount) && Intrinsics.areEqual(this.sourceAccount, deposit.sourceAccount);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.sourceAccount.hashCode();
            }

            public String toString() {
                return "Deposit(amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ")";
            }

            public Deposit(Money amount, TransferAccount sourceAccount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                this.amount = amount;
                this.sourceAccount = sourceAccount;
            }

            @Override // com.robinhood.store.advisory.AdvisoryFirstDepositConfig.Transfer
            public Money getAmount() {
                return this.amount;
            }

            @Override // com.robinhood.store.advisory.AdvisoryFirstDepositConfig.Transfer
            public TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            @Override // com.robinhood.store.advisory.AdvisoryFirstDepositConfig.Transfer
            public ApiCreateTransferRequest2 getFrequency() {
                return ApiCreateTransferRequest2.ONCE;
            }
        }
    }

    /* compiled from: AdvisoryFirstDepositConfig.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$IraMigration;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "selfDirectedAccountNumber", "", "<init>", "(Ljava/lang/String;)V", "getSelfDirectedAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IraMigration implements AdvisoryFirstDepositConfig {
        private final String selfDirectedAccountNumber;

        public static /* synthetic */ IraMigration copy$default(IraMigration iraMigration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iraMigration.selfDirectedAccountNumber;
            }
            return iraMigration.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSelfDirectedAccountNumber() {
            return this.selfDirectedAccountNumber;
        }

        public final IraMigration copy(String selfDirectedAccountNumber) {
            Intrinsics.checkNotNullParameter(selfDirectedAccountNumber, "selfDirectedAccountNumber");
            return new IraMigration(selfDirectedAccountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IraMigration) && Intrinsics.areEqual(this.selfDirectedAccountNumber, ((IraMigration) other).selfDirectedAccountNumber);
        }

        public int hashCode() {
            return this.selfDirectedAccountNumber.hashCode();
        }

        public String toString() {
            return "IraMigration(selfDirectedAccountNumber=" + this.selfDirectedAccountNumber + ")";
        }

        public IraMigration(String selfDirectedAccountNumber) {
            Intrinsics.checkNotNullParameter(selfDirectedAccountNumber, "selfDirectedAccountNumber");
            this.selfDirectedAccountNumber = selfDirectedAccountNumber;
        }

        public final String getSelfDirectedAccountNumber() {
            return this.selfDirectedAccountNumber;
        }
    }
}
