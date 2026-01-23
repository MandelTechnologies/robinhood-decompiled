package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/UpdateVerificationRequest;", "", "type", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;", "verificationId", "Ljava/util/UUID;", "request", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoWithdrawalVerificationRequest;", "<init>", "(Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;Ljava/util/UUID;Lcom/robinhood/models/api/transfer/verification/ApiCryptoWithdrawalVerificationRequest;)V", "getType", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse$Type;", "getVerificationId", "()Ljava/util/UUID;", "getRequest", "()Lcom/robinhood/models/api/transfer/verification/ApiCryptoWithdrawalVerificationRequest;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class UpdateVerificationRequest {
    private final ApiCryptoWithdrawalVerificationRequest request;
    private final ApiCryptoTransferHistoryDetailResponse.Type type;
    private final UUID verificationId;

    public static /* synthetic */ UpdateVerificationRequest copy$default(UpdateVerificationRequest updateVerificationRequest, ApiCryptoTransferHistoryDetailResponse.Type type2, UUID uuid, ApiCryptoWithdrawalVerificationRequest apiCryptoWithdrawalVerificationRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = updateVerificationRequest.type;
        }
        if ((i & 2) != 0) {
            uuid = updateVerificationRequest.verificationId;
        }
        if ((i & 4) != 0) {
            apiCryptoWithdrawalVerificationRequest = updateVerificationRequest.request;
        }
        return updateVerificationRequest.copy(type2, uuid, apiCryptoWithdrawalVerificationRequest);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiCryptoTransferHistoryDetailResponse.Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getVerificationId() {
        return this.verificationId;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCryptoWithdrawalVerificationRequest getRequest() {
        return this.request;
    }

    public final UpdateVerificationRequest copy(ApiCryptoTransferHistoryDetailResponse.Type type2, UUID verificationId, ApiCryptoWithdrawalVerificationRequest request) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(request, "request");
        return new UpdateVerificationRequest(type2, verificationId, request);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateVerificationRequest)) {
            return false;
        }
        UpdateVerificationRequest updateVerificationRequest = (UpdateVerificationRequest) other;
        return this.type == updateVerificationRequest.type && Intrinsics.areEqual(this.verificationId, updateVerificationRequest.verificationId) && Intrinsics.areEqual(this.request, updateVerificationRequest.request);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.verificationId.hashCode()) * 31) + this.request.hashCode();
    }

    public String toString() {
        return "UpdateVerificationRequest(type=" + this.type + ", verificationId=" + this.verificationId + ", request=" + this.request + ")";
    }

    public UpdateVerificationRequest(ApiCryptoTransferHistoryDetailResponse.Type type2, UUID verificationId, ApiCryptoWithdrawalVerificationRequest request) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(request, "request");
        this.type = type2;
        this.verificationId = verificationId;
        this.request = request;
    }

    public final ApiCryptoTransferHistoryDetailResponse.Type getType() {
        return this.type;
    }

    public final UUID getVerificationId() {
        return this.verificationId;
    }

    public final ApiCryptoWithdrawalVerificationRequest getRequest() {
        return this.request;
    }
}
