package com.robinhood.android.futures.trade.p147ui.ordertype;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.futures.contracts.FuturesTradeActivityKey;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FuturesOrderTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDataState;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setIsDay", "isDay", "", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesOrderTypeDuxo extends BaseDuxo<FuturesOrderTypeDataState, FuturesOrderTypeViewState> implements HasSavedState {
    private final FuturesContractStore futuresContractStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderTypeDuxo(FuturesContractStore futuresContractStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new FuturesOrderTypeDataState(((FuturesTradeActivityKey.TradeData.OrderForm) INSTANCE.getArgs(savedStateHandle)).getSide(), false, null, 6, null), FuturesOrderTypeDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresContractStore = futuresContractStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C176391(null));
    }

    /* compiled from: FuturesOrderTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$onCreate$1", m3645f = "FuturesOrderTypeDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$onCreate$1 */
    static final class C176391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C176391(Continuation<? super C176391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderTypeDuxo.this.new C176391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C176391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<FuturesContract> flowStreamFuturesContract = FuturesOrderTypeDuxo.this.futuresContractStore.streamFuturesContract(((FuturesTradeActivityKey.TradeData.OrderForm) FuturesOrderTypeDuxo.INSTANCE.getArgs(FuturesOrderTypeDuxo.this.getSavedStateHandle())).getFuturesContractId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FuturesOrderTypeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFuturesContract, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: FuturesOrderTypeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$onCreate$1$1", m3645f = "FuturesOrderTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FuturesContract, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FuturesOrderTypeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FuturesOrderTypeDuxo futuresOrderTypeDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = futuresOrderTypeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FuturesContract futuresContract, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(futuresContract, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FuturesOrderTypeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$onCreate$1$1$1", m3645f = "FuturesOrderTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501621 extends ContinuationImpl7 implements Function2<FuturesOrderTypeDataState, Continuation<? super FuturesOrderTypeDataState>, Object> {
                final /* synthetic */ FuturesContract $contract;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501621(FuturesContract futuresContract, Continuation<? super C501621> continuation) {
                    super(2, continuation);
                    this.$contract = futuresContract;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501621 c501621 = new C501621(this.$contract, continuation);
                    c501621.L$0 = obj;
                    return c501621;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesOrderTypeDataState futuresOrderTypeDataState, Continuation<? super FuturesOrderTypeDataState> continuation) {
                    return ((C501621) create(futuresOrderTypeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return FuturesOrderTypeDataState.copy$default((FuturesOrderTypeDataState) this.L$0, null, false, this.$contract, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501621((FuturesContract) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: FuturesOrderTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$setIsDay$1", m3645f = "FuturesOrderTypeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.trade.ui.ordertype.FuturesOrderTypeDuxo$setIsDay$1 */
    static final class C176401 extends ContinuationImpl7 implements Function2<FuturesOrderTypeDataState, Continuation<? super FuturesOrderTypeDataState>, Object> {
        final /* synthetic */ boolean $isDay;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C176401(boolean z, Continuation<? super C176401> continuation) {
            super(2, continuation);
            this.$isDay = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C176401 c176401 = new C176401(this.$isDay, continuation);
            c176401.L$0 = obj;
            return c176401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOrderTypeDataState futuresOrderTypeDataState, Continuation<? super FuturesOrderTypeDataState> continuation) {
            return ((C176401) create(futuresOrderTypeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderTypeDataState.copy$default((FuturesOrderTypeDataState) this.L$0, null, this.$isDay, null, 5, null);
        }
    }

    public final void setIsDay(boolean isDay) {
        applyMutation(new C176401(isDay, null));
    }

    /* compiled from: FuturesOrderTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDuxo;", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$OrderForm;", "<init>", "()V", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FuturesOrderTypeDuxo, FuturesTradeActivityKey.TradeData.OrderForm> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesTradeActivityKey.TradeData.OrderForm getArgs(SavedStateHandle savedStateHandle) {
            return (FuturesTradeActivityKey.TradeData.OrderForm) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FuturesTradeActivityKey.TradeData.OrderForm getArgs(FuturesOrderTypeDuxo futuresOrderTypeDuxo) {
            return (FuturesTradeActivityKey.TradeData.OrderForm) DuxoCompanion.DefaultImpls.getArgs(this, futuresOrderTypeDuxo);
        }
    }
}
