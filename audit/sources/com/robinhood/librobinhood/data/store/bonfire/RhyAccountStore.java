package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiRhyAccount;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.dao.bonfire.RhyAccountDao;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyAccount2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: RhyAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\u0014¢\u0006\u0004\b!\u0010\u0017J\u0019\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0011¢\u0006\u0004\b\"\u0010\u0013J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0014¢\u0006\u0004\b$\u0010\u0017J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001c0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0015008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "bonfireApi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/bonfire/RhyAccountDao;", "dao", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/RhyAccountDao;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;)V", "", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "Lcom/robinhood/utils/Optional;", "getRhySpendingAccountOptional", "(Ljava/lang/Iterable;)Lcom/robinhood/utils/Optional;", "Lio/reactivex/Single;", "forceFetchAccountIfNotCached", "()Lio/reactivex/Single;", "Lio/reactivex/Observable;", "", "streamAccounts", "()Lio/reactivex/Observable;", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiRhyAccount;", "pollAccountsUntilPresent", "(Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "pollAccountsUntilPresentObservable", "(Lj$/time/Duration;)Lio/reactivex/Observable;", "streamSpendingAccount", "forceFetchAccounts", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "streamMinervaCardAccount", "", "force", "Lkotlinx/coroutines/Job;", "refresh", "(Z)Lkotlinx/coroutines/Job;", "Lcom/robinhood/models/dao/bonfire/RhyAccountDao;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "Lcom/robinhood/api/PaginatedEndpoint;", "", "endpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "streamRhyAccounts", "Lcom/robinhood/android/moria/db/Query;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhyAccountStore extends Store {
    private final RhyAccountDao dao;
    private final PaginatedEndpoint<Unit, ApiRhyAccount> endpoint;
    private final MinervaAccountStore minervaAccountStore;
    private final Query<Unit, List<RhyAccount>> streamRhyAccounts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyAccountStore(RhyBonfireApi bonfireApi, StoreBundle storeBundle, RhyAccountDao dao, MinervaAccountStore minervaAccountStore) {
        super(storeBundle, RhyAccount.INSTANCE);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        this.dao = dao;
        this.minervaAccountStore = minervaAccountStore;
        PaginatedEndpoint<Unit, ApiRhyAccount> paginatedEndpointCreate$default = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new RhyAccountStore2(bonfireApi, null), getLogoutKillswitch(), new RhyAccountStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.endpoint = paginatedEndpointCreate$default;
        this.streamRhyAccounts = Store.create$default(this, Query.INSTANCE, "queryRhyAccounts", CollectionsKt.listOf(new RefreshEach(new RhyAccountStore4(paginatedEndpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountStore.streamRhyAccounts$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamRhyAccounts$lambda$0(RhyAccountStore rhyAccountStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return rhyAccountStore.dao.getRhyAccounts();
    }

    /* compiled from: RhyAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$1", m3645f = "RhyAccountStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$1 */
    /* loaded from: classes13.dex */
    static final class C345401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends RhyAccount>>, Object> {
        int label;

        C345401(Continuation<? super C345401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyAccountStore.this.new C345401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends RhyAccount>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<RhyAccount>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<RhyAccount>> continuation) {
            return ((C345401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            final Flow<List<RhyAccount>> rhyAccounts = RhyAccountStore.this.dao.getRhyAccounts();
            final RhyAccountStore rhyAccountStore = RhyAccountStore.this;
            Flow<Optional<? extends RhyAccount>> flow = new Flow<Optional<? extends RhyAccount>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ RhyAccountStore this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$1$invokeSuspend$$inlined$map$1$2", m3645f = "RhyAccountStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, RhyAccountStore rhyAccountStore) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = rhyAccountStore;
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
                            RhyAccountStore rhyAccountStore = this.this$0;
                            Intrinsics.checkNotNull(list);
                            Optional rhySpendingAccountOptional = rhyAccountStore.getRhySpendingAccountOptional(list);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(rhySpendingAccountOptional, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Optional<? extends RhyAccount>> flowCollector, Continuation continuation) {
                    Object objCollect = rhyAccounts.collect(new AnonymousClass2(flowCollector, rhyAccountStore), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            Object objFirst = FlowKt.first(flow, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }

    public final Single<Optional<RhyAccount>> forceFetchAccountIfNotCached() {
        Single<Optional<RhyAccount>> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C345401(null), 1, null).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore.forceFetchAccountIfNotCached.2

            /* compiled from: RhyAccountStore.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$2$1", m3645f = "RhyAccountStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends RhyAccount>>, Object> {
                int label;
                final /* synthetic */ RhyAccountStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RhyAccountStore rhyAccountStore, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = rhyAccountStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends RhyAccount>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<RhyAccount>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<RhyAccount>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    final Flow flowForceFetchAllPages = PaginatedEndpointKt.forceFetchAllPages(this.this$0.endpoint);
                    Flow<Optional<? extends RhyAccount>> flow = new Flow<Optional<? extends RhyAccount>>() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$2$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$2$1$invokeSuspend$$inlined$map$1$2", m3645f = "RhyAccountStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$forceFetchAccountIfNotCached$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                T next;
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
                                    Iterator<T> it = ((PaginatedResult) obj).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = (T) null;
                                            break;
                                        }
                                        next = it.next();
                                        if (((ApiRhyAccount) next).getPurpose() == ApiRhyAccount.Purpose.SPENDING) {
                                            break;
                                        }
                                    }
                                    ApiRhyAccount apiRhyAccount = next;
                                    Optional optionalAsOptional = Optional3.asOptional(apiRhyAccount != null ? RhyAccount2.toDbModel(apiRhyAccount) : null);
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
                        public Object collect(FlowCollector<? super Optional<? extends RhyAccount>> flowCollector, Continuation continuation) {
                            Object objCollect = flowForceFetchAllPages.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object objFirst = FlowKt.first(flow, this);
                    return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<RhyAccount>> apply(Optional<RhyAccount> rhyAccountOptional) {
                Intrinsics.checkNotNullParameter(rhyAccountOptional, "rhyAccountOptional");
                if (rhyAccountOptional.getOrNull() == null) {
                    RhyAccountStore rhyAccountStore = RhyAccountStore.this;
                    return RxFactory.DefaultImpls.rxSingle$default(rhyAccountStore, null, new AnonymousClass1(rhyAccountStore, null), 1, null);
                }
                Single singleJust = Single.just(rhyAccountOptional);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Observable<List<RhyAccount>> streamAccounts() {
        return this.streamRhyAccounts.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ Flow pollAccountsUntilPresent$default(RhyAccountStore rhyAccountStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return rhyAccountStore.pollAccountsUntilPresent(duration);
    }

    /* compiled from: RhyAccountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiRhyAccount;", "accounts"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$pollAccountsUntilPresent$1", m3645f = "RhyAccountStore.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore$pollAccountsUntilPresent$1 */
    /* loaded from: classes13.dex */
    static final class C345431 extends ContinuationImpl7 implements Function3<FlowCollector<? super PaginatedResult<? extends ApiRhyAccount>>, PaginatedResult<? extends ApiRhyAccount>, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C345431(Continuation<? super C345431> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super PaginatedResult<? extends ApiRhyAccount>> flowCollector, PaginatedResult<? extends ApiRhyAccount> paginatedResult, Continuation<? super Boolean> continuation) {
            return invoke2((FlowCollector<? super PaginatedResult<ApiRhyAccount>>) flowCollector, (PaginatedResult<ApiRhyAccount>) paginatedResult, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super PaginatedResult<ApiRhyAccount>> flowCollector, PaginatedResult<ApiRhyAccount> paginatedResult, Continuation<? super Boolean> continuation) {
            C345431 c345431 = new C345431(continuation);
            c345431.L$0 = flowCollector;
            c345431.L$1 = paginatedResult;
            return c345431.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PaginatedResult paginatedResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                PaginatedResult paginatedResult2 = (PaginatedResult) this.L$1;
                this.L$0 = paginatedResult2;
                this.label = 1;
                if (flowCollector.emit(paginatedResult2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paginatedResult = paginatedResult2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paginatedResult = (PaginatedResult) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!paginatedResult.getResults().isEmpty());
        }
    }

    public final Flow<PaginatedResult<ApiRhyAccount>> pollAccountsUntilPresent(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.transformWhile(this.endpoint.pollAllPages(Unit.INSTANCE, duration), new C345431(null));
    }

    public static /* synthetic */ Observable pollAccountsUntilPresentObservable$default(RhyAccountStore rhyAccountStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return rhyAccountStore.pollAccountsUntilPresentObservable(duration);
    }

    public final Observable<PaginatedResult<ApiRhyAccount>> pollAccountsUntilPresentObservable(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return asObservable(pollAccountsUntilPresent(duration));
    }

    public final Observable<Optional<RhyAccount>> streamSpendingAccount() {
        Observable map = streamAccounts().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore.streamSpendingAccount.1
            @Override // io.reactivex.functions.Function
            public final Optional<RhyAccount> apply(List<RhyAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RhyAccountStore.this.getRhySpendingAccountOptional(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<List<RhyAccount>> forceFetchAccounts() {
        Single<List<RhyAccount>> map = asObservable(PaginatedEndpointKt.forceFetchAllPages(this.endpoint)).firstOrError().map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore.forceFetchAccounts.1
            @Override // io.reactivex.functions.Function
            public final List<RhyAccount> apply(PaginatedResult<ApiRhyAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<ApiRhyAccount> results = it.getResults();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
                Iterator<T> it2 = results.iterator();
                while (it2.hasNext()) {
                    arrayList.add(RhyAccount2.toDbModel((ApiRhyAccount) it2.next()));
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<MinervaAccount> streamMinervaCardAccount() {
        Observable observableFlatMapObservable = forceFetchAccountIfNotCached().flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore.streamMinervaCardAccount.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MinervaAccount> apply(Optional<RhyAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                RhyAccount rhyAccountComponent1 = optional.component1();
                return rhyAccountComponent1 != null ? RhyAccountStore.this.minervaAccountStore.streamRhyMinervaAccount(rhyAccountComponent1.getId()) : RhyAccountStore.this.minervaAccountStore.streamAccount(ApiMinervaAccount.Type.BROKERAGE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }

    public final Job refresh(boolean force) {
        return this.endpoint.refreshAllPages(Unit.INSTANCE, force);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Optional<RhyAccount> getRhySpendingAccountOptional(Iterable<RhyAccount> iterable) {
        RhyAccount next;
        Iterator<RhyAccount> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.isSpendingAccount()) {
                break;
            }
        }
        return Optional3.asOptional(next);
    }
}
