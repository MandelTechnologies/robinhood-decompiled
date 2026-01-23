package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetTaxGainsAndLossesRequestDto;
import advisory.proto.p008v1.GetTaxLossHarvestDashboardRequestDto;
import advisory.proto.p008v1.SubmitTaxLossHarvestStrategyRequestDto;
import advisory.proto.p008v1.SubmitTaxLossHarvestStrategyResponseDto;
import advisory.proto.p008v1.TaxLossHarvestUpdateEnrollmentRequestDto;
import advisory.proto.p008v1.TaxLossHarvestUpdateEnrollmentResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.advisory.p304db.tlh.SubmitTaxLossHarvestStrategyResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestFlowResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesResponse;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyType;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestUpdateEnrollment;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestUpdateEnrollmentResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TaxLossHarvestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"2\b\u0010#\u001a\u0004\u0018\u00010\nJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\b\u0010#\u001a\u0004\u0018\u00010\nJ\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u001bJ\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\"J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0086@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0086@¢\u0006\u0002\u00101R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b\u0012\u0004\u0012\u00020\u00100\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/store/advisory/TaxLossHarvestStore;", "Lcom/robinhood/store/Store;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/store/StoreBundle;)V", "taxLossHarvestDashboardFlow", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard;", "gainsAndLossesFlow", "Lcom/robinhood/models/advisory/db/tlh/TaxGainsAndLossesResponse;", "harvestStrategiesFlow", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategiesResponse;", "flowResponseFlow", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestFlowResponse;", "dashboardEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardRequestDto;", "flowEndpoint", "", "gainsAndLossesEndpoint", "Ladvisory/proto/v1/GetTaxGainsAndLossesRequestDto;", "harvestStrategiesEndpoint", "", "dashboardQuery", "Lcom/robinhood/android/moria/db/Query;", "flowQuery", "gainsAndLossesQuery", "harvestStrategiesQuery", "streamDashboard", "Lkotlinx/coroutines/flow/Flow;", "year", "streamGainsAndLosses", "streamHarvestStrategies", "accountNumbers", "streamFlowResponse", "submitHarvestStrategy", "Lcom/robinhood/models/advisory/db/tlh/SubmitTaxLossHarvestStrategyResponse;", "strategyType", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyType;", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategyType;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEnrollment", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestUpdateEnrollmentResponse;", "isEnrolled", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TaxLossHarvestStore extends Store {
    private final AdvisoryService advisoryService;
    private final Endpoint<GetTaxLossHarvestDashboardRequestDto, TaxLossHarvestDashboard> dashboardEndpoint;
    private final Query<GetTaxLossHarvestDashboardRequestDto, TaxLossHarvestDashboard> dashboardQuery;
    private final Endpoint<Unit, TaxLossHarvestFlowResponse> flowEndpoint;
    private final Query<Unit, TaxLossHarvestFlowResponse> flowQuery;
    private final StateFlow2<TaxLossHarvestFlowResponse> flowResponseFlow;
    private final Endpoint<GetTaxGainsAndLossesRequestDto, TaxGainsAndLossesResponse> gainsAndLossesEndpoint;
    private final Map<String, StateFlow2<TaxGainsAndLossesResponse>> gainsAndLossesFlow;
    private final Query<GetTaxGainsAndLossesRequestDto, TaxGainsAndLossesResponse> gainsAndLossesQuery;
    private final Endpoint<List<String>, TaxLossHarvestStrategiesResponse> harvestStrategiesEndpoint;
    private final StateFlow2<TaxLossHarvestStrategiesResponse> harvestStrategiesFlow;
    private final Query<List<String>, TaxLossHarvestStrategiesResponse> harvestStrategiesQuery;
    private final Map<String, StateFlow2<TaxLossHarvestDashboard>> taxLossHarvestDashboardFlow;

    /* compiled from: TaxLossHarvestStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore", m3645f = "TaxLossHarvestStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "submitHarvestStrategy")
    /* renamed from: com.robinhood.store.advisory.TaxLossHarvestStore$submitHarvestStrategy$1 */
    static final class C413271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413271(Continuation<? super C413271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaxLossHarvestStore.this.submitHarvestStrategy(null, null, this);
        }
    }

    /* compiled from: TaxLossHarvestStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.TaxLossHarvestStore", m3645f = "TaxLossHarvestStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "updateEnrollment")
    /* renamed from: com.robinhood.store.advisory.TaxLossHarvestStore$updateEnrollment$1 */
    static final class C413281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413281(Continuation<? super C413281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TaxLossHarvestStore.this.updateEnrollment(false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStore(AdvisoryService advisoryService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.taxLossHarvestDashboardFlow = new LinkedHashMap();
        this.gainsAndLossesFlow = new LinkedHashMap();
        this.harvestStrategiesFlow = StateFlow4.MutableStateFlow(null);
        this.flowResponseFlow = StateFlow4.MutableStateFlow(null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<GetTaxLossHarvestDashboardRequestDto, TaxLossHarvestDashboard> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new TaxLossHarvestStore$dashboardEndpoint$1(this, null), getLogoutKillswitch(), new TaxLossHarvestStore$dashboardEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.dashboardEndpoint = endpointCreateWithParams$default;
        Endpoint<Unit, TaxLossHarvestFlowResponse> endpointCreate$default = Endpoint.Companion.create$default(companion, new TaxLossHarvestStore$flowEndpoint$1(this, null), getLogoutKillswitch(), new TaxLossHarvestStore$flowEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.flowEndpoint = endpointCreate$default;
        Endpoint<GetTaxGainsAndLossesRequestDto, TaxGainsAndLossesResponse> endpointCreateWithParams$default2 = Endpoint.Companion.createWithParams$default(companion, new TaxLossHarvestStore$gainsAndLossesEndpoint$1(this, null), getLogoutKillswitch(), new TaxLossHarvestStore$gainsAndLossesEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.gainsAndLossesEndpoint = endpointCreateWithParams$default2;
        Endpoint<List<String>, TaxLossHarvestStrategiesResponse> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new TaxLossHarvestStore$harvestStrategiesEndpoint$1(this, null), getLogoutKillswitch(), new TaxLossHarvestStore$harvestStrategiesEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.harvestStrategiesEndpoint = endpointCreate$default2;
        Query.Companion companion2 = Query.INSTANCE;
        this.dashboardQuery = Store.create$default(this, companion2, "taxLossHarvestDashboardQuery", CollectionsKt.listOf(new RefreshEach(new TaxLossHarvestStore$dashboardQuery$1(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.store.advisory.TaxLossHarvestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxLossHarvestStore.dashboardQuery$lambda$1(this.f$0, (GetTaxLossHarvestDashboardRequestDto) obj);
            }
        }, false, 8, null);
        this.flowQuery = Store.create$default(this, companion2, "taxLossHarvestFlowQuery", CollectionsKt.listOf(new RefreshEach(new TaxLossHarvestStore$flowQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.advisory.TaxLossHarvestStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxLossHarvestStore.flowQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.gainsAndLossesQuery = Store.create$default(this, companion2, "taxLossHarvestGainsAndLossesQuery", CollectionsKt.listOf(new RefreshEach(new TaxLossHarvestStore$gainsAndLossesQuery$1(endpointCreateWithParams$default2))), new Function1() { // from class: com.robinhood.store.advisory.TaxLossHarvestStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxLossHarvestStore.gainsAndLossesQuery$lambda$6(this.f$0, (GetTaxGainsAndLossesRequestDto) obj);
            }
        }, false, 8, null);
        this.harvestStrategiesQuery = Store.create$default(this, companion2, "taxLossHarvestStrategiesQuery", CollectionsKt.listOf(new RefreshEach(new TaxLossHarvestStore$harvestStrategiesQuery$1(endpointCreate$default2))), new Function1() { // from class: com.robinhood.store.advisory.TaxLossHarvestStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxLossHarvestStore.harvestStrategiesQuery$lambda$8(this.f$0, (List) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow dashboardQuery$lambda$1(TaxLossHarvestStore taxLossHarvestStore, GetTaxLossHarvestDashboardRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, StateFlow2<TaxLossHarvestDashboard>> map = taxLossHarvestStore.taxLossHarvestDashboardFlow;
        String year = request.getYear();
        StateFlow2<TaxLossHarvestDashboard> stateFlow2MutableStateFlow = map.get(year);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(year, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow flowQuery$lambda$3(TaxLossHarvestStore taxLossHarvestStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return taxLossHarvestStore.flowResponseFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow gainsAndLossesQuery$lambda$6(TaxLossHarvestStore taxLossHarvestStore, GetTaxGainsAndLossesRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, StateFlow2<TaxGainsAndLossesResponse>> map = taxLossHarvestStore.gainsAndLossesFlow;
        String year = request.getYear();
        StateFlow2<TaxGainsAndLossesResponse> stateFlow2MutableStateFlow = map.get(year);
        if (stateFlow2MutableStateFlow == null) {
            stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
            map.put(year, stateFlow2MutableStateFlow);
        }
        return stateFlow2MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow harvestStrategiesQuery$lambda$8(TaxLossHarvestStore taxLossHarvestStore, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return taxLossHarvestStore.harvestStrategiesFlow;
    }

    public final Flow<TaxLossHarvestDashboard> streamDashboard(String year) {
        return this.dashboardQuery.asFlow(new GetTaxLossHarvestDashboardRequestDto(year));
    }

    public final Flow<TaxGainsAndLossesResponse> streamGainsAndLosses(String year) {
        return this.gainsAndLossesQuery.asFlow(new GetTaxGainsAndLossesRequestDto(year));
    }

    public final Flow<TaxLossHarvestStrategiesResponse> streamHarvestStrategies(List<String> accountNumbers) {
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        return this.harvestStrategiesQuery.asFlow(accountNumbers);
    }

    public final Flow<TaxLossHarvestFlowResponse> streamFlowResponse() {
        return this.flowQuery.asFlow(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitHarvestStrategy(TaxLossHarvestStrategyType taxLossHarvestStrategyType, List<String> list, Continuation<? super SubmitTaxLossHarvestStrategyResponse> continuation) {
        C413271 c413271;
        if (continuation instanceof C413271) {
            c413271 = (C413271) continuation;
            int i = c413271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413271.label = i - Integer.MIN_VALUE;
            } else {
                c413271 = new C413271(continuation);
            }
        }
        Object objSubmitTaxLossHarvestStrategy = c413271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitTaxLossHarvestStrategy);
            AdvisoryService advisoryService = this.advisoryService;
            SubmitTaxLossHarvestStrategyRequestDto submitTaxLossHarvestStrategyRequestDto = new SubmitTaxLossHarvestStrategyRequestDto(TaxLossHarvestStrategiesKt.toDtoModel(taxLossHarvestStrategyType), list);
            c413271.label = 1;
            objSubmitTaxLossHarvestStrategy = advisoryService.SubmitTaxLossHarvestStrategy(submitTaxLossHarvestStrategyRequestDto, c413271);
            if (objSubmitTaxLossHarvestStrategy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitTaxLossHarvestStrategy);
        }
        return TaxLossHarvestStrategiesKt.toDbModel((SubmitTaxLossHarvestStrategyResponseDto) objSubmitTaxLossHarvestStrategy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateEnrollment(boolean z, Continuation<? super TaxLossHarvestUpdateEnrollmentResponse> continuation) {
        C413281 c413281;
        if (continuation instanceof C413281) {
            c413281 = (C413281) continuation;
            int i = c413281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413281.label = i - Integer.MIN_VALUE;
            } else {
                c413281 = new C413281(continuation);
            }
        }
        Object objTaxLossHarvestUpdateEnrollment = c413281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413281.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxLossHarvestUpdateEnrollment);
            AdvisoryService advisoryService = this.advisoryService;
            TaxLossHarvestUpdateEnrollmentRequestDto taxLossHarvestUpdateEnrollmentRequestDto = new TaxLossHarvestUpdateEnrollmentRequestDto(z);
            c413281.label = 1;
            objTaxLossHarvestUpdateEnrollment = advisoryService.TaxLossHarvestUpdateEnrollment(taxLossHarvestUpdateEnrollmentRequestDto, c413281);
            if (objTaxLossHarvestUpdateEnrollment == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxLossHarvestUpdateEnrollment);
        }
        TaxLossHarvestUpdateEnrollmentResponse dbModel = TaxLossHarvestUpdateEnrollment.toDbModel((TaxLossHarvestUpdateEnrollmentResponseDto) objTaxLossHarvestUpdateEnrollment);
        Endpoint.DefaultImpls.refresh$default(this.dashboardEndpoint, new GetTaxLossHarvestDashboardRequestDto(null, i3, 0 == true ? 1 : 0), true, null, 4, null);
        return dbModel;
    }
}
