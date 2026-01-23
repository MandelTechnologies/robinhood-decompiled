package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: TransferAccountBannerStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "transferBannerChannel", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "query", "Lcom/robinhood/android/moria/db/Query;", "stream", "Lio/reactivex/Observable;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TransferAccountBannerStore extends Store {
    private final TransfersBonfireApi bonfireApi;
    private final Endpoint<Unit, ApiTransferBanners> endpoint;
    private final Query<Unit, ApiTransferBanners> query;
    private final SharedFlow2<ApiTransferBanners> transferBannerChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAccountBannerStore(TransfersBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        SharedFlow2<ApiTransferBanners> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.transferBannerChannel = sharedFlow2MutableSharedFlow$default;
        Endpoint<Unit, ApiTransferBanners> endpointCreate = Endpoint.INSTANCE.create(new TransferAccountBannerStore2(this, null), getLogoutKillswitch(), new TransferAccountBannerStore3(sharedFlow2MutableSharedFlow$default), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getFIVE_SECONDS(), storeBundle.getClock()));
        this.endpoint = endpointCreate;
        this.query = Store.create$default(this, Query.INSTANCE, "transferBannerQuery", CollectionsKt.listOf(new RefreshEach(new TransferAccountBannerStore4(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountBannerStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$tryEmit(SharedFlow2 sharedFlow2, ApiTransferBanners apiTransferBanners, Continuation continuation) {
        sharedFlow2.tryEmit(apiTransferBanners);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(TransferAccountBannerStore transferAccountBannerStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return transferAccountBannerStore.transferBannerChannel;
    }

    public final Observable<ApiTransferBanners> stream() {
        Endpoint8.refresh$default(this.endpoint, false, null, 2, null);
        return this.query.asObservable(Unit.INSTANCE);
    }
}
