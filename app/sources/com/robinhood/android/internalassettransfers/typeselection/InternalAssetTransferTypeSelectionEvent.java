package com.robinhood.android.internalassettransfers.typeselection;

import kotlin.Metadata;

/* compiled from: InternalAssetTransferTypeSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent;", "", "TransferAllAssets", "TransferPartialAssets", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent$TransferAllAssets;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent$TransferPartialAssets;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferTypeSelectionEvent {

    /* compiled from: InternalAssetTransferTypeSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent$TransferAllAssets;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferAllAssets implements InternalAssetTransferTypeSelectionEvent {
        public static final int $stable = 0;
        public static final TransferAllAssets INSTANCE = new TransferAllAssets();

        public boolean equals(Object other) {
            return this == other || (other instanceof TransferAllAssets);
        }

        public int hashCode() {
            return -669050672;
        }

        public String toString() {
            return "TransferAllAssets";
        }

        private TransferAllAssets() {
        }
    }

    /* compiled from: InternalAssetTransferTypeSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent$TransferPartialAssets;", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferPartialAssets implements InternalAssetTransferTypeSelectionEvent {
        public static final int $stable = 0;
        public static final TransferPartialAssets INSTANCE = new TransferPartialAssets();

        public boolean equals(Object other) {
            return this == other || (other instanceof TransferPartialAssets);
        }

        public int hashCode() {
            return -565708112;
        }

        public String toString() {
            return "TransferPartialAssets";
        }

        private TransferPartialAssets() {
        }
    }
}
