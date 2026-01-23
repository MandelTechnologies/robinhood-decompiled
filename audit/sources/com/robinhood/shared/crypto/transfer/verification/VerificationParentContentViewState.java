package com.robinhood.shared.crypto.transfer.verification;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationParentContentDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentViewState;", "", "verificationId", "Ljava/util/UUID;", TestTags.LOADED, "", "type", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "transferId", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "<init>", "(Ljava/util/UUID;ZLcom/robinhood/shared/crypto/transfer/verification/VerificationType;Ljava/util/UUID;Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;)V", "getVerificationId", "()Ljava/util/UUID;", "getLoaded", "()Z", "getType", "()Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "getTransferId", "getLoggingContext", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$LoggingContext;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VerificationParentContentViewState {
    public static final int $stable = 8;
    private final boolean loaded;
    private final CryptoTransferVerificationIntentKey.LoggingContext loggingContext;
    private final UUID transferId;
    private final VerificationType type;
    private final UUID verificationId;

    public static /* synthetic */ VerificationParentContentViewState copy$default(VerificationParentContentViewState verificationParentContentViewState, UUID uuid, boolean z, VerificationType verificationType, UUID uuid2, CryptoTransferVerificationIntentKey.LoggingContext loggingContext, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = verificationParentContentViewState.verificationId;
        }
        if ((i & 2) != 0) {
            z = verificationParentContentViewState.loaded;
        }
        if ((i & 4) != 0) {
            verificationType = verificationParentContentViewState.type;
        }
        if ((i & 8) != 0) {
            uuid2 = verificationParentContentViewState.transferId;
        }
        if ((i & 16) != 0) {
            loggingContext = verificationParentContentViewState.loggingContext;
        }
        CryptoTransferVerificationIntentKey.LoggingContext loggingContext2 = loggingContext;
        VerificationType verificationType2 = verificationType;
        return verificationParentContentViewState.copy(uuid, z, verificationType2, uuid2, loggingContext2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getVerificationId() {
        return this.verificationId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoaded() {
        return this.loaded;
    }

    /* renamed from: component3, reason: from getter */
    public final VerificationType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getTransferId() {
        return this.transferId;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoTransferVerificationIntentKey.LoggingContext getLoggingContext() {
        return this.loggingContext;
    }

    public final VerificationParentContentViewState copy(UUID verificationId, boolean loaded, VerificationType type2, UUID transferId, CryptoTransferVerificationIntentKey.LoggingContext loggingContext) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return new VerificationParentContentViewState(verificationId, loaded, type2, transferId, loggingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationParentContentViewState)) {
            return false;
        }
        VerificationParentContentViewState verificationParentContentViewState = (VerificationParentContentViewState) other;
        return Intrinsics.areEqual(this.verificationId, verificationParentContentViewState.verificationId) && this.loaded == verificationParentContentViewState.loaded && this.type == verificationParentContentViewState.type && Intrinsics.areEqual(this.transferId, verificationParentContentViewState.transferId) && Intrinsics.areEqual(this.loggingContext, verificationParentContentViewState.loggingContext);
    }

    public int hashCode() {
        int iHashCode = ((((this.verificationId.hashCode() * 31) + Boolean.hashCode(this.loaded)) * 31) + this.type.hashCode()) * 31;
        UUID uuid = this.transferId;
        return ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.loggingContext.hashCode();
    }

    public String toString() {
        return "VerificationParentContentViewState(verificationId=" + this.verificationId + ", loaded=" + this.loaded + ", type=" + this.type + ", transferId=" + this.transferId + ", loggingContext=" + this.loggingContext + ")";
    }

    public VerificationParentContentViewState(UUID verificationId, boolean z, VerificationType type2, UUID uuid, CryptoTransferVerificationIntentKey.LoggingContext loggingContext) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.verificationId = verificationId;
        this.loaded = z;
        this.type = type2;
        this.transferId = uuid;
        this.loggingContext = loggingContext;
    }

    public final UUID getVerificationId() {
        return this.verificationId;
    }

    public final boolean getLoaded() {
        return this.loaded;
    }

    public final VerificationType getType() {
        return this.type;
    }

    public final UUID getTransferId() {
        return this.transferId;
    }

    public final CryptoTransferVerificationIntentKey.LoggingContext getLoggingContext() {
        return this.loggingContext;
    }
}
