package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiRhyApplicationStatus;
import com.robinhood.models.api.identi.rhy.ApiRhyEligibility;
import com.robinhood.models.api.identi.rhy.ApiSubmitRhyApplicationRequest;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: RhyApplicationStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!¨\u0006'"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/api/retrofit/Identi;", "identi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "bonfire", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/Identi;Lcom/robinhood/api/rhy/RhyBonfireApi;)V", "", "migratedFromCashManagement", "Lio/reactivex/Completable;", "submitRhyApplication", "(Z)Lio/reactivex/Completable;", "Lio/reactivex/Single;", "getEligibility", "()Lio/reactivex/Single;", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/api/bonfire/ApiRhyApplicationStatus;", "pollApplicationStatusUntilFinal", "(Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/Observable;", "pollApplicationStatusUntilFinalObservable", "(Lj$/time/Duration;)Lio/reactivex/Observable;", "Lcom/robinhood/api/retrofit/Identi;", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/identi/rhy/ApiRhyEligibility;", "getEligibilityEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/identi/rhy/ApiSubmitRhyApplicationRequest;", "postEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "getApplicationStatusEndpoint", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyApplicationStore extends Store {
    private final RhyBonfireApi bonfire;
    private final Endpoint<Unit, ApiRhyApplicationStatus> getApplicationStatusEndpoint;
    private final Endpoint<Unit, ApiRhyEligibility> getEligibilityEndpoint;
    private final Identi identi;
    private final PostEndpoint<ApiSubmitRhyApplicationRequest, Unit> postEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyApplicationStore(StoreBundle storeBundle, Identi identi2, RhyBonfireApi bonfire2) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        this.identi = identi2;
        this.bonfire = bonfire2;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getEligibilityEndpoint = Endpoint.Companion.create$default(companion, new RhyApplicationStore4(this, null), getLogoutKillswitch(), new RhyApplicationStore5(null), storeBundle.getClock(), null, 16, null);
        this.postEndpoint = PostEndpoint.INSTANCE.create(new RhyApplicationStore6(identi2), new RhyApplicationStore7(null));
        this.getApplicationStatusEndpoint = Endpoint.Companion.create$default(companion, new RhyApplicationStore2(this, null), getLogoutKillswitch(), new RhyApplicationStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: RhyApplicationStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyApplicationStore$submitRhyApplication$1", m3645f = "RhyApplicationStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyApplicationStore$submitRhyApplication$1 */
    static final class C342951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $migratedFromCashManagement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342951(boolean z, Continuation<? super C342951> continuation) {
            super(2, continuation);
            this.$migratedFromCashManagement = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyApplicationStore.this.new C342951(this.$migratedFromCashManagement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C342951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = RhyApplicationStore.this.postEndpoint;
                ApiSubmitRhyApplicationRequest apiSubmitRhyApplicationRequest = new ApiSubmitRhyApplicationRequest(this.$migratedFromCashManagement);
                this.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, apiSubmitRhyApplicationRequest, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Completable submitRhyApplication$default(RhyApplicationStore rhyApplicationStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return rhyApplicationStore.submitRhyApplication(z);
    }

    public final Completable submitRhyApplication(boolean migratedFromCashManagement) {
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C342951(migratedFromCashManagement, null), 1, null);
    }

    /* compiled from: RhyApplicationStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyApplicationStore$getEligibility$1", m3645f = "RhyApplicationStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyApplicationStore$getEligibility$1 */
    static final class C342931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C342931(Continuation<? super C342931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyApplicationStore.this.new C342931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C342931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = RhyApplicationStore.this.getEligibilityEndpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(((ApiRhyEligibility) obj).getIs_eligible());
        }
    }

    public final Single<Boolean> getEligibility() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C342931(null), 1, null);
    }

    public static /* synthetic */ Flow pollApplicationStatusUntilFinal$default(RhyApplicationStore rhyApplicationStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return rhyApplicationStore.pollApplicationStatusUntilFinal(duration);
    }

    /* compiled from: RhyApplicationStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/api/bonfire/ApiRhyApplicationStatus;", "status"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyApplicationStore$pollApplicationStatusUntilFinal$1", m3645f = "RhyApplicationStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyApplicationStore$pollApplicationStatusUntilFinal$1 */
    static final class C342941 extends ContinuationImpl7 implements Function3<FlowCollector<? super ApiRhyApplicationStatus>, ApiRhyApplicationStatus, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C342941(Continuation<? super C342941> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super ApiRhyApplicationStatus> flowCollector, ApiRhyApplicationStatus apiRhyApplicationStatus, Continuation<? super Boolean> continuation) {
            C342941 c342941 = new C342941(continuation);
            c342941.L$0 = flowCollector;
            c342941.L$1 = apiRhyApplicationStatus;
            return c342941.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiRhyApplicationStatus apiRhyApplicationStatus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ApiRhyApplicationStatus apiRhyApplicationStatus2 = (ApiRhyApplicationStatus) this.L$1;
                this.L$0 = apiRhyApplicationStatus2;
                this.label = 1;
                if (flowCollector.emit(apiRhyApplicationStatus2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                apiRhyApplicationStatus = apiRhyApplicationStatus2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiRhyApplicationStatus = (ApiRhyApplicationStatus) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!apiRhyApplicationStatus.getStatus().isStatusFinal());
        }
    }

    public final Flow<ApiRhyApplicationStatus> pollApplicationStatusUntilFinal(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.transformWhile(Endpoint.DefaultImpls.poll$default(this.getApplicationStatusEndpoint, Unit.INSTANCE, duration, null, 4, null), new C342941(null));
    }

    public static /* synthetic */ Observable pollApplicationStatusUntilFinalObservable$default(RhyApplicationStore rhyApplicationStore, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return rhyApplicationStore.pollApplicationStatusUntilFinalObservable(duration);
    }

    public final Observable<ApiRhyApplicationStatus> pollApplicationStatusUntilFinalObservable(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return asObservable(pollApplicationStatusUntilFinal(duration));
    }
}
