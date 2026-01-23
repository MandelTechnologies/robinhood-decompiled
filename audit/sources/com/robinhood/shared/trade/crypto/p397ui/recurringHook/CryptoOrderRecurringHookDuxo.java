package com.robinhood.shared.trade.crypto.p397ui.recurringHook;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookBottomSheet;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookEvent;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: CryptoOrderRecurringHookDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\"B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDataState;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookViewState;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookStateProvider;)V", "", "onCreate", "()V", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;", "frequency", "setSelectedFrequency", "(Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookFrequency;)V", "continueWithSelectedRecurringOption", "onContinueTapped", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderRecurringHookDuxo extends BaseDuxo3<CryptoOrderRecurringHookDataState, CryptoOrderRecurringHookViewState, CryptoOrderRecurringHookEvent> implements HasSavedState {
    private final AppType appType;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrderRecurringHookDuxo(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoOrderRecurringHookStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        boolean z = false;
        super(new CryptoOrderRecurringHookDataState(((CryptoOrderRecurringHookBottomSheet.Args) companion.getArgs(savedStateHandle)).getCurrency().getCode(), InvestFlowFrequency.INSTANCE.defaultInvestmentStartDate(clock), appType, z, CryptoOrderRecurringHookFrequency.INSTANCE.fromApiFrequency(((CryptoOrderRecurringHookBottomSheet.Args) companion.getArgs(savedStateHandle)).getFrequency()), 8, null), stateProvider, duxoBundle);
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C406631(null));
    }

    /* compiled from: CryptoOrderRecurringHookDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$onCreate$1", m3645f = "CryptoOrderRecurringHookDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$onCreate$1 */
    static final class C406631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406631(Continuation<? super C406631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderRecurringHookDuxo.this.new C406631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = CryptoOrderRecurringHookDuxo.this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderRecurringHookDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderRecurringHookDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$onCreate$1$1", m3645f = "CryptoOrderRecurringHookDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoOrderRecurringHookDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoOrderRecurringHookDuxo cryptoOrderRecurringHookDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderRecurringHookDuxo;
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

            /* compiled from: CryptoOrderRecurringHookDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$onCreate$1$1$1", m3645f = "CryptoOrderRecurringHookDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508041 extends ContinuationImpl7 implements Function2<CryptoOrderRecurringHookDataState, Continuation<? super CryptoOrderRecurringHookDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508041(boolean z, Continuation<? super C508041> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C508041 c508041 = new C508041(this.$it, continuation);
                    c508041.L$0 = obj;
                    return c508041;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoOrderRecurringHookDataState cryptoOrderRecurringHookDataState, Continuation<? super CryptoOrderRecurringHookDataState> continuation) {
                    return ((C508041) create(cryptoOrderRecurringHookDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoOrderRecurringHookDataState.copy$default((CryptoOrderRecurringHookDataState) this.L$0, null, null, null, this.$it, null, 23, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C508041(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoOrderRecurringHookDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$setSelectedFrequency$1", m3645f = "CryptoOrderRecurringHookDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$setSelectedFrequency$1 */
    static final class C406641 extends ContinuationImpl7 implements Function2<CryptoOrderRecurringHookDataState, Continuation<? super CryptoOrderRecurringHookDataState>, Object> {
        final /* synthetic */ CryptoOrderRecurringHookFrequency $frequency;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C406641(CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency, Continuation<? super C406641> continuation) {
            super(2, continuation);
            this.$frequency = cryptoOrderRecurringHookFrequency;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C406641 c406641 = new C406641(this.$frequency, continuation);
            c406641.L$0 = obj;
            return c406641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderRecurringHookDataState cryptoOrderRecurringHookDataState, Continuation<? super CryptoOrderRecurringHookDataState> continuation) {
            return ((C406641) create(cryptoOrderRecurringHookDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoOrderRecurringHookDataState.copy$default((CryptoOrderRecurringHookDataState) this.L$0, null, null, null, false, this.$frequency, 15, null);
        }
    }

    public final void setSelectedFrequency(CryptoOrderRecurringHookFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        applyMutation(new C406641(frequency, null));
    }

    public final void continueWithSelectedRecurringOption() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderRecurringHookDuxo.continueWithSelectedRecurringOption$lambda$0(this.f$0, (CryptoOrderRecurringHookDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueWithSelectedRecurringOption$lambda$0(CryptoOrderRecurringHookDuxo cryptoOrderRecurringHookDuxo, CryptoOrderRecurringHookDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoOrderRecurringHookDuxo.submit(new CryptoOrderRecurringHookEvent.ContinueWithSelectedRecurringOption(it.getSelectedFrequency().getApiFrequency(), it.getNextInvestmentDate()));
        return Unit.INSTANCE;
    }

    public final void onContinueTapped() {
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderRecurringHookDuxo.onContinueTapped$lambda$1(this.f$0, (CryptoOrderRecurringHookDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onContinueTapped$lambda$1(CryptoOrderRecurringHookDuxo cryptoOrderRecurringHookDuxo, CryptoOrderRecurringHookDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (cryptoOrderRecurringHookDuxo.appType == AppType.TRADER) {
            Companion companion = INSTANCE;
            if (((CryptoOrderRecurringHookBottomSheet.Args) companion.getArgs((HasSavedState) cryptoOrderRecurringHookDuxo)).getCryptoOrderMonetizationModel() instanceof CryptoOrderMonetizationModel.Fee) {
                CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequencyFromApiFrequency = CryptoOrderRecurringHookFrequency.INSTANCE.fromApiFrequency(((CryptoOrderRecurringHookBottomSheet.Args) companion.getArgs((HasSavedState) cryptoOrderRecurringHookDuxo)).getFrequency());
                CryptoOrderRecurringHookFrequency cryptoOrderRecurringHookFrequency = CryptoOrderRecurringHookFrequency.ONE_TIME;
                if (cryptoOrderRecurringHookFrequencyFromApiFrequency == cryptoOrderRecurringHookFrequency && it.getSelectedFrequency() != cryptoOrderRecurringHookFrequency && !it.m2899x225649c1()) {
                    cryptoOrderRecurringHookDuxo.submit(CryptoOrderRecurringHookEvent.ShowCryptoFeeUnsupportedRecurringAlert.INSTANCE);
                } else {
                    cryptoOrderRecurringHookDuxo.continueWithSelectedRecurringOption();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderRecurringHookDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoOrderRecurringHookDuxo, CryptoOrderRecurringHookBottomSheet.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderRecurringHookBottomSheet.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoOrderRecurringHookBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoOrderRecurringHookBottomSheet.Args getArgs(CryptoOrderRecurringHookDuxo cryptoOrderRecurringHookDuxo) {
            return (CryptoOrderRecurringHookBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoOrderRecurringHookDuxo);
        }
    }
}
