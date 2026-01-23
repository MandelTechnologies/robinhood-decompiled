package com.robinhood.shared.crypto.transfer.unified;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo2;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFragment;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedViewState;
import com.robinhood.shared.formats.crypto.UiCurrencyPairs3;
import com.robinhood.utils.extensions.Throwables;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: CryptoTransferUnifiedDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "changeActivePageIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferUnifiedDuxo extends BaseDuxo5<CryptoTransferUnifiedViewState, CryptoTransferUnifiedDuxo2> implements HasSavedState {
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTransferUnifiedDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        CryptoTransferUnifiedFragment.Args args = (CryptoTransferUnifiedFragment.Args) INSTANCE.getArgs(savedStateHandle);
        UiCurrencyPair uiCurrencyPair = null;
        CryptoTransferConfig cryptoTransferConfig = null;
        super(new CryptoTransferUnifiedViewState(CryptoTransferUnifiedViewState.Screen.INSTANCE.screenFromAction$feature_crypto_transfer_externalDebug(args.getAction()), uiCurrencyPair, args.getUseSavedAddressesFlow(), cryptoTransferConfig, args.getSendState(), args.getSource(), 10, null), duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.currencyPairStore = currencyPairStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C384271(null));
    }

    /* compiled from: CryptoTransferUnifiedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1 */
    static final class C384271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C384271(Continuation<? super C384271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C384271 c384271 = CryptoTransferUnifiedDuxo.this.new C384271(continuation);
            c384271.L$0 = obj;
            return c384271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C384271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoTransferUnifiedDuxo.this.currencyPairStore.streamCurrencyPairFlow(((CryptoTransferUnifiedFragment.Args) CryptoTransferUnifiedDuxo.INSTANCE.getArgs((HasSavedState) CryptoTransferUnifiedDuxo.this)).getCurrencyPairId());
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(new Flow<UiCurrencyPair>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                UiCurrencyPair uiCurrencyPairAdjustMinOrderQuantityIncrement = UiCurrencyPairs3.adjustMinOrderQuantityIncrement((UiCurrencyPair) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(uiCurrencyPairAdjustMinOrderQuantityIncrement, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super UiCurrencyPair> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamCurrencyPairFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, CryptoTransferUnifiedDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, CryptoTransferUnifiedDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, CryptoTransferUnifiedDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoTransferUnifiedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$1", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiCurrencyPair> $currencyPairFlow;
            int label;
            final /* synthetic */ CryptoTransferUnifiedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiCurrencyPair> sharedFlow, CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currencyPairFlow = sharedFlow;
                this.this$0 = cryptoTransferUnifiedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$currencyPairFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTransferUnifiedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$1$1", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507211 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferUnifiedDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507211(CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, Continuation<? super C507211> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferUnifiedDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507211 c507211 = new C507211(this.this$0, continuation);
                    c507211.L$0 = obj;
                    return c507211;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((C507211) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferUnifiedDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$1$1$1", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507221 extends ContinuationImpl7 implements Function2<CryptoTransferUnifiedViewState, Continuation<? super CryptoTransferUnifiedViewState>, Object> {
                    final /* synthetic */ UiCurrencyPair $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507221(UiCurrencyPair uiCurrencyPair, Continuation<? super C507221> continuation) {
                        super(2, continuation);
                        this.$it = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507221 c507221 = new C507221(this.$it, continuation);
                        c507221.L$0 = obj;
                        return c507221;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferUnifiedViewState cryptoTransferUnifiedViewState, Continuation<? super CryptoTransferUnifiedViewState> continuation) {
                        return ((C507221) create(cryptoTransferUnifiedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferUnifiedViewState.copy$default((CryptoTransferUnifiedViewState) this.L$0, null, this.$it, false, null, null, null, 61, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507221((UiCurrencyPair) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UiCurrencyPair> sharedFlow = this.$currencyPairFlow;
                    C507211 c507211 = new C507211(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c507211, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTransferUnifiedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$2", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiCurrencyPair> $currencyPairFlow;
            int label;
            final /* synthetic */ CryptoTransferUnifiedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiCurrencyPair> sharedFlow, CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$currencyPairFlow = sharedFlow;
                this.this$0 = cryptoTransferUnifiedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$currencyPairFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowTransformLatest = FlowKt.transformLatest(this.$currencyPairFlow, new C38424x561b4f52(null, this.this$0));
                        C507232 c507232 = new C507232(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTransformLatest, c507232, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    if (Throwables.isNetworkRelated(th)) {
                        this.this$0.submit(new CryptoTransferUnifiedDuxo2.Error(th));
                    } else {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferUnifiedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$2$2", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C507232 extends ContinuationImpl7 implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferUnifiedDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507232(CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, Continuation<? super C507232> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferUnifiedDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507232 c507232 = new C507232(this.this$0, continuation);
                    c507232.L$0 = obj;
                    return c507232;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferConfig cryptoTransferConfig, Continuation<? super Unit> continuation) {
                    return ((C507232) create(cryptoTransferConfig, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferUnifiedDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$2$2$1", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferUnifiedViewState, Continuation<? super CryptoTransferUnifiedViewState>, Object> {
                    final /* synthetic */ CryptoTransferConfig $config;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CryptoTransferConfig cryptoTransferConfig, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$config = cryptoTransferConfig;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$config, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferUnifiedViewState cryptoTransferUnifiedViewState, Continuation<? super CryptoTransferUnifiedViewState> continuation) {
                        return ((AnonymousClass1) create(cryptoTransferUnifiedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferUnifiedViewState.copy$default((CryptoTransferUnifiedViewState) this.L$0, null, null, false, this.$config, null, null, 55, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((CryptoTransferConfig) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoTransferUnifiedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$changeActivePageIndex$1", m3645f = "CryptoTransferUnifiedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo$changeActivePageIndex$1 */
    static final class C384261 extends ContinuationImpl7 implements Function2<CryptoTransferUnifiedViewState, Continuation<? super CryptoTransferUnifiedViewState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C384261(int i, Continuation<? super C384261> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C384261 c384261 = new C384261(this.$index, continuation);
            c384261.L$0 = obj;
            return c384261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferUnifiedViewState cryptoTransferUnifiedViewState, Continuation<? super CryptoTransferUnifiedViewState> continuation) {
            return ((C384261) create(cryptoTransferUnifiedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CryptoTransferUnifiedViewState) this.L$0).mutateWithPageIndex(this.$index);
        }
    }

    public final void changeActivePageIndex(int index) {
        applyMutation(new C384261(index, null));
    }

    /* compiled from: CryptoTransferUnifiedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedDuxo;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferUnifiedDuxo, CryptoTransferUnifiedFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferUnifiedFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferUnifiedFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferUnifiedFragment.Args getArgs(CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo) {
            return (CryptoTransferUnifiedFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferUnifiedDuxo);
        }
    }
}
