package com.robinhood.android.moneymovement.checkoutflow;

import bff_money_movement.service.p019v1.GetSubscriptionPaymentMethodResponseDto;
import com.robinhood.idl.Response;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$3$3", m3645f = "MoneyMovementPaymentPreferenceCellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$3$3, reason: use source file name */
/* loaded from: classes8.dex */
final class MoneyMovementPaymentPreferenceCellDuxo3 extends ContinuationImpl7 implements Function2<MoneyMovementPaymentPreferenceDataState, Continuation<? super MoneyMovementPaymentPreferenceDataState>, Object> {
    final /* synthetic */ Response<GetSubscriptionPaymentMethodResponseDto> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoneyMovementPaymentPreferenceCellDuxo3(Response<GetSubscriptionPaymentMethodResponseDto> response, Continuation<? super MoneyMovementPaymentPreferenceCellDuxo3> continuation) {
        super(2, continuation);
        this.$result = response;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MoneyMovementPaymentPreferenceCellDuxo3 moneyMovementPaymentPreferenceCellDuxo3 = new MoneyMovementPaymentPreferenceCellDuxo3(this.$result, continuation);
        moneyMovementPaymentPreferenceCellDuxo3.L$0 = obj;
        return moneyMovementPaymentPreferenceCellDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState, Continuation<? super MoneyMovementPaymentPreferenceDataState> continuation) {
        return ((MoneyMovementPaymentPreferenceCellDuxo3) create(moneyMovementPaymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState = (MoneyMovementPaymentPreferenceDataState) this.L$0;
        return Intrinsics.areEqual(this.$result.getData().getPayment_instrument_id(), ServerConstants.BROKERAGE_INDICATOR) ? MoneyMovementPaymentPreferenceDataState.copy$default(moneyMovementPaymentPreferenceDataState, "Individual Account", this.$result.getData().getPayment_instrument_id(), false, 4, null) : moneyMovementPaymentPreferenceDataState;
    }
}
