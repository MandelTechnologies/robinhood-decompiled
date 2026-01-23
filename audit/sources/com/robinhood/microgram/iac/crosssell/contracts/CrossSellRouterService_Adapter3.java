package com.robinhood.microgram.iac.crosssell.contracts;

import com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CrossSellRouterService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService_Adapter$Endpoint_launchDemoHalfSheet$call$1", m3645f = "CrossSellRouterService_Adapter.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService_Adapter$Endpoint_launchDemoHalfSheet$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CrossSellRouterService_Adapter3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CrossSellRouterService_Adapter.Endpoint_launchDemoHalfSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossSellRouterService_Adapter3(CrossSellRouterService_Adapter.Endpoint_launchDemoHalfSheet endpoint_launchDemoHalfSheet, Continuation<? super CrossSellRouterService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_launchDemoHalfSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrossSellRouterService_Adapter3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((CrossSellRouterService_Adapter3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CrossSellRouterService crossSellRouterService = this.this$0.service;
            this.label = 1;
            if (crossSellRouterService.launchDemoHalfSheet(this) == coroutine_suspended) {
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
