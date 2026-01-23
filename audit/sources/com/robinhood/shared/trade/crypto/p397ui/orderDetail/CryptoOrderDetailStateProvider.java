package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.crypto.history.details.OrderDetailViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderDetailStateProvider implements StateProvider<CryptoOrderDetailDataState, OrderDetailViewState<CryptoOrderDetailTapAction>> {
    public static final int $stable = 8;
    private final Resources resources;

    public CryptoOrderDetailStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OrderDetailViewState<CryptoOrderDetailTapAction> reduce(CryptoOrderDetailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new OrderDetailViewState<>(dataState.getHeaderState(), dataState.getViewInstrumentActionState(), dataState.dataRowContents(this.resources), null, dataState.getBanner(), dataState.getDisclaimerTextContent(), dataState.getButtonState(), 8, null);
    }
}
