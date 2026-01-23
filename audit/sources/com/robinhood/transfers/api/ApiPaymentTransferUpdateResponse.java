package com.robinhood.transfers.api;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiPaymentTransferUpdateResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaymentTransferUpdateResponse;", "", "transfer", "Lcom/robinhood/transfers/api/ApiPaymentTransfer;", "<init>", "(Lcom/robinhood/transfers/api/ApiPaymentTransfer;)V", "getTransfer", "()Lcom/robinhood/transfers/api/ApiPaymentTransfer;", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ApiPaymentTransferUpdateResponse {
    private final ApiPaymentTransfer transfer;

    public ApiPaymentTransferUpdateResponse(ApiPaymentTransfer transfer) {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        this.transfer = transfer;
    }

    public final ApiPaymentTransfer getTransfer() {
        return this.transfer;
    }
}
