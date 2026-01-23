package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$call$1", m3645f = "ResurrectionUpsellLoggingService_Adapter.kt", m3646l = {70}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$call$1, reason: use source file name */
/* loaded from: classes22.dex */
final class ResurrectionUpsellLoggingService_Adapter5 extends ContinuationImpl7 implements Function2<ResurrectionUpsellLoggingService_Adapter.Endpoint_logTakeoverUpsellAction.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResurrectionUpsellLoggingService_Adapter.Endpoint_logTakeoverUpsellAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResurrectionUpsellLoggingService_Adapter5(ResurrectionUpsellLoggingService_Adapter.Endpoint_logTakeoverUpsellAction endpoint_logTakeoverUpsellAction, Continuation<? super ResurrectionUpsellLoggingService_Adapter5> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_logTakeoverUpsellAction;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResurrectionUpsellLoggingService_Adapter5 resurrectionUpsellLoggingService_Adapter5 = new ResurrectionUpsellLoggingService_Adapter5(this.this$0, continuation);
        resurrectionUpsellLoggingService_Adapter5.L$0 = obj;
        return resurrectionUpsellLoggingService_Adapter5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ResurrectionUpsellLoggingService_Adapter.Endpoint_logTakeoverUpsellAction.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((ResurrectionUpsellLoggingService_Adapter5) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ResurrectionUpsellLoggingService_Adapter.Endpoint_logTakeoverUpsellAction.Arguments arguments = (ResurrectionUpsellLoggingService_Adapter.Endpoint_logTakeoverUpsellAction.Arguments) this.L$0;
            ResurrectionUpsellLoggingService resurrectionUpsellLoggingService = this.this$0.service;
            String upsellIdentifier = arguments.getUpsellIdentifier();
            int shownCount = arguments.getShownCount();
            Long lastShownTimeMs = arguments.getLastShownTimeMs();
            boolean wasShown = arguments.getWasShown();
            this.label = 1;
            if (resurrectionUpsellLoggingService.logTakeoverUpsellAction(upsellIdentifier, shownCount, lastShownTimeMs, wasShown, this) == coroutine_suspended) {
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
