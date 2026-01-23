package com.robinhood.shared.stepupverification.support;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.workflow.p358ui.screens.RequestPhoneCallScreen;
import com.robinhood.shared.security.contracts.RequestPhoneCallFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.stepupverification.support.RequestPhoneCallEvent;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RequestPhoneCallDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001 B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0013J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDataState;", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallViewState;", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "savePhoneNumber", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "phoneNumber", "", "onCountryCodeSelected", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "requestCall", "handleActionResult", "result", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RequestPhoneCallDuxo extends BaseDuxo3<RequestPhoneCallDataState, RequestPhoneCallViewState, RequestPhoneCallEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RequestPhoneCallDuxo(WorkflowManager workflowManager, SavedStateHandle savedStateHandle, RequestPhoneCallStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        String phoneNumber = ((RequestPhoneCallFragmentKey) INSTANCE.getArgs(savedStateHandle)).getWorkflowScreen().getPhoneNumber();
        String str = phoneNumber == null ? "" : phoneNumber;
        InternationalInfo.Companion companion = InternationalInfo.INSTANCE;
        CountryCode.Supported.UnitedStates unitedStates = CountryCode.Supported.UnitedStates.INSTANCE;
        super(new RequestPhoneCallDataState(false, InternationalInfo.Companion.fromCountryCode$default(companion, null, unitedStates, 1, null), InternationalInfo.Companion.fromCountryCode$default(companion, null, unitedStates, 1, null), str, 1, null), stateProvider, duxoBundle);
        this.workflowManager = workflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: RequestPhoneCallDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$onCreate$1", m3645f = "RequestPhoneCallDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$onCreate$1 */
    static final class C399391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C399391(Continuation<? super C399391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RequestPhoneCallDuxo.this.new C399391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RequestPhoneCallDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RequestPhoneCallDuxo $tmp0;

            AnonymousClass1(RequestPhoneCallDuxo requestPhoneCallDuxo) {
                this.$tmp0 = requestPhoneCallDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RequestPhoneCallDuxo.class, "handleActionResult", "handleActionResult(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleActionResult = C399391.invokeSuspend$handleActionResult(this.$tmp0, workflowActionResult, continuation);
                return objInvokeSuspend$handleActionResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleActionResult : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((WorkflowActionResult) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RequestPhoneCallDuxo.this.workflowManager.getActionResultFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RequestPhoneCallDuxo.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleActionResult(RequestPhoneCallDuxo requestPhoneCallDuxo, WorkflowActionResult workflowActionResult, Continuation continuation) {
            requestPhoneCallDuxo.handleActionResult(workflowActionResult);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C399391(null));
    }

    /* compiled from: RequestPhoneCallDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$savePhoneNumber$1", m3645f = "RequestPhoneCallDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$savePhoneNumber$1 */
    static final class C399411 extends ContinuationImpl7 implements Function2<RequestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState>, Object> {
        final /* synthetic */ InternationalInfo $internationalInfo;
        final /* synthetic */ String $phoneNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399411(InternationalInfo internationalInfo, String str, Continuation<? super C399411> continuation) {
            super(2, continuation);
            this.$internationalInfo = internationalInfo;
            this.$phoneNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399411 c399411 = new C399411(this.$internationalInfo, this.$phoneNumber, continuation);
            c399411.L$0 = obj;
            return c399411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RequestPhoneCallDataState requestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState> continuation) {
            return ((C399411) create(requestPhoneCallDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RequestPhoneCallDataState.copy$default((RequestPhoneCallDataState) this.L$0, false, this.$internationalInfo, null, this.$phoneNumber, 5, null);
        }
    }

    public final void savePhoneNumber(InternationalInfo internationalInfo, String phoneNumber) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        applyMutation(new C399411(internationalInfo, phoneNumber, null));
    }

    /* compiled from: RequestPhoneCallDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$onCountryCodeSelected$1", m3645f = "RequestPhoneCallDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$onCountryCodeSelected$1 */
    static final class C399381 extends ContinuationImpl7 implements Function2<RequestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState>, Object> {
        final /* synthetic */ CountryCode $countryCode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399381(CountryCode countryCode, Continuation<? super C399381> continuation) {
            super(2, continuation);
            this.$countryCode = countryCode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399381 c399381 = new C399381(this.$countryCode, continuation);
            c399381.L$0 = obj;
            return c399381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RequestPhoneCallDataState requestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState> continuation) {
            return ((C399381) create(requestPhoneCallDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RequestPhoneCallDataState.copy$default((RequestPhoneCallDataState) this.L$0, false, null, InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, this.$countryCode, 1, null), null, 11, null);
        }
    }

    public final void onCountryCodeSelected(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        applyMutation(new C399381(countryCode, null));
    }

    /* compiled from: RequestPhoneCallDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$requestCall$1", m3645f = "RequestPhoneCallDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$requestCall$1 */
    static final class C399401 extends ContinuationImpl7 implements Function2<RequestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C399401(Continuation<? super C399401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399401 c399401 = RequestPhoneCallDuxo.this.new C399401(continuation);
            c399401.L$0 = obj;
            return c399401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RequestPhoneCallDataState requestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState> continuation) {
            return ((C399401) create(requestPhoneCallDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RequestPhoneCallDataState requestPhoneCallDataState = (RequestPhoneCallDataState) this.L$0;
                WorkflowManager workflowManager = RequestPhoneCallDuxo.this.workflowManager;
                Companion companion = RequestPhoneCallDuxo.INSTANCE;
                workflowManager.sendActionRequest(((RequestPhoneCallFragmentKey) companion.getArgs((HasSavedState) RequestPhoneCallDuxo.this)).getWorkflowId(), new RequestPhoneCallScreen.Action.Proceed(requestPhoneCallDataState.getInternationalInfo().getDisplayCountryPhoneCode() + requestPhoneCallDataState.getPhoneNumber()), ((RequestPhoneCallFragmentKey) companion.getArgs((HasSavedState) RequestPhoneCallDuxo.this)).getWorkflowScreen());
                return RequestPhoneCallDataState.copy$default(requestPhoneCallDataState, true, null, null, null, 14, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void requestCall() {
        applyMutation(new C399401(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionResult(WorkflowActionResult result) {
        if (result.getAction() instanceof RequestPhoneCallScreen.Action.Proceed) {
            applyMutation(new C399371(null));
            Throwable thConsumeError = result.consumeError();
            if (thConsumeError != null) {
                submit(new RequestPhoneCallEvent.Error(thConsumeError));
            }
        }
    }

    /* compiled from: RequestPhoneCallDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$handleActionResult$1", m3645f = "RequestPhoneCallDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.RequestPhoneCallDuxo$handleActionResult$1 */
    static final class C399371 extends ContinuationImpl7 implements Function2<RequestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C399371(Continuation<? super C399371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399371 c399371 = new C399371(continuation);
            c399371.L$0 = obj;
            return c399371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RequestPhoneCallDataState requestPhoneCallDataState, Continuation<? super RequestPhoneCallDataState> continuation) {
            return ((C399371) create(requestPhoneCallDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RequestPhoneCallDataState.copy$default((RequestPhoneCallDataState) this.L$0, false, null, null, null, 14, null);
        }
    }

    /* compiled from: RequestPhoneCallDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/support/RequestPhoneCallDuxo;", "Lcom/robinhood/shared/security/contracts/RequestPhoneCallFragmentKey;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RequestPhoneCallDuxo, RequestPhoneCallFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RequestPhoneCallFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RequestPhoneCallFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RequestPhoneCallFragmentKey getArgs(RequestPhoneCallDuxo requestPhoneCallDuxo) {
            return (RequestPhoneCallFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, requestPhoneCallDuxo);
        }
    }
}
