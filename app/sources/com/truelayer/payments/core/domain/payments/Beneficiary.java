package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Beneficiary.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \r2\u00020\u0001:\u0004\f\r\u000e\u000fR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "", "accountHolderName", "", "getAccountHolderName", "()Ljava/lang/String;", "accountIdentifier", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "getAccountIdentifier", "()Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "reference", "getReference", "AccountIdentifier", "Companion", "ExternalAccount", "MerchantAccount", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$ExternalAccount;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$MerchantAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface Beneficiary {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    String getAccountHolderName();

    AccountIdentifier getAccountIdentifier();

    String getReference();

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$MerchantAccount;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "id", "", "accountHolderName", "accountIdentifier", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "reference", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;Ljava/lang/String;)V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountIdentifier", "()Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "getId", "getReference", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class MerchantAccount implements Beneficiary {
        private final String accountHolderName;
        private final AccountIdentifier accountIdentifier;
        private final String id;
        private final String reference;

        public static /* synthetic */ MerchantAccount copy$default(MerchantAccount merchantAccount, String str, String str2, AccountIdentifier accountIdentifier, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchantAccount.id;
            }
            if ((i & 2) != 0) {
                str2 = merchantAccount.accountHolderName;
            }
            if ((i & 4) != 0) {
                accountIdentifier = merchantAccount.accountIdentifier;
            }
            if ((i & 8) != 0) {
                str3 = merchantAccount.reference;
            }
            return merchantAccount.copy(str, str2, accountIdentifier, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReference() {
            return this.reference;
        }

        public final MerchantAccount copy(String id, String accountHolderName, AccountIdentifier accountIdentifier, String reference) {
            return new MerchantAccount(id, accountHolderName, accountIdentifier, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantAccount)) {
                return false;
            }
            MerchantAccount merchantAccount = (MerchantAccount) other;
            return Intrinsics.areEqual(this.id, merchantAccount.id) && Intrinsics.areEqual(this.accountHolderName, merchantAccount.accountHolderName) && Intrinsics.areEqual(this.accountIdentifier, merchantAccount.accountIdentifier) && Intrinsics.areEqual(this.reference, merchantAccount.reference);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AccountIdentifier accountIdentifier = this.accountIdentifier;
            int iHashCode3 = (iHashCode2 + (accountIdentifier == null ? 0 : accountIdentifier.hashCode())) * 31;
            String str3 = this.reference;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "MerchantAccount(id=" + this.id + ", accountHolderName=" + this.accountHolderName + ", accountIdentifier=" + this.accountIdentifier + ", reference=" + this.reference + ")";
        }

        public MerchantAccount(String str, String str2, AccountIdentifier accountIdentifier, String str3) {
            this.id = str;
            this.accountHolderName = str2;
            this.accountIdentifier = accountIdentifier;
            this.reference = str3;
        }

        public final String getId() {
            return this.id;
        }

        @Override // com.truelayer.payments.core.domain.payments.Beneficiary
        public String getAccountHolderName() {
            return this.accountHolderName;
        }

        @Override // com.truelayer.payments.core.domain.payments.Beneficiary
        public AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        @Override // com.truelayer.payments.core.domain.payments.Beneficiary
        public String getReference() {
            return this.reference;
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$ExternalAccount;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "accountHolderName", "", "accountIdentifier", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "reference", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;Ljava/lang/String;)V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountIdentifier", "()Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "getReference", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ExternalAccount implements Beneficiary {
        private final String accountHolderName;
        private final AccountIdentifier accountIdentifier;
        private final String reference;

        public static /* synthetic */ ExternalAccount copy$default(ExternalAccount externalAccount, String str, AccountIdentifier accountIdentifier, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = externalAccount.accountHolderName;
            }
            if ((i & 2) != 0) {
                accountIdentifier = externalAccount.accountIdentifier;
            }
            if ((i & 4) != 0) {
                str2 = externalAccount.reference;
            }
            return externalAccount.copy(str, accountIdentifier, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountHolderName() {
            return this.accountHolderName;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReference() {
            return this.reference;
        }

        public final ExternalAccount copy(String accountHolderName, AccountIdentifier accountIdentifier, String reference) {
            return new ExternalAccount(accountHolderName, accountIdentifier, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalAccount)) {
                return false;
            }
            ExternalAccount externalAccount = (ExternalAccount) other;
            return Intrinsics.areEqual(this.accountHolderName, externalAccount.accountHolderName) && Intrinsics.areEqual(this.accountIdentifier, externalAccount.accountIdentifier) && Intrinsics.areEqual(this.reference, externalAccount.reference);
        }

        public int hashCode() {
            String str = this.accountHolderName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AccountIdentifier accountIdentifier = this.accountIdentifier;
            int iHashCode2 = (iHashCode + (accountIdentifier == null ? 0 : accountIdentifier.hashCode())) * 31;
            String str2 = this.reference;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ExternalAccount(accountHolderName=" + this.accountHolderName + ", accountIdentifier=" + this.accountIdentifier + ", reference=" + this.reference + ")";
        }

        public ExternalAccount(String str, AccountIdentifier accountIdentifier, String str2) {
            this.accountHolderName = str;
            this.accountIdentifier = accountIdentifier;
            this.reference = str2;
        }

        @Override // com.truelayer.payments.core.domain.payments.Beneficiary
        public String getAccountHolderName() {
            return this.accountHolderName;
        }

        @Override // com.truelayer.payments.core.domain.payments.Beneficiary
        public AccountIdentifier getAccountIdentifier() {
            return this.accountIdentifier;
        }

        @Override // com.truelayer.payments.core.domain.payments.Beneficiary
        public String getReference() {
            return this.reference;
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "", "Companion", "Iban", "SortCodeAccountNumber", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$Iban;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface AccountIdentifier {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$SortCodeAccountNumber;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "sortCode", "", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSortCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class SortCodeAccountNumber implements AccountIdentifier {
            private final String accountNumber;
            private final String sortCode;

            public static /* synthetic */ SortCodeAccountNumber copy$default(SortCodeAccountNumber sortCodeAccountNumber, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sortCodeAccountNumber.sortCode;
                }
                if ((i & 2) != 0) {
                    str2 = sortCodeAccountNumber.accountNumber;
                }
                return sortCodeAccountNumber.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSortCode() {
                return this.sortCode;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SortCodeAccountNumber copy(String sortCode, String accountNumber) {
                Intrinsics.checkNotNullParameter(sortCode, "sortCode");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new SortCodeAccountNumber(sortCode, accountNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SortCodeAccountNumber)) {
                    return false;
                }
                SortCodeAccountNumber sortCodeAccountNumber = (SortCodeAccountNumber) other;
                return Intrinsics.areEqual(this.sortCode, sortCodeAccountNumber.sortCode) && Intrinsics.areEqual(this.accountNumber, sortCodeAccountNumber.accountNumber);
            }

            public int hashCode() {
                return (this.sortCode.hashCode() * 31) + this.accountNumber.hashCode();
            }

            public String toString() {
                return "SortCodeAccountNumber(sortCode=" + this.sortCode + ", accountNumber=" + this.accountNumber + ")";
            }

            public SortCodeAccountNumber(String sortCode, String accountNumber) {
                Intrinsics.checkNotNullParameter(sortCode, "sortCode");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.sortCode = sortCode;
                this.accountNumber = accountNumber;
            }

            public final String getSortCode() {
                return this.sortCode;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$Iban;", "Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier;", "iban", "", "(Ljava/lang/String;)V", "getIban", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Iban implements AccountIdentifier {
            private final String iban;

            public static /* synthetic */ Iban copy$default(Iban iban, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iban.iban;
                }
                return iban.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIban() {
                return this.iban;
            }

            public final Iban copy(String iban) {
                Intrinsics.checkNotNullParameter(iban, "iban");
                return new Iban(iban);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Iban) && Intrinsics.areEqual(this.iban, ((Iban) other).iban);
            }

            public int hashCode() {
                return this.iban.hashCode();
            }

            public String toString() {
                return "Iban(iban=" + this.iban + ")";
            }

            public Iban(String iban) {
                Intrinsics.checkNotNullParameter(iban, "iban");
                this.iban = iban;
            }

            public final String getIban() {
                return this.iban;
            }
        }

        /* compiled from: Beneficiary.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$AccountIdentifier$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }
    }

    /* compiled from: Beneficiary.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Beneficiary$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
