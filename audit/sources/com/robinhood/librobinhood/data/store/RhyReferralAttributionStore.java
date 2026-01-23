package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.rhy.referral.RhyReferralBonfireApi;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttribution;
import com.robinhood.models.rhy.referral.dao.RhyReferralAttributionDao;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: RhyReferralAttributionStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;", "dao", "Lcom/robinhood/models/rhy/referral/dao/RhyReferralAttributionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;Lcom/robinhood/models/rhy/referral/dao/RhyReferralAttributionDao;Lcom/robinhood/store/StoreBundle;)V", "listEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralAttribution;", "endpoint", "listQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "query", "Lcom/robinhood/utils/Optional;", "streamList", "Lio/reactivex/Observable;", "stream", "refreshList", "Lkotlinx/coroutines/Job;", "force", "", "refresh", "lib-store-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RhyReferralAttributionStore extends Store {
    private final RhyReferralBonfireApi bonfireApi;
    private final RhyReferralAttributionDao dao;
    private final Endpoint<Unit, ApiRhyReferralAttribution> endpoint;
    private final Endpoint<Unit, List<ApiRhyReferralAttribution>> listEndpoint;
    private final Query<Unit, List<RhyReferralAttribution>> listQuery;
    private final Query<Unit, Optional<RhyReferralAttribution>> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralAttributionStore(RhyReferralBonfireApi bonfireApi, RhyReferralAttributionDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfireApi = bonfireApi;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<Unit, List<ApiRhyReferralAttribution>> endpointCreate$default = Endpoint.Companion.create$default(companion, new RhyReferralAttributionStore4(this, null), getLogoutKillswitch(), new RhyReferralAttributionStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.listEndpoint = endpointCreate$default;
        Endpoint<Unit, ApiRhyReferralAttribution> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new RhyReferralAttributionStore2(this, null), getLogoutKillswitch(), new RhyReferralAttributionStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default2;
        Query.Companion companion2 = Query.INSTANCE;
        this.listQuery = Store.create$default(this, companion2, "streamRhyReferralAttributionList", CollectionsKt.listOf(new RefreshEach(new RhyReferralAttributionStore6(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralAttributionStore.listQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.query = Store.create$default(this, companion2, "streamRhyReferralAttribution", CollectionsKt.listOf(new RefreshEach(new RhyReferralAttributionStore7(endpointCreate$default2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralAttributionStore.query$lambda$4(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow listQuery$lambda$0(RhyReferralAttributionStore rhyReferralAttributionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return rhyReferralAttributionStore.dao.getAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$4(RhyReferralAttributionStore rhyReferralAttributionStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Flow<List<RhyReferralAttribution>> all = rhyReferralAttributionStore.dao.getAll();
        return new Flow<Optional<? extends RhyReferralAttribution>>() { // from class: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$query$lambda$4$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$query$lambda$4$$inlined$map$1$2 */
            public static final class C342962<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$query$lambda$4$$inlined$map$1$2", m3645f = "RhyReferralAttributionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.RhyReferralAttributionStore$query$lambda$4$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C342962.this.emit(null, this);
                    }
                }

                public C342962(FlowCollector flowCollector) {
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
                        List list = (List) obj;
                        RhyReferralAttribution rhyReferralAttribution = null;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                if (((RhyReferralAttribution) next).isReferralOfCurrentUser()) {
                                    rhyReferralAttribution = next;
                                    break;
                                }
                            }
                            rhyReferralAttribution = rhyReferralAttribution;
                        }
                        Optional optionalAsOptional = Optional3.asOptional(rhyReferralAttribution);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Optional<? extends RhyReferralAttribution>> flowCollector, Continuation continuation) {
                Object objCollect = all.collect(new C342962(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<List<RhyReferralAttribution>> streamList() {
        return this.listQuery.asObservable(Unit.INSTANCE);
    }

    public final Observable<Optional<RhyReferralAttribution>> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ Job refreshList$default(RhyReferralAttributionStore rhyReferralAttributionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return rhyReferralAttributionStore.refreshList(z);
    }

    public final Job refreshList(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.listEndpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public static /* synthetic */ Job refresh$default(RhyReferralAttributionStore rhyReferralAttributionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return rhyReferralAttributionStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
