package com.robinhood.librobinhood.usecase;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CheckOptionUpgradeToLevel3EligibilityUseCase.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$tradeCountEligibilityFlow$1", m3645f = "CheckOptionUpgradeToLevel3EligibilityUseCase.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase$invoke$tradeCountEligibilityFlow$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CheckOptionUpgradeToLevel3EligibilityUseCase2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CheckOptionUpgradeToLevel3EligibilityUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckOptionUpgradeToLevel3EligibilityUseCase2(CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, Continuation<? super CheckOptionUpgradeToLevel3EligibilityUseCase2> continuation) {
        super(2, continuation);
        this.this$0 = checkOptionUpgradeToLevel3EligibilityUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckOptionUpgradeToLevel3EligibilityUseCase2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
        return ((CheckOptionUpgradeToLevel3EligibilityUseCase2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.optionOrderStore.refreshAll(false);
        return Unit.INSTANCE;
    }
}
