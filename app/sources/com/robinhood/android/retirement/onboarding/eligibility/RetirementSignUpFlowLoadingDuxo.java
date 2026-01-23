package com.robinhood.android.retirement.onboarding.eligibility;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.RetirementOnboardingEntryPoint;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys5;
import com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowEligibilityEvent;
import com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.models.api.ManagementType;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: RetirementSignUpFlowLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/eligibility/RetirementSignUpFlowLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/retirement/onboarding/eligibility/RetirementSignUpFlowEligibilityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "streamOnboardingIntro", "Lio/reactivex/Observable;", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "streamPartnershipDetails", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse;", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowLoadingDuxo extends BaseDuxo5<Unit, RetirementSignUpFlowEligibilityEvent> implements HasSavedState {
    private final RetirementApi retirementApi;
    private final RetirementOnboardingStore retirementOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RetirementSignUpFlowLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RetirementIntentKeys5.values().length];
            try {
                iArr[RetirementIntentKeys5.SELECTION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetirementIntentKeys5.SELF_DIRECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RetirementIntentKeys5.MANAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpFlowLoadingDuxo(RetirementOnboardingStore retirementOnboardingStore, RetirementApi retirementApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.retirementOnboardingStore = retirementOnboardingStore;
        this.retirementApi = retirementApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, Observables.INSTANCE.combineLatest(streamPartnershipDetails(), streamOnboardingIntro()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowLoadingDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowLoadingDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RetirementSignUpFlowLoadingDuxo retirementSignUpFlowLoadingDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ApiRetirementPartnershipDetailResponse apiRetirementPartnershipDetailResponse = (ApiRetirementPartnershipDetailResponse) tuples2.component1();
        RetirementOnboardingIntro partnershipDetails = (RetirementOnboardingIntro) tuples2.component2();
        ApiRetirementPartnershipDetailResponse.PartnershipDetailViewModel mobile_view_model = apiRetirementPartnershipDetailResponse.getMobile_view_model();
        if (mobile_view_model != null) {
            partnershipDetails = new RetirementOnboardingIntro.PartnershipDetails(mobile_view_model, partnershipDetails);
        }
        retirementSignUpFlowLoadingDuxo.submit(new RetirementSignUpFlowEligibilityEvent.Loaded(partnershipDetails));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RetirementSignUpFlowLoadingDuxo retirementSignUpFlowLoadingDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        retirementSignUpFlowLoadingDuxo.submit(new RetirementSignUpFlowEligibilityEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    private final Observable<RetirementOnboardingIntro> streamOnboardingIntro() {
        ManagementType managementType;
        Companion companion = INSTANCE;
        if (((RetirementSignUpFlowLoadingFragment.Args) companion.getArgs((HasSavedState) this)).getIntro() != null) {
            Observable<RetirementOnboardingIntro> observableJust = Observable.just(((RetirementSignUpFlowLoadingFragment.Args) companion.getArgs((HasSavedState) this)).getIntro());
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        RetirementOnboardingStore retirementOnboardingStore = this.retirementOnboardingStore;
        int i = WhenMappings.$EnumSwitchMapping$0[((RetirementSignUpFlowLoadingFragment.Args) companion.getArgs((HasSavedState) this)).getManagementTypeSelection().ordinal()];
        if (i == 1) {
            managementType = null;
        } else if (i == 2) {
            managementType = ManagementType.SELF_DIRECTED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            managementType = ManagementType.MANAGED;
        }
        Observable<RetirementOnboardingIntro> observable = retirementOnboardingStore.streamOnboardingIntro(managementType).toObservable();
        Intrinsics.checkNotNull(observable);
        return observable;
    }

    private final Observable<ApiRetirementPartnershipDetailResponse> streamPartnershipDetails() {
        if (!Intrinsics.areEqual(((RetirementSignUpFlowLoadingFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint(), RetirementOnboardingEntryPoint.PARTNERSHIP_DETAILS.getServerValue())) {
            Observable<ApiRetirementPartnershipDetailResponse> observableOnErrorReturn = RxFactory.DefaultImpls.rxObservable$default(this, null, new C270921(null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingDuxo.streamPartnershipDetails.2
                @Override // io.reactivex.functions.Function
                public final ApiRetirementPartnershipDetailResponse apply(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ApiRetirementPartnershipDetailResponse(null, null, 3, null);
                }
            });
            Intrinsics.checkNotNull(observableOnErrorReturn);
            return observableOnErrorReturn;
        }
        Observable<ApiRetirementPartnershipDetailResponse> observableJust = Observable.just(new ApiRetirementPartnershipDetailResponse(null, null, 3, null));
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* compiled from: RetirementSignUpFlowLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingDuxo$streamPartnershipDetails$1", m3645f = "RetirementSignUpFlowLoadingDuxo.kt", m3646l = {75, 75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingDuxo$streamPartnershipDetails$1 */
    static final class C270921 extends ContinuationImpl7 implements Function2<Produce4<? super ApiRetirementPartnershipDetailResponse>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C270921(Continuation<? super C270921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C270921 c270921 = RetirementSignUpFlowLoadingDuxo.this.new C270921(continuation);
            c270921.L$0 = obj;
            return c270921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ApiRetirementPartnershipDetailResponse> produce4, Continuation<? super Unit> continuation) {
            return ((C270921) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.send(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                RetirementApi retirementApi = RetirementSignUpFlowLoadingDuxo.this.retirementApi;
                this.L$0 = produce4;
                this.label = 1;
                obj = retirementApi.getRetirement1099PartnershipDetails("retirement_onboarding", this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* compiled from: RetirementSignUpFlowLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/eligibility/RetirementSignUpFlowLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/onboarding/eligibility/RetirementSignUpFlowLoadingDuxo;", "Lcom/robinhood/android/retirement/onboarding/eligibility/RetirementSignUpFlowLoadingFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementSignUpFlowLoadingDuxo, RetirementSignUpFlowLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementSignUpFlowLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowLoadingFragment.Args getArgs(RetirementSignUpFlowLoadingDuxo retirementSignUpFlowLoadingDuxo) {
            return (RetirementSignUpFlowLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowLoadingDuxo);
        }
    }
}
