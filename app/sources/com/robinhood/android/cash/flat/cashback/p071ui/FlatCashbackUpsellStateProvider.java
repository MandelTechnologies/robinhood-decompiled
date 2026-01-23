package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackUpsellStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellStateProvider;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;", "<init>", "()V", "reduceLoadedData", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", WebsocketGatewayConstants.DATA_KEY, "mockViewState", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellStateProvider implements BaseFlatCashbackStateProvider<MerchantOfferV2, FlatCashbackUpsellViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BaseFlatCashbackViewState<FlatCashbackUpsellViewState> reduce(BaseFlatCashbackDataState<MerchantOfferV2> baseFlatCashbackDataState) {
        return BaseFlatCashbackStateProvider.DefaultImpls.reduce(this, baseFlatCashbackDataState);
    }

    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackUpsellViewState reduceLoadedData(ProductMarketingContent content, MerchantOfferV2 data) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        String pageTitle = content.getPageTitle();
        if (pageTitle == null) {
            pageTitle = "";
        }
        return new FlatCashbackUpsellViewState(pageTitle, String.valueOf(content.getProductDescription()), data);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackUpsellViewState mockViewState() {
        return FlatCashbackUpsellViewState.INSTANCE.getMock$feature_cash_flat_cashback_externalDebug();
    }
}
