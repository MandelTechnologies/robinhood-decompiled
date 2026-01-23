package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$8$1", m3645f = "RecurringDepositExtraCashAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$8$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositExtraCashAccountSelectionDuxo5 extends ContinuationImpl7 implements Function2<RecurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState>, Object> {
    final /* synthetic */ Map<String, List<AutomaticDepositWithBankInfo>> $automaticDepositsToInstrumentId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecurringDepositExtraCashAccountSelectionDuxo5(Map<String, ? extends List<AutomaticDepositWithBankInfo>> map, Continuation<? super RecurringDepositExtraCashAccountSelectionDuxo5> continuation) {
        super(2, continuation);
        this.$automaticDepositsToInstrumentId = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringDepositExtraCashAccountSelectionDuxo5 recurringDepositExtraCashAccountSelectionDuxo5 = new RecurringDepositExtraCashAccountSelectionDuxo5(this.$automaticDepositsToInstrumentId, continuation);
        recurringDepositExtraCashAccountSelectionDuxo5.L$0 = obj;
        return recurringDepositExtraCashAccountSelectionDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState> continuation) {
        return ((RecurringDepositExtraCashAccountSelectionDuxo5) create(recurringDepositExtraCashAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RecurringDepositExtraCashAccountSelectionDataState.copy$default((RecurringDepositExtraCashAccountSelectionDataState) this.L$0, null, null, this.$automaticDepositsToInstrumentId, null, null, null, 59, null);
    }
}
