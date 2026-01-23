package com.robinhood.shared.crypto.transfer.unified;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentEvent;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentFragment;
import com.robinhood.shared.formats.crypto.UiCurrencyPairs3;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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

/* compiled from: CryptoTransferUnifiedParentDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0013\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "startInitialNavigation", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferUnifiedParentDuxo extends BaseDuxo5<Unit, CryptoTransferUnifiedParentEvent> implements HasSavedState {
    private final CryptoExperimentsStore cryptoExperimentsStore;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferUnifiedParentDuxo(SavedStateHandle savedStateHandle, CryptoTransfersStore cryptoTransfersStore, CurrencyPairV2Store currencyPairStore, CryptoExperimentsStore cryptoExperimentsStore, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    /* compiled from: CryptoTransferUnifiedParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1", m3645f = "CryptoTransferUnifiedParentDuxo.kt", m3646l = {41, 57}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1 */
    static final class C384401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C384401(Continuation<? super C384401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferUnifiedParentDuxo.this.new C384401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C384401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000e, B:12:0x001e, B:18:0x0038, B:20:0x003c, B:23:0x0044, B:25:0x0056, B:28:0x008d, B:15:0x0025), top: B:36:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    CryptoTransferUnifiedParentDuxo.this.submit(new CryptoTransferUnifiedParentEvent.Error(th));
                } else {
                    throw th;
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoTransfersSavedAddressesExperiment = CryptoTransferUnifiedParentDuxo.this.cryptoExperimentsStore.streamCryptoTransfersSavedAddressesExperiment();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamCryptoTransfersSavedAddressesExperiment, this);
                if (obj == coroutine_suspended) {
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
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (zBooleanValue) {
                Companion companion = CryptoTransferUnifiedParentDuxo.INSTANCE;
                if (((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((HasSavedState) CryptoTransferUnifiedParentDuxo.this)).getAction() == CryptoTransferAction.SEND) {
                    final Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoTransferUnifiedParentDuxo.this.currencyPairStore.streamCurrencyPairFlow(((CryptoTransferUnifiedParentFragment.Args) companion.getArgs((HasSavedState) CryptoTransferUnifiedParentDuxo.this)).getCurrencyPairId());
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<UiCurrencyPair>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoTransferUnifiedParentDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                    }, new C38437x2416a3cf(null, CryptoTransferUnifiedParentDuxo.this));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoTransferUnifiedParentDuxo.this, null);
                    this.label = 2;
                } else {
                    CryptoTransferUnifiedParentDuxo.this.submit(new CryptoTransferUnifiedParentEvent.Navigate.Unified(zBooleanValue));
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoTransferUnifiedParentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1$3", m3645f = "CryptoTransferUnifiedParentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedParentDuxo$startInitialNavigation$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiCurrencyPair, ? extends CryptoTransferConfig>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTransferUnifiedParentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTransferUnifiedParentDuxo cryptoTransferUnifiedParentDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferUnifiedParentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiCurrencyPair, ? extends CryptoTransferConfig> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<UiCurrencyPair, CryptoTransferConfig>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<UiCurrencyPair, CryptoTransferConfig> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CryptoTransferConfig.TransferWarnings.Stage send;
                CryptoTransferConfig.TransferWarnings.Stage send2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) tuples2.component1();
                CryptoTransferConfig cryptoTransferConfig = (CryptoTransferConfig) tuples2.component2();
                if (cryptoTransferConfig.getSendState() == ApiCryptoTransferConfig.TransferStates.SendState.SEND) {
                    CryptoTransferUnifiedParentDuxo cryptoTransferUnifiedParentDuxo = this.this$0;
                    CryptoTransferConfig.TransferWarnings transferWarnings = cryptoTransferConfig.getTransferWarnings();
                    CryptoTransferConfig.TransferWarnings.Stage.Warning initial = null;
                    CryptoTransferConfig.TransferWarnings.Stage.Warning warning = (transferWarnings == null || (send2 = transferWarnings.getSend()) == null) ? null : send2.getFinal();
                    CryptoTransferConfig.TransferWarnings transferWarnings2 = cryptoTransferConfig.getTransferWarnings();
                    if (transferWarnings2 != null && (send = transferWarnings2.getSend()) != null) {
                        initial = send.getInitial();
                    }
                    cryptoTransferUnifiedParentDuxo.submit(new CryptoTransferUnifiedParentEvent.Navigate.AddressEntry(uiCurrencyPair, initial, warning, cryptoTransferConfig.getAddressTag(), cryptoTransferConfig.getMaxAddressLength(), true));
                } else {
                    this.this$0.submit(new CryptoTransferUnifiedParentEvent.Navigate.Unified(true));
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void startInitialNavigation() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C384401(null), 3, null);
    }

    /* compiled from: CryptoTransferUnifiedParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentDuxo;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedParentFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferUnifiedParentDuxo, CryptoTransferUnifiedParentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferUnifiedParentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferUnifiedParentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferUnifiedParentFragment.Args getArgs(CryptoTransferUnifiedParentDuxo cryptoTransferUnifiedParentDuxo) {
            return (CryptoTransferUnifiedParentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferUnifiedParentDuxo);
        }
    }
}
