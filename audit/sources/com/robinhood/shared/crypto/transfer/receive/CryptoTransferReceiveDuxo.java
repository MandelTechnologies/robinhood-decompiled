package com.robinhood.shared.crypto.transfer.receive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveEvent;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
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

/* compiled from: CryptoTransferReceiveDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002 !B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveViewState;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo$InitArgs;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onNetworkSelected", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "markInitialSheetShown", "handleError", "t", "", "InitArgs", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferReceiveDuxo extends BaseDuxo3<CryptoTransferReceiveDataState, CryptoTransferReceiveViewState, CryptoTransferReceiveEvent> implements HasArgs<InitArgs> {
    private static final String HAS_SHOWN_INITIAL_SHEET = "has_shown_initial_sheet_receive";
    private final CryptoTransfersStore cryptoTransfersStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTransferReceiveDuxo(CurrencyPairV2Store currencyPairStore, CryptoTransfersStore cryptoTransfersStore, SavedStateHandle savedStateHandle, AppType appType, CryptoTransferReceiveStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        boolean z = appType == AppType.RHC;
        Boolean bool = (Boolean) savedStateHandle.get(HAS_SHOWN_INITIAL_SHEET);
        super(new CryptoTransferReceiveDataState(z, null, null, null, null, bool != null ? bool.booleanValue() : false, 30, null), stateProvider, duxoBundle);
        this.currencyPairStore = currencyPairStore;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C380511(null));
    }

    /* compiled from: CryptoTransferReceiveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1 */
    static final class C380511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C380511(Continuation<? super C380511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C380511 c380511 = CryptoTransferReceiveDuxo.this.new C380511(continuation);
            c380511.L$0 = obj;
            return c380511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C380511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoTransferReceiveDuxo.this.currencyPairStore.streamCurrencyPairFlow(((InitArgs) CryptoTransferReceiveDuxo.INSTANCE.getArgs((HasArgs) CryptoTransferReceiveDuxo.this)).getCurrencyPairId());
                LifecycleHostCoroutineScope lifecycleScope = CryptoTransferReceiveDuxo.this.getLifecycleScope();
                SharingStarted.Companion companion = SharingStarted.INSTANCE;
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(flowStreamCurrencyPairFlow, lifecycleScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                SharedFlow sharedFlowShareIn2 = FlowKt.shareIn(FlowKt.transformLatest(sharedFlowShareIn, new C38049xe4c1cab1(null, CryptoTransferReceiveDuxo.this)), CryptoTransferReceiveDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, CryptoTransferReceiveDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn2, CryptoTransferReceiveDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn, sharedFlowShareIn2, CryptoTransferReceiveDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoTransferReceiveDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiCurrencyPair> $currencyPairFlow;
            int label;
            final /* synthetic */ CryptoTransferReceiveDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiCurrencyPair> sharedFlow, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currencyPairFlow = sharedFlow;
                this.this$0 = cryptoTransferReceiveDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$currencyPairFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<UiCurrencyPair> sharedFlow = this.$currencyPairFlow;
                        C507021 c507021 = new C507021(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(sharedFlow, c507021, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferReceiveDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$1$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507021 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferReceiveDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507021(CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Continuation<? super C507021> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferReceiveDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507021 c507021 = new C507021(this.this$0, continuation);
                    c507021.L$0 = obj;
                    return c507021;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((C507021) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferReceiveDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$1$1$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507031 extends ContinuationImpl7 implements Function2<CryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $uiCurrencyPair;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507031(UiCurrencyPair uiCurrencyPair, Continuation<? super C507031> continuation) {
                        super(2, continuation);
                        this.$uiCurrencyPair = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507031 c507031 = new C507031(this.$uiCurrencyPair, continuation);
                        c507031.L$0 = obj;
                        return c507031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferReceiveDataState cryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState> continuation) {
                        return ((C507031) create(cryptoTransferReceiveDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferReceiveDataState.copy$default((CryptoTransferReceiveDataState) this.L$0, false, null, this.$uiCurrencyPair, null, null, false, 59, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507031((UiCurrencyPair) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoTransferReceiveDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$2", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<CryptoTransferConfig> $configFlow;
            int label;
            final /* synthetic */ CryptoTransferReceiveDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<CryptoTransferConfig> sharedFlow, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$configFlow = sharedFlow;
                this.this$0 = cryptoTransferReceiveDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$configFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<CryptoTransferConfig> sharedFlow = this.$configFlow;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferReceiveDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$2$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferReceiveDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferReceiveDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferConfig cryptoTransferConfig, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(cryptoTransferConfig, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferReceiveDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$2$1$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507041 extends ContinuationImpl7 implements Function2<CryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState>, Object> {
                    final /* synthetic */ CryptoTransferConfig $config;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507041(CryptoTransferConfig cryptoTransferConfig, Continuation<? super C507041> continuation) {
                        super(2, continuation);
                        this.$config = cryptoTransferConfig;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507041 c507041 = new C507041(this.$config, continuation);
                        c507041.L$0 = obj;
                        return c507041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferReceiveDataState cryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState> continuation) {
                        return ((C507041) create(cryptoTransferReceiveDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferReceiveDataState.copy$default((CryptoTransferReceiveDataState) this.L$0, false, null, null, this.$config, null, false, 55, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507041((CryptoTransferConfig) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoTransferReceiveDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {98}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<CryptoTransferConfig> $configFlow;
            final /* synthetic */ SharedFlow<UiCurrencyPair> $currencyPairFlow;
            int label;
            final /* synthetic */ CryptoTransferReceiveDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<UiCurrencyPair> sharedFlow, SharedFlow<CryptoTransferConfig> sharedFlow2, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$currencyPairFlow = sharedFlow;
                this.$configFlow = sharedFlow2;
                this.this$0 = cryptoTransferReceiveDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$currencyPairFlow, this.$configFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final Flow flowCombine = Operators.combine(this.$currencyPairFlow, this.$configFlow);
                        final CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo = this.this$0;
                        Flow<ApiCryptoTransferDepositDetails> flow = new Flow<ApiCryptoTransferDepositDetails>() { // from class: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$invokeSuspend$$inlined$map$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;
                                final /* synthetic */ CryptoTransferReceiveDuxo this$0;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {52, 50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                                public AnonymousClass2(FlowCollector flowCollector, CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo) {
                                    this.$this_unsafeFlow = flowCollector;
                                    this.this$0 = cryptoTransferReceiveDuxo;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
                                
                                    if (r10.emit(r9, r0) != r1) goto L27;
                                 */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                /* JADX WARN: Type inference failed for: r10v6, types: [com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails] */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    FlowCollector flowCollector;
                                    T t;
                                    FlowCollector flowCollector2;
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
                                        flowCollector = this.$this_unsafeFlow;
                                        Tuples2 tuples2 = (Tuples2) obj;
                                        UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) tuples2.component1();
                                        if (((CryptoTransferConfig) tuples2.component2()).getReceiveState() == ApiCryptoTransferConfig.TransferStates.ReceiveState.RECEIVE) {
                                            CryptoTransfersStore cryptoTransfersStore = this.this$0.cryptoTransfersStore;
                                            String apiCode = uiCurrencyPair.getAssetCurrency().getApiCode();
                                            anonymousClass1.L$0 = flowCollector;
                                            anonymousClass1.label = 1;
                                            Object depositDetails = cryptoTransfersStore.getDepositDetails(apiCode, anonymousClass1);
                                            if (depositDetails != coroutine_suspended) {
                                                obj2 = depositDetails;
                                                flowCollector2 = flowCollector;
                                            }
                                            return coroutine_suspended;
                                        }
                                        t = null;
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.label = 2;
                                    } else {
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                            return Unit.INSTANCE;
                                        }
                                        flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    ?? r10 = (ApiCryptoTransferDepositDetails) obj2;
                                    flowCollector = flowCollector2;
                                    t = r10;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.label = 2;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super ApiCryptoTransferDepositDetails> flowCollector, Continuation continuation) {
                                Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector, cryptoTransferReceiveDuxo), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }
                        };
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.this$0.handleError(th);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferReceiveDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "depositDetails", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$2", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ApiCryptoTransferDepositDetails, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferReceiveDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferReceiveDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(apiCryptoTransferDepositDetails, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferReceiveDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$2$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onCreate$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState>, Object> {
                    final /* synthetic */ ApiCryptoTransferDepositDetails $depositDetails;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ApiCryptoTransferDepositDetails apiCryptoTransferDepositDetails, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$depositDetails = apiCryptoTransferDepositDetails;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$depositDetails, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferReceiveDataState cryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoTransferReceiveDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferReceiveDataState.copy$default((CryptoTransferReceiveDataState) this.L$0, false, null, null, null, this.$depositDetails, false, 47, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ApiCryptoTransferDepositDetails) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoTransferReceiveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onNetworkSelected$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$onNetworkSelected$1 */
    static final class C380521 extends ContinuationImpl7 implements Function2<CryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C380521(int i, Continuation<? super C380521> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C380521 c380521 = new C380521(this.$index, continuation);
            c380521.L$0 = obj;
            return c380521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferReceiveDataState cryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState> continuation) {
            return ((C380521) create(cryptoTransferReceiveDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferReceiveDataState.copy$default((CryptoTransferReceiveDataState) this.L$0, false, boxing.boxInt(this.$index), null, null, null, false, 61, null);
        }
    }

    public final void onNetworkSelected(int index) {
        applyMutation(new C380521(index, null));
    }

    /* compiled from: CryptoTransferReceiveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$markInitialSheetShown$1", m3645f = "CryptoTransferReceiveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveDuxo$markInitialSheetShown$1 */
    static final class C380501 extends ContinuationImpl7 implements Function2<CryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C380501(Continuation<? super C380501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C380501 c380501 = new C380501(continuation);
            c380501.L$0 = obj;
            return c380501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferReceiveDataState cryptoTransferReceiveDataState, Continuation<? super CryptoTransferReceiveDataState> continuation) {
            return ((C380501) create(cryptoTransferReceiveDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferReceiveDataState.copy$default((CryptoTransferReceiveDataState) this.L$0, false, null, null, null, null, true, 31, null);
        }
    }

    public final void markInitialSheetShown() {
        getSavedStateHandle().set(HAS_SHOWN_INITIAL_SHEET, Boolean.TRUE);
        applyMutation(new C380501(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            submit(new CryptoTransferReceiveEvent.Error(t));
            return;
        }
        throw t;
    }

    /* compiled from: CryptoTransferReceiveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo$InitArgs;", "Landroid/os/Parcelable;", "loggingSessionId", "Ljava/util/UUID;", "currencyPairId", "initialAction", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/transfer/CryptoTransferAction;)V", "getLoggingSessionId", "()Ljava/util/UUID;", "getCurrencyPairId", "getInitialAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final CryptoTransferAction initialAction;
        private final UUID loggingSessionId;

        /* compiled from: CryptoTransferReceiveDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), CryptoTransferAction.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, UUID uuid2, CryptoTransferAction cryptoTransferAction, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.loggingSessionId;
            }
            if ((i & 2) != 0) {
                uuid2 = initArgs.currencyPairId;
            }
            if ((i & 4) != 0) {
                cryptoTransferAction = initArgs.initialAction;
            }
            return initArgs.copy(uuid, uuid2, cryptoTransferAction);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoTransferAction getInitialAction() {
            return this.initialAction;
        }

        public final InitArgs copy(UUID loggingSessionId, UUID currencyPairId, CryptoTransferAction initialAction) {
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(initialAction, "initialAction");
            return new InitArgs(loggingSessionId, currencyPairId, initialAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.loggingSessionId, initArgs.loggingSessionId) && Intrinsics.areEqual(this.currencyPairId, initArgs.currencyPairId) && this.initialAction == initArgs.initialAction;
        }

        public int hashCode() {
            return (((this.loggingSessionId.hashCode() * 31) + this.currencyPairId.hashCode()) * 31) + this.initialAction.hashCode();
        }

        public String toString() {
            return "InitArgs(loggingSessionId=" + this.loggingSessionId + ", currencyPairId=" + this.currencyPairId + ", initialAction=" + this.initialAction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.loggingSessionId);
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.initialAction.name());
        }

        public InitArgs(UUID loggingSessionId, UUID currencyPairId, CryptoTransferAction initialAction) {
            Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(initialAction, "initialAction");
            this.loggingSessionId = loggingSessionId;
            this.currencyPairId = currencyPairId;
            this.initialAction = initialAction;
        }

        public final UUID getLoggingSessionId() {
            return this.loggingSessionId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final CryptoTransferAction getInitialAction() {
            return this.initialAction;
        }
    }

    /* compiled from: CryptoTransferReceiveDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo;", "Lcom/robinhood/shared/crypto/transfer/receive/CryptoTransferReceiveDuxo$InitArgs;", "<init>", "()V", "HAS_SHOWN_INITIAL_SHEET", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoTransferReceiveDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(CryptoTransferReceiveDuxo cryptoTransferReceiveDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoTransferReceiveDuxo);
        }
    }
}
