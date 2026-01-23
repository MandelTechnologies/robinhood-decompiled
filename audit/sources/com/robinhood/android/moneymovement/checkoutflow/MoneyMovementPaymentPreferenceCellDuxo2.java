package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MoneyMovementPaymentPreferenceCellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$3$2$1", m3645f = "MoneyMovementPaymentPreferenceCellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellDuxo$reloadInstrumentPreference$3$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MoneyMovementPaymentPreferenceCellDuxo2 extends ContinuationImpl7 implements Function2<MoneyMovementPaymentPreferenceDataState, Continuation<? super MoneyMovementPaymentPreferenceDataState>, Object> {
    final /* synthetic */ TransferAccount $account;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoneyMovementPaymentPreferenceCellDuxo2(TransferAccount transferAccount, Continuation<? super MoneyMovementPaymentPreferenceCellDuxo2> continuation) {
        super(2, continuation);
        this.$account = transferAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MoneyMovementPaymentPreferenceCellDuxo2 moneyMovementPaymentPreferenceCellDuxo2 = new MoneyMovementPaymentPreferenceCellDuxo2(this.$account, continuation);
        moneyMovementPaymentPreferenceCellDuxo2.L$0 = obj;
        return moneyMovementPaymentPreferenceCellDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MoneyMovementPaymentPreferenceDataState moneyMovementPaymentPreferenceDataState, Continuation<? super MoneyMovementPaymentPreferenceDataState> continuation) {
        return ((MoneyMovementPaymentPreferenceCellDuxo2) create(moneyMovementPaymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MoneyMovementPaymentPreferenceDataState.copy$default((MoneyMovementPaymentPreferenceDataState) this.L$0, this.$account.getAccountName(), this.$account.getAccountId(), false, 4, null);
    }
}
