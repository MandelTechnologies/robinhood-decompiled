package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection;

import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.utils.Either2;
import java.util.List;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$3$1", m3645f = "RecurringDepositExtraCashAccountSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositExtraCashAccountSelectionDuxo3 extends ContinuationImpl7 implements Function2<RecurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState>, Object> {
    final /* synthetic */ List<AchRelationship> $achRelationships;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringDepositExtraCashAccountSelectionDuxo3(List<AchRelationship> list, Continuation<? super RecurringDepositExtraCashAccountSelectionDuxo3> continuation) {
        super(2, continuation);
        this.$achRelationships = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringDepositExtraCashAccountSelectionDuxo3 recurringDepositExtraCashAccountSelectionDuxo3 = new RecurringDepositExtraCashAccountSelectionDuxo3(this.$achRelationships, continuation);
        recurringDepositExtraCashAccountSelectionDuxo3.L$0 = obj;
        return recurringDepositExtraCashAccountSelectionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecurringDepositExtraCashAccountSelectionDataState recurringDepositExtraCashAccountSelectionDataState, Continuation<? super RecurringDepositExtraCashAccountSelectionDataState> continuation) {
        return ((RecurringDepositExtraCashAccountSelectionDuxo3) create(recurringDepositExtraCashAccountSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RecurringDepositExtraCashAccountSelectionDataState.copy$default((RecurringDepositExtraCashAccountSelectionDataState) this.L$0, Either2.asLeft(this.$achRelationships), null, null, null, null, null, 62, null);
    }
}
