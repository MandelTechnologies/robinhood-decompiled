package com.robinhood.android.acats.retries;

import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.asset.AcatsInReviewAssetsContract;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsContract;
import com.robinhood.android.acatsin.confirmation.AcatsInConfirmationContract;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesEvents.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents;", "", "TransferSubmit", "RowClickEvent", "FragmentLauncher", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsRetriesEvents {

    /* compiled from: AcatsRetriesEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$FragmentLauncher;", "", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface FragmentLauncher {
        FragmentKey getKey();
    }

    /* compiled from: AcatsRetriesEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents;", "TransferSubmitSuccess", "TransferSubmitError", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit$TransferSubmitError;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit$TransferSubmitSuccess;", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TransferSubmit extends AcatsRetriesEvents {

        /* compiled from: AcatsRetriesEvents.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit$TransferSubmitSuccess;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$FragmentLauncher;", "key", "Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Key;", "<init>", "(Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Key;)V", "getKey", "()Lcom/robinhood/android/acatsin/confirmation/AcatsInConfirmationContract$Key;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TransferSubmitSuccess implements TransferSubmit, FragmentLauncher {
            public static final int $stable = AcatsInConfirmationContract.Key.$stable;
            private final AcatsInConfirmationContract.Key key;

            public static /* synthetic */ TransferSubmitSuccess copy$default(TransferSubmitSuccess transferSubmitSuccess, AcatsInConfirmationContract.Key key, int i, Object obj) {
                if ((i & 1) != 0) {
                    key = transferSubmitSuccess.key;
                }
                return transferSubmitSuccess.copy(key);
            }

            /* renamed from: component1, reason: from getter */
            public final AcatsInConfirmationContract.Key getKey() {
                return this.key;
            }

            public final TransferSubmitSuccess copy(AcatsInConfirmationContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new TransferSubmitSuccess(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TransferSubmitSuccess) && Intrinsics.areEqual(this.key, ((TransferSubmitSuccess) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "TransferSubmitSuccess(key=" + this.key + ")";
            }

            public TransferSubmitSuccess(AcatsInConfirmationContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            @Override // com.robinhood.android.acats.retries.AcatsRetriesEvents.FragmentLauncher
            public AcatsInConfirmationContract.Key getKey() {
                return this.key;
            }
        }

        /* compiled from: AcatsRetriesEvents.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit$TransferSubmitError;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$TransferSubmit;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TransferSubmitError implements TransferSubmit {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ TransferSubmitError copy$default(TransferSubmitError transferSubmitError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = transferSubmitError.error;
                }
                return transferSubmitError.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final TransferSubmitError copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new TransferSubmitError(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TransferSubmitError) && Intrinsics.areEqual(this.error, ((TransferSubmitError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "TransferSubmitError(error=" + this.error + ")";
            }

            public TransferSubmitError(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: AcatsRetriesEvents.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$FragmentLauncher;", "AssetsConfirmRowClick", "AccountTypeRowClicked", "AccountNumberRowClicked", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent$AccountNumberRowClicked;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent$AccountTypeRowClicked;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent$AssetsConfirmRowClick;", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RowClickEvent extends AcatsRetriesEvents, FragmentLauncher {

        /* compiled from: AcatsRetriesEvents.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent$AssetsConfirmRowClick;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent;", "key", "Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;", "<init>", "(Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;)V", "getKey", "()Lcom/robinhood/android/acatsin/asset/AcatsInReviewAssetsContract$Key;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AssetsConfirmRowClick implements RowClickEvent {
            public static final int $stable = AcatsInReviewAssetsContract.Key.$stable;
            private final AcatsInReviewAssetsContract.Key key;

            public static /* synthetic */ AssetsConfirmRowClick copy$default(AssetsConfirmRowClick assetsConfirmRowClick, AcatsInReviewAssetsContract.Key key, int i, Object obj) {
                if ((i & 1) != 0) {
                    key = assetsConfirmRowClick.key;
                }
                return assetsConfirmRowClick.copy(key);
            }

            /* renamed from: component1, reason: from getter */
            public final AcatsInReviewAssetsContract.Key getKey() {
                return this.key;
            }

            public final AssetsConfirmRowClick copy(AcatsInReviewAssetsContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new AssetsConfirmRowClick(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AssetsConfirmRowClick) && Intrinsics.areEqual(this.key, ((AssetsConfirmRowClick) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "AssetsConfirmRowClick(key=" + this.key + ")";
            }

            public AssetsConfirmRowClick(AcatsInReviewAssetsContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            @Override // com.robinhood.android.acats.retries.AcatsRetriesEvents.FragmentLauncher
            public AcatsInReviewAssetsContract.Key getKey() {
                return this.key;
            }
        }

        /* compiled from: AcatsRetriesEvents.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent$AccountTypeRowClicked;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent;", "key", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "<init>", "(Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;)V", "getKey", "()Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsContract$Key;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountTypeRowClicked implements RowClickEvent {
            public static final int $stable = AcatsInAvailableDestinationsContract.Key.$stable;
            private final AcatsInAvailableDestinationsContract.Key key;

            public static /* synthetic */ AccountTypeRowClicked copy$default(AccountTypeRowClicked accountTypeRowClicked, AcatsInAvailableDestinationsContract.Key key, int i, Object obj) {
                if ((i & 1) != 0) {
                    key = accountTypeRowClicked.key;
                }
                return accountTypeRowClicked.copy(key);
            }

            /* renamed from: component1, reason: from getter */
            public final AcatsInAvailableDestinationsContract.Key getKey() {
                return this.key;
            }

            public final AccountTypeRowClicked copy(AcatsInAvailableDestinationsContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new AccountTypeRowClicked(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountTypeRowClicked) && Intrinsics.areEqual(this.key, ((AccountTypeRowClicked) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "AccountTypeRowClicked(key=" + this.key + ")";
            }

            public AccountTypeRowClicked(AcatsInAvailableDestinationsContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            @Override // com.robinhood.android.acats.retries.AcatsRetriesEvents.FragmentLauncher
            public AcatsInAvailableDestinationsContract.Key getKey() {
                return this.key;
            }
        }

        /* compiled from: AcatsRetriesEvents.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent$AccountNumberRowClicked;", "Lcom/robinhood/android/acats/retries/AcatsRetriesEvents$RowClickEvent;", "key", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "<init>", "(Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;)V", "getKey", "()Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-retries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountNumberRowClicked implements RowClickEvent {
            public static final int $stable = AcatsInAccountNumberContract.Key.$stable;
            private final AcatsInAccountNumberContract.Key key;

            public static /* synthetic */ AccountNumberRowClicked copy$default(AccountNumberRowClicked accountNumberRowClicked, AcatsInAccountNumberContract.Key key, int i, Object obj) {
                if ((i & 1) != 0) {
                    key = accountNumberRowClicked.key;
                }
                return accountNumberRowClicked.copy(key);
            }

            /* renamed from: component1, reason: from getter */
            public final AcatsInAccountNumberContract.Key getKey() {
                return this.key;
            }

            public final AccountNumberRowClicked copy(AcatsInAccountNumberContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new AccountNumberRowClicked(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountNumberRowClicked) && Intrinsics.areEqual(this.key, ((AccountNumberRowClicked) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "AccountNumberRowClicked(key=" + this.key + ")";
            }

            public AccountNumberRowClicked(AcatsInAccountNumberContract.Key key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            @Override // com.robinhood.android.acats.retries.AcatsRetriesEvents.FragmentLauncher
            public AcatsInAccountNumberContract.Key getKey() {
                return this.key;
            }
        }
    }
}
