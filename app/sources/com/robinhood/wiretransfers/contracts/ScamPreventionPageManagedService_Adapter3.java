package com.robinhood.wiretransfers.contracts;

import com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScamPreventionPageManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected$call$1", m3645f = "ScamPreventionPageManagedService_Adapter.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected$call$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ScamPreventionPageManagedService_Adapter3 extends ContinuationImpl7 implements Function2<ScamPreventionPageManagedService_Adapter.Endpoint_buttonSelected.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScamPreventionPageManagedService_Adapter.Endpoint_buttonSelected this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScamPreventionPageManagedService_Adapter3(ScamPreventionPageManagedService_Adapter.Endpoint_buttonSelected endpoint_buttonSelected, Continuation<? super ScamPreventionPageManagedService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_buttonSelected;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScamPreventionPageManagedService_Adapter3 scamPreventionPageManagedService_Adapter3 = new ScamPreventionPageManagedService_Adapter3(this.this$0, continuation);
        scamPreventionPageManagedService_Adapter3.L$0 = obj;
        return scamPreventionPageManagedService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScamPreventionPageManagedService_Adapter.Endpoint_buttonSelected.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((ScamPreventionPageManagedService_Adapter3) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScamPreventionPageManagedService_Adapter.Endpoint_buttonSelected.Arguments arguments = (ScamPreventionPageManagedService_Adapter.Endpoint_buttonSelected.Arguments) this.L$0;
            ScamPreventionPageManagedService scamPreventionPageManagedService = this.this$0.service;
            ScamPreventionButtonType selectionType = arguments.getSelectionType();
            this.label = 1;
            if (scamPreventionPageManagedService.buttonSelected(selectionType, this) == coroutine_suspended) {
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
