package com.robinhood.android.transfers.contracts;

import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputActivityResultContract.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"EXTRA_WIRE_ROUTING_NUMBER_INPUT_RESULT", "", "toApiOutgoingWireData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$ApiOutgoingWireData;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "outgoingWireMemo", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContractKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputActivityResultContract2 {
    public static final String EXTRA_WIRE_ROUTING_NUMBER_INPUT_RESULT = "extraWireRoutingNumberInputResult";

    public static /* synthetic */ ApiCreateTransferRequest.ApiTransferAdditionalData.ApiOutgoingWireData toApiOutgoingWireData$default(WireRoutingDetailsInputActivityResultContract3.Success success, String str, RecipientType recipientType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            recipientType = null;
        }
        return toApiOutgoingWireData(success, str, recipientType);
    }

    public static final ApiCreateTransferRequest.ApiTransferAdditionalData.ApiOutgoingWireData toApiOutgoingWireData(WireRoutingDetailsInputActivityResultContract3.Success success, String str, RecipientType recipientType) {
        Intrinsics.checkNotNullParameter(success, "<this>");
        return new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiOutgoingWireData(success.getAccountNumber(), success.getRoutingNumber(), str, recipientType);
    }
}
