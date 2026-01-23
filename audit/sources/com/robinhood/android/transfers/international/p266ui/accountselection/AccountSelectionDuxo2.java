package com.robinhood.android.transfers.international.p266ui.accountselection;

import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.international.ui.accountselection.AccountSelectionDuxo$loadExternalAccounts$1$1", m3645f = "AccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.international.ui.accountselection.AccountSelectionDuxo$loadExternalAccounts$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AccountSelectionDuxo2 extends ContinuationImpl7 implements Function2<AccountSelectionDataState, Continuation<? super AccountSelectionDataState>, Object> {
    final /* synthetic */ List<PaymentInstrumentV2> $paymentInstruments;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectionDuxo2(List<PaymentInstrumentV2> list, Continuation<? super AccountSelectionDuxo2> continuation) {
        super(2, continuation);
        this.$paymentInstruments = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountSelectionDuxo2 accountSelectionDuxo2 = new AccountSelectionDuxo2(this.$paymentInstruments, continuation);
        accountSelectionDuxo2.L$0 = obj;
        return accountSelectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountSelectionDataState accountSelectionDataState, Continuation<? super AccountSelectionDataState> continuation) {
        return ((AccountSelectionDuxo2) create(accountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AccountSelectionDataState.copy$default((AccountSelectionDataState) this.L$0, null, null, null, this.$paymentInstruments, 7, null);
    }
}
