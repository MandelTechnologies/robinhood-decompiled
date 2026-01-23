package com.robinhood.shared.crypto.transfer.send.landing;

import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.models.util.Money;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendLandingComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/HigherLimitSheetState;", "", "limits", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "<init>", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;)V", "getLimits", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "amountAvailableForWithdrawal", "Lcom/robinhood/utils/resource/StringResource;", "getAmountAvailableForWithdrawal", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HigherLimitSheetState {
    public static final int $stable = 8;
    private final CryptoTransferLimits limits;

    public static /* synthetic */ HigherLimitSheetState copy$default(HigherLimitSheetState higherLimitSheetState, CryptoTransferLimits cryptoTransferLimits, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTransferLimits = higherLimitSheetState.limits;
        }
        return higherLimitSheetState.copy(cryptoTransferLimits);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoTransferLimits getLimits() {
        return this.limits;
    }

    public final HigherLimitSheetState copy(CryptoTransferLimits limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        return new HigherLimitSheetState(limits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HigherLimitSheetState) && Intrinsics.areEqual(this.limits, ((HigherLimitSheetState) other).limits);
    }

    public int hashCode() {
        return this.limits.hashCode();
    }

    public String toString() {
        return "HigherLimitSheetState(limits=" + this.limits + ")";
    }

    public HigherLimitSheetState(CryptoTransferLimits limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.limits = limits;
    }

    public final CryptoTransferLimits getLimits() {
        return this.limits;
    }

    public final StringResource getAmountAvailableForWithdrawal() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_limit_content, Money.format$default(this.limits.getWithdrawalFiatMaximum(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }
}
