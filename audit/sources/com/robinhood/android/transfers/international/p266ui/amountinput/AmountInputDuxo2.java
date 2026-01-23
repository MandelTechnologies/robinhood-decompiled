package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.AlertDto;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.ValidateRequestDto;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.ValidateResponseDto;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.ValidationService;

/* compiled from: AmountInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$continueButtonClicked$1$1", m3645f = "AmountInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$continueButtonClicked$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AmountInputDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AmountInputDataState $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AmountInputDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountInputDuxo2(AmountInputDuxo amountInputDuxo, AmountInputDataState amountInputDataState, Continuation<? super AmountInputDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = amountInputDuxo;
        this.$state = amountInputDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AmountInputDuxo2 amountInputDuxo2 = new AmountInputDuxo2(this.this$0, this.$state, continuation);
        amountInputDuxo2.L$0 = obj;
        return amountInputDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AmountInputDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$continueButtonClicked$1$1$1", m3645f = "AmountInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxo$continueButtonClicked$1$1$1 */
    static final class C303421 extends ContinuationImpl7 implements Function2<AmountInputDataState, Continuation<? super AmountInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C303421(Continuation<? super C303421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C303421 c303421 = new C303421(continuation);
            c303421.L$0 = obj;
            return c303421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AmountInputDataState amountInputDataState, Continuation<? super AmountInputDataState> continuation) {
            return ((C303421) create(amountInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AmountInputDataState.copy$default((AmountInputDataState) this.L$0, null, null, null, null, null, null, null, null, null, true, 511, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C303421(null));
                AmountInputDuxo amountInputDuxo = this.this$0;
                AmountInputDataState amountInputDataState = this.$state;
                Result.Companion companion = Result.INSTANCE;
                ValidationService validationService = amountInputDuxo.getValidationService();
                ValidateRequestDto validateRequestDto = AmountInputDuxo7.toValidateRequestDto(amountInputDataState);
                this.label = 1;
                obj = validationService.Validate(validateRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ValidateResponseDto) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        AmountInputDuxo amountInputDuxo2 = this.this$0;
        AmountInputDataState amountInputDataState2 = this.$state;
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            ValidateResponseDto validateResponseDto = (ValidateResponseDto) objM28550constructorimpl;
            amountInputDuxo2.applyMutation(new AmountInputDuxo3(null));
            AlertDto alert = validateResponseDto.getAlert();
            if (validateResponseDto.is_valid() || alert == null) {
                amountInputDuxo2.submitAmountEnteredEvent(amountInputDataState2);
            } else {
                amountInputDuxo2.submit(new AmountInputEvent.ValidationError(alert));
            }
        } else {
            amountInputDuxo2.applyMutation(new AmountInputDuxo4(null));
            amountInputDuxo2.submitAmountEnteredEvent(amountInputDataState2);
        }
        return Unit.INSTANCE;
    }
}
