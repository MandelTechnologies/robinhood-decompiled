package com.robinhood.android.retirement.onboarding.submit;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.api.ApiRetirementAccountCreatedResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingAgreement;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingSubmitRequest;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingSubmitResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility2;
import com.robinhood.android.retirement.onboarding.agreements.SlipCheckboxState;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignupSubmitEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0003\u001e\u001f B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0006\u0010\u001b\u001a\u00020\u0017J\b\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "getRetirementAccountCreated", "Lio/reactivex/Observable;", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "submitAndPoll", "getSubmitRequest", "Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingSubmitRequest;", "CreateResult", "SubmitResult", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowSubmitDuxo extends BaseDuxo3<RetirementSignupSubmitDataState, RetirementSignupSubmitViewState, RetirementSignupSubmitEvent> implements HasSavedState {
    private static final long ACCOUNT_CREATED_TIMEOUT_SECONDS = 15;
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final RetirementAccountSwitcherStore retirementAccountSwitcherStore;
    private final RetirementApi retirementApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementSignUpFlowSubmitDuxo(AccountProvider accountProvider, ExperimentsStore experimentsStore, RetirementApi retirementApi, RetirementAccountSwitcherStore retirementAccountSwitcherStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RetirementSignupSubmitDataState(((RetirementSignUpFlowSubmitFragment.Args) INSTANCE.getArgs(savedStateHandle)).getIgnoreExitDeepLink(), false, false, 0, null, 30, null), RetirementSignupSubmitDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.retirementApi = retirementApi;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        submitAndPoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<ApiRetirementAccountCreatedResponse> getRetirementAccountCreated() {
        Observable<ApiRetirementAccountCreatedResponse> observableFlatMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AccountCreatedManagementTypeExperiment.INSTANCE}, false, null, 6, null).flatMap(new Function() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo.getRetirementAccountCreated.1

            /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$getRetirementAccountCreated$1$1", m3645f = "RetirementSignUpFlowSubmitDuxo.kt", m3646l = {52, 58, 64}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$getRetirementAccountCreated$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Produce4<? super ApiRetirementAccountCreatedResponse>, Continuation<? super Unit>, Object> {
                final /* synthetic */ Boolean $isInManagementTypeExperiment;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RetirementSignUpFlowSubmitDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Boolean bool, RetirementSignUpFlowSubmitDuxo retirementSignUpFlowSubmitDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isInManagementTypeExperiment = bool;
                    this.this$0 = retirementSignUpFlowSubmitDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isInManagementTypeExperiment, this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Produce4<? super ApiRetirementAccountCreatedResponse> produce4, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
                
                    if (r9 == r0) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
                
                    if (r9 == r0) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
                
                    if (r1.send(r9, r8) == r0) goto L24;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Produce4 produce4;
                    ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        produce4 = (Produce4) this.L$0;
                        if (this.$isInManagementTypeExperiment.booleanValue()) {
                            RetirementApi retirementApi = this.this$0.retirementApi;
                            Companion companion = RetirementSignUpFlowSubmitDuxo.INSTANCE;
                            BrokerageAccountType accountType = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getAccountType();
                            ManagementType managementType = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getManagementType();
                            String entryPoint = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getEntryPoint();
                            this.L$0 = produce4;
                            this.label = 1;
                            obj = retirementApi.getRetirementAccountCreated(accountType, managementType, entryPoint, this);
                        } else {
                            RetirementApi retirementApi2 = this.this$0.retirementApi;
                            Companion companion2 = RetirementSignUpFlowSubmitDuxo.INSTANCE;
                            BrokerageAccountType accountType2 = ((RetirementSignUpFlowSubmitFragment.Args) companion2.getArgs((HasSavedState) this.this$0)).getAccountType();
                            String entryPoint2 = ((RetirementSignUpFlowSubmitFragment.Args) companion2.getArgs((HasSavedState) this.this$0)).getEntryPoint();
                            this.L$0 = produce4;
                            this.label = 2;
                            obj = retirementApi2.getRetirementAccountCreatedLegacy(accountType2, entryPoint2, this);
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        produce4 = (Produce4) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        apiRetirementAccountCreatedResponse = (ApiRetirementAccountCreatedResponse) obj;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        produce4 = (Produce4) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        apiRetirementAccountCreatedResponse = (ApiRetirementAccountCreatedResponse) obj;
                    }
                    this.L$0 = null;
                    this.label = 3;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiRetirementAccountCreatedResponse> apply(Boolean isInManagementTypeExperiment) {
                Intrinsics.checkNotNullParameter(isInManagementTypeExperiment, "isInManagementTypeExperiment");
                RetirementSignUpFlowSubmitDuxo retirementSignUpFlowSubmitDuxo = RetirementSignUpFlowSubmitDuxo.this;
                return RxFactory.DefaultImpls.rxObservable$default(retirementSignUpFlowSubmitDuxo, null, new AnonymousClass1(isInManagementTypeExperiment, retirementSignUpFlowSubmitDuxo, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$1 */
    /* synthetic */ class C271331 extends AdaptedFunctionReference implements Function2<RetirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState>, Object>, ContinuationImpl6 {
        public static final C271331 INSTANCE = new C271331();

        C271331() {
            super(2, RetirementSignupSubmitDataState.class, "reset", "reset()Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState;", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementSignupSubmitDataState retirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState> continuation) {
            return RetirementSignUpFlowSubmitDuxo.submitAndPoll$reset(retirementSignupSubmitDataState, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object submitAndPoll$reset(RetirementSignupSubmitDataState retirementSignupSubmitDataState, Continuation continuation) {
        return retirementSignupSubmitDataState.reset();
    }

    public final void submitAndPoll() {
        applyMutation(C271331.INSTANCE);
        Observable observableOnErrorReturn = RxFactory.DefaultImpls.rxObservable$default(this, null, new C271342(null), 1, null).map(new Function() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo.submitAndPoll.3
            @Override // io.reactivex.functions.Function
            public final SubmitResult apply(ApiRetirementOnboardingSubmitResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                ApiRetirementSignUpEligibility2 ineligible_bottom_sheet = response.getIneligible_bottom_sheet();
                if (ineligible_bottom_sheet != null) {
                    return new SubmitResult.Ineligible(ineligible_bottom_sheet);
                }
                return SubmitResult.Success.INSTANCE;
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo.submitAndPoll.4
            @Override // io.reactivex.functions.Function
            public final SubmitResult apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return new SubmitResult.Error(t);
            }
        }).switchMap(new C271375()).onErrorReturn(new Function() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo.submitAndPoll.6
            @Override // io.reactivex.functions.Function
            public final CreateResult apply(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof TimeoutException) {
                    return CreateResult.Timeout.INSTANCE;
                }
                return new CreateResult.Error(throwable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorReturn, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowSubmitDuxo.submitAndPoll$lambda$0(this.f$0, (RetirementSignUpFlowSubmitDuxo.CreateResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowSubmitDuxo.submitAndPoll$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C271399(null), 3, null);
    }

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingSubmitResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$2", m3645f = "RetirementSignUpFlowSubmitDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$2 */
    static final class C271342 extends ContinuationImpl7 implements Function2<Produce4<? super ApiRetirementOnboardingSubmitResponse>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C271342(Continuation<? super C271342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C271342 c271342 = RetirementSignUpFlowSubmitDuxo.this.new C271342(continuation);
            c271342.L$0 = obj;
            return c271342;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ApiRetirementOnboardingSubmitResponse> produce4, Continuation<? super Unit> continuation) {
            return ((C271342) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r1.send(r6, r5) == r0) goto L15;
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
                RetirementApi retirementApi = RetirementSignUpFlowSubmitDuxo.this.retirementApi;
                ApiRetirementOnboardingSubmitRequest submitRequest = RetirementSignUpFlowSubmitDuxo.this.getSubmitRequest();
                this.L$0 = produce4;
                this.label = 1;
                obj = retirementApi.submitRetirementSignUp(submitRequest, this);
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

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$5 */
    static final class C271375<T, R> implements Function {
        C271375() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends CreateResult> apply(SubmitResult submitResult) {
            Intrinsics.checkNotNullParameter(submitResult, "submitResult");
            if (submitResult instanceof SubmitResult.Ineligible) {
                return Observable.just(new CreateResult.Ineligible(((SubmitResult.Ineligible) submitResult).getBottomSheet()));
            }
            if (submitResult instanceof SubmitResult.Success) {
                return ObservablesKt.retryAfter$default(RetirementSignUpFlowSubmitDuxo.this.getRetirementAccountCreated(), 500L, TimeUnit.MILLISECONDS, 0, new Function1() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(RetirementSignUpFlowSubmitDuxo.C271375.apply$lambda$0((Throwable) obj));
                    }
                }, 4, null).timeout(RetirementSignUpFlowSubmitDuxo.ACCOUNT_CREATED_TIMEOUT_SECONDS, TimeUnit.SECONDS).map(new Function() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo.submitAndPoll.5.2
                    @Override // io.reactivex.functions.Function
                    public final CreateResult apply(ApiRetirementAccountCreatedResponse response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        return new CreateResult.Success(response);
                    }
                }).onErrorReturn(new Function() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo.submitAndPoll.5.3
                    @Override // io.reactivex.functions.Function
                    public final CreateResult apply(Throwable throwable) {
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        if (Throwables.is4xxHttpException(throwable) || (throwable instanceof TimeoutException)) {
                            return CreateResult.Timeout.INSTANCE;
                        }
                        return new CreateResult.Error(throwable);
                    }
                });
            }
            if (submitResult instanceof SubmitResult.Error) {
                return Observable.just(new CreateResult.Error(((SubmitResult.Error) submitResult).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean apply$lambda$0(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return Throwables.is4xxHttpException(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitAndPoll$lambda$0(RetirementSignUpFlowSubmitDuxo retirementSignUpFlowSubmitDuxo, CreateResult createResult) {
        if (createResult instanceof CreateResult.Ineligible) {
            retirementSignUpFlowSubmitDuxo.submit(new RetirementSignupSubmitEvent.Ineligible(((CreateResult.Ineligible) createResult).getBottomSheet()));
        } else if (createResult instanceof CreateResult.Success) {
            retirementSignUpFlowSubmitDuxo.accountProvider.refresh(true);
            retirementSignUpFlowSubmitDuxo.retirementAccountSwitcherStore.setActiveRetirementAccountNumber(((CreateResult.Success) createResult).getResponse().getAccount_number());
            retirementSignUpFlowSubmitDuxo.applyMutation(new RetirementSignUpFlowSubmitDuxo2(createResult, null));
        } else if (createResult instanceof CreateResult.Error) {
            retirementSignUpFlowSubmitDuxo.submit(new RetirementSignupSubmitEvent.Error(((CreateResult.Error) createResult).getError()));
        } else {
            if (!(createResult instanceof CreateResult.Timeout)) {
                throw new NoWhenBranchMatchedException();
            }
            retirementSignUpFlowSubmitDuxo.applyMutation(new RetirementSignUpFlowSubmitDuxo3(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitAndPoll$lambda$1(RetirementSignUpFlowSubmitDuxo retirementSignUpFlowSubmitDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        retirementSignUpFlowSubmitDuxo.submit(new RetirementSignupSubmitEvent.Error(error));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$9", m3645f = "RetirementSignUpFlowSubmitDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$9 */
    static final class C271399 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C271399(Continuation<? super C271399> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementSignUpFlowSubmitDuxo.this.new C271399(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271399) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RetirementSignUpFlowSubmitDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$9$1", m3645f = "RetirementSignUpFlowSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitDuxo$submitAndPoll$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementSignupSubmitDataState retirementSignupSubmitDataState, Continuation<? super RetirementSignupSubmitDataState> continuation) {
                return ((AnonymousClass1) create(retirementSignupSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RetirementSignupSubmitDataState.copy$default((RetirementSignupSubmitDataState) this.L$0, false, true, false, 0, null, 29, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiRetirementOnboardingSubmitRequest getSubmitRequest() {
        Companion companion = INSTANCE;
        BrokerageAccountType accountType = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this)).getAccountType();
        ManagementType managementType = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this)).getManagementType();
        ApiRetirementOnboardingAgreement accountAgreement = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this)).getSignedAgreements().getAccountAgreement();
        List<SlipCheckboxState> slipCheckboxStates = ((RetirementSignUpFlowSubmitFragment.Args) companion.getArgs((HasSavedState) this)).getSignedAgreements().getSlipCheckboxStates();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slipCheckboxStates) {
            if (((SlipCheckboxState) obj).isChecked()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SlipCheckboxState) it.next()).getAccountType());
        }
        Companion companion2 = INSTANCE;
        return new ApiRetirementOnboardingSubmitRequest(accountType, managementType, accountAgreement, arrayList2, ((RetirementSignUpFlowSubmitFragment.Args) companion2.getArgs((HasSavedState) this)).getSignedAgreements().getSlipLendingAgreement(), ((RetirementSignUpFlowSubmitFragment.Args) companion2.getArgs((HasSavedState) this)).getSignedAgreements().getSlipCustodianAgreement(), null, null, null, ((RetirementSignUpFlowSubmitFragment.Args) companion2.getArgs((HasSavedState) this)).getRefId(), null);
    }

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult;", "", "<init>", "()V", "Ineligible", "Success", "Error", "Timeout", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Error;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Ineligible;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Success;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Timeout;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class CreateResult {
        public static final int $stable = 0;

        public /* synthetic */ CreateResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Ineligible;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult;", "bottomSheet", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;)V", "getBottomSheet", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ineligible extends CreateResult {
            public static final int $stable = 8;
            private final ApiRetirementSignUpEligibility2 bottomSheet;

            public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, ApiRetirementSignUpEligibility2 apiRetirementSignUpEligibility2, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiRetirementSignUpEligibility2 = ineligible.bottomSheet;
                }
                return ineligible.copy(apiRetirementSignUpEligibility2);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiRetirementSignUpEligibility2 getBottomSheet() {
                return this.bottomSheet;
            }

            public final Ineligible copy(ApiRetirementSignUpEligibility2 bottomSheet) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                return new Ineligible(bottomSheet);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ineligible) && Intrinsics.areEqual(this.bottomSheet, ((Ineligible) other).bottomSheet);
            }

            public int hashCode() {
                return this.bottomSheet.hashCode();
            }

            public String toString() {
                return "Ineligible(bottomSheet=" + this.bottomSheet + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ineligible(ApiRetirementSignUpEligibility2 bottomSheet) {
                super(null);
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                this.bottomSheet = bottomSheet;
            }

            public final ApiRetirementSignUpEligibility2 getBottomSheet() {
                return this.bottomSheet;
            }
        }

        private CreateResult() {
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Success;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult;", "response", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;)V", "getResponse", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends CreateResult {
            public static final int $stable = 8;
            private final ApiRetirementAccountCreatedResponse response;

            public static /* synthetic */ Success copy$default(Success success, ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiRetirementAccountCreatedResponse = success.response;
                }
                return success.copy(apiRetirementAccountCreatedResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiRetirementAccountCreatedResponse getResponse() {
                return this.response;
            }

            public final Success copy(ApiRetirementAccountCreatedResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new Success(response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.response, ((Success) other).response);
            }

            public int hashCode() {
                return this.response.hashCode();
            }

            public String toString() {
                return "Success(response=" + this.response + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ApiRetirementAccountCreatedResponse response) {
                super(null);
                Intrinsics.checkNotNullParameter(response, "response");
                this.response = response;
            }

            public final ApiRetirementAccountCreatedResponse getResponse() {
                return this.response;
            }
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Error;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends CreateResult {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.error;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Error copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult$Timeout;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$CreateResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Timeout extends CreateResult {
            public static final int $stable = 0;
            public static final Timeout INSTANCE = new Timeout();

            public boolean equals(Object other) {
                return this == other || (other instanceof Timeout);
            }

            public int hashCode() {
                return 662438359;
            }

            public String toString() {
                return "Timeout";
            }

            private Timeout() {
                super(null);
            }
        }
    }

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult;", "", "Success", "Ineligible", "Error", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult$Error;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult$Ineligible;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult$Success;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SubmitResult {

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult$Success;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements SubmitResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return -160042347;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult$Ineligible;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult;", "bottomSheet", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;)V", "getBottomSheet", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ineligible implements SubmitResult {
            public static final int $stable = 8;
            private final ApiRetirementSignUpEligibility2 bottomSheet;

            public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, ApiRetirementSignUpEligibility2 apiRetirementSignUpEligibility2, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiRetirementSignUpEligibility2 = ineligible.bottomSheet;
                }
                return ineligible.copy(apiRetirementSignUpEligibility2);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiRetirementSignUpEligibility2 getBottomSheet() {
                return this.bottomSheet;
            }

            public final Ineligible copy(ApiRetirementSignUpEligibility2 bottomSheet) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                return new Ineligible(bottomSheet);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ineligible) && Intrinsics.areEqual(this.bottomSheet, ((Ineligible) other).bottomSheet);
            }

            public int hashCode() {
                return this.bottomSheet.hashCode();
            }

            public String toString() {
                return "Ineligible(bottomSheet=" + this.bottomSheet + ")";
            }

            public Ineligible(ApiRetirementSignUpEligibility2 bottomSheet) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                this.bottomSheet = bottomSheet;
            }

            public final ApiRetirementSignUpEligibility2 getBottomSheet() {
                return this.bottomSheet;
            }
        }

        /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult$Error;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$SubmitResult;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements SubmitResult {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.error;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Error copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            public Error(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: RetirementSignUpFlowSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Args;", "<init>", "()V", "ACCOUNT_CREATED_TIMEOUT_SECONDS", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementSignUpFlowSubmitDuxo, RetirementSignUpFlowSubmitFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowSubmitFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementSignUpFlowSubmitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementSignUpFlowSubmitFragment.Args getArgs(RetirementSignUpFlowSubmitDuxo retirementSignUpFlowSubmitDuxo) {
            return (RetirementSignUpFlowSubmitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowSubmitDuxo);
        }
    }
}
