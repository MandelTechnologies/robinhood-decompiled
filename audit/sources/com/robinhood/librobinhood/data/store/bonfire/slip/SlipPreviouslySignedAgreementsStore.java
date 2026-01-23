package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipPreviouslySignedAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\rR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPreviouslySignedAgreementsStore;", "Lcom/robinhood/store/Store;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiPreviouslySignedAgreements;", "getPreviouslySignedAgreements", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipPreviouslySignedAgreementsStore extends Store {
    private final Endpoint<Unit, ApiPreviouslySignedAgreements> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipPreviouslySignedAgreementsStore(SlipApi slipApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipPreviouslySignedAgreementsStore2(slipApi, null), getLogoutKillswitch(), new SlipPreviouslySignedAgreementsStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object getPreviouslySignedAgreements(Continuation<? super ApiPreviouslySignedAgreements> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.endpoint, Unit.INSTANCE, null, continuation, 2, null);
    }
}
