package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import com.robinhood.models.p320db.Account;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubDuxo$onResume$3$1", m3645f = "RecurringDepositHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringDepositHubDuxo3 extends ContinuationImpl7 implements Function2<RecurringDepositHubDataState, Continuation<? super RecurringDepositHubDataState>, Object> {
    final /* synthetic */ Map<String, Account> $accounts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecurringDepositHubDuxo3(Map<String, Account> map, Continuation<? super RecurringDepositHubDuxo3> continuation) {
        super(2, continuation);
        this.$accounts = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecurringDepositHubDuxo3 recurringDepositHubDuxo3 = new RecurringDepositHubDuxo3(this.$accounts, continuation);
        recurringDepositHubDuxo3.L$0 = obj;
        return recurringDepositHubDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecurringDepositHubDataState recurringDepositHubDataState, Continuation<? super RecurringDepositHubDataState> continuation) {
        return ((RecurringDepositHubDuxo3) create(recurringDepositHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RecurringDepositHubDataState recurringDepositHubDataState = (RecurringDepositHubDataState) this.L$0;
        Map<String, Account> map = this.$accounts;
        Intrinsics.checkNotNull(map);
        return RecurringDepositHubDataState.copy$default(recurringDepositHubDataState, null, map, 1, null);
    }
}
