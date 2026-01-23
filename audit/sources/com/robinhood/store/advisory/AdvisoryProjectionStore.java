package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.advisory.p304db.projection.ProjectedReturns;
import com.robinhood.models.advisory.p304db.projection.ProjectionDisclosure;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
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
import p479j$.time.Clock;
import yoda.service.RestYoda;

/* compiled from: AdvisoryProjectionStore.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\u001b\u001a\u00020\fJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryProjectionStore;", "Lcom/robinhood/store/Store;", "yodaApi", "Lyoda/service/RestYoda;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lyoda/service/RestYoda;Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/store/StoreBundle;)V", "projectionFlowMap", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/projection/ProjectedReturns;", "getProjectionFlowMap$lib_store_advisory_externalDebug", "()Ljava/util/Map;", "projectionDisclosureFlowMap", "Lcom/robinhood/models/advisory/db/projection/ProjectionDisclosure;", "projectionEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "projectionDisclosureEndpoint", "projectionQuery", "Lcom/robinhood/android/moria/db/Query;", "projectionDisclosureQuery", "streamProjections", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "streamProjectionDisclosure", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AdvisoryProjectionStore extends Store {
    private final AdvisoryService advisoryService;
    private final Endpoint<String, ProjectionDisclosure> projectionDisclosureEndpoint;
    private final Map<String, StateFlow2<ProjectionDisclosure>> projectionDisclosureFlowMap;
    private final Query<String, ProjectionDisclosure> projectionDisclosureQuery;
    private final Endpoint<String, ProjectedReturns> projectionEndpoint;
    private final Map<String, StateFlow2<ProjectedReturns>> projectionFlowMap;
    private final Query<String, ProjectedReturns> projectionQuery;
    private final RestYoda yodaApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryProjectionStore(RestYoda yodaApi, AdvisoryService advisoryService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(yodaApi, "yodaApi");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.yodaApi = yodaApi;
        this.advisoryService = advisoryService;
        this.projectionFlowMap = new LinkedHashMap();
        this.projectionDisclosureFlowMap = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        Endpoint<String, ProjectedReturns> endpointCreate = companion.create(new AdvisoryProjectionStore5(this, null), logoutKillswitch, new AdvisoryProjectionStore6(this, null), clock, new DefaultStaleDecider(durations.getFIFTEEN_MINUTES(), storeBundle.getClock()));
        this.projectionEndpoint = endpointCreate;
        Endpoint<String, ProjectionDisclosure> endpointCreate2 = companion.create(new AdvisoryProjectionStore2(this, null), getLogoutKillswitch(), new AdvisoryProjectionStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getONE_HOUR(), storeBundle.getClock()));
        this.projectionDisclosureEndpoint = endpointCreate2;
        Query.Companion companion2 = Query.INSTANCE;
        this.projectionQuery = Store.create$default(this, companion2, "accountProjectionQuery", CollectionsKt.listOf(new RefreshEach(new AdvisoryProjectionStore7(endpointCreate))), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryProjectionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryProjectionStore.projectionQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.projectionDisclosureQuery = Store.create$default(this, companion2, "projectionDisclosureQuery", CollectionsKt.listOf(new RefreshEach(new AdvisoryProjectionStore4(endpointCreate2))), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryProjectionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryProjectionStore.projectionDisclosureQuery$lambda$4(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    public final Map<String, StateFlow2<ProjectedReturns>> getProjectionFlowMap$lib_store_advisory_externalDebug() {
        return this.projectionFlowMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow projectionQuery$lambda$1(AdvisoryProjectionStore advisoryProjectionStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<ProjectedReturns>> map = advisoryProjectionStore.projectionFlowMap;
        StateFlow2<ProjectedReturns> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow projectionDisclosureQuery$lambda$4(AdvisoryProjectionStore advisoryProjectionStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Map<String, StateFlow2<ProjectionDisclosure>> map = advisoryProjectionStore.projectionDisclosureFlowMap;
        StateFlow2<ProjectionDisclosure> stateFlow2MutableStateFlow = map.get(accountNumber);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(accountNumber, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    public final Flow<ProjectedReturns> streamProjections(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.projectionQuery.asFlow(accountNumber);
    }

    public final Flow<ProjectionDisclosure> streamProjectionDisclosure(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.projectionDisclosureQuery.asFlow(accountNumber);
    }
}
