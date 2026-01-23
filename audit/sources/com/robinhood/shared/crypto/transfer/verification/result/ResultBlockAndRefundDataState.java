package com.robinhood.shared.crypto.transfer.verification.result;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferHistoryDetailResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultBlockAndRefundDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundDataState;", "", AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY, "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetailResponse;", "<init>", "(Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetailResponse;)V", "currency", "", "getCurrency", "()Ljava/lang/String;", "loading", "", "getLoading", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ResultBlockAndRefundDataState {
    public static final int $stable = 8;
    private final CryptoTransferHistoryDetailResponse history;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultBlockAndRefundDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final CryptoTransferHistoryDetailResponse getHistory() {
        return this.history;
    }

    public static /* synthetic */ ResultBlockAndRefundDataState copy$default(ResultBlockAndRefundDataState resultBlockAndRefundDataState, CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTransferHistoryDetailResponse = resultBlockAndRefundDataState.history;
        }
        return resultBlockAndRefundDataState.copy(cryptoTransferHistoryDetailResponse);
    }

    public final ResultBlockAndRefundDataState copy(CryptoTransferHistoryDetailResponse history) {
        return new ResultBlockAndRefundDataState(history);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResultBlockAndRefundDataState) && Intrinsics.areEqual(this.history, ((ResultBlockAndRefundDataState) other).history);
    }

    public int hashCode() {
        CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse = this.history;
        if (cryptoTransferHistoryDetailResponse == null) {
            return 0;
        }
        return cryptoTransferHistoryDetailResponse.hashCode();
    }

    public String toString() {
        return "ResultBlockAndRefundDataState(history=" + this.history + ")";
    }

    public ResultBlockAndRefundDataState(CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse) {
        this.history = cryptoTransferHistoryDetailResponse;
    }

    public /* synthetic */ ResultBlockAndRefundDataState(CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoTransferHistoryDetailResponse);
    }

    public final String getCurrency() {
        CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse = this.history;
        if (cryptoTransferHistoryDetailResponse != null) {
            return cryptoTransferHistoryDetailResponse.getCurrencyCode();
        }
        return null;
    }

    public final boolean getLoading() {
        return this.history == null;
    }
}
