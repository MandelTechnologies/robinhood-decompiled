package com.robinhood.rosetta.converters.crypto;

import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.CryptoOrderPayload;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrders.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "monetizationModel", "Lcom/robinhood/models/api/fee/MonetizationModel;", "Lrosetta/nummus/MonetizationModel;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.crypto.CryptoOrdersKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CryptoOrders {

    /* compiled from: CryptoOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.crypto.CryptoOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonetizationModel.values().length];
            try {
                iArr[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CryptoOrderPayload toProtobuf(ApiCryptoOrderRequest apiCryptoOrderRequest, MonetizationModel monetizationModel) {
        Intrinsics.checkNotNullParameter(apiCryptoOrderRequest, "<this>");
        String string2 = apiCryptoOrderRequest.getRef_id().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String accountId = apiCryptoOrderRequest.getAccountId();
        String string3 = apiCryptoOrderRequest.getCurrency_pair_id().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String protobuf = Securities.toProtobuf(apiCryptoOrderRequest.getPrice());
        String plainString = apiCryptoOrderRequest.getQuantity().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return new CryptoOrderPayload(string2, accountId, string3, protobuf, plainString, Orders2.toProtobuf(apiCryptoOrderRequest.getSide()), Orders2.toProtobuf(apiCryptoOrderRequest.getTime_in_force()), null, Orders2.toProtobuf(apiCryptoOrderRequest.getType()), null, null, null, null, toProtobuf(monetizationModel), Securities.toProtobuf(apiCryptoOrderRequest.getFee_ratio()), null, false, null, false, null, null, 2072192, null);
    }

    public static final rosetta.nummus.MonetizationModel toProtobuf(MonetizationModel monetizationModel) {
        int i = monetizationModel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[monetizationModel.ordinal()];
        if (i == -1) {
            return rosetta.nummus.MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
        }
        if (i == 1) {
            return rosetta.nummus.MonetizationModel.MONETIZATION_MODEL_FEE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return rosetta.nummus.MonetizationModel.MONETIZATION_MODEL_REBATE;
    }
}
