package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.p320db.SlipHub;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: SlipHubStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubStore;", "Lcom/robinhood/store/Store;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/SlipHub;", "slipHubSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "stream", "Lkotlinx/coroutines/flow/Flow;", "refresh", "force", "", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipHubStore extends Store {
    private final Endpoint<Unit, SlipHub> endpoint;
    private final SharedFlow2<SlipHub> slipHubSharedFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipHubStore(SlipApi slipApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipHubStore2(slipApi, null), getLogoutKillswitch(), new SlipHubStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.slipHubSharedFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    public final Flow<SlipHub> stream() {
        return FlowKt.asSharedFlow(this.slipHubSharedFlow);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
