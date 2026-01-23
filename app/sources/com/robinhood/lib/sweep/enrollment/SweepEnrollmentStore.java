package com.robinhood.lib.sweep.enrollment;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.api.gold.GoldApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollmentRequestBody;
import com.robinhood.lib.sweep.enrollment.api.SweepEnrollmentApi;
import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollment;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SweepEnrollmentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0016\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!2\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010$\u001a\u00020%J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100(2\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u001fJ\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130!2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u00100\u001a\u0002012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u00102\u001a\u000203R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00180\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0-\u0012\u0004\u0012\u00020\u00130\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "Lcom/robinhood/store/Store;", "sweepOnboardingApi", "Lcom/robinhood/lib/sweep/enrollment/api/SweepEnrollmentApi;", "goldApi", "Lcom/robinhood/android/api/gold/GoldApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/lib/sweep/enrollment/api/SweepEnrollmentApi;Lcom/robinhood/android/api/gold/GoldApi;Lcom/robinhood/store/StoreBundle;)V", "enrollmentRelays", "", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;", "enrollGoldSweepRelay", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepEnrollment;", "kotlin.jvm.PlatformType", "sweepSplashRelay", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash;", "getEnrollmentRelay", "accountNumber", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "getEnrollmentQuery", "Lcom/robinhood/android/moria/db/Query;", "postEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollmentRequestBody;", "getSweepEnrollment", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSweepEnrollmentObservable", "Lio/reactivex/Observable;", "updateSweepEnrollment", "Lio/reactivex/Completable;", "action", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentAction;", "postGoldSweepEndpoint", "enrollGoldSweep", "Lio/reactivex/Single;", "getSweepOnboardingFlow", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "getSweepFlow", "getSweepSplashEndpoint", "Lcom/robinhood/utils/Optional;", "getSweepSplashRelay", "streamSweepSplashObservable", "refreshSweepSplash", "", "force", "", "lib-sweep-enrollment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class SweepEnrollmentStore extends Store {
    private final BehaviorRelay<ApiGoldSweepEnrollment> enrollGoldSweepRelay;
    private final Map<String, BehaviorRelay<ApiSweepEnrollment>> enrollmentRelays;
    private final Endpoint<String, Tuples2<String, ApiSweepEnrollment>> getEndpoint;
    private final Query<String, ApiSweepEnrollment> getEnrollmentQuery;
    private final Endpoint<String, ApiSweepFlow> getSweepOnboardingFlow;
    private final Endpoint<Optional<String>, ApiSweepSplash> getSweepSplashEndpoint;
    private final GoldApi goldApi;
    private final PostEndpoint<Tuples2<String, ApiSweepEnrollmentRequestBody>, Tuples2<String, ApiSweepEnrollment>> postEndpoint;
    private final PostEndpoint<String, ApiGoldSweepEnrollment> postGoldSweepEndpoint;
    private final SweepEnrollmentApi sweepOnboardingApi;
    private final Map<String, BehaviorRelay<ApiSweepSplash>> sweepSplashRelay;

    /* compiled from: SweepEnrollmentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore", m3645f = "SweepEnrollmentStore.kt", m3646l = {76}, m3647m = "getSweepEnrollment")
    /* renamed from: com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$getSweepEnrollment$1 */
    static final class C333921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C333921(Continuation<? super C333921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SweepEnrollmentStore.this.getSweepEnrollment(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SweepEnrollmentStore(SweepEnrollmentApi sweepOnboardingApi, GoldApi goldApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(sweepOnboardingApi, "sweepOnboardingApi");
        Intrinsics.checkNotNullParameter(goldApi, "goldApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.sweepOnboardingApi = sweepOnboardingApi;
        this.goldApi = goldApi;
        this.enrollmentRelays = new LinkedHashMap();
        BehaviorRelay<ApiGoldSweepEnrollment> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.enrollGoldSweepRelay = behaviorRelayCreate;
        this.sweepSplashRelay = new LinkedHashMap();
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<String, Tuples2<String, ApiSweepEnrollment>> endpointCreate$default = Endpoint.Companion.create$default(companion, new SweepEnrollmentStore$getEndpoint$1(this, null), getLogoutKillswitch(), new SweepEnrollmentStore$getEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getEndpoint = endpointCreate$default;
        this.getEnrollmentQuery = Store.create$default(this, Query.INSTANCE, "getSweepEnrollment", CollectionsKt.listOf(new RefreshEach(new SweepEnrollmentStore$getEnrollmentQuery$1(endpointCreate$default))), new Function1() { // from class: com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepEnrollmentStore.getEnrollmentQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
        PostEndpoint.Companion companion2 = PostEndpoint.INSTANCE;
        this.postEndpoint = companion2.create(new SweepEnrollmentStore$postEndpoint$1(this, null), new SweepEnrollmentStore$postEndpoint$2(this, null));
        this.postGoldSweepEndpoint = companion2.create(new SweepEnrollmentStore$postGoldSweepEndpoint$1(this, null), new SweepEnrollmentStore$postGoldSweepEndpoint$2(behaviorRelayCreate));
        this.getSweepOnboardingFlow = Endpoint.Companion.create$default(companion, new SweepEnrollmentStore$getSweepOnboardingFlow$1(this, null), getLogoutKillswitch(), new SweepEnrollmentStore$getSweepOnboardingFlow$2(null), storeBundle.getClock(), null, 16, null);
        this.getSweepSplashEndpoint = companion.create(new SweepEnrollmentStore$getSweepSplashEndpoint$1(this, null), getLogoutKillswitch(), new SweepEnrollmentStore$getSweepSplashEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_HOUR(), storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BehaviorRelay<ApiSweepEnrollment> getEnrollmentRelay(String accountNumber) {
        Map<String, BehaviorRelay<ApiSweepEnrollment>> map = this.enrollmentRelays;
        BehaviorRelay<ApiSweepEnrollment> behaviorRelayCreate = map.get(accountNumber);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            map.put(accountNumber, behaviorRelayCreate);
        }
        return behaviorRelayCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getEnrollmentQuery$lambda$1(SweepEnrollmentStore sweepEnrollmentStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Context7.buffer$default(RxConvert.asFlow(sweepEnrollmentStore.getEnrollmentRelay(accountNumber)), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSweepEnrollment(String str, Continuation<? super ApiSweepEnrollment> continuation) {
        C333921 c333921;
        if (continuation instanceof C333921) {
            c333921 = (C333921) continuation;
            int i = c333921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333921.label = i - Integer.MIN_VALUE;
            } else {
                c333921 = new C333921(continuation);
            }
        }
        C333921 c3339212 = c333921;
        Object objForceFetch$default = c3339212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3339212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<String, Tuples2<String, ApiSweepEnrollment>> endpoint = this.getEndpoint;
            c3339212.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, c3339212, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((Tuples2) objForceFetch$default).getSecond();
    }

    public final Observable<ApiSweepEnrollment> getSweepEnrollmentObservable(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(this.getEnrollmentQuery.asFlow(accountNumber));
    }

    /* compiled from: SweepEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$updateSweepEnrollment$1", m3645f = "SweepEnrollmentStore.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$updateSweepEnrollment$1 */
    static final class C333931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends String, ? extends Tuples2<? extends String, ? extends ApiSweepEnrollment>>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ SweepEnrollmentAction $action;
        Object L$0;
        int label;
        final /* synthetic */ SweepEnrollmentStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333931(String str, SweepEnrollmentStore sweepEnrollmentStore, SweepEnrollmentAction sweepEnrollmentAction, Continuation<? super C333931> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.this$0 = sweepEnrollmentStore;
            this.$action = sweepEnrollmentAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C333931(this.$accountNumber, this.this$0, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends String, ? extends Tuples2<? extends String, ? extends ApiSweepEnrollment>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Tuples2<String, Tuples2<String, ApiSweepEnrollment>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<String, Tuples2<String, ApiSweepEnrollment>>> continuation) {
            return ((C333931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str2 = this.$accountNumber;
                PostEndpoint postEndpoint = this.this$0.postEndpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, new ApiSweepEnrollmentRequestBody(this.$action));
                this.L$0 = str2;
                this.label = 1;
                Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
                if (objPost$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                obj = objPost$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Tuples4.m3642to(str, obj);
        }
    }

    public final Completable updateSweepEnrollment(String accountNumber, SweepEnrollmentAction action) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        Completable completableIgnoreElement = RxFactory.DefaultImpls.rxSingle$default(this, null, new C333931(accountNumber, this, action, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore.updateSweepEnrollment.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Tuples2<String, Tuples2<String, ApiSweepEnrollment>> tuples2) {
                String strComponent1 = tuples2.component1();
                SweepEnrollmentStore.refreshSweepSplash$default(SweepEnrollmentStore.this, null, true, 1, null);
                SweepEnrollmentStore.this.refreshSweepSplash(strComponent1, true);
            }
        }).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "ignoreElement(...)");
        return completableIgnoreElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object postGoldSweepEndpoint$accept(BehaviorRelay behaviorRelay, ApiGoldSweepEnrollment apiGoldSweepEnrollment, Continuation continuation) {
        behaviorRelay.accept(apiGoldSweepEnrollment);
        return Unit.INSTANCE;
    }

    /* compiled from: SweepEnrollmentStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepEnrollment;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$enrollGoldSweep$1", m3645f = "SweepEnrollmentStore.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore$enrollGoldSweep$1 */
    static final class C333901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiGoldSweepEnrollment>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333901(String str, Continuation<? super C333901> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SweepEnrollmentStore.this.new C333901(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiGoldSweepEnrollment> continuation) {
            return ((C333901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = SweepEnrollmentStore.this.postGoldSweepEndpoint;
            String str = this.$accountNumber;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, str, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiGoldSweepEnrollment> enrollGoldSweep(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Single<ApiGoldSweepEnrollment> singleDoOnSuccess = RxFactory.DefaultImpls.rxSingle$default(this, null, new C333901(accountNumber, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore.enrollGoldSweep.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiGoldSweepEnrollment apiGoldSweepEnrollment) {
                SweepEnrollmentStore.refreshSweepSplash$default(SweepEnrollmentStore.this, null, true, 1, null);
                SweepEnrollmentStore.this.refreshSweepSplash(accountNumber, true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        return singleDoOnSuccess;
    }

    public final Object getSweepFlow(String str, Continuation<? super ApiSweepFlow> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getSweepOnboardingFlow, str, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BehaviorRelay<ApiSweepSplash> getSweepSplashRelay(String accountNumber) {
        BehaviorRelay<ApiSweepSplash> behaviorRelayCreate = this.sweepSplashRelay.get(accountNumber);
        if (behaviorRelayCreate == null) {
            behaviorRelayCreate = BehaviorRelay.create();
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        }
        this.sweepSplashRelay.put(accountNumber, behaviorRelayCreate);
        return behaviorRelayCreate;
    }

    public static /* synthetic */ Observable streamSweepSplashObservable$default(SweepEnrollmentStore sweepEnrollmentStore, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sweepEnrollmentStore.streamSweepSplashObservable(str);
    }

    public final Observable<ApiSweepSplash> streamSweepSplashObservable(String accountNumber) {
        Endpoint.DefaultImpls.refresh$default(this.getSweepSplashEndpoint, Optional3.asOptional(accountNumber), false, null, 6, null);
        return getSweepSplashRelay(accountNumber);
    }

    public static /* synthetic */ void refreshSweepSplash$default(SweepEnrollmentStore sweepEnrollmentStore, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        sweepEnrollmentStore.refreshSweepSplash(str, z);
    }

    public final void refreshSweepSplash(String accountNumber, boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.getSweepSplashEndpoint, Optional3.asOptional(accountNumber), force, null, 4, null);
    }
}
