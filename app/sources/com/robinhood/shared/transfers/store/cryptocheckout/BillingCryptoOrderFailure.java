package com.robinhood.shared.transfers.store.cryptocheckout;

import bff_money_movement.service.p019v1.BillErrorDto;
import bff_money_movement.service.p019v1.BillingAccountTypeDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingCryptoOrderStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;", "<init>", "(Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;)V", "billErrorDto", "Lbff_money_movement/service/v1/BillErrorDto;", "accountType", "Lbff_money_movement/service/v1/BillingAccountTypeDto;", "(Lbff_money_movement/service/v1/BillErrorDto;Lbff_money_movement/service/v1/BillingAccountTypeDto;)V", "getReason", "()Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Reason", "lib-store-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BillingCryptoOrderFailure extends Exception {
    private final Reason reason;

    /* compiled from: BillingCryptoOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillErrorDto.values().length];
            try {
                iArr[BillErrorDto.BILL_ERROR_FAILED_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillErrorDto.BILL_ERROR_CRYPTO_FEE_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BillErrorDto.BILL_ERROR_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BillErrorDto.BILL_ERROR_UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BillErrorDto.BILL_ERROR_FAILED_DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ BillingCryptoOrderFailure copy$default(BillingCryptoOrderFailure billingCryptoOrderFailure, Reason reason, int i, Object obj) {
        if ((i & 1) != 0) {
            reason = billingCryptoOrderFailure.reason;
        }
        return billingCryptoOrderFailure.copy(reason);
    }

    /* renamed from: component1, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    public final BillingCryptoOrderFailure copy(Reason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new BillingCryptoOrderFailure(reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BillingCryptoOrderFailure) && this.reason == ((BillingCryptoOrderFailure) other).reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "BillingCryptoOrderFailure(reason=" + this.reason + ")";
    }

    public final Reason getReason() {
        return this.reason;
    }

    public BillingCryptoOrderFailure(Reason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BillingCryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderFailure$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "CRYPTO_FEE_UNAVAILABLE", "FAILED_BANK_DEPOSIT", "FAILED_DEBIT_CARD_DEPOSIT", "FAILED_ORDER", "UNKNOWN", "lib-store-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason CRYPTO_FEE_UNAVAILABLE = new Reason("CRYPTO_FEE_UNAVAILABLE", 0);
        public static final Reason FAILED_BANK_DEPOSIT = new Reason("FAILED_BANK_DEPOSIT", 1);
        public static final Reason FAILED_DEBIT_CARD_DEPOSIT = new Reason("FAILED_DEBIT_CARD_DEPOSIT", 2);
        public static final Reason FAILED_ORDER = new Reason("FAILED_ORDER", 3);
        public static final Reason UNKNOWN = new Reason("UNKNOWN", 4);

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{CRYPTO_FEE_UNAVAILABLE, FAILED_BANK_DEPOSIT, FAILED_DEBIT_CARD_DEPOSIT, FAILED_ORDER, UNKNOWN};
        }

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }

        private Reason(String str, int i) {
        }

        static {
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reasonArr$values);
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillingCryptoOrderFailure(BillErrorDto billErrorDto, BillingAccountTypeDto accountType) {
        Reason reason;
        Intrinsics.checkNotNullParameter(billErrorDto, "billErrorDto");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        int i = WhenMappings.$EnumSwitchMapping$0[billErrorDto.ordinal()];
        if (i == 1) {
            reason = Reason.FAILED_ORDER;
        } else if (i == 2) {
            reason = Reason.CRYPTO_FEE_UNAVAILABLE;
        } else if (i == 3 || i == 4) {
            reason = Reason.UNKNOWN;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (accountType == BillingAccountTypeDto.BILLING_ACCOUNT_TYPE_DEBIT_CARD) {
                reason = Reason.FAILED_DEBIT_CARD_DEPOSIT;
            } else {
                reason = Reason.FAILED_BANK_DEPOSIT;
            }
        }
        this(reason);
    }
}
