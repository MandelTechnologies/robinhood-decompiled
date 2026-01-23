package com.robinhood.android.transfers.p271ui.max.irataxwithholding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.retirement.transfers.RetirementTransfersApi;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.EditIraDistributionTaxWithholdingEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraDistributionType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "onCreate", "", "setFederalWithholdingPercent", "federalWithholdingPercent", "setStateWithholdingPercent", "stateWithholdingPercent", "submitTaxWithholding", "getIraDistributionTaxWithholding", "Lkotlin/Result;", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "getIraDistributionTaxWithholding-0E7RQCE", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EditIraDistributionTaxWithholdingDuxo extends BaseDuxo5<EditIraDistributionTaxWithholdingViewState, EditIraDistributionTaxWithholdingEvent> implements HasSavedState {
    private static final long DEBOUNCE_DURATION_MS = 200;
    private final RetirementTransfersApi retirementTransfersApi;
    private final SavedStateHandle savedStateHandle;
    private final SharedFlow2<Tuples2<BigDecimal, BigDecimal>> submitFlow;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditIraDistributionTaxWithholdingDuxo(RetirementTransfersApi retirementTransfersApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new EditIraDistributionTaxWithholdingViewState(null, null, false, null, 15, null), duxoBundle);
        Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.retirementTransfersApi = retirementTransfersApi;
        this.savedStateHandle = savedStateHandle;
        this.submitFlow = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C309291(null));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C309302(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C309313(null));
    }

    /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$1", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$1 */
    static final class C309291 extends ContinuationImpl7 implements Function2<EditIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C309291(Continuation<? super C309291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C309291 c309291 = EditIraDistributionTaxWithholdingDuxo.this.new C309291(continuation);
            c309291.L$0 = obj;
            return c309291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState> continuation) {
            return ((C309291) create(editIraDistributionTaxWithholdingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EditIraDistributionTaxWithholdingViewState.copy$default((EditIraDistributionTaxWithholdingViewState) this.L$0, null, null, false, ((EditIraDistributionTaxWithholdingLaunchMode) EditIraDistributionTaxWithholdingDuxo.INSTANCE.getArgs((HasSavedState) EditIraDistributionTaxWithholdingDuxo.this)).getIraDistributionTaxWithholding(), 7, null);
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2 */
    static final class C309302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309302(Continuation<? super C309302> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EditIraDistributionTaxWithholdingDuxo.this.new C309302(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<EditIraDistributionTaxWithholdingViewState> stateFlow = EditIraDistributionTaxWithholdingDuxo.this.getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.debounce(new Flow<Tuples2<? extends BigDecimal, ? extends BigDecimal>>() { // from class: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState = (EditIraDistributionTaxWithholdingViewState) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(editIraDistributionTaxWithholdingViewState.getFederalWithholdingPercent(), editIraDistributionTaxWithholdingViewState.getStateWithholdingPercent());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Tuples2<? extends BigDecimal, ? extends BigDecimal>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 200L));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EditIraDistributionTaxWithholdingDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$2", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends BigDecimal, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EditIraDistributionTaxWithholdingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = editIraDistributionTaxWithholdingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Tuples2<? extends BigDecimal, ? extends BigDecimal> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objM19905getIraDistributionTaxWithholding0E7RQCE;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    BigDecimal bigDecimal = (BigDecimal) tuples2.component1();
                    BigDecimal bigDecimal2 = (BigDecimal) tuples2.component2();
                    if (bigDecimal == null || bigDecimal2 == null) {
                        this.this$0.applyMutation(new AnonymousClass3(null));
                        return Unit.INSTANCE;
                    }
                    EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo = this.this$0;
                    this.label = 1;
                    objM19905getIraDistributionTaxWithholding0E7RQCE = editIraDistributionTaxWithholdingDuxo.m19905getIraDistributionTaxWithholding0E7RQCE(bigDecimal, bigDecimal2, this);
                    if (objM19905getIraDistributionTaxWithholding0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM19905getIraDistributionTaxWithholding0E7RQCE = ((Result) obj).getValue();
                }
                EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo2 = this.this$0;
                if (Result.m28556isSuccessimpl(objM19905getIraDistributionTaxWithholding0E7RQCE)) {
                    editIraDistributionTaxWithholdingDuxo2.applyMutation(new EditIraDistributionTaxWithholdingDuxo3((ApiIraDistributionTaxWithholding) objM19905getIraDistributionTaxWithholding0E7RQCE, null));
                }
                EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo3 = this.this$0;
                if (Result.m28553exceptionOrNullimpl(objM19905getIraDistributionTaxWithholding0E7RQCE) != null) {
                    editIraDistributionTaxWithholdingDuxo3.applyMutation(new EditIraDistributionTaxWithholdingDuxo4(null));
                }
                Result.m28549boximpl(objM19905getIraDistributionTaxWithholding0E7RQCE);
                return Unit.INSTANCE;
            }

            /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$2$3", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$2$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<EditIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState> continuation) {
                    return ((AnonymousClass3) create(editIraDistributionTaxWithholdingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EditIraDistributionTaxWithholdingViewState.copy$default((EditIraDistributionTaxWithholdingViewState) this.L$0, null, null, false, null, 7, null);
                }
            }
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$3", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$3 */
    static final class C309313 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C309313(Continuation<? super C309313> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EditIraDistributionTaxWithholdingDuxo.this.new C309313(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C309313) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = EditIraDistributionTaxWithholdingDuxo.this.submitFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EditIraDistributionTaxWithholdingDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow2, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$3$1", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends BigDecimal, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EditIraDistributionTaxWithholdingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = editIraDistributionTaxWithholdingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Tuples2<? extends BigDecimal, ? extends BigDecimal> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$3$1$1", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506231 extends ContinuationImpl7 implements Function2<EditIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C506231(Continuation<? super C506231> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506231 c506231 = new C506231(continuation);
                    c506231.L$0 = obj;
                    return c506231;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState> continuation) {
                    return ((C506231) create(editIraDistributionTaxWithholdingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EditIraDistributionTaxWithholdingViewState.copy$default((EditIraDistributionTaxWithholdingViewState) this.L$0, null, null, true, null, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objM19905getIraDistributionTaxWithholding0E7RQCE;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    BigDecimal bigDecimal = (BigDecimal) tuples2.component1();
                    BigDecimal bigDecimal2 = (BigDecimal) tuples2.component2();
                    this.this$0.applyMutation(new C506231(null));
                    EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo = this.this$0;
                    this.label = 1;
                    objM19905getIraDistributionTaxWithholding0E7RQCE = editIraDistributionTaxWithholdingDuxo.m19905getIraDistributionTaxWithholding0E7RQCE(bigDecimal, bigDecimal2, this);
                    if (objM19905getIraDistributionTaxWithholding0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM19905getIraDistributionTaxWithholding0E7RQCE = ((Result) obj).getValue();
                }
                EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo2 = this.this$0;
                if (Result.m28556isSuccessimpl(objM19905getIraDistributionTaxWithholding0E7RQCE)) {
                    editIraDistributionTaxWithholdingDuxo2.submit(new EditIraDistributionTaxWithholdingEvent.Submit((ApiIraDistributionTaxWithholding) objM19905getIraDistributionTaxWithholding0E7RQCE));
                }
                EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo3 = this.this$0;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM19905getIraDistributionTaxWithholding0E7RQCE);
                if (thM28553exceptionOrNullimpl != null) {
                    editIraDistributionTaxWithholdingDuxo3.submit(new EditIraDistributionTaxWithholdingEvent.Error(thM28553exceptionOrNullimpl));
                    editIraDistributionTaxWithholdingDuxo3.applyMutation(new EditIraDistributionTaxWithholdingDuxo5(null));
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$setFederalWithholdingPercent$1", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$setFederalWithholdingPercent$1 */
    static final class C309321 extends ContinuationImpl7 implements Function2<EditIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState>, Object> {
        final /* synthetic */ BigDecimal $federalWithholdingPercent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C309321(BigDecimal bigDecimal, Continuation<? super C309321> continuation) {
            super(2, continuation);
            this.$federalWithholdingPercent = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C309321 c309321 = new C309321(this.$federalWithholdingPercent, continuation);
            c309321.L$0 = obj;
            return c309321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState> continuation) {
            return ((C309321) create(editIraDistributionTaxWithholdingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EditIraDistributionTaxWithholdingViewState.copy$default((EditIraDistributionTaxWithholdingViewState) this.L$0, this.$federalWithholdingPercent, null, false, null, 14, null);
        }
    }

    public final void setFederalWithholdingPercent(BigDecimal federalWithholdingPercent) {
        applyMutation(new C309321(federalWithholdingPercent, null));
    }

    /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$setStateWithholdingPercent$1", m3645f = "EditIraDistributionTaxWithholdingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.irataxwithholding.EditIraDistributionTaxWithholdingDuxo$setStateWithholdingPercent$1 */
    static final class C309331 extends ContinuationImpl7 implements Function2<EditIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState>, Object> {
        final /* synthetic */ BigDecimal $stateWithholdingPercent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C309331(BigDecimal bigDecimal, Continuation<? super C309331> continuation) {
            super(2, continuation);
            this.$stateWithholdingPercent = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C309331 c309331 = new C309331(this.$stateWithholdingPercent, continuation);
            c309331.L$0 = obj;
            return c309331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EditIraDistributionTaxWithholdingViewState editIraDistributionTaxWithholdingViewState, Continuation<? super EditIraDistributionTaxWithholdingViewState> continuation) {
            return ((C309331) create(editIraDistributionTaxWithholdingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EditIraDistributionTaxWithholdingViewState.copy$default((EditIraDistributionTaxWithholdingViewState) this.L$0, null, this.$stateWithholdingPercent, false, null, 13, null);
        }
    }

    public final void setStateWithholdingPercent(BigDecimal stateWithholdingPercent) {
        applyMutation(new C309331(stateWithholdingPercent, null));
    }

    public final void submitTaxWithholding(BigDecimal federalWithholdingPercent, BigDecimal stateWithholdingPercent) {
        Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
        Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
        this.submitFlow.tryEmit(Tuples4.m3642to(federalWithholdingPercent, stateWithholdingPercent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: getIraDistributionTaxWithholding-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19905getIraDistributionTaxWithholding0E7RQCE(BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super Result<ApiIraDistributionTaxWithholding>> continuation) {
        EditIraDistributionTaxWithholdingDuxo2 editIraDistributionTaxWithholdingDuxo2;
        if (continuation instanceof EditIraDistributionTaxWithholdingDuxo2) {
            editIraDistributionTaxWithholdingDuxo2 = (EditIraDistributionTaxWithholdingDuxo2) continuation;
            int i = editIraDistributionTaxWithholdingDuxo2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                editIraDistributionTaxWithholdingDuxo2.label = i - Integer.MIN_VALUE;
            } else {
                editIraDistributionTaxWithholdingDuxo2 = new EditIraDistributionTaxWithholdingDuxo2(this, continuation);
            }
        }
        EditIraDistributionTaxWithholdingDuxo2 editIraDistributionTaxWithholdingDuxo22 = editIraDistributionTaxWithholdingDuxo2;
        Object iraDistributionTaxWithholding = editIraDistributionTaxWithholdingDuxo22.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = editIraDistributionTaxWithholdingDuxo22.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(iraDistributionTaxWithholding);
                Result.Companion companion = Result.INSTANCE;
                RetirementTransfersApi retirementTransfersApi = this.retirementTransfersApi;
                Companion companion2 = INSTANCE;
                BigDecimal amount = ((EditIraDistributionTaxWithholdingLaunchMode) companion2.getArgs((HasSavedState) this)).getIraDistributionTaxWithholding().getAmount();
                String account_number = ((EditIraDistributionTaxWithholdingLaunchMode) companion2.getArgs((HasSavedState) this)).getIraDistributionTaxWithholding().getAccount_number();
                ApiTransferAccount.TransferAccountType account_type = ((EditIraDistributionTaxWithholdingLaunchMode) companion2.getArgs((HasSavedState) this)).getIraDistributionTaxWithholding().getAccount_type();
                IraDistributionType distribution_type = ((EditIraDistributionTaxWithholdingLaunchMode) companion2.getArgs((HasSavedState) this)).getIraDistributionTaxWithholding().getDistribution_type();
                editIraDistributionTaxWithholdingDuxo22.label = 1;
                iraDistributionTaxWithholding = retirementTransfersApi.getIraDistributionTaxWithholding(amount, account_number, account_type, distribution_type, bigDecimal2, bigDecimal, editIraDistributionTaxWithholdingDuxo22);
                if (iraDistributionTaxWithholding == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(iraDistributionTaxWithholding);
            }
            return Result.m28550constructorimpl((ApiIraDistributionTaxWithholding) iraDistributionTaxWithholding);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* compiled from: EditIraDistributionTaxWithholdingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingDuxo;", "Lcom/robinhood/android/transfers/ui/max/irataxwithholding/EditIraDistributionTaxWithholdingLaunchMode;", "<init>", "()V", "DEBOUNCE_DURATION_MS", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EditIraDistributionTaxWithholdingDuxo, EditIraDistributionTaxWithholdingLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EditIraDistributionTaxWithholdingLaunchMode getArgs(SavedStateHandle savedStateHandle) {
            return (EditIraDistributionTaxWithholdingLaunchMode) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EditIraDistributionTaxWithholdingLaunchMode getArgs(EditIraDistributionTaxWithholdingDuxo editIraDistributionTaxWithholdingDuxo) {
            return (EditIraDistributionTaxWithholdingLaunchMode) DuxoCompanion.DefaultImpls.getArgs(this, editIraDistributionTaxWithholdingDuxo);
        }
    }
}
