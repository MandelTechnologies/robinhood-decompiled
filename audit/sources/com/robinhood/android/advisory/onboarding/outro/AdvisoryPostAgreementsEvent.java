package com.robinhood.android.advisory.onboarding.outro;

import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* compiled from: AdvisoryPostAgreementsEvent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "", "GoToAcats", "GoToRollover", "GoToInternalAssetTransfers", "AccountLoadedButLostTransferConfig", "DepositConfigurationInvalid", "DepositSubmissionFailed", "FirstDepositPostTransfer", "GoToManagedDashboard", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$AccountLoadedButLostTransferConfig;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$DepositConfigurationInvalid;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$DepositSubmissionFailed;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$FirstDepositPostTransfer;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToAcats;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToInternalAssetTransfers;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToManagedDashboard;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToRollover;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryPostAgreementsEvent {

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToAcats;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GoToAcats implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ GoToAcats copy$default(GoToAcats goToAcats, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goToAcats.accountNumber;
            }
            return goToAcats.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final GoToAcats copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new GoToAcats(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoToAcats) && Intrinsics.areEqual(this.accountNumber, ((GoToAcats) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "GoToAcats(accountNumber=" + this.accountNumber + ")";
        }

        public GoToAcats(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToRollover;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GoToRollover implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ GoToRollover copy$default(GoToRollover goToRollover, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goToRollover.accountNumber;
            }
            return goToRollover.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final GoToRollover copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new GoToRollover(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoToRollover) && Intrinsics.areEqual(this.accountNumber, ((GoToRollover) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "GoToRollover(accountNumber=" + this.accountNumber + ")";
        }

        public GoToRollover(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToInternalAssetTransfers;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GoToInternalAssetTransfers implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ GoToInternalAssetTransfers copy$default(GoToInternalAssetTransfers goToInternalAssetTransfers, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goToInternalAssetTransfers.accountNumber;
            }
            return goToInternalAssetTransfers.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final GoToInternalAssetTransfers copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new GoToInternalAssetTransfers(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoToInternalAssetTransfers) && Intrinsics.areEqual(this.accountNumber, ((GoToInternalAssetTransfers) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "GoToInternalAssetTransfers(accountNumber=" + this.accountNumber + ")";
        }

        public GoToInternalAssetTransfers(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$AccountLoadedButLostTransferConfig;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountLoadedButLostTransferConfig implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ AccountLoadedButLostTransferConfig copy$default(AccountLoadedButLostTransferConfig accountLoadedButLostTransferConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountLoadedButLostTransferConfig.accountNumber;
            }
            return accountLoadedButLostTransferConfig.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AccountLoadedButLostTransferConfig copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new AccountLoadedButLostTransferConfig(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountLoadedButLostTransferConfig) && Intrinsics.areEqual(this.accountNumber, ((AccountLoadedButLostTransferConfig) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "AccountLoadedButLostTransferConfig(accountNumber=" + this.accountNumber + ")";
        }

        public AccountLoadedButLostTransferConfig(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$DepositConfigurationInvalid;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "accountNumber", "", "error", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;)V", "getAccountNumber", "()Ljava/lang/String;", "getError", "()Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositConfigurationInvalid implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final ValidationFailure error;

        public static /* synthetic */ DepositConfigurationInvalid copy$default(DepositConfigurationInvalid depositConfigurationInvalid, String str, ValidationFailure validationFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositConfigurationInvalid.accountNumber;
            }
            if ((i & 2) != 0) {
                validationFailure = depositConfigurationInvalid.error;
            }
            return depositConfigurationInvalid.copy(str, validationFailure);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final ValidationFailure getError() {
            return this.error;
        }

        public final DepositConfigurationInvalid copy(String accountNumber, ValidationFailure error) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(error, "error");
            return new DepositConfigurationInvalid(accountNumber, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositConfigurationInvalid)) {
                return false;
            }
            DepositConfigurationInvalid depositConfigurationInvalid = (DepositConfigurationInvalid) other;
            return Intrinsics.areEqual(this.accountNumber, depositConfigurationInvalid.accountNumber) && Intrinsics.areEqual(this.error, depositConfigurationInvalid.error);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "DepositConfigurationInvalid(accountNumber=" + this.accountNumber + ", error=" + this.error + ")";
        }

        public DepositConfigurationInvalid(String accountNumber, ValidationFailure error) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(error, "error");
            this.accountNumber = accountNumber;
            this.error = error;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ValidationFailure getError() {
            return this.error;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$DepositSubmissionFailed;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "accountNumber", "", "error", "Lretrofit2/HttpException;", "<init>", "(Ljava/lang/String;Lretrofit2/HttpException;)V", "getAccountNumber", "()Ljava/lang/String;", "getError", "()Lretrofit2/HttpException;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepositSubmissionFailed implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final HttpException error;

        public static /* synthetic */ DepositSubmissionFailed copy$default(DepositSubmissionFailed depositSubmissionFailed, String str, HttpException httpException, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositSubmissionFailed.accountNumber;
            }
            if ((i & 2) != 0) {
                httpException = depositSubmissionFailed.error;
            }
            return depositSubmissionFailed.copy(str, httpException);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final HttpException getError() {
            return this.error;
        }

        public final DepositSubmissionFailed copy(String accountNumber, HttpException error) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(error, "error");
            return new DepositSubmissionFailed(accountNumber, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositSubmissionFailed)) {
                return false;
            }
            DepositSubmissionFailed depositSubmissionFailed = (DepositSubmissionFailed) other;
            return Intrinsics.areEqual(this.accountNumber, depositSubmissionFailed.accountNumber) && Intrinsics.areEqual(this.error, depositSubmissionFailed.error);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "DepositSubmissionFailed(accountNumber=" + this.accountNumber + ", error=" + this.error + ")";
        }

        public DepositSubmissionFailed(String accountNumber, HttpException error) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(error, "error");
            this.accountNumber = accountNumber;
            this.error = error;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final HttpException getError() {
            return this.error;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$FirstDepositPostTransfer;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "<init>", "(Lcom/robinhood/models/ui/bonfire/PostTransferFlow;)V", "getPostTransferFlow", "()Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FirstDepositPostTransfer implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 8;
        private final PostTransferFlow postTransferFlow;

        public static /* synthetic */ FirstDepositPostTransfer copy$default(FirstDepositPostTransfer firstDepositPostTransfer, PostTransferFlow postTransferFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferFlow = firstDepositPostTransfer.postTransferFlow;
            }
            return firstDepositPostTransfer.copy(postTransferFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }

        public final FirstDepositPostTransfer copy(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            return new FirstDepositPostTransfer(postTransferFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FirstDepositPostTransfer) && Intrinsics.areEqual(this.postTransferFlow, ((FirstDepositPostTransfer) other).postTransferFlow);
        }

        public int hashCode() {
            return this.postTransferFlow.hashCode();
        }

        public String toString() {
            return "FirstDepositPostTransfer(postTransferFlow=" + this.postTransferFlow + ")";
        }

        public FirstDepositPostTransfer(PostTransferFlow postTransferFlow) {
            Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
            this.postTransferFlow = postTransferFlow;
        }

        public final PostTransferFlow getPostTransferFlow() {
            return this.postTransferFlow;
        }
    }

    /* compiled from: AdvisoryPostAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent$GoToManagedDashboard;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "destination", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getDestination", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GoToManagedDashboard implements AdvisoryPostAgreementsEvent {
        public static final int $stable = 8;
        private final IntentKey destination;

        public static /* synthetic */ GoToManagedDashboard copy$default(GoToManagedDashboard goToManagedDashboard, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = goToManagedDashboard.destination;
            }
            return goToManagedDashboard.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getDestination() {
            return this.destination;
        }

        public final GoToManagedDashboard copy(IntentKey destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new GoToManagedDashboard(destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoToManagedDashboard) && Intrinsics.areEqual(this.destination, ((GoToManagedDashboard) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "GoToManagedDashboard(destination=" + this.destination + ")";
        }

        public GoToManagedDashboard(IntentKey destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
        }

        public final IntentKey getDestination() {
            return this.destination;
        }
    }
}
