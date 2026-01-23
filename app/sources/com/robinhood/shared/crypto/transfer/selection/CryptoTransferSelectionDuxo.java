package com.robinhood.shared.crypto.transfer.selection;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferConfig;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferOptions;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.shared.crypto.contracts.CryptoTransferSelectionIntentKey;
import com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo5;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoTransferSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDataState;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionViewState;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "transfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "accountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onCreate", "", "updateQuery", "newQuery", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSelectionDuxo extends BaseDuxo3<CryptoTransferSelectionDataState, CryptoTransferSelectionViewState, CryptoTransferSelectionDuxo5> implements HasSavedState {
    private final StateFlow2<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final CryptoTransfersStore transfersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTransferSelectionDuxo(CryptoTransferSelectionDuxo6 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AccountProvider accountProvider, CryptoTransfersStore transfersStore) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(transfersStore, "transfersStore");
        Companion companion = INSTANCE;
        CryptoTransferIntentKey.Action action = ((CryptoTransferSelectionIntentKey) companion.getExtras(savedStateHandle)).getAction();
        super(new CryptoTransferSelectionDataState(null, ((CryptoTransferSelectionIntentKey) companion.getExtras(savedStateHandle)).getCheckForUpsell(), action != null ? CryptoTransferSelectionDuxo3.getLocalAction(action) : null, null, null, 1, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.transfersStore = transfersStore;
        this.accountNumberFlow = StateFlow4.MutableStateFlow(((CryptoTransferSelectionIntentKey) companion.getExtras((HasSavedState) this)).getAccountNumber());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C380771(null));
    }

    /* compiled from: CryptoTransferSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1 */
    static final class C380771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C380771(Continuation<? super C380771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C380771 c380771 = CryptoTransferSelectionDuxo.this.new C380771(continuation);
            c380771.L$0 = obj;
            return c380771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C380771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTransferSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$1", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSelectionDuxo;
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
                    Observable<Account> observableStreamIndividualAccount = this.this$0.accountProvider.streamIndividualAccount();
                    final C507051 c507051 = new PropertyReference1Impl() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo.onCreate.1.1.1
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                        public Object get(Object obj2) {
                            return ((Account) obj2).getAccountNumber();
                        }
                    };
                    ObservableSource map = observableStreamIndividualAccount.map(new Function(c507051) { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxoKt$sam$io_reactivex_functions_Function$0
                        private final /* synthetic */ Function1 function;

                        {
                            Intrinsics.checkNotNullParameter(c507051, "function");
                            this.function = c507051;
                        }

                        @Override // io.reactivex.functions.Function
                        public final /* synthetic */ Object apply(Object obj2) {
                            return this.function.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: CryptoTransferSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$1$2", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSelectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSelectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        String str = (String) this.L$0;
                        StateFlow2 stateFlow2 = this.this$0.accountNumberFlow;
                        this.label = 1;
                        if (stateFlow2.emit(str, this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoTransferSelectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoTransferSelectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoTransferSelectionDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoTransferSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$2", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                boolean zIsNetworkRelated;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CryptoTransfersStore cryptoTransfersStore = this.this$0.transfersStore;
                        CryptoTransferAction cryptoTransferAction = CryptoTransferAction.SEARCH;
                        this.label = 1;
                        obj = cryptoTransfersStore.fetchTransferConfigCo(null, cryptoTransferAction, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CryptoTransferConfig cryptoTransferConfig = (CryptoTransferConfig) obj;
                    this.this$0.applyMutation(new AnonymousClass1(cryptoTransferConfig, null));
                    Companion companion = CryptoTransferSelectionDuxo.INSTANCE;
                    if (((CryptoTransferSelectionIntentKey) companion.getExtras((HasSavedState) this.this$0)).getAction() == CryptoTransferIntentKey.Action.ENROLL || ((((CryptoTransferSelectionIntentKey) companion.getExtras((HasSavedState) this.this$0)).getAction() == CryptoTransferIntentKey.Action.RECEIVE && cryptoTransferConfig.getReceiveState() == ApiCryptoTransferConfig.TransferStates.ReceiveState.ENROLLMENT) || (((CryptoTransferSelectionIntentKey) companion.getExtras((HasSavedState) this.this$0)).getAction() == CryptoTransferIntentKey.Action.SEND && cryptoTransferConfig.getSendState() == ApiCryptoTransferConfig.TransferStates.SendState.ENROLLMENT))) {
                        this.this$0.submit(CryptoTransferSelectionDuxo5.NeedsEnrollment.INSTANCE);
                    }
                } finally {
                    if (!zIsNetworkRelated) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$2$1", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferSelectionDataState, Continuation<? super CryptoTransferSelectionDataState>, Object> {
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
                public final Object invoke(CryptoTransferSelectionDataState cryptoTransferSelectionDataState, Continuation<? super CryptoTransferSelectionDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoTransferSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTransferSelectionDataState.copy$default((CryptoTransferSelectionDataState) this.L$0, null, false, null, this.$config, null, 23, null);
                }
            }
        }

        /* compiled from: CryptoTransferSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$3", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoTransferSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTransferSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                boolean zIsNetworkRelated;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.accountNumberFlow), new C38076x46e4ed2b(null, this.this$0));
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } finally {
                    if (!zIsNetworkRelated) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoTransferSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$3$2", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoTransferOptions, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoTransferSelectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoTransferSelectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTransferOptions cryptoTransferOptions, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(cryptoTransferOptions, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoTransferSelectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$3$2$1", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$onCreate$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTransferSelectionDataState, Continuation<? super CryptoTransferSelectionDataState>, Object> {
                    final /* synthetic */ CryptoTransferOptions $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CryptoTransferOptions cryptoTransferOptions, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = cryptoTransferOptions;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoTransferSelectionDataState cryptoTransferSelectionDataState, Continuation<? super CryptoTransferSelectionDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoTransferSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoTransferSelectionDataState.copy$default((CryptoTransferSelectionDataState) this.L$0, null, false, null, null, this.$it, 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((CryptoTransferOptions) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoTransferSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$updateQuery$1", m3645f = "CryptoTransferSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionDuxo$updateQuery$1 */
    static final class C380781 extends ContinuationImpl7 implements Function2<CryptoTransferSelectionDataState, Continuation<? super CryptoTransferSelectionDataState>, Object> {
        final /* synthetic */ String $newQuery;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C380781(String str, Continuation<? super C380781> continuation) {
            super(2, continuation);
            this.$newQuery = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C380781 c380781 = new C380781(this.$newQuery, continuation);
            c380781.L$0 = obj;
            return c380781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSelectionDataState cryptoTransferSelectionDataState, Continuation<? super CryptoTransferSelectionDataState> continuation) {
            return ((C380781) create(cryptoTransferSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSelectionDataState.copy$default((CryptoTransferSelectionDataState) this.L$0, StringsKt.trim(this.$newQuery).toString(), false, null, null, null, 30, null);
        }
    }

    public final void updateQuery(String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        applyMutation(new C380781(newQuery, null));
    }

    /* compiled from: CryptoTransferSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDuxo;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferSelectionIntentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<CryptoTransferSelectionDuxo, CryptoTransferSelectionIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoTransferSelectionIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (CryptoTransferSelectionIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoTransferSelectionIntentKey getExtras(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo) {
            return (CryptoTransferSelectionIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, cryptoTransferSelectionDuxo);
        }
    }
}
