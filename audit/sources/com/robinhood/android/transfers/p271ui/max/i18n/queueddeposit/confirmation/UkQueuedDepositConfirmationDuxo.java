package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: UkQueuedDepositConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UkQueuedDepositConfirmationDuxo extends BaseDuxo<UkQueuedDepositConfirmationDataState, UkQueuedDepositConfirmationViewState> implements HasSavedState {
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UkQueuedDepositConfirmationDuxo(PaymentInstrumentStore paymentInstrumentStore, SavedStateHandle savedStateHandle, UkQueuedDepositConfirmationStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new UkQueuedDepositConfirmationDataState(((UkQueuedDepositConfirmationFragment.Args) INSTANCE.getArgs(savedStateHandle)).getPostTransferPage(), null, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: UkQueuedDepositConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationDuxo$onStart$1", m3645f = "UkQueuedDepositConfirmationDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationDuxo$onStart$1 */
    static final class C308511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308511(Continuation<? super C308511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkQueuedDepositConfirmationDuxo.this.new C308511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PaymentInstrumentV2> flowPoll = UkQueuedDepositConfirmationDuxo.this.paymentInstrumentStore.poll(PaymentInstrumentType.UK_BANK_ACCOUNT, ((UkQueuedDepositConfirmationFragment.Args) UkQueuedDepositConfirmationDuxo.INSTANCE.getArgs((HasSavedState) UkQueuedDepositConfirmationDuxo.this)).getPostTransferPage().getInstrumentId());
                UkQueuedDepositConfirmationDuxo2 ukQueuedDepositConfirmationDuxo2 = new UkQueuedDepositConfirmationDuxo2(null);
                this.label = 1;
                obj = FlowKt.first(flowPoll, ukQueuedDepositConfirmationDuxo2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UkQueuedDepositConfirmationDuxo.this.applyMutation(new AnonymousClass1((PaymentInstrumentV2) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: UkQueuedDepositConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationDuxo$onStart$1$1", m3645f = "UkQueuedDepositConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UkQueuedDepositConfirmationDataState, Continuation<? super UkQueuedDepositConfirmationDataState>, Object> {
            final /* synthetic */ PaymentInstrumentV2 $instrument;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaymentInstrumentV2 paymentInstrumentV2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$instrument = paymentInstrumentV2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrument, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UkQueuedDepositConfirmationDataState ukQueuedDepositConfirmationDataState, Continuation<? super UkQueuedDepositConfirmationDataState> continuation) {
                return ((AnonymousClass1) create(ukQueuedDepositConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UkQueuedDepositConfirmationDataState.copy$default((UkQueuedDepositConfirmationDataState) this.L$0, null, this.$instrument, 1, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C308511(null), 3, null);
    }

    /* compiled from: UkQueuedDepositConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UkQueuedDepositConfirmationDuxo, UkQueuedDepositConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkQueuedDepositConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (UkQueuedDepositConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkQueuedDepositConfirmationFragment.Args getArgs(UkQueuedDepositConfirmationDuxo ukQueuedDepositConfirmationDuxo) {
            return (UkQueuedDepositConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, ukQueuedDepositConfirmationDuxo);
        }
    }
}
