package com.robinhood.shared.crypto.transfer.send.address.manage;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.contracts.transfers.CryptoAddSavedAddressFragmentKey;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoAddSavedAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDataState;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoAddSavedAddressFragmentKey;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoAddSavedAddressDuxo extends BaseDuxo3<CryptoAddSavedAddressDataState, CryptoAddSavedAddressViewState, CryptoAddSavedAddressDuxo2> implements HasArgs<CryptoAddSavedAddressFragmentKey> {
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CurrencyPairV2Store currencyPairV2Store;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoAddSavedAddressFragmentKey getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoAddSavedAddressFragmentKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAddSavedAddressDuxo(SavedStateHandle savedStateHandle, CurrencyPairV2Store currencyPairV2Store, CryptoTransfersStore cryptoTransfersStore, CryptoAddSavedAddressStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoAddSavedAddressDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.currencyPairV2Store = currencyPairV2Store;
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C381841(null));
    }

    /* compiled from: CryptoAddSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1", m3645f = "CryptoAddSavedAddressDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1 */
    static final class C381841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C381841(Continuation<? super C381841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoAddSavedAddressDuxo.this.new C381841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C381841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(CryptoAddSavedAddressDuxo.this.currencyPairV2Store.streamCurrencyPairFlow(((CryptoAddSavedAddressFragmentKey) CryptoAddSavedAddressDuxo.INSTANCE.getArgs((HasArgs) CryptoAddSavedAddressDuxo.this)).getCurrencyPairId()), new AnonymousClass1(CryptoAddSavedAddressDuxo.this, null)), new C38183x9ab73467(null, CryptoAddSavedAddressDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoAddSavedAddressDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CryptoAddSavedAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$1", m3645f = "CryptoAddSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoAddSavedAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoAddSavedAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoAddSavedAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$1$1", m3645f = "CryptoAddSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507111 extends ContinuationImpl7 implements Function2<CryptoAddSavedAddressDataState, Continuation<? super CryptoAddSavedAddressDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507111(UiCurrencyPair uiCurrencyPair, Continuation<? super C507111> continuation) {
                    super(2, continuation);
                    this.$it = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507111 c507111 = new C507111(this.$it, continuation);
                    c507111.L$0 = obj;
                    return c507111;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoAddSavedAddressDataState cryptoAddSavedAddressDataState, Continuation<? super CryptoAddSavedAddressDataState> continuation) {
                    return ((C507111) create(cryptoAddSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoAddSavedAddressDataState.copy$default((CryptoAddSavedAddressDataState) this.L$0, this.$it, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507111((UiCurrencyPair) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: CryptoAddSavedAddressDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$3", m3645f = "CryptoAddSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoAddSavedAddressDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoAddSavedAddressDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTransferConfig cryptoTransferConfig, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(cryptoTransferConfig, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoAddSavedAddressDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$3$1", m3645f = "CryptoAddSavedAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoAddSavedAddressDataState, Continuation<? super CryptoAddSavedAddressDataState>, Object> {
                final /* synthetic */ CryptoTransferConfig $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTransferConfig cryptoTransferConfig, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = cryptoTransferConfig;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoAddSavedAddressDataState cryptoAddSavedAddressDataState, Continuation<? super CryptoAddSavedAddressDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoAddSavedAddressDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoAddSavedAddressDataState.copy$default((CryptoAddSavedAddressDataState) this.L$0, null, this.$it, 1, null);
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

    /* compiled from: CryptoAddSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDuxo;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoAddSavedAddressFragmentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoAddSavedAddressDuxo, CryptoAddSavedAddressFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoAddSavedAddressFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoAddSavedAddressFragmentKey) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoAddSavedAddressFragmentKey getArgs(CryptoAddSavedAddressDuxo cryptoAddSavedAddressDuxo) {
            return (CryptoAddSavedAddressFragmentKey) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoAddSavedAddressDuxo);
        }
    }
}
