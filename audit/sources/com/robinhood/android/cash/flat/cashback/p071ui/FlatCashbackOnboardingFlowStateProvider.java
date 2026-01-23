package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackOnboardingFlowStateProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowStateProvider;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowViewState;", "<init>", "()V", "reduceLoadedData", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", WebsocketGatewayConstants.DATA_KEY, "mockViewState", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class FlatCashbackOnboardingFlowStateProvider implements BaseFlatCashbackStateProvider<List<? extends MerchantOfferV2>, FlatCashbackOnboardingFlowViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BaseFlatCashbackViewState<FlatCashbackOnboardingFlowViewState> reduce(BaseFlatCashbackDataState<List<? extends MerchantOfferV2>> baseFlatCashbackDataState) {
        return BaseFlatCashbackStateProvider.DefaultImpls.reduce(this, baseFlatCashbackDataState);
    }

    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public /* bridge */ /* synthetic */ FlatCashbackOnboardingFlowViewState reduceLoadedData(ProductMarketingContent productMarketingContent, List<? extends MerchantOfferV2> list) {
        return reduceLoadedData2(productMarketingContent, (List<MerchantOfferV2>) list);
    }

    /* renamed from: reduceLoadedData, reason: avoid collision after fix types in other method */
    public FlatCashbackOnboardingFlowViewState reduceLoadedData2(ProductMarketingContent content, List<MerchantOfferV2> data) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        MerchantOfferV2 trialOffer = TrialRequest3.getTrialOffer(content, data);
        return new FlatCashbackOnboardingFlowViewState(trialOffer != null ? trialOffer.getId() : null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackOnboardingFlowViewState mockViewState() {
        return new FlatCashbackOnboardingFlowViewState(null);
    }
}
