package com.robinhood.android.portfolio.pnl;

import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemRequestDto;
import wormhole.service.p554v1.GetRealizedGainLossItemResponseDto;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossDetailStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "Lcom/robinhood/store/Store;", "pnlService", "Lwormhole/service/v1/PNLService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lwormhole/service/v1/PNLService;Lcom/robinhood/store/StoreBundle;)V", "getItem", "Lwormhole/service/v1/GetRealizedGainLossItemResponseDto;", "id", "Ljava/util/UUID;", "assetClassDto", "Lwormhole/service/v1/AssetClassDto;", "accountNumber", "", "(Ljava/util/UUID;Lwormhole/service/v1/AssetClassDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProfitAndLossDetailStore extends Store {
    public static final int $stable = 8;
    private final PNLService pnlService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitAndLossDetailStore(PNLService pnlService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pnlService, "pnlService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.pnlService = pnlService;
    }

    public final Object getItem(UUID uuid, AssetClassDto assetClassDto, String str, Continuation<? super GetRealizedGainLossItemResponseDto> continuation) {
        PNLService pNLService = this.pnlService;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return pNLService.GetRealizedGainLossItem(new GetRealizedGainLossItemRequestDto(string2, assetClassDto, str), continuation);
    }
}
