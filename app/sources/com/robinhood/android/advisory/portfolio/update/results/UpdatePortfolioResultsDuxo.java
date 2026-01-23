package com.robinhood.android.advisory.portfolio.update.results;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetModelPortfolioChangeRequestDto;
import advisory.proto.p008v1.GetModelPortfolioChangeResponseDto;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioResultsKey;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UpdatePortfolioResultsDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDataState;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "advisoryService", "Ladvisory/proto/v1/AdvisoryService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ladvisory/proto/v1/AdvisoryService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchAndSetPortfolioChangeResponse", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "Companion", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class UpdatePortfolioResultsDuxo extends BaseDuxo<UpdatePortfolioResultsDataState, UpdatePortfolioResultsViewState> implements HasSavedState {
    private final AdvisoryService advisoryService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UpdatePortfolioResultsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo", m3645f = "UpdatePortfolioResultsDuxo.kt", m3646l = {29}, m3647m = "fetchAndSetPortfolioChangeResponse")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$fetchAndSetPortfolioChangeResponse$1 */
    static final class C92341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C92341(Continuation<? super C92341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatePortfolioResultsDuxo.this.fetchAndSetPortfolioChangeResponse(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdatePortfolioResultsDuxo(AdvisoryService advisoryService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new UpdatePortfolioResultsDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), UpdatePortfolioResultsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advisoryService = advisoryService;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndSetPortfolioChangeResponse(Continuation<? super Unit> continuation) {
        C92341 c92341;
        if (continuation instanceof C92341) {
            c92341 = (C92341) continuation;
            int i = c92341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c92341.label = i - Integer.MIN_VALUE;
            } else {
                c92341 = new C92341(continuation);
            }
        }
        Object objGetModelPortfolioChange = c92341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c92341.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetModelPortfolioChange);
                AdvisoryService advisoryService = this.advisoryService;
                GetModelPortfolioChangeRequestDto getModelPortfolioChangeRequestDto = new GetModelPortfolioChangeRequestDto(((AdvisoryUpdatePortfolioResultsKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber());
                c92341.label = 1;
                objGetModelPortfolioChange = advisoryService.GetModelPortfolioChange(getModelPortfolioChangeRequestDto, c92341);
                if (objGetModelPortfolioChange == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetModelPortfolioChange);
            }
            applyMutation(new C92352(UpdatePortfolioResultsResponse2.toUiModel((GetModelPortfolioChangeResponseDto) objGetModelPortfolioChange), null));
        } catch (Exception e) {
            applyMutation(new C92363(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UpdatePortfolioResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$fetchAndSetPortfolioChangeResponse$2", m3645f = "UpdatePortfolioResultsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$fetchAndSetPortfolioChangeResponse$2 */
    static final class C92352 extends ContinuationImpl7 implements Function2<UpdatePortfolioResultsDataState, Continuation<? super UpdatePortfolioResultsDataState>, Object> {
        final /* synthetic */ UpdatePortfolioResultsResponse $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C92352(UpdatePortfolioResultsResponse updatePortfolioResultsResponse, Continuation<? super C92352> continuation) {
            super(2, continuation);
            this.$result = updatePortfolioResultsResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C92352 c92352 = new C92352(this.$result, continuation);
            c92352.L$0 = obj;
            return c92352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdatePortfolioResultsDataState updatePortfolioResultsDataState, Continuation<? super UpdatePortfolioResultsDataState> continuation) {
            return ((C92352) create(updatePortfolioResultsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UpdatePortfolioResultsDataState.copy$default((UpdatePortfolioResultsDataState) this.L$0, this.$result, null, 2, null);
        }
    }

    /* compiled from: UpdatePortfolioResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$fetchAndSetPortfolioChangeResponse$3", m3645f = "UpdatePortfolioResultsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$fetchAndSetPortfolioChangeResponse$3 */
    static final class C92363 extends ContinuationImpl7 implements Function2<UpdatePortfolioResultsDataState, Continuation<? super UpdatePortfolioResultsDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f3918$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C92363(Exception exc, Continuation<? super C92363> continuation) {
            super(2, continuation);
            this.f3918$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C92363 c92363 = new C92363(this.f3918$e, continuation);
            c92363.L$0 = obj;
            return c92363;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdatePortfolioResultsDataState updatePortfolioResultsDataState, Continuation<? super UpdatePortfolioResultsDataState> continuation) {
            return ((C92363) create(updatePortfolioResultsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UpdatePortfolioResultsDataState.copy$default((UpdatePortfolioResultsDataState) this.L$0, null, this.f3918$e, 1, null);
        }
    }

    /* compiled from: UpdatePortfolioResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$onStart$1", m3645f = "UpdatePortfolioResultsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$onStart$1 */
    static final class C92371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C92371(Continuation<? super C92371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C92371 c92371 = UpdatePortfolioResultsDuxo.this.new C92371(continuation);
            c92371.L$0 = obj;
            return c92371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UpdatePortfolioResultsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$onStart$1$1", m3645f = "UpdatePortfolioResultsDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UpdatePortfolioResultsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdatePortfolioResultsDuxo updatePortfolioResultsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = updatePortfolioResultsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UpdatePortfolioResultsDuxo updatePortfolioResultsDuxo = this.this$0;
                    this.label = 1;
                    if (updatePortfolioResultsDuxo.fetchAndSetPortfolioChangeResponse(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(UpdatePortfolioResultsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C92371(null));
    }

    /* compiled from: UpdatePortfolioResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$retry$1", m3645f = "UpdatePortfolioResultsDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsDuxo$retry$1 */
    static final class C92381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C92381(Continuation<? super C92381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdatePortfolioResultsDuxo.this.new C92381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UpdatePortfolioResultsDuxo updatePortfolioResultsDuxo = UpdatePortfolioResultsDuxo.this;
                this.label = 1;
                if (updatePortfolioResultsDuxo.fetchAndSetPortfolioChangeResponse(this) == coroutine_suspended) {
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

    public final void retry() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C92381(null), 3, null);
    }

    /* compiled from: UpdatePortfolioResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioResultsKey;", "<init>", "()V", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UpdatePortfolioResultsDuxo, AdvisoryUpdatePortfolioResultsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryUpdatePortfolioResultsKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryUpdatePortfolioResultsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryUpdatePortfolioResultsKey getArgs(UpdatePortfolioResultsDuxo updatePortfolioResultsDuxo) {
            return (AdvisoryUpdatePortfolioResultsKey) DuxoCompanion.DefaultImpls.getArgs(this, updatePortfolioResultsDuxo);
        }
    }
}
