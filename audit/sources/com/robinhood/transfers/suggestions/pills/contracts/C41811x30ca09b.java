package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DynamicPillValueManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Emission;", "it", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$call$1", m3645f = "DynamicPillValueManagedService_Adapter.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$call$1 */
/* loaded from: classes12.dex */
final class C41811x30ca09b extends ContinuationImpl7 implements Function2<DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Arguments, Continuation<? super DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C41811x30ca09b(DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts endpoint_resolveAmounts, Continuation<? super C41811x30ca09b> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_resolveAmounts;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41811x30ca09b c41811x30ca09b = new C41811x30ca09b(this.this$0, continuation);
        c41811x30ca09b.L$0 = obj;
        return c41811x30ca09b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Arguments arguments, Continuation<? super DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Emission> continuation) {
        return ((C41811x30ca09b) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Arguments arguments = (DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Arguments) this.L$0;
            DynamicPillValueManagedService dynamicPillValueManagedService = this.this$0.service;
            MicrogramTransferAccount source = arguments.getSource();
            MicrogramTransferAccount sink = arguments.getSink();
            String entryPoint = arguments.getEntryPoint();
            String amount = arguments.getAmount();
            String currency = arguments.getCurrency();
            String initialPrefilledAmount = arguments.getInitialPrefilledAmount();
            this.label = 1;
            obj = dynamicPillValueManagedService.resolveAmounts(source, sink, entryPoint, amount, currency, initialPrefilledAmount, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Emission.m26580boximpl(DynamicPillValueManagedService_Adapter.Endpoint_resolveAmounts.Emission.m26581constructorimpl((List) obj));
    }
}
