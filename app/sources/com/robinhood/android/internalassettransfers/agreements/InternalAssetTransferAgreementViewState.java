package com.robinhood.android.internalassettransfers.agreements;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState;", "", "Loading", "Success", "Failure", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState$Failure;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState$Loading;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState$Success;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferAgreementViewState {

    /* compiled from: InternalAssetTransferAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState$Loading;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements InternalAssetTransferAgreementViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -44400274;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: InternalAssetTransferAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState$Success;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState;", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "isSubmittingAgreement", "", "<init>", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Z)V", "getAgreement", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements InternalAssetTransferAgreementViewState {
        public static final int $stable = 8;
        private final UiAgreementWithContent agreement;
        private final boolean isSubmittingAgreement;

        public static /* synthetic */ Success copy$default(Success success, UiAgreementWithContent uiAgreementWithContent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAgreementWithContent = success.agreement;
            }
            if ((i & 2) != 0) {
                z = success.isSubmittingAgreement;
            }
            return success.copy(uiAgreementWithContent, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAgreementWithContent getAgreement() {
            return this.agreement;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSubmittingAgreement() {
            return this.isSubmittingAgreement;
        }

        public final Success copy(UiAgreementWithContent agreement, boolean isSubmittingAgreement) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            return new Success(agreement, isSubmittingAgreement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.agreement, success.agreement) && this.isSubmittingAgreement == success.isSubmittingAgreement;
        }

        public int hashCode() {
            return (this.agreement.hashCode() * 31) + Boolean.hashCode(this.isSubmittingAgreement);
        }

        public String toString() {
            return "Success(agreement=" + this.agreement + ", isSubmittingAgreement=" + this.isSubmittingAgreement + ")";
        }

        public Success(UiAgreementWithContent agreement, boolean z) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            this.agreement = agreement;
            this.isSubmittingAgreement = z;
        }

        public /* synthetic */ Success(UiAgreementWithContent uiAgreementWithContent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiAgreementWithContent, (i & 2) != 0 ? false : z);
        }

        public final UiAgreementWithContent getAgreement() {
            return this.agreement;
        }

        public final boolean isSubmittingAgreement() {
            return this.isSubmittingAgreement;
        }
    }

    /* compiled from: InternalAssetTransferAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState$Failure;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements InternalAssetTransferAgreementViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.error;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failure copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ")";
        }

        public Failure(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
