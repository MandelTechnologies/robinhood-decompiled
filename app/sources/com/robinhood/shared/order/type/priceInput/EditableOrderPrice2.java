package com.robinhood.shared.order.type.priceInput;

import com.robinhood.idl.IdlDecimal2;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice;
import crypto_perpetuals.order.p438v1.ValidatePriceDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditableOrderPrice.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"toEditableOrderPrice", "Lcom/robinhood/shared/order/type/priceInput/EditableOrderPrice;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "toValidatePrice", "Lcrypto_perpetuals/order/v1/ValidatePriceDto;", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.priceInput.EditableOrderPriceKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EditableOrderPrice2 {
    public static final EditableOrderPrice toEditableOrderPrice(CryptoOrderTypeFragmentKey5 cryptoOrderTypeFragmentKey5) {
        Intrinsics.checkNotNullParameter(cryptoOrderTypeFragmentKey5, "<this>");
        if (Intrinsics.areEqual(cryptoOrderTypeFragmentKey5, CryptoOrderTypeFragmentKey5.Market.INSTANCE)) {
            throw new IllegalStateException("Market order is not able to be edited");
        }
        if (!(cryptoOrderTypeFragmentKey5 instanceof CryptoOrderTypeFragmentKey5.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoOrderTypeFragmentKey5.Limit limit = (CryptoOrderTypeFragmentKey5.Limit) cryptoOrderTypeFragmentKey5;
        return new EditableOrderPrice.Limit(limit.getPrice(), limit.getTimeInForce());
    }

    public static final ValidatePriceDto toValidatePrice(EditableOrderPrice editableOrderPrice) {
        Intrinsics.checkNotNullParameter(editableOrderPrice, "<this>");
        if (!(editableOrderPrice instanceof EditableOrderPrice.Limit)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ValidatePriceDto(new ValidatePriceDto.PriceDto.LimitPrice(new ValidatePriceDto.LimitPriceDto(IdlDecimal2.toIdlDecimal(((EditableOrderPrice.Limit) editableOrderPrice).getPrice()))));
    }
}
