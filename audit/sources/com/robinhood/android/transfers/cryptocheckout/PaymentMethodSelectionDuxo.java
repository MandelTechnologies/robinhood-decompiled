package com.robinhood.android.transfers.cryptocheckout;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BillingAccountDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.transfers.contracts.CryptoCheckoutPaymentMethodSelectionKey;
import com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionEvent;
import com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService;
import contracts.money_movement.crypto_account_selection.proto.p432v1.DidSelectAccountRequestDto;
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
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: PaymentMethodSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006:\u0001)BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020(R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDataState;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent;", "Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService$Callbacks;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/microgramsdui/MicrogramManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getMicrogramInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "accountSelectionService", "Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService;", "getAccountSelectionService", "()Lcom/robinhood/android/transfers/cryptocheckout/service/RealCryptoAccountSelectionService;", "onCreate", "", "onAccountSelected", "request", "Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;", "onAddAccountRequested", "rhsAccountNumber", "", "Companion", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PaymentMethodSelectionDuxo extends BaseDuxo3<PaymentMethodSelectionDataState, PaymentMethodSelectionViewState, PaymentMethodSelectionEvent> implements HasSavedState, RealCryptoAccountSelectionService.Callbacks {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final MicrogramManager microgramManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodSelectionDuxo(CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, MicrogramManager microgramManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, PaymentMethodSelectionStateProvider stateProvider) {
        super(new PaymentMethodSelectionDataState(false, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.microgramManager = microgramManager;
        this.savedStateHandle = savedStateHandle;
    }

    private final MicrogramManager2 getMicrogramInstance() {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication(PaymentMethodSelectionDuxo2.MICROGRAM_APP_ID, null, 2, null), null, 2, null), null, 4, null);
    }

    private final RealCryptoAccountSelectionService getAccountSelectionService() {
        Object hostImplementation = getMicrogramInstance().getComponent().getServiceLocator().getHostImplementation(CryptoAccountSelectionManagedService.class);
        Intrinsics.checkNotNull(hostImplementation, "null cannot be cast to non-null type com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService");
        return (RealCryptoAccountSelectionService) hostImplementation;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getAccountSelectionService().setCallbacks(this);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C302411(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C302422(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C302433(null));
    }

    /* compiled from: PaymentMethodSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$1 */
    static final class C302411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302411(Continuation<? super C302411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodSelectionDuxo.this.new C302411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoMibExperiment = PaymentMethodSelectionDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PaymentMethodSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoMibExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PaymentMethodSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$1$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PaymentMethodSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaymentMethodSelectionDuxo paymentMethodSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = paymentMethodSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PaymentMethodSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$1$1$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505941 extends ContinuationImpl7 implements Function2<PaymentMethodSelectionDataState, Continuation<? super PaymentMethodSelectionDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505941(boolean z, Continuation<? super C505941> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505941 c505941 = new C505941(this.$it, continuation);
                    c505941.L$0 = obj;
                    return c505941;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentMethodSelectionDataState paymentMethodSelectionDataState, Continuation<? super PaymentMethodSelectionDataState> continuation) {
                    return ((C505941) create(paymentMethodSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PaymentMethodSelectionDataState.copy$default((PaymentMethodSelectionDataState) this.L$0, this.$it, null, null, 6, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C505941(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PaymentMethodSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$2", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$2 */
    static final class C302422 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302422(Continuation<? super C302422> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodSelectionDuxo.this.new C302422(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(PaymentMethodSelectionDuxo.this.cryptoCurrencyPairAccountSwitcherStore.getAccountSwitcherForCurrencyPairQuery().asFlow(((CryptoCheckoutPaymentMethodSelectionKey) PaymentMethodSelectionDuxo.INSTANCE.getArgs((HasSavedState) PaymentMethodSelectionDuxo.this)).getCurrencyPairId()), PaymentMethodSelectionDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PaymentMethodSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PaymentMethodSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$2$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCurrencyPairAccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaymentMethodSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaymentMethodSelectionDuxo paymentMethodSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = paymentMethodSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoCurrencyPairAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PaymentMethodSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$2$1$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505951 extends ContinuationImpl7 implements Function2<PaymentMethodSelectionDataState, Continuation<? super PaymentMethodSelectionDataState>, Object> {
                final /* synthetic */ CryptoCurrencyPairAccountSwitcher $accountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505951(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, Continuation<? super C505951> continuation) {
                    super(2, continuation);
                    this.$accountSwitcher = cryptoCurrencyPairAccountSwitcher;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505951 c505951 = new C505951(this.$accountSwitcher, continuation);
                    c505951.L$0 = obj;
                    return c505951;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentMethodSelectionDataState paymentMethodSelectionDataState, Continuation<? super PaymentMethodSelectionDataState> continuation) {
                    return ((C505951) create(paymentMethodSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PaymentMethodSelectionDataState.copy$default((PaymentMethodSelectionDataState) this.L$0, false, this.$accountSwitcher, null, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C505951((CryptoCurrencyPairAccountSwitcher) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PaymentMethodSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$3", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$3 */
    static final class C302433 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C302433(Continuation<? super C302433> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodSelectionDuxo.this.new C302433(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C302433) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(PaymentMethodSelectionDuxo.this.cryptoAccountProvider.streamAccountNumber(CryptoAccountSwitcherLocation.PaymentSelection.INSTANCE), PaymentMethodSelectionDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PaymentMethodSelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PaymentMethodSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$3$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaymentMethodSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaymentMethodSelectionDuxo paymentMethodSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = paymentMethodSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PaymentMethodSelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$3$1$1", m3645f = "PaymentMethodSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505961 extends ContinuationImpl7 implements Function2<PaymentMethodSelectionDataState, Continuation<? super PaymentMethodSelectionDataState>, Object> {
                final /* synthetic */ String $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505961(String str, Continuation<? super C505961> continuation) {
                    super(2, continuation);
                    this.$it = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505961 c505961 = new C505961(this.$it, continuation);
                    c505961.L$0 = obj;
                    return c505961;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PaymentMethodSelectionDataState paymentMethodSelectionDataState, Continuation<? super PaymentMethodSelectionDataState> continuation) {
                    return ((C505961) create(paymentMethodSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PaymentMethodSelectionDataState.copy$default((PaymentMethodSelectionDataState) this.L$0, false, null, this.$it, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C505961((String) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService.Callbacks
    public void onAccountSelected(DidSelectAccountRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        BillingAccountDto account = request.getAccount();
        if (account != null) {
            submit(new PaymentMethodSelectionEvent.AccountSelected(account));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionService.Callbacks
    public void onAddAccountRequested() {
        submit(PaymentMethodSelectionEvent.AddAccount.INSTANCE);
    }

    public final void onAccountSelected(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        this.cryptoAccountProvider.mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation.PaymentSelection.INSTANCE, rhsAccountNumber);
    }

    /* compiled from: PaymentMethodSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo;", "Lcom/robinhood/android/transfers/contracts/CryptoCheckoutPaymentMethodSelectionKey;", "<init>", "()V", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaymentMethodSelectionDuxo, CryptoCheckoutPaymentMethodSelectionKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoCheckoutPaymentMethodSelectionKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoCheckoutPaymentMethodSelectionKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoCheckoutPaymentMethodSelectionKey getArgs(PaymentMethodSelectionDuxo paymentMethodSelectionDuxo) {
            return (CryptoCheckoutPaymentMethodSelectionKey) DuxoCompanion.DefaultImpls.getArgs(this, paymentMethodSelectionDuxo);
        }
    }
}
