package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.GroupedBorrowCharges;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: BorrowChargeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/db/GroupedBorrowCharges;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1", m3645f = "BorrowChargeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends GroupedBorrowCharges>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1(Continuation<? super BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1 borrowChargeStore$historyLoaderCallbacks$1$getLatest$1 = new BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1(continuation);
        borrowChargeStore$historyLoaderCallbacks$1$getLatest$1.L$0 = obj;
        return borrowChargeStore$historyLoaderCallbacks$1$getLatest$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends GroupedBorrowCharges>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<GroupedBorrowCharges>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<GroupedBorrowCharges>> flowCollector, Continuation<? super Unit> continuation) {
        return ((BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List listEmptyList = CollectionsKt.emptyList();
            this.label = 1;
            if (flowCollector.emit(listEmptyList, this) == coroutine_suspended) {
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
