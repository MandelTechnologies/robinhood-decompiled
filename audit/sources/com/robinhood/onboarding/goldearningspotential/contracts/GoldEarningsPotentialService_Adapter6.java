package com.robinhood.onboarding.goldearningspotential.contracts;

import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldEarningsPotentialService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Emission;", "it", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$call$1", m3645f = "GoldEarningsPotentialService_Adapter.kt", m3646l = {89}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$call$1, reason: use source file name */
/* loaded from: classes22.dex */
final class GoldEarningsPotentialService_Adapter6 extends ContinuationImpl7 implements Function2<GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Arguments, Continuation<? super GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldEarningsPotentialService_Adapter6(GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator endpoint_getPotentialGoldEarningsCalculator, Continuation<? super GoldEarningsPotentialService_Adapter6> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getPotentialGoldEarningsCalculator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldEarningsPotentialService_Adapter6 goldEarningsPotentialService_Adapter6 = new GoldEarningsPotentialService_Adapter6(this.this$0, continuation);
        goldEarningsPotentialService_Adapter6.L$0 = obj;
        return goldEarningsPotentialService_Adapter6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Arguments arguments, Continuation<? super GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Emission> continuation) {
        return ((GoldEarningsPotentialService_Adapter6) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Arguments arguments = (GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Arguments) this.L$0;
            GoldEarningsPotentialService goldEarningsPotentialService = this.this$0.service;
            double deposit = arguments.getDeposit();
            this.label = 1;
            obj = goldEarningsPotentialService.getPotentialGoldEarningsCalculator(deposit, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Emission.m23695boximpl(GoldEarningsPotentialService_Adapter.Endpoint_getPotentialGoldEarningsCalculator.Emission.m23696constructorimpl((GoldEarningsCalculatorModel) obj));
    }
}
