package com.robinhood.android.transfers.international.p266ui.methodselection;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.GetServiceFeeRequestDto;
import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodEvent;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransferMethodDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDataState;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodViewState;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodStateProvider;Landroidx/lifecycle/SavedStateHandle;Lbff_money_movement/service/v1/BffMoneyMovementService;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onFastSelected", "onWireSelected", "fetchOutgoingWireServiceFee", "currency", "Ljava/util/Currency;", "(Ljava/util/Currency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferMethodDuxo extends BaseDuxo3<TransferMethodDataState, TransferMethodViewState, TransferMethodEvent> implements HasSavedState {
    private final BffMoneyMovementService bffMoneyMovementService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferMethodDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.methodselection.TransferMethodDuxo", m3645f = "TransferMethodDuxo.kt", m3646l = {66}, m3647m = "fetchOutgoingWireServiceFee")
    /* renamed from: com.robinhood.android.transfers.international.ui.methodselection.TransferMethodDuxo$fetchOutgoingWireServiceFee$1 */
    static final class C303651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C303651(Continuation<? super C303651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferMethodDuxo.this.fetchOutgoingWireServiceFee(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransferMethodDuxo(DuxoBundle duxoBundle, TransferMethodStateProvider stateProvider, SavedStateHandle savedStateHandle, BffMoneyMovementService bffMoneyMovementService) {
        super(new TransferMethodDataState((TransferMethodFragment.Args) INSTANCE.getArgs(savedStateHandle), null, 2, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        this.savedStateHandle = savedStateHandle;
        this.bffMoneyMovementService = bffMoneyMovementService;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        TransferMethodFragment.Args args = (TransferMethodFragment.Args) INSTANCE.getArgs((HasSavedState) this);
        if (args instanceof TransferMethodFragment.Args.Withdraw) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C303671(args, null), 3, null);
        } else if (!(args instanceof TransferMethodFragment.Args.Deposit)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: TransferMethodDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.methodselection.TransferMethodDuxo$onStart$1", m3645f = "TransferMethodDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.methodselection.TransferMethodDuxo$onStart$1 */
    static final class C303671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TransferMethodFragment.Args $args;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C303671(TransferMethodFragment.Args args, Continuation<? super C303671> continuation) {
            super(2, continuation);
            this.$args = args;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferMethodDuxo.this.new C303671(this.$args, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C303671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransferMethodDuxo transferMethodDuxo = TransferMethodDuxo.this;
                Currency currency = ((TransferMethodFragment.Args.Withdraw) this.$args).getCurrency();
                this.label = 1;
                if (transferMethodDuxo.fetchOutgoingWireServiceFee(currency, this) == coroutine_suspended) {
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

    public final void onFastSelected() {
        submit(new TransferMethodEvent.TransferMethodSelected(TransferType.FAST));
    }

    public final void onWireSelected() {
        submit(new TransferMethodEvent.TransferMethodSelected(TransferType.WIRE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchOutgoingWireServiceFee(Currency currency, Continuation<? super Unit> continuation) {
        C303651 c303651;
        if (continuation instanceof C303651) {
            c303651 = (C303651) continuation;
            int i = c303651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c303651.label = i - Integer.MIN_VALUE;
            } else {
                c303651 = new C303651(continuation);
            }
        }
        Object objGetServiceFee = c303651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c303651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetServiceFee);
            BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService;
            String str = null;
            GetServiceFeeRequestDto getServiceFeeRequestDto = new GetServiceFeeRequestDto(str, Currency2.toCurrencyDto(currency), DirectionDto.DIRECTION_WITHDRAW, PurposeDto.PURPOSE_I18N_WIRE_TRANSFER, null, 17, null);
            c303651.label = 1;
            objGetServiceFee = bffMoneyMovementService.GetServiceFee(getServiceFeeRequestDto, c303651);
            if (objGetServiceFee == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetServiceFee);
        }
        applyMutation(new C303662((GetServiceFeeResponseDto) objGetServiceFee, null));
        return Unit.INSTANCE;
    }

    /* compiled from: TransferMethodDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.methodselection.TransferMethodDuxo$fetchOutgoingWireServiceFee$2", m3645f = "TransferMethodDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.methodselection.TransferMethodDuxo$fetchOutgoingWireServiceFee$2 */
    static final class C303662 extends ContinuationImpl7 implements Function2<TransferMethodDataState, Continuation<? super TransferMethodDataState>, Object> {
        final /* synthetic */ GetServiceFeeResponseDto $serviceFeeResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C303662(GetServiceFeeResponseDto getServiceFeeResponseDto, Continuation<? super C303662> continuation) {
            super(2, continuation);
            this.$serviceFeeResponse = getServiceFeeResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303662 c303662 = new C303662(this.$serviceFeeResponse, continuation);
            c303662.L$0 = obj;
            return c303662;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferMethodDataState transferMethodDataState, Continuation<? super TransferMethodDataState> continuation) {
            return ((C303662) create(transferMethodDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TransferMethodDataState.copy$default((TransferMethodDataState) this.L$0, null, this.$serviceFeeResponse, 1, null);
        }
    }

    /* compiled from: TransferMethodDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDuxo;", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "<init>", "()V", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TransferMethodDuxo, TransferMethodFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransferMethodFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (TransferMethodFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransferMethodFragment.Args getArgs(TransferMethodDuxo transferMethodDuxo) {
            return (TransferMethodFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, transferMethodDuxo);
        }
    }
}
