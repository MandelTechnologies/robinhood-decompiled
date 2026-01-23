package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.pluto.ApiActivateTrialResponse;
import com.robinhood.models.api.pluto.ApiMerchantOfferBanner;
import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import com.robinhood.models.dao.MerchantOfferV2Dao;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner2;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV23;
import com.robinhood.models.p320db.mcduckling.RoundupOverview;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: MerchantOfferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00011B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020&J\u0018\u0010$\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020&J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0)2\u0006\u0010'\u001a\u00020\u0011J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0)2\u0006\u0010+\u001a\u00020\u0011J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190)J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190-J\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190/2\u0006\u00100\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/MerchantOfferV2Dao;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/MerchantOfferV2Dao;Lcom/robinhood/api/pluto/PlutoApi;)V", "endpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2;", "halfSheetEndpoint", "singleOfferEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "trialEligibleOffersEndpoint", "", "activateTrial", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/pluto/ApiActivateTrialResponse;", "query", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "singleOfferQuery", "offerByGlobalOfferIdQuery", "bannerEndpoint", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferBanner;", "streamBanner", "Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", "offerId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "force", "", "id", "stream", "Lio/reactivex/Observable;", "streamByGlobalOfferId", "globalOfferId", "getDebitSpendOffers", "Lio/reactivex/Single;", "getTrialEligibleOffers", "Lkotlinx/coroutines/flow/Flow;", "context", "MerchantOfferContextQueryParams", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MerchantOfferStore extends Store {
    private final PostEndpoint<UUID, ApiActivateTrialResponse> activateTrial;
    private final Endpoint<UUID, Response<ApiMerchantOfferBanner>> bannerEndpoint;
    private final MerchantOfferV2Dao dao;
    private final PaginatedEndpoint<Unit, ApiMerchantOfferV2> endpoint;
    private final PaginatedEndpoint<Unit, ApiMerchantOfferV2> halfSheetEndpoint;
    private final Query<UUID, MerchantOfferV2> offerByGlobalOfferIdQuery;
    private final PlutoApi pluto;
    private final Query<Unit, List<MerchantOfferV2>> query;
    private final Endpoint<UUID, ApiMerchantOfferV2> singleOfferEndpoint;
    private final Query<UUID, MerchantOfferV2> singleOfferQuery;
    private final PaginatedEndpoint<String, ApiMerchantOfferV2> trialEligibleOffersEndpoint;

    /* compiled from: MerchantOfferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore", m3645f = "MerchantOfferStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "streamBanner")
    /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$streamBanner$1 */
    static final class C339481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C339481(Continuation<? super C339481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MerchantOfferStore.this.streamBanner(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOfferStore(StoreBundle storeBundle, MerchantOfferV2Dao dao, PlutoApi pluto) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        this.dao = dao;
        this.pluto = pluto;
        PaginatedEndpoint.Companion companion = PaginatedEndpoint.INSTANCE;
        this.endpoint = PaginatedEndpoint.Companion.create$default(companion, new MerchantOfferStore$endpoint$1(this, null), getLogoutKillswitch(), new MerchantOfferStore$endpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.halfSheetEndpoint = PaginatedEndpoint.Companion.create$default(companion, new MerchantOfferStore$halfSheetEndpoint$1(this, null), getLogoutKillswitch(), new MerchantOfferStore$halfSheetEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        Endpoint.Companion companion2 = Endpoint.INSTANCE;
        this.singleOfferEndpoint = Endpoint.Companion.create$default(companion2, new MerchantOfferStore$singleOfferEndpoint$1(this, null), getLogoutKillswitch(), new MerchantOfferStore$singleOfferEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.trialEligibleOffersEndpoint = PaginatedEndpoint.Companion.create$default(companion, new MerchantOfferStore$trialEligibleOffersEndpoint$1(this, null), getLogoutKillswitch(), new MerchantOfferStore$trialEligibleOffersEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.activateTrial = PostEndpoint.INSTANCE.create(new C339451(pluto), new C339462(null));
        Query.Companion companion3 = Query.INSTANCE;
        this.query = Store.create$default(this, companion3, "streamAllMerchantOffersV2", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferStore.query$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.singleOfferQuery = Store.create$default(this, companion3, "streamMerchantOfferV2", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferStore.singleOfferQuery$lambda$4(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferStore.singleOfferQuery$lambda$5(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.offerByGlobalOfferIdQuery = Store.create$default(this, companion3, "streamMerchantOfferV2", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferStore.offerByGlobalOfferIdQuery$lambda$6(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantOfferStore.offerByGlobalOfferIdQuery$lambda$7(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.bannerEndpoint = Endpoint.Companion.create$default(companion2, new MerchantOfferStore$bannerEndpoint$1(this, null), getLogoutKillswitch(), new MerchantOfferStore$bannerEndpoint$2(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: MerchantOfferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$activateTrial$1 */
    /* synthetic */ class C339451 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiActivateTrialResponse>, Object>, ContinuationImpl6 {
        C339451(Object obj) {
            super(2, obj, PlutoApi.class, "activateTrial", "activateTrial(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super ApiActivateTrialResponse> continuation) {
            return ((PlutoApi) this.receiver).activateTrial(uuid, continuation);
        }
    }

    /* compiled from: MerchantOfferStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/pluto/ApiActivateTrialResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$activateTrial$2", m3645f = "MerchantOfferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$activateTrial$2 */
    static final class C339462 extends ContinuationImpl7 implements Function2<ApiActivateTrialResponse, Continuation<? super Unit>, Object> {
        int label;

        C339462(Continuation<? super C339462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C339462(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiActivateTrialResponse apiActivateTrialResponse, Continuation<? super Unit> continuation) {
            return ((C339462) create(apiActivateTrialResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(MerchantOfferStore merchantOfferStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaginatedEndpointKt.refreshAllPages(merchantOfferStore.endpoint, true);
        return PaginatedEndpointKt.refreshAllPages(merchantOfferStore.halfSheetEndpoint, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$3(MerchantOfferStore merchantOfferStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Flow<List<MerchantOfferV2>> visibleMerchantOffers = merchantOfferStore.dao.getVisibleMerchantOffers();
        return new Flow<List<? extends MerchantOfferV2>>() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$query$lambda$3$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$query$lambda$3$$inlined$map$1$2 */
            public static final class C339442<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$query$lambda$3$$inlined$map$1$2", m3645f = "MerchantOfferStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$query$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C339442.this.emit(null, this);
                    }
                }

                public C339442(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            Instant expireAt = ((MerchantOfferV2) t).getExpireAt();
                            if (expireAt != null ? expireAt.isAfter(Instant.now()) : true) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends MerchantOfferV2>> flowCollector, Continuation continuation) {
                Object objCollect = visibleMerchantOffers.collect(new C339442(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singleOfferQuery$lambda$4(MerchantOfferStore merchantOfferStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.poll$default(merchantOfferStore.singleOfferEndpoint, id, RoundupOverview.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singleOfferQuery$lambda$5(MerchantOfferStore merchantOfferStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return merchantOfferStore.dao.getMerchantOffer(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job offerByGlobalOfferIdQuery$lambda$6(MerchantOfferStore merchantOfferStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.refreshAllPages(merchantOfferStore.endpoint, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow offerByGlobalOfferIdQuery$lambda$7(MerchantOfferStore merchantOfferStore, UUID globalOfferId) {
        Intrinsics.checkNotNullParameter(globalOfferId, "globalOfferId");
        return merchantOfferStore.dao.getMerchantOfferByGlobalOfferId(globalOfferId);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamBanner(UUID uuid, Continuation<? super MerchantOfferBanner> continuation) {
        C339481 c339481;
        if (continuation instanceof C339481) {
            c339481 = (C339481) continuation;
            int i = c339481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c339481.label = i - Integer.MIN_VALUE;
            } else {
                c339481 = new C339481(continuation);
            }
        }
        C339481 c3394812 = c339481;
        Object objForceFetch$default = c3394812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3394812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, Response<ApiMerchantOfferBanner>> endpoint = this.bannerEndpoint;
            c3394812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c3394812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiMerchantOfferBanner apiMerchantOfferBanner = (ApiMerchantOfferBanner) ((Response) objForceFetch$default).body();
        if (apiMerchantOfferBanner != null) {
            return MerchantOfferBanner2.toDbModel(apiMerchantOfferBanner);
        }
        return null;
    }

    public static /* synthetic */ void refresh$default(MerchantOfferStore merchantOfferStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        merchantOfferStore.refresh(z);
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.endpoint, force);
    }

    public static /* synthetic */ void refresh$default(MerchantOfferStore merchantOfferStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        merchantOfferStore.refresh(uuid, z);
    }

    public final void refresh(UUID id, boolean force) {
        Intrinsics.checkNotNullParameter(id, "id");
        Endpoint.DefaultImpls.refresh$default(this.singleOfferEndpoint, id, force, null, 4, null);
    }

    public final Observable<MerchantOfferV2> stream(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.singleOfferQuery.asObservable(id);
    }

    public final Observable<MerchantOfferV2> streamByGlobalOfferId(UUID globalOfferId) {
        Intrinsics.checkNotNullParameter(globalOfferId, "globalOfferId");
        return this.offerByGlobalOfferIdQuery.asObservable(globalOfferId);
    }

    public final Observable<List<MerchantOfferV2>> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    /* compiled from: MerchantOfferStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$getDebitSpendOffers$1", m3645f = "MerchantOfferStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$getDebitSpendOffers$1 */
    static final class C339471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends MerchantOfferV2>>, Object> {
        int label;

        C339471(Continuation<? super C339471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantOfferStore.this.new C339471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MerchantOfferV2>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<MerchantOfferV2>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<MerchantOfferV2>> continuation) {
            return ((C339471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlutoApi plutoApi = MerchantOfferStore.this.pluto;
                String value = MerchantOfferContextQueryParams.HALF_SHEET.getValue();
                this.label = 1;
                obj = plutoApi.getMerchantOffersV2(value, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List results = ((PaginatedResult) obj).getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(MerchantOfferV23.toDbModel((ApiMerchantOfferV2) it.next(), 0));
            }
            return arrayList;
        }
    }

    public final Single<List<MerchantOfferV2>> getDebitSpendOffers() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C339471(null), 1, null);
    }

    public final Flow<List<MerchantOfferV2>> getTrialEligibleOffers(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Flow<PaginatedResult<ApiMerchantOfferV2>> flowForceFetchAllPages = this.trialEligibleOffersEndpoint.forceFetchAllPages(context);
        return new Flow<List<? extends MerchantOfferV2>>() { // from class: com.robinhood.librobinhood.data.store.MerchantOfferStore$getTrialEligibleOffers$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends MerchantOfferV2>> flowCollector, Continuation continuation) {
                Object objCollect = flowForceFetchAllPages.collect(new C339432(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$getTrialEligibleOffers$$inlined$map$1$2 */
            public static final class C339432<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$getTrialEligibleOffers$$inlined$map$1$2", m3645f = "MerchantOfferStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferStore$getTrialEligibleOffers$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C339432.this.emit(null, this);
                    }
                }

                public C339432(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List<T> results = ((PaginatedResult) obj).getResults();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                        Iterator<T> it = results.iterator();
                        while (it.hasNext()) {
                            arrayList.add(MerchantOfferV23.toDbModel((ApiMerchantOfferV2) it.next(), 0));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Object activateTrial(UUID uuid, Continuation<? super ApiActivateTrialResponse> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.activateTrial, uuid, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MerchantOfferStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/MerchantOfferStore$MerchantOfferContextQueryParams;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HALF_SHEET", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class MerchantOfferContextQueryParams {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MerchantOfferContextQueryParams[] $VALUES;
        public static final MerchantOfferContextQueryParams HALF_SHEET = new MerchantOfferContextQueryParams("HALF_SHEET", 0, "half_sheet");
        private final String value;

        private static final /* synthetic */ MerchantOfferContextQueryParams[] $values() {
            return new MerchantOfferContextQueryParams[]{HALF_SHEET};
        }

        public static EnumEntries<MerchantOfferContextQueryParams> getEntries() {
            return $ENTRIES;
        }

        private MerchantOfferContextQueryParams(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            MerchantOfferContextQueryParams[] merchantOfferContextQueryParamsArr$values = $values();
            $VALUES = merchantOfferContextQueryParamsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(merchantOfferContextQueryParamsArr$values);
        }

        public static MerchantOfferContextQueryParams valueOf(String str) {
            return (MerchantOfferContextQueryParams) Enum.valueOf(MerchantOfferContextQueryParams.class, str);
        }

        public static MerchantOfferContextQueryParams[] values() {
            return (MerchantOfferContextQueryParams[]) $VALUES.clone();
        }
    }
}
