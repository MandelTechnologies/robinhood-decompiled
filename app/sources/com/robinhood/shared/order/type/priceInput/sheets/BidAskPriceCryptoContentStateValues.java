package com.robinhood.shared.order.type.priceInput.sheets;

import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.content.CryptoContentState;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BidAskPriceCryptoContentStateValues.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getBidAskPriceCryptoContentState", "Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;", "instrumentSymbol", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.priceInput.sheets.BidAskPriceCryptoContentStateValuesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BidAskPriceCryptoContentStateValues {

    /* compiled from: BidAskPriceCryptoContentStateValues.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.order.type.priceInput.sheets.BidAskPriceCryptoContentStateValuesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CryptoContentState getBidAskPriceCryptoContentState(String instrumentSymbol, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoContentState(companion.invoke(C39278R.string.crypto_order_types_ask_price_sheet_title, instrumentSymbol), companion.invoke(C39278R.string.crypto_order_types_ask_price_sheet_description, new Object[0]), extensions2.persistentListOf(), null, companion.invoke(C39278R.string.crypto_order_types_ok, new Object[0]), null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        return new CryptoContentState(companion2.invoke(C39278R.string.crypto_order_types_bid_price_sheet_title, instrumentSymbol), companion2.invoke(C39278R.string.crypto_order_types_bid_price_sheet_description, new Object[0]), extensions2.persistentListOf(), null, companion2.invoke(C39278R.string.crypto_order_types_ok, new Object[0]), null);
    }
}
