package com.robinhood.shared.crypto.transfer.send.address;

import com.robinhood.models.api.transfer.ApiSavedAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiSavedAddress.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toUiModel", "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "Lcom/robinhood/models/api/transfer/ApiSavedAddress;", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.UiSavedAddressKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UiSavedAddress2 {
    public static final UiSavedAddress toUiModel(ApiSavedAddress apiSavedAddress) {
        Intrinsics.checkNotNullParameter(apiSavedAddress, "<this>");
        return new UiSavedAddress(apiSavedAddress.getId(), apiSavedAddress.getAddress(), apiSavedAddress.getCurrencyCode(), apiSavedAddress.getLastTransactionCreatedAt(), apiSavedAddress.getNickname(), apiSavedAddress.getStatusMessage(), apiSavedAddress.getStatus());
    }
}
