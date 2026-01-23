package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetAdvisoryInsightDetailsRequestDto;
import advisory.proto.p008v1.GetAdvisoryInsightsRequestDto;
import advisory.proto.p008v1.GetAdvisoryMultiPageInsightRequestDto;
import advisory.proto.p008v1.GetUnseenAdvisoryInsightsRequestDto;
import advisory.proto.p008v1.MarkAdvisoryInsightAsSeenBodyDto;
import advisory.proto.p008v1.MarkAdvisoryInsightAsSeenRequestDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.api.AdvisoryApi;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.advisory.api.insights.ApiAdvisoryInsightsPerformanceChartModel;
import com.robinhood.models.advisory.dao.AdvisorInsightsDao;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightKt;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.Combine;
import p479j$.time.Clock;
import yoda.service.insight.InsightTypeDto;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001f\u0010 J \u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\"\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00130'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00130'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00130-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001e018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u00106\u001a\u0014\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00100R \u00108\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0013078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R&\u0010:\u001a\u0014\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109¨\u0006;"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryInsightsStore;", "Lcom/robinhood/store/Store;", "Ladvisory/proto/v1/AdvisoryService;", "advisoryService", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "advisorInsightsDao", "Lcom/robinhood/android/advisory/api/AdvisoryApi;", "advisoryApi", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;Lcom/robinhood/android/advisory/api/AdvisoryApi;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "", "parentId", "accountNumber", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "streamMultiPageInsights", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "onlyUnseen", "streamInsights", "(Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "streamMostRecentUnseenInsights", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "insightId", "streamSingleInsight", "", "markInsightAsSeen", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getPortfolioPerformanceChart", "Ladvisory/proto/v1/AdvisoryService;", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "Lcom/robinhood/android/advisory/api/AdvisoryApi;", "Lj$/time/Clock;", "Lcom/robinhood/api/PaginatedEndpoint;", "Ladvisory/proto/v1/GetAdvisoryInsightsRequestDto;", "insightsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Ladvisory/proto/v1/GetUnseenAdvisoryInsightsRequestDto;", "unseenInsightsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ladvisory/proto/v1/GetAdvisoryInsightDetailsRequestDto;", "singleInsightEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenRequestDto;", "markAsSeenEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Ladvisory/proto/v1/GetAdvisoryMultiPageInsightRequestDto;", "multiPageEndpoint", "Lcom/robinhood/android/moria/db/Query;", "singleInsightQuery", "Lcom/robinhood/android/moria/db/Query;", "multiPageQuery", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AdvisoryInsightsStore extends Store {
    private final AdvisorInsightsDao advisorInsightsDao;
    private final AdvisoryApi advisoryApi;
    private final AdvisoryService advisoryService;
    private final Clock clock;
    private final PaginatedEndpoint<GetAdvisoryInsightsRequestDto, AdvisoryInsight> insightsEndpoint;
    private final PostEndpoint<MarkAdvisoryInsightAsSeenRequestDto, Unit> markAsSeenEndpoint;
    private final Endpoint<GetAdvisoryMultiPageInsightRequestDto, List<AdvisoryInsight>> multiPageEndpoint;
    private final Query<GetAdvisoryMultiPageInsightRequestDto, List<AdvisoryInsight>> multiPageQuery;
    private final Endpoint<GetAdvisoryInsightDetailsRequestDto, AdvisoryInsight> singleInsightEndpoint;
    private final Query<GetAdvisoryInsightDetailsRequestDto, AdvisoryInsight> singleInsightQuery;
    private final PaginatedEndpoint<GetUnseenAdvisoryInsightsRequestDto, AdvisoryInsight> unseenInsightsEndpoint;

    /* compiled from: AdvisoryInsightsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore", m3645f = "AdvisoryInsightsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "getPortfolioPerformanceChart")
    /* renamed from: com.robinhood.store.advisory.AdvisoryInsightsStore$getPortfolioPerformanceChart$1 */
    static final class C413171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413171(Continuation<? super C413171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryInsightsStore.this.getPortfolioPerformanceChart(null, null, this);
        }
    }

    /* compiled from: AdvisoryInsightsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore", m3645f = "AdvisoryInsightsStore.kt", m3646l = {EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "markInsightAsSeen")
    /* renamed from: com.robinhood.store.advisory.AdvisoryInsightsStore$markInsightAsSeen$1 */
    static final class C413181 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C413181(Continuation<? super C413181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryInsightsStore.this.markInsightAsSeen(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightsStore(AdvisoryService advisoryService, AdvisorInsightsDao advisorInsightsDao, AdvisoryApi advisoryApi, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(advisorInsightsDao, "advisorInsightsDao");
        Intrinsics.checkNotNullParameter(advisoryApi, "advisoryApi");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.advisoryService = advisoryService;
        this.advisorInsightsDao = advisorInsightsDao;
        this.advisoryApi = advisoryApi;
        this.clock = clock;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock2 = storeBundle.getClock();
        Durations durations = Durations.INSTANCE;
        this.insightsEndpoint = companion.create(new AdvisoryInsightsStore$insightsEndpoint$1(this, null), logoutKillswitch, new AdvisoryInsightsStore$insightsEndpoint$2(this, null), clock2, new DefaultStaleDecider(durations.getFIFTEEN_MINUTES(), storeBundle.getClock()));
        this.unseenInsightsEndpoint = companion.create(new AdvisoryInsightsStore$unseenInsightsEndpoint$1(this, null), getLogoutKillswitch(), new AdvisoryInsightsStore$unseenInsightsEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(durations.getFIFTEEN_MINUTES(), storeBundle.getClock()));
        Endpoint.Companion companion2 = Endpoint.INSTANCE;
        AdvisoryInsightsStore$singleInsightEndpoint$1 advisoryInsightsStore$singleInsightEndpoint$1 = new AdvisoryInsightsStore$singleInsightEndpoint$1(advisorInsightsDao);
        this.singleInsightEndpoint = companion2.create(new AdvisoryInsightsStore$singleInsightEndpoint$2(this, null), getLogoutKillswitch(), advisoryInsightsStore$singleInsightEndpoint$1, storeBundle.getClock(), new DefaultStaleDecider(durations.getFIFTEEN_MINUTES(), storeBundle.getClock()));
        this.markAsSeenEndpoint = PostEndpoint.INSTANCE.createWithParams(new AdvisoryInsightsStore$markAsSeenEndpoint$1(this, null), new AdvisoryInsightsStore$markAsSeenEndpoint$2(null));
        AdvisoryInsightsStore$multiPageEndpoint$1 advisoryInsightsStore$multiPageEndpoint$1 = new AdvisoryInsightsStore$multiPageEndpoint$1(advisorInsightsDao);
        Endpoint<GetAdvisoryMultiPageInsightRequestDto, List<AdvisoryInsight>> endpointCreate = companion2.create(new AdvisoryInsightsStore$multiPageEndpoint$2(this, null), getLogoutKillswitch(), advisoryInsightsStore$multiPageEndpoint$1, storeBundle.getClock(), new DefaultStaleDecider(durations.getFIFTEEN_MINUTES(), storeBundle.getClock()));
        this.multiPageEndpoint = endpointCreate;
        Query.Companion companion3 = Query.INSTANCE;
        this.singleInsightQuery = Store.create$default(this, companion3, "singleInsightQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryInsightsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryInsightsStore.singleInsightQuery$lambda$1(this.f$0, (GetAdvisoryInsightDetailsRequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryInsightsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryInsightsStore.singleInsightQuery$lambda$2(this.f$0, (GetAdvisoryInsightDetailsRequestDto) obj);
            }
        }, false, 8, null);
        this.multiPageQuery = Store.create$default(this, companion3, "multiPageInsightQuery", CollectionsKt.listOf(new RefreshEach(new AdvisoryInsightsStore$multiPageQuery$1(endpointCreate))), new Function1() { // from class: com.robinhood.store.advisory.AdvisoryInsightsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryInsightsStore.multiPageQuery$lambda$3(this.f$0, (GetAdvisoryMultiPageInsightRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object singleInsightEndpoint$insert(AdvisorInsightsDao advisorInsightsDao, AdvisoryInsight advisoryInsight, Continuation continuation) {
        advisorInsightsDao.insert((AdvisorInsightsDao) advisoryInsight);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object multiPageEndpoint$insert$0(AdvisorInsightsDao advisorInsightsDao, Iterable iterable, Continuation continuation) {
        advisorInsightsDao.insert(iterable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singleInsightQuery$lambda$1(AdvisoryInsightsStore advisoryInsightsStore, GetAdvisoryInsightDetailsRequestDto insightDetailsRequestDto) {
        Intrinsics.checkNotNullParameter(insightDetailsRequestDto, "insightDetailsRequestDto");
        return Endpoint.DefaultImpls.poll$default(advisoryInsightsStore.singleInsightEndpoint, insightDetailsRequestDto, Durations.INSTANCE.getFIFTEEN_MINUTES(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singleInsightQuery$lambda$2(AdvisoryInsightsStore advisoryInsightsStore, GetAdvisoryInsightDetailsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return advisoryInsightsStore.advisorInsightsDao.streamInsight(request.getInsight_id(), request.getAccount_number());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow multiPageQuery$lambda$3(AdvisoryInsightsStore advisoryInsightsStore, GetAdvisoryMultiPageInsightRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return advisoryInsightsStore.advisorInsightsDao.streamChildInsights(request.getInsight_id(), request.getAccount_number());
    }

    public final Flow<List<AdvisoryInsight>> streamMultiPageInsights(String parentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.multiPageQuery.asFlow(new GetAdvisoryMultiPageInsightRequestDto(parentId, accountNumber));
    }

    public static /* synthetic */ Flow streamInsights$default(AdvisoryInsightsStore advisoryInsightsStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return advisoryInsightsStore.streamInsights(str, z);
    }

    public final Flow<List<AdvisoryInsight>> streamInsights(String accountNumber, boolean onlyUnseen) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (onlyUnseen) {
            PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.unseenInsightsEndpoint, new GetUnseenAdvisoryInsightsRequestDto(null, null, accountNumber, 3, null), false, 2, null);
        } else {
            PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.insightsEndpoint, new GetAdvisoryInsightsRequestDto(null, null, accountNumber, InsightTypeDto.INSIGHT_TYPE_UNSPECIFIED, 3, null), false, 2, null);
        }
        return this.advisorInsightsDao.streamTopLevelInsights(accountNumber, onlyUnseen);
    }

    public final Flow<List<AdvisoryInsight>> streamMostRecentUnseenInsights(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.unseenInsightsEndpoint, new GetUnseenAdvisoryInsightsRequestDto(null, null, accountNumber, 3, null), false, 2, null);
        final Flow[] flowArr = {this.advisorInsightsDao.streamMostRecentUnseenNonQuarterlyInsight(accountNumber), this.advisorInsightsDao.streamMostRecentUnseenQuarterlyInsight(accountNumber)};
        return new Flow<List<? extends AdvisoryInsight>>() { // from class: com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends AdvisoryInsight>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<AdvisoryInsight[]>() { // from class: com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final AdvisoryInsight[] invoke() {
                        return new AdvisoryInsight[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1$3", m3645f = "AdvisoryInsightsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends AdvisoryInsight>>, AdvisoryInsight[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super List<? extends AdvisoryInsight>> flowCollector, AdvisoryInsight[] advisoryInsightArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = advisoryInsightArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        List listSortedWith = CollectionsKt.sortedWith(ArraysKt.filterNotNull((AdvisoryInsight[]) ((Object[]) this.L$1)), 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: INVOKE (r1v6 'listSortedWith' java.util.List) = 
                              (wrap:java.util.List:0x0024: INVOKE 
                              (wrap:com.robinhood.models.advisory.db.insights.AdvisoryInsight[]:0x0022: CHECK_CAST (com.robinhood.models.advisory.db.insights.AdvisoryInsight[]) (wrap:java.lang.Object[]:0x0020: CHECK_CAST (java.lang.Object[]) (wrap:java.lang.Object:0x001e: IGET 
                              (r4v0 'this' com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1$3 A[IMMUTABLE_TYPE, THIS])
                             A[WRAPPED] com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1.3.L$1 java.lang.Object)))
                             STATIC call: kotlin.collections.ArraysKt.filterNotNull(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> (m), WRAPPED] (LINE:235))
                              (wrap:java.util.Comparator:0x002c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1068) call: com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$lambda$5$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1068) in method: com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$$inlined$combine$1.3.invokeSuspend(java.lang.Object):java.lang.Object, file: classes12.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$lambda$5$$inlined$sortedByDescending$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r4.label
                            r2 = 1
                            if (r1 == 0) goto L17
                            if (r1 != r2) goto Lf
                            kotlin.ResultKt.throwOnFailure(r5)
                            goto L3c
                        Lf:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r0)
                            throw r5
                        L17:
                            kotlin.ResultKt.throwOnFailure(r5)
                            java.lang.Object r5 = r4.L$0
                            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                            java.lang.Object r1 = r4.L$1
                            java.lang.Object[] r1 = (java.lang.Object[]) r1
                            com.robinhood.models.advisory.db.insights.AdvisoryInsight[] r1 = (com.robinhood.models.advisory.p304db.insights.AdvisoryInsight[]) r1
                            java.util.List r1 = kotlin.collections.ArraysKt.filterNotNull(r1)
                            java.lang.Iterable r1 = (java.lang.Iterable) r1
                            com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$lambda$5$$inlined$sortedByDescending$1 r3 = new com.robinhood.store.advisory.AdvisoryInsightsStore$streamMostRecentUnseenInsights$lambda$5$$inlined$sortedByDescending$1
                            r3.<init>()
                            java.util.List r1 = kotlin.collections.CollectionsKt.sortedWith(r1, r3)
                            r4.label = r2
                            java.lang.Object r5 = r5.emit(r1, r4)
                            if (r5 != r0) goto L3c
                            return r0
                        L3c:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.store.advisory.C41315x750674ef.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }
            };
        }

        public final Flow<AdvisoryInsight> streamSingleInsight(String accountNumber, String insightId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(insightId, "insightId");
            return this.singleInsightQuery.asFlow(new GetAdvisoryInsightDetailsRequestDto(insightId, accountNumber));
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        
            if (r11.markInsightSeen(r10, r9, r4) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object markInsightAsSeen(String str, String str2, Continuation<? super Unit> continuation) {
            C413181 c413181;
            if (continuation instanceof C413181) {
                c413181 = (C413181) continuation;
                int i = c413181.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c413181.label = i - Integer.MIN_VALUE;
                } else {
                    c413181 = new C413181(continuation);
                }
            }
            C413181 c4131812 = c413181;
            Object obj = c4131812.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c4131812.label;
            try {
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint<MarkAdvisoryInsightAsSeenRequestDto, Unit> postEndpoint = this.markAsSeenEndpoint;
                MarkAdvisoryInsightAsSeenRequestDto markAdvisoryInsightAsSeenRequestDto = new MarkAdvisoryInsightAsSeenRequestDto(new MarkAdvisoryInsightAsSeenBodyDto(str2, str));
                c4131812.L$0 = str;
                c4131812.L$1 = str2;
                c4131812.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, markAdvisoryInsightAsSeenRequestDto, null, c4131812, 2, null) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            str2 = (String) c4131812.L$1;
            str = (String) c4131812.L$0;
            ResultKt.throwOnFailure(obj);
            AdvisorInsightsDao advisorInsightsDao = this.advisorInsightsDao;
            c4131812.L$0 = null;
            c4131812.L$1 = null;
            c4131812.label = 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getPortfolioPerformanceChart(String str, String str2, Continuation<? super PerformanceChartModel> continuation) {
            C413171 c413171;
            if (continuation instanceof C413171) {
                c413171 = (C413171) continuation;
                int i = c413171.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c413171.label = i - Integer.MIN_VALUE;
                } else {
                    c413171 = new C413171(continuation);
                }
            }
            Object portfolioPerformanceChart = c413171.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c413171.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(portfolioPerformanceChart);
                AdvisoryApi advisoryApi = this.advisoryApi;
                c413171.label = 1;
                portfolioPerformanceChart = advisoryApi.getPortfolioPerformanceChart(str, str2, c413171);
                if (portfolioPerformanceChart == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(portfolioPerformanceChart);
            }
            return AdvisoryInsightKt.toDbModel((ApiAdvisoryInsightsPerformanceChartModel) portfolioPerformanceChart, this.clock);
        }
    }
