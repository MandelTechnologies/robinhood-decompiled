package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.transfer.CryptoTransferAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoTransferConfigRequest;", "", "currencyCode", "", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/transfer/CryptoTransferAction;)V", "getCurrencyCode", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class CryptoTransferConfigRequest {
    private final CryptoTransferAction action;
    private final String currencyCode;

    public static /* synthetic */ CryptoTransferConfigRequest copy$default(CryptoTransferConfigRequest cryptoTransferConfigRequest, String str, CryptoTransferAction cryptoTransferAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTransferConfigRequest.currencyCode;
        }
        if ((i & 2) != 0) {
            cryptoTransferAction = cryptoTransferConfigRequest.action;
        }
        return cryptoTransferConfigRequest.copy(str, cryptoTransferAction);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoTransferAction getAction() {
        return this.action;
    }

    public final CryptoTransferConfigRequest copy(String currencyCode, CryptoTransferAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new CryptoTransferConfigRequest(currencyCode, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferConfigRequest)) {
            return false;
        }
        CryptoTransferConfigRequest cryptoTransferConfigRequest = (CryptoTransferConfigRequest) other;
        return Intrinsics.areEqual(this.currencyCode, cryptoTransferConfigRequest.currencyCode) && this.action == cryptoTransferConfigRequest.action;
    }

    public int hashCode() {
        String str = this.currencyCode;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.action.hashCode();
    }

    public String toString() {
        return "CryptoTransferConfigRequest(currencyCode=" + this.currencyCode + ", action=" + this.action + ")";
    }

    public CryptoTransferConfigRequest(String str, CryptoTransferAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.currencyCode = str;
        this.action = action;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final CryptoTransferAction getAction() {
        return this.action;
    }
}
