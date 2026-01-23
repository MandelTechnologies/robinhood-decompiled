package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.shared.models.history.EventOrderTransaction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/history/EventOrderTransaction;", "displayDetails", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "isLimitOrderNotionalExp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$historyTransactionLoader$1$1$1", m3645f = "EventOrderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$historyTransactionLoader$1$1$1 extends ContinuationImpl7 implements Function4<ContractDisplayDetails, EventContract, Boolean, Continuation<? super EventOrderTransaction>, Object> {
    final /* synthetic */ UiEventOrder $uiOrder;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderStore$historyTransactionLoader$1$1$1(UiEventOrder uiEventOrder, Continuation<? super EventOrderStore$historyTransactionLoader$1$1$1> continuation) {
        super(4, continuation);
        this.$uiOrder = uiEventOrder;
    }

    public final Object invoke(ContractDisplayDetails contractDisplayDetails, EventContract eventContract, boolean z, Continuation<? super EventOrderTransaction> continuation) {
        EventOrderStore$historyTransactionLoader$1$1$1 eventOrderStore$historyTransactionLoader$1$1$1 = new EventOrderStore$historyTransactionLoader$1$1$1(this.$uiOrder, continuation);
        eventOrderStore$historyTransactionLoader$1$1$1.L$0 = contractDisplayDetails;
        eventOrderStore$historyTransactionLoader$1$1$1.L$1 = eventContract;
        eventOrderStore$historyTransactionLoader$1$1$1.Z$0 = z;
        return eventOrderStore$historyTransactionLoader$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(ContractDisplayDetails contractDisplayDetails, EventContract eventContract, Boolean bool, Continuation<? super EventOrderTransaction> continuation) {
        return invoke(contractDisplayDetails, eventContract, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ContractDisplayDetails contractDisplayDetails = (ContractDisplayDetails) this.L$0;
        return new EventOrderTransaction(this.$uiOrder, (EventContract) this.L$1, contractDisplayDetails, this.Z$0);
    }
}
