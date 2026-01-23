package com.robinhood.android.common.history.p082ui;

import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryRow.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowEvent;", "", "TransactionDetails", "DetailError", "Lcom/robinhood/android/common/history/ui/HistoryRowEvent$DetailError;", "Lcom/robinhood/android/common/history/ui/HistoryRowEvent$TransactionDetails;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.history.ui.HistoryRowEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface HistoryRow3 {

    /* compiled from: HistoryRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowEvent$TransactionDetails;", "Lcom/robinhood/android/common/history/ui/HistoryRowEvent;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "isFromCryptoSource", "", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;Z)V", "getReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.history.ui.HistoryRowEvent$TransactionDetails, reason: from toString */
    public static final /* data */ class TransactionDetails implements HistoryRow3 {
        public static final int $stable = 8;
        private final boolean isFromCryptoSource;
        private final TransactionReference reference;

        public static /* synthetic */ TransactionDetails copy$default(TransactionDetails transactionDetails, TransactionReference transactionReference, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionReference = transactionDetails.reference;
            }
            if ((i & 2) != 0) {
                z = transactionDetails.isFromCryptoSource;
            }
            return transactionDetails.copy(transactionReference, z);
        }

        /* renamed from: component1, reason: from getter */
        public final TransactionReference getReference() {
            return this.reference;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFromCryptoSource() {
            return this.isFromCryptoSource;
        }

        public final TransactionDetails copy(TransactionReference reference, boolean isFromCryptoSource) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return new TransactionDetails(reference, isFromCryptoSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionDetails)) {
                return false;
            }
            TransactionDetails transactionDetails = (TransactionDetails) other;
            return Intrinsics.areEqual(this.reference, transactionDetails.reference) && this.isFromCryptoSource == transactionDetails.isFromCryptoSource;
        }

        public int hashCode() {
            return (this.reference.hashCode() * 31) + Boolean.hashCode(this.isFromCryptoSource);
        }

        public String toString() {
            return "TransactionDetails(reference=" + this.reference + ", isFromCryptoSource=" + this.isFromCryptoSource + ")";
        }

        public TransactionDetails(TransactionReference reference, boolean z) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.reference = reference;
            this.isFromCryptoSource = z;
        }

        public final TransactionReference getReference() {
            return this.reference;
        }

        public final boolean isFromCryptoSource() {
            return this.isFromCryptoSource;
        }
    }

    /* compiled from: HistoryRow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowEvent$DetailError;", "Lcom/robinhood/android/common/history/ui/HistoryRowEvent;", "type", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;)V", "getType", "()Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.history.ui.HistoryRowEvent$DetailError, reason: from toString */
    public static final /* data */ class DetailError implements HistoryRow3 {
        public static final int $stable = 8;
        private final DetailErrorType type;

        public static /* synthetic */ DetailError copy$default(DetailError detailError, DetailErrorType detailErrorType, int i, Object obj) {
            if ((i & 1) != 0) {
                detailErrorType = detailError.type;
            }
            return detailError.copy(detailErrorType);
        }

        /* renamed from: component1, reason: from getter */
        public final DetailErrorType getType() {
            return this.type;
        }

        public final DetailError copy(DetailErrorType type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new DetailError(type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DetailError) && Intrinsics.areEqual(this.type, ((DetailError) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "DetailError(type=" + this.type + ")";
        }

        public DetailError(DetailErrorType type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
        }

        public final DetailErrorType getType() {
            return this.type;
        }
    }
}
