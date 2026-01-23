package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderDetailTaxLotsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDataState;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderDetailTaxLotsStateProvider implements StateProvider<CryptoOrderDetailTaxLotsDataState, CryptoOrderDetailTaxLotsViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public CryptoOrderDetailTaxLotsStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoOrderDetailTaxLotsViewState reduce(CryptoOrderDetailTaxLotsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new CryptoOrderDetailTaxLotsViewState(dataState.getTitle(), dataState.getSubtitle(), dataState.taxLotTableState(this.resources));
    }
}
