package com.robinhood.android.transfers.international.p266ui.methodselection;

import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferMethodEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodEvent;", "", "TransferMethodSelected", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodEvent$TransferMethodSelected;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TransferMethodEvent {

    /* compiled from: TransferMethodEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodEvent$TransferMethodSelected;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodEvent;", "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/model/TransferType;)V", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TransferMethodSelected implements TransferMethodEvent {
        public static final int $stable = 0;
        private final TransferType transferType;

        public static /* synthetic */ TransferMethodSelected copy$default(TransferMethodSelected transferMethodSelected, TransferType transferType, int i, Object obj) {
            if ((i & 1) != 0) {
                transferType = transferMethodSelected.transferType;
            }
            return transferMethodSelected.copy(transferType);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferType getTransferType() {
            return this.transferType;
        }

        public final TransferMethodSelected copy(TransferType transferType) {
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            return new TransferMethodSelected(transferType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TransferMethodSelected) && this.transferType == ((TransferMethodSelected) other).transferType;
        }

        public int hashCode() {
            return this.transferType.hashCode();
        }

        public String toString() {
            return "TransferMethodSelected(transferType=" + this.transferType + ")";
        }

        public TransferMethodSelected(TransferType transferType) {
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            this.transferType = transferType;
        }

        public final TransferType getTransferType() {
            return this.transferType;
        }
    }
}
