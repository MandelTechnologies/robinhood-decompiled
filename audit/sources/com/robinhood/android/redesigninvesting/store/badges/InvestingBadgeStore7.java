package com.robinhood.android.redesigninvesting.store.badges;

import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: InvestingBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamBadgeData$volatilityStream$1", m3645f = "InvestingBadgeStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamBadgeData$volatilityStream$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingBadgeStore7 extends ContinuationImpl7 implements Function2<FlowCollector<? super InvestingBadge>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InvestingBadgeStore7(Continuation<? super InvestingBadgeStore7> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestingBadgeStore7 investingBadgeStore7 = new InvestingBadgeStore7(continuation);
        investingBadgeStore7.L$0 = obj;
        return investingBadgeStore7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super InvestingBadge> flowCollector, Continuation<? super Unit> continuation) {
        return ((InvestingBadgeStore7) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            InvestingBadge.None none = InvestingBadge.None.INSTANCE;
            this.label = 1;
            if (flowCollector.emit(none, this) == coroutine_suspended) {
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
