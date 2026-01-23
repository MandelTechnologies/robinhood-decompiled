package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ResurrectionUpsellService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Emission;", "it", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$call$1", m3645f = "ResurrectionUpsellService_Adapter.kt", m3646l = {82}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$call$1 */
/* loaded from: classes22.dex */
final class C35947x1b150c2b extends ContinuationImpl7 implements Function2<ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Arguments, Continuation<? super ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C35947x1b150c2b(ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell endpoint_shouldShowPostDepositUpsell, Continuation<? super C35947x1b150c2b> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_shouldShowPostDepositUpsell;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C35947x1b150c2b c35947x1b150c2b = new C35947x1b150c2b(this.this$0, continuation);
        c35947x1b150c2b.L$0 = obj;
        return c35947x1b150c2b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Arguments arguments, Continuation<? super ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Emission> continuation) {
        return ((C35947x1b150c2b) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Arguments arguments = (ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Arguments) this.L$0;
            ResurrectionUpsellService resurrectionUpsellService = this.this$0.service;
            String upsellIdentifier = arguments.getUpsellIdentifier();
            this.label = 1;
            obj = resurrectionUpsellService.shouldShowPostDepositUpsell(upsellIdentifier, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Emission.m23738boximpl(ResurrectionUpsellService_Adapter.Endpoint_shouldShowPostDepositUpsell.Emission.m23739constructorimpl(((Boolean) obj).booleanValue()));
    }
}
