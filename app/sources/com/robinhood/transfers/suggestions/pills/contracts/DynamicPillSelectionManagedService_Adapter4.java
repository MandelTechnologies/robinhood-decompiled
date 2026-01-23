package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService_Adapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DynamicPillSelectionManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillSelectionManagedService_Adapter$Endpoint_pillSelected$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService_Adapter$Endpoint_pillSelected$call$1", m3645f = "DynamicPillSelectionManagedService_Adapter.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService_Adapter$Endpoint_pillSelected$call$1, reason: use source file name */
/* loaded from: classes12.dex */
final class DynamicPillSelectionManagedService_Adapter4 extends ContinuationImpl7 implements Function2<DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicPillSelectionManagedService_Adapter4(DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected endpoint_pillSelected, Continuation<? super DynamicPillSelectionManagedService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_pillSelected;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DynamicPillSelectionManagedService_Adapter4 dynamicPillSelectionManagedService_Adapter4 = new DynamicPillSelectionManagedService_Adapter4(this.this$0, continuation);
        dynamicPillSelectionManagedService_Adapter4.L$0 = obj;
        return dynamicPillSelectionManagedService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((DynamicPillSelectionManagedService_Adapter4) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected.Arguments arguments = (DynamicPillSelectionManagedService_Adapter.Endpoint_pillSelected.Arguments) this.L$0;
            DynamicPillSelectionManagedService dynamicPillSelectionManagedService = this.this$0.service;
            String currency = arguments.getCurrency();
            String amount = arguments.getAmount();
            List<String> availablePillAmounts = arguments.getAvailablePillAmounts();
            this.label = 1;
            if (dynamicPillSelectionManagedService.pillSelected(currency, amount, availablePillAmounts, this) == coroutine_suspended) {
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
