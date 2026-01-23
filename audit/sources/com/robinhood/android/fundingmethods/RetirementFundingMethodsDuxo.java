package com.robinhood.android.fundingmethods;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.fundingmethods.RetirementFundingMethodsEvent;
import com.robinhood.android.fundingmethods.RetirementFundingMethodsFragment;
import com.robinhood.android.models.retirement.api.ApiRetirementFundingMethodsResponse;
import com.robinhood.android.models.retirement.api.RetirementFundingMethod;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementFundingMethodsDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsDataState;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsViewState;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/api/retirement/RetirementApi;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onFundingMethodSelected", "selectedMethod", "Lcom/robinhood/android/models/retirement/api/RetirementFundingMethod;", "Companion", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class RetirementFundingMethodsDuxo extends BaseDuxo3<RetirementFundingMethodsDataState, RetirementFundingMethodsViewState, RetirementFundingMethodsEvent> implements HasSavedState {
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
    public RetirementFundingMethodsDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, RetirementApi retirementApi) {
        super(new RetirementFundingMethodsDataState(null, 1, null), RetirementFundingMethodsStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        this.savedStateHandle = savedStateHandle;
        this.retirementApi = retirementApi;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C169471(null));
    }

    /* compiled from: RetirementFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.fundingmethods.RetirementFundingMethodsDuxo$onCreate$1", m3645f = "RetirementFundingMethodsDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.fundingmethods.RetirementFundingMethodsDuxo$onCreate$1 */
    static final class C169471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C169471(Continuation<? super C169471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementFundingMethodsDuxo.this.new C169471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C169471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementApi retirementApi = RetirementFundingMethodsDuxo.this.retirementApi;
                    Companion companion = RetirementFundingMethodsDuxo.INSTANCE;
                    String accountNumber = ((RetirementFundingMethodsFragment.Args) companion.getArgs((HasSavedState) RetirementFundingMethodsDuxo.this)).getAccountNumber();
                    String entryPoint = ((RetirementFundingMethodsFragment.Args) companion.getArgs((HasSavedState) RetirementFundingMethodsDuxo.this)).getEntryPoint();
                    this.label = 1;
                    obj = retirementApi.getRetirementFundingMethods(accountNumber, entryPoint, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RetirementFundingMethodsDuxo.this.applyMutation(new AnonymousClass1((ApiRetirementFundingMethodsResponse) obj, null));
            } catch (Throwable th) {
                RetirementFundingMethodsDuxo.this.submit(new RetirementFundingMethodsEvent.LoadingError(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RetirementFundingMethodsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.fundingmethods.RetirementFundingMethodsDuxo$onCreate$1$1", m3645f = "RetirementFundingMethodsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.fundingmethods.RetirementFundingMethodsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementFundingMethodsDataState, Continuation<? super RetirementFundingMethodsDataState>, Object> {
            final /* synthetic */ ApiRetirementFundingMethodsResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRetirementFundingMethodsResponse apiRetirementFundingMethodsResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiRetirementFundingMethodsResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementFundingMethodsDataState retirementFundingMethodsDataState, Continuation<? super RetirementFundingMethodsDataState> continuation) {
                return ((AnonymousClass1) create(retirementFundingMethodsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((RetirementFundingMethodsDataState) this.L$0).copy(this.$response);
            }
        }
    }

    public final void onFundingMethodSelected(RetirementFundingMethod selectedMethod) {
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        submit(new RetirementFundingMethodsEvent.NavigateToMethods(selectedMethod.getDeeplink()));
    }

    /* compiled from: RetirementFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsDuxo;", "Lcom/robinhood/android/fundingmethods/RetirementFundingMethodsFragment$Args;", "<init>", "()V", "feature-retirement-funding-methods_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementFundingMethodsDuxo, RetirementFundingMethodsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementFundingMethodsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementFundingMethodsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementFundingMethodsFragment.Args getArgs(RetirementFundingMethodsDuxo retirementFundingMethodsDuxo) {
            return (RetirementFundingMethodsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementFundingMethodsDuxo);
        }
    }
}
