package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import accio.service.p003v1.LinkedAccountDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringDepositExtraCashAccountSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/accountselection/RecurringDepositExtraCashAccountSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$6$1", m3645f = "RecurringDepositExtraCashAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$6$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositExtraCashAccountSelectionDuxo4 extends ContinuationImpl7 implements Function2<RecurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState>, Object> {
    final /* synthetic */ Map<String, LinkedAccountDto> $accioAccounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringDepositExtraCashAccountSelectionDuxo4(Map<String, LinkedAccountDto> map, Continuation<? super RecurringDepositExtraCashAccountSelectionDuxo4> continuation) {
        super(2, continuation);
        this.$accioAccounts = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringDepositExtraCashAccountSelectionDuxo4 recurringDepositExtraCashAccountSelectionDuxo4 = new RecurringDepositExtraCashAccountSelectionDuxo4(this.$accioAccounts, continuation);
        recurringDepositExtraCashAccountSelectionDuxo4.L$0 = obj;
        return recurringDepositExtraCashAccountSelectionDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState> continuation) {
        return ((RecurringDepositExtraCashAccountSelectionDuxo4) create(recurringDepositExtraCashAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RecurringDepositExtraCashAccountSelectionDataState.copy$default((RecurringDepositExtraCashAccountSelectionDataState) this.L$0, null, this.$accioAccounts, null, null, null, null, 61, null);
    }
}
