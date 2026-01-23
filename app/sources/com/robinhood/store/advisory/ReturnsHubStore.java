package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.advisory.p304db.returns.ReturnsHubResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: ReturnsHubStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0015\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/advisory/ReturnsHubStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/store/StoreBundle;)V", "getAdvisoryService", "()Ladvisory/proto/v1/AdvisoryService;", "returnsHubDataFlowMap", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;", "returnsHubEndPoint", "Lcom/robinhood/android/moria/network/Endpoint;", "returnsHubQuery", "Lcom/robinhood/android/moria/db/Query;", "streamReturnsHubData", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ReturnsHubStore extends Store {
    private final AdvisoryService advisoryService;
    private final Map<String, StateFlow2<ReturnsHubResponse>> returnsHubDataFlowMap;
    private final Endpoint<String, ReturnsHubResponse> returnsHubEndPoint;
    private final Query<String, ReturnsHubResponse> returnsHubQuery;

    public final AdvisoryService getAdvisoryService() {
        return this.advisoryService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnsHubStore(AdvisoryService advisoryService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.returnsHubDataFlowMap = new LinkedHashMap();
        Endpoint<String, ReturnsHubResponse> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ReturnsHubStore2(this, null), getLogoutKillswitch(), new ReturnsHubStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.returnsHubEndPoint = endpointCreate$default;
        this.returnsHubQuery = Store.create$default(this, Query.INSTANCE, "returnsHubQuery", CollectionsKt.listOf(new RefreshEach(new ReturnsHubStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.advisory.ReturnsHubStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReturnsHubStore.returnsHubQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow returnsHubQuery$lambda$1(ReturnsHubStore returnsHubStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<ReturnsHubResponse>> map = returnsHubStore.returnsHubDataFlowMap;
        StateFlow2<ReturnsHubResponse> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<ReturnsHubResponse> streamReturnsHubData(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.returnsHubQuery.asFlow(accountNumber);
    }
}
