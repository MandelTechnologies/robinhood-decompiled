package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetDepositPromoDetailsResponseDto;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryDepositPromoDetailsStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryDepositPromoDetailsStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "", "Ladvisory/proto/v1/GetDepositPromoDetailsResponseDto;", "fetchPromoDetails", "campaign", "isIraTransfer", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisoryDepositPromoDetailsStore extends Store {
    private final AdvisoryService advisoryService;
    private final Endpoint<Tuples2<String, Boolean>, GetDepositPromoDetailsResponseDto> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryDepositPromoDetailsStore(AdvisoryService advisoryService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.endpoint = Endpoint.INSTANCE.create(new AdvisoryDepositPromoDetailsStore2(this, null), getLogoutKillswitch(), new AdvisoryDepositPromoDetailsStore3(null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
    }

    public final Object fetchPromoDetails(String str, boolean z, Continuation<? super GetDepositPromoDetailsResponseDto> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.endpoint, Tuples4.m3642to(str, boxing.boxBoolean(z)), null, continuation, 2, null);
    }
}
