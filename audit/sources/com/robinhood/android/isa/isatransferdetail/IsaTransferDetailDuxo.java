package com.robinhood.android.isa.isatransferdetail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.isa.contracts.IsaTransferDetailKey;
import com.robinhood.android.isa.isatransfer.IsaTransferDetailUseCase;
import com.robinhood.android.isa.isatransfer.IsaTransferWithAccountType;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailDataState;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailEvent;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailViewState;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.isa.IsaTransferStore;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IsaTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferdetail/IsaTransferDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailDataState;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/isa/contracts/IsaTransferDetailKey;", "isaTransferDetailUseCase", "Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase;", "isaTransferStore", "Lcom/robinhood/store/isa/IsaTransferStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/isa/isatransferdetail/IsaTransferDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/isa/isatransfer/IsaTransferDetailUseCase;Lcom/robinhood/store/isa/IsaTransferStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/isa/isatransferdetail/IsaTransferDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "Ljava/util/UUID;", "getTransferId", "()Ljava/util/UUID;", "onCreate", "", "cancelTransferRequest", "feature-isa-transfer-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaTransferDetailDuxo extends BaseDuxo3<IsaTransferDetailDataState, IsaTransferDetailViewState, IsaTransferDetailEvent> implements HasArgs<IsaTransferDetailKey> {
    public static final int $stable = 8;
    private final IsaTransferDetailUseCase isaTransferDetailUseCase;
    private final IsaTransferStore isaTransferStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public IsaTransferDetailKey getArgs(SavedStateHandle savedStateHandle) {
        return (IsaTransferDetailKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsaTransferDetailDuxo(IsaTransferDetailUseCase isaTransferDetailUseCase, IsaTransferStore isaTransferStore, SavedStateHandle savedStateHandle, IsaTransferDetailStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new IsaTransferDetailDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(isaTransferDetailUseCase, "isaTransferDetailUseCase");
        Intrinsics.checkNotNullParameter(isaTransferStore, "isaTransferStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.isaTransferDetailUseCase = isaTransferDetailUseCase;
        this.isaTransferStore = isaTransferStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getTransferId() {
        return ((IsaTransferDetailKey) getArgs(getSavedStateHandle())).getTransferId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C199331(null));
    }

    /* compiled from: IsaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1", m3645f = "IsaTransferDetailDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1 */
    static final class C199331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C199331(Continuation<? super C199331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IsaTransferDetailDuxo.this.new C199331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C199331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowM28818catch = FlowKt.m28818catch(IsaTransferDetailDuxo.this.isaTransferDetailUseCase.streamTransferDetailWithAccountType(IsaTransferDetailDuxo.this.getTransferId()), new AnonymousClass1(IsaTransferDetailDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(IsaTransferDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: IsaTransferDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/isa/isatransfer/IsaTransferWithAccountType;", "error", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1$1", m3645f = "IsaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FlowCollector<? super IsaTransferWithAccountType>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IsaTransferDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IsaTransferDetailDuxo isaTransferDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = isaTransferDetailDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super IsaTransferWithAccountType> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = th;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                if (!Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
                this.this$0.submit(new IsaTransferDetailEvent.Error(th));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: IsaTransferDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/isa/isatransfer/IsaTransferWithAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1$2", m3645f = "IsaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<IsaTransferWithAccountType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IsaTransferDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(IsaTransferDetailDuxo isaTransferDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = isaTransferDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IsaTransferWithAccountType isaTransferWithAccountType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(isaTransferWithAccountType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IsaTransferDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1$2$1", m3645f = "IsaTransferDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IsaTransferDetailDataState, Continuation<? super IsaTransferDetailDataState>, Object> {
                final /* synthetic */ IsaTransferWithAccountType $data;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IsaTransferWithAccountType isaTransferWithAccountType, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$data = isaTransferWithAccountType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IsaTransferDetailDataState isaTransferDetailDataState, Continuation<? super IsaTransferDetailDataState> continuation) {
                    return ((AnonymousClass1) create(isaTransferDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((IsaTransferDetailDataState) this.L$0).copy(this.$data.getTransfer(), this.$data.getSinkAccountType());
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((IsaTransferWithAccountType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IsaTransferDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$cancelTransferRequest$1", m3645f = "IsaTransferDetailDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailDuxo$cancelTransferRequest$1 */
    static final class C199321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C199321(Continuation<? super C199321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IsaTransferDetailDuxo.this.new C199321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C199321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IsaTransferStore isaTransferStore = IsaTransferDetailDuxo.this.isaTransferStore;
                    UUID transferId = IsaTransferDetailDuxo.this.getTransferId();
                    this.label = 1;
                    if (isaTransferStore.cancelTransferRequest(transferId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                IsaTransferDetailDuxo.this.isaTransferStore.refreshTransferById(IsaTransferDetailDuxo.this.getTransferId(), true);
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
                IsaTransferDetailDuxo.this.submit(new IsaTransferDetailEvent.Error(th));
            }
            return Unit.INSTANCE;
        }
    }

    public final void cancelTransferRequest() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C199321(null), 3, null);
    }
}
