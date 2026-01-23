package com.robinhood.shared.crypto.transfer.selection;

import kotlin.Metadata;

/* compiled from: CryptoTransferSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent;", "", "NeedsEnrollment", "Finish", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent$Finish;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent$NeedsEnrollment;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionEvent, reason: use source file name */
/* loaded from: classes6.dex */
public interface CryptoTransferSelectionDuxo5 {

    /* compiled from: CryptoTransferSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent$NeedsEnrollment;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionEvent$NeedsEnrollment */
    public static final /* data */ class NeedsEnrollment implements CryptoTransferSelectionDuxo5 {
        public static final int $stable = 0;
        public static final NeedsEnrollment INSTANCE = new NeedsEnrollment();

        public boolean equals(Object other) {
            return this == other || (other instanceof NeedsEnrollment);
        }

        public int hashCode() {
            return 2100798041;
        }

        public String toString() {
            return "NeedsEnrollment";
        }

        private NeedsEnrollment() {
        }
    }

    /* compiled from: CryptoTransferSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent$Finish;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionEvent$Finish */
    public static final /* data */ class Finish implements CryptoTransferSelectionDuxo5 {
        public static final int $stable = 0;
        public static final Finish INSTANCE = new Finish();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finish);
        }

        public int hashCode() {
            return -1520041797;
        }

        public String toString() {
            return "Finish";
        }

        private Finish() {
        }
    }
}
