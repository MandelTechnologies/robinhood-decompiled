package com.robinhood.android.cash.flat.cashback.p071ui.bottomsheet;

import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackDataState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FlatCashbackUpsellBottomSheetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetStateProvider;", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackStateProvider;", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;", "<init>", "()V", "reduceLoadedData", "content", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", WebsocketGatewayConstants.DATA_KEY, "mockViewState", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellBottomSheetStateProvider implements BaseFlatCashbackStateProvider<MerchantOfferV2, FlatCashbackUpsellBottomSheetViewState> {
    public static final int $stable = 0;
    public static final String PROMO_NEW_TITLE_IDENTIFIER = "promo-sheet-new";
    public static final String PROMO_UNLOCKED_TITLE_IDENTIFIER = "promo-sheet-unlocked";

    @Override // com.robinhood.android.udf.StateProvider
    public BaseFlatCashbackViewState<FlatCashbackUpsellBottomSheetViewState> reduce(BaseFlatCashbackDataState<MerchantOfferV2> baseFlatCashbackDataState) {
        return BaseFlatCashbackStateProvider.DefaultImpls.reduce(this, baseFlatCashbackDataState);
    }

    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackUpsellBottomSheetViewState reduceLoadedData(ProductMarketingContent content, MerchantOfferV2 data) {
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        for (ProductMarketingContent.Feature feature : content.getFeatures()) {
            if (Intrinsics.areEqual(data.getLocked(), Boolean.FALSE)) {
                zAreEqual = Intrinsics.areEqual(feature.getIdentifier(), PROMO_UNLOCKED_TITLE_IDENTIFIER);
            } else {
                zAreEqual = Intrinsics.areEqual(feature.getIdentifier(), PROMO_NEW_TITLE_IDENTIFIER);
            }
            if (zAreEqual) {
                return new FlatCashbackUpsellBottomSheetViewState(feature.getTitle(), data);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackStateProvider
    public FlatCashbackUpsellBottomSheetViewState mockViewState() {
        return FlatCashbackUpsellBottomSheetViewState.INSTANCE.getMock$feature_cash_flat_cashback_externalDebug();
    }
}
