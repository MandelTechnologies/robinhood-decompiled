package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiSlipEnabledRequest;
import com.robinhood.models.p320db.SlipAccountsStatusResponse;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SlipStatusStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0 J\u000e\u0010!\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "Lcom/robinhood/store/Store;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "slipHubCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipHubCardStore;Lcom/robinhood/store/StoreBundle;)V", "slipEnabledSharedFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/models/db/SlipEnabledResponse;", "putEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/ApiSlipEnabledRequest;", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/SlipAccountsStatusResponse;", "updateSlipEnabledStatus", "accountNumber", "isEnabled", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSlipAccountsStatusResponse", "Lkotlinx/coroutines/Job;", "force", "streamAccountsStatus", "Lkotlinx/coroutines/flow/Flow;", "getSlipStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipStatusStore extends Store {
    private final Endpoint<Unit, SlipAccountsStatusResponse> getEndpoint;
    private final PostEndpoint<Tuples2<String, ApiSlipEnabledRequest>, SlipEnabledResponse> putEndpoint;
    private final SlipApi slipApi;
    private final StateFlow2<List<SlipEnabledResponse>> slipEnabledSharedFlow;
    private final SlipHubCardStore slipHubCardStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipStatusStore(SlipApi slipApi, SlipHubCardStore slipHubCardStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(slipHubCardStore, "slipHubCardStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.slipApi = slipApi;
        this.slipHubCardStore = slipHubCardStore;
        this.slipEnabledSharedFlow = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.putEndpoint = PostEndpoint.INSTANCE.create(new SlipStatusStore4(this, null), new SlipStatusStore5(this, null));
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipStatusStore2(this, null), getLogoutKillswitch(), new SlipStatusStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Object updateSlipEnabledStatus(String str, boolean z, Continuation<? super SlipEnabledResponse> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.putEndpoint, Tuples4.m3642to(str, new ApiSlipEnabledRequest(z)), null, continuation, 2, null);
    }

    public final Job refreshSlipAccountsStatusResponse(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.getEndpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Flow<List<SlipEnabledResponse>> streamAccountsStatus() {
        return FlowKt.asSharedFlow(this.slipEnabledSharedFlow);
    }

    public final Object getSlipStatus(Continuation<? super SlipAccountsStatusResponse> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEndpoint, Unit.INSTANCE, null, continuation, 2, null);
    }
}
