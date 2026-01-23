package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.api.bonfire.ApiFeatureDiscoveryResponse;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import retrofit2.Response;

/* compiled from: FeatureDiscoveryStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u001e\u001a\u00020\u000bJ\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010!\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureDiscoveryStore;", "Lcom/robinhood/store/Store;", "bonfire", "Lcom/robinhood/api/retrofit/BonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Lcom/robinhood/store/StoreBundle;)V", "featureDiscoveryCache", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/librobinhood/data/store/GetFeatureDiscoveryArgs;", "Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "getFeatureDiscoveryCache$lib_store_discovery_externalDebug$annotations", "()V", "getFeatureDiscoveryCache$lib_store_discovery_externalDebug", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "get", "Lcom/robinhood/android/moria/network/Endpoint;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiFeatureDiscoveryResponse;", "streamFeatureDiscovery", "Lcom/robinhood/android/moria/db/Query;", "streamFeatureDiscoveryByLocation", "Lio/reactivex/Observable;", "location", "Lcom/robinhood/models/api/FeatureDiscoveryLocation;", "accountNumber", "", "Lkotlinx/coroutines/flow/Flow;", "args", "refresh", "", "clearCache", "lib-store-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FeatureDiscoveryStore extends Store {
    private final BonfireApi bonfire;
    private final StateFlow2<Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse>> featureDiscoveryCache;
    private final Endpoint<GetFeatureDiscoveryArgs, Response<ApiFeatureDiscoveryResponse>> get;
    private final Query<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse> streamFeatureDiscovery;

    /* renamed from: getFeatureDiscoveryCache$lib_store_discovery_externalDebug$annotations */
    public static /* synthetic */ void m2608xf7effbcf() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureDiscoveryStore(BonfireApi bonfire2, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfire = bonfire2;
        this.featureDiscoveryCache = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        Endpoint<GetFeatureDiscoveryArgs, Response<ApiFeatureDiscoveryResponse>> endpointCreateWithParams = Endpoint.INSTANCE.createWithParams(new FeatureDiscoveryStore2(this, null), getLogoutKillswitch(), new FeatureDiscoveryStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
        this.get = endpointCreateWithParams;
        this.streamFeatureDiscovery = Store.create$default(this, Query.INSTANCE, "streamFeatureDiscovery", CollectionsKt.listOf(new RefreshEach(new C338641(endpointCreateWithParams))), new Function1() { // from class: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureDiscoveryStore.streamFeatureDiscovery$lambda$1(this.f$0, (GetFeatureDiscoveryArgs) obj);
            }
        }, false, 8, null);
    }

    public final StateFlow2<Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse>> getFeatureDiscoveryCache$lib_store_discovery_externalDebug() {
        return this.featureDiscoveryCache;
    }

    /* compiled from: FeatureDiscoveryStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$streamFeatureDiscovery$1 */
    /* synthetic */ class C338641 extends AdaptedFunctionReference implements Function1<GetFeatureDiscoveryArgs, Job> {
        C338641(Object obj) {
            super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Job invoke(GetFeatureDiscoveryArgs p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamFeatureDiscovery$lambda$1(FeatureDiscoveryStore featureDiscoveryStore, final GetFeatureDiscoveryArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        final StateFlow2<Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse>> stateFlow2 = featureDiscoveryStore.featureDiscoveryCache;
        return new Flow<FeatureDiscoveryResponse>() { // from class: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$streamFeatureDiscovery$lambda$1$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$streamFeatureDiscovery$lambda$1$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ GetFeatureDiscoveryArgs $args$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$streamFeatureDiscovery$lambda$1$$inlined$map$1$2", m3645f = "FeatureDiscoveryStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$streamFeatureDiscovery$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, GetFeatureDiscoveryArgs getFeatureDiscoveryArgs) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$args$inlined = getFeatureDiscoveryArgs;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$args$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FeatureDiscoveryResponse> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, args), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ Observable streamFeatureDiscoveryByLocation$default(FeatureDiscoveryStore featureDiscoveryStore, FeatureDiscoveryLocation featureDiscoveryLocation, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return featureDiscoveryStore.streamFeatureDiscoveryByLocation(featureDiscoveryLocation, str);
    }

    public final Observable<FeatureDiscoveryResponse> streamFeatureDiscoveryByLocation(FeatureDiscoveryLocation location, String accountNumber) {
        Intrinsics.checkNotNullParameter(location, "location");
        Observable<FeatureDiscoveryResponse> observableTakeUntil = this.streamFeatureDiscovery.asObservable(new GetFeatureDiscoveryArgs(location, accountNumber)).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Flow<FeatureDiscoveryResponse> streamFeatureDiscovery(GetFeatureDiscoveryArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return takeWhileLoggedIn(this.streamFeatureDiscovery.asFlow(args));
    }

    public static /* synthetic */ void refresh$default(FeatureDiscoveryStore featureDiscoveryStore, FeatureDiscoveryLocation featureDiscoveryLocation, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        featureDiscoveryStore.refresh(featureDiscoveryLocation, str);
    }

    public final void refresh(FeatureDiscoveryLocation location, String accountNumber) {
        Intrinsics.checkNotNullParameter(location, "location");
        Endpoint.DefaultImpls.refresh$default(this.get, new GetFeatureDiscoveryArgs(location, accountNumber), true, null, 4, null);
    }

    /* compiled from: FeatureDiscoveryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$clearCache$1", m3645f = "FeatureDiscoveryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.FeatureDiscoveryStore$clearCache$1 */
    static final class C338631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C338631(Continuation<? super C338631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FeatureDiscoveryStore.this.new C338631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C338631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StateFlow2<Map<GetFeatureDiscoveryArgs, FeatureDiscoveryResponse>> featureDiscoveryCache$lib_store_discovery_externalDebug = FeatureDiscoveryStore.this.getFeatureDiscoveryCache$lib_store_discovery_externalDebug();
            while (!featureDiscoveryCache$lib_store_discovery_externalDebug.compareAndSet(featureDiscoveryCache$lib_store_discovery_externalDebug.getValue(), MapsKt.emptyMap())) {
            }
            FeatureDiscoveryStore.this.get.markAllParamsAsStale();
            return Unit.INSTANCE;
        }
    }

    public final void clearCache() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C338631(null), 3, null);
    }
}
