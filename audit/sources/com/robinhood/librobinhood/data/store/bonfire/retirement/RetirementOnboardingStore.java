package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementDashboardSignupResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpAccountSelection;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0012\u001a\u00020\nJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/BrokerageAccountType;", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "signUpFlowCache", "", "getSignUpFlowCache$lib_store_retirement_externalDebug", "()Ljava/util/Map;", "getRetirementSignupFlow", "Lio/reactivex/Single;", "brokerageAccountType", "streamEligibility", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpEligibility;", "streamSignupPageViewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "firstSwipey", "", "streamAccountSelectionAsIntro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "(Lcom/robinhood/models/api/ManagementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamOnboardingIntro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RetirementOnboardingStore extends Store {
    private final Endpoint<BrokerageAccountType, ApiRetirementSignUpFlow> endpoint;
    private final RetirementApi retirementApi;
    private final Map<BrokerageAccountType, ApiRetirementSignUpFlow> signUpFlowCache;

    /* compiled from: RetirementOnboardingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore", m3645f = "RetirementOnboardingStore.kt", m3646l = {56}, m3647m = "streamAccountSelectionAsIntro")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamAccountSelectionAsIntro$1 */
    static final class C347311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C347311(Continuation<? super C347311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RetirementOnboardingStore.this.streamAccountSelectionAsIntro(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementOnboardingStore(RetirementApi retirementApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        this.endpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new RetirementOnboardingStore2(this, null), getLogoutKillswitch(), new RetirementOnboardingStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.signUpFlowCache = new LinkedHashMap();
    }

    public final Map<BrokerageAccountType, ApiRetirementSignUpFlow> getSignUpFlowCache$lib_store_retirement_externalDebug() {
        return this.signUpFlowCache;
    }

    /* compiled from: RetirementOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$getRetirementSignupFlow$2", m3645f = "RetirementOnboardingStore.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$getRetirementSignupFlow$2 */
    static final class C347302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRetirementSignUpFlow>, Object> {
        final /* synthetic */ BrokerageAccountType $brokerageAccountType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347302(BrokerageAccountType brokerageAccountType, Continuation<? super C347302> continuation) {
            super(2, continuation);
            this.$brokerageAccountType = brokerageAccountType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementOnboardingStore.this.new C347302(this.$brokerageAccountType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRetirementSignUpFlow> continuation) {
            return ((C347302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = RetirementOnboardingStore.this.endpoint;
            BrokerageAccountType brokerageAccountType = this.$brokerageAccountType;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, brokerageAccountType, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiRetirementSignUpFlow> getRetirementSignupFlow(BrokerageAccountType brokerageAccountType) {
        Single<ApiRetirementSignUpFlow> singleJust;
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        ApiRetirementSignUpFlow apiRetirementSignUpFlow = this.signUpFlowCache.get(brokerageAccountType);
        return (apiRetirementSignUpFlow == null || (singleJust = Single.just(apiRetirementSignUpFlow)) == null) ? RxFactory.DefaultImpls.rxSingle$default(this, null, new C347302(brokerageAccountType, null), 1, null) : singleJust;
    }

    /* compiled from: RetirementOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamEligibility$1", m3645f = "RetirementOnboardingStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamEligibility$1 */
    static final class C347321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRetirementSignUpEligibility>, Object> {
        int label;

        C347321(Continuation<? super C347321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementOnboardingStore.this.new C347321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRetirementSignUpEligibility> continuation) {
            return ((C347321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RetirementApi retirementApi = RetirementOnboardingStore.this.retirementApi;
            this.label = 1;
            Object retirementSignUpEligibility = retirementApi.getRetirementSignUpEligibility(this);
            return retirementSignUpEligibility == coroutine_suspended ? coroutine_suspended : retirementSignUpEligibility;
        }
    }

    public final Single<ApiRetirementSignUpEligibility> streamEligibility() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347321(null), 1, null);
    }

    /* compiled from: RetirementOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamSignupPageViewModel$1", m3645f = "RetirementOnboardingStore.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamSignupPageViewModel$1 */
    static final class C347341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRetirementDashboardSignupResponse>, Object> {
        final /* synthetic */ String $firstSwipey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347341(String str, Continuation<? super C347341> continuation) {
            super(2, continuation);
            this.$firstSwipey = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementOnboardingStore.this.new C347341(this.$firstSwipey, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRetirementDashboardSignupResponse> continuation) {
            return ((C347341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RetirementApi retirementApi = RetirementOnboardingStore.this.retirementApi;
            String str = this.$firstSwipey;
            this.label = 1;
            Object retirementSignupSwipeys = retirementApi.getRetirementSignupSwipeys(str, this);
            return retirementSignupSwipeys == coroutine_suspended ? coroutine_suspended : retirementSignupSwipeys;
        }
    }

    public final Single<ApiRetirementDashboardSignupResponse> streamSignupPageViewModel(String firstSwipey) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347341(firstSwipey, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamAccountSelectionAsIntro(ManagementType managementType, Continuation<? super RetirementOnboardingIntro.AccountSelection> continuation) {
        C347311 c347311;
        if (continuation instanceof C347311) {
            c347311 = (C347311) continuation;
            int i = c347311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c347311.label = i - Integer.MIN_VALUE;
            } else {
                c347311 = new C347311(continuation);
            }
        }
        Object retirementSignUpAccountSelection = c347311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c347311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(retirementSignUpAccountSelection);
            RetirementApi retirementApi = this.retirementApi;
            c347311.label = 1;
            retirementSignUpAccountSelection = retirementApi.getRetirementSignUpAccountSelection(managementType, c347311);
            if (retirementSignUpAccountSelection == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(retirementSignUpAccountSelection);
        }
        return new RetirementOnboardingIntro.AccountSelection((ApiRetirementSignUpAccountSelection) retirementSignUpAccountSelection);
    }

    /* compiled from: RetirementOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamOnboardingIntro$1", m3645f = "RetirementOnboardingStore.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$streamOnboardingIntro$1 */
    static final class C347331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RetirementOnboardingIntro>, Object> {
        final /* synthetic */ ManagementType $managementType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347331(ManagementType managementType, Continuation<? super C347331> continuation) {
            super(2, continuation);
            this.$managementType = managementType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementOnboardingStore.this.new C347331(this.$managementType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RetirementOnboardingIntro> continuation) {
            return ((C347331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            RetirementOnboardingStore retirementOnboardingStore = RetirementOnboardingStore.this;
            ManagementType managementType = this.$managementType;
            this.label = 1;
            Object objStreamAccountSelectionAsIntro = retirementOnboardingStore.streamAccountSelectionAsIntro(managementType, this);
            return objStreamAccountSelectionAsIntro == coroutine_suspended ? coroutine_suspended : objStreamAccountSelectionAsIntro;
        }
    }

    public final Single<RetirementOnboardingIntro> streamOnboardingIntro(ManagementType managementType) {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C347331(managementType, null), 1, null);
    }
}
