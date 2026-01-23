package com.robinhood.android.event.gamedetail;

import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$contractGroupIdsForAmericanOddsFlow$1$2", m3645f = "GameDetailDuxo.kt", m3646l = {508}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$contractGroupIdsForAmericanOddsFlow$1$2 */
/* loaded from: classes3.dex */
final class C16271xfa5e1c8 extends ContinuationImpl7 implements Function2<FlowCollector<? super Set<? extends UUID>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    C16271xfa5e1c8(Continuation<? super C16271xfa5e1c8> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C16271xfa5e1c8 c16271xfa5e1c8 = new C16271xfa5e1c8(continuation);
        c16271xfa5e1c8.L$0 = obj;
        return c16271xfa5e1c8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Set<UUID>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Set<UUID>> flowCollector, Continuation<? super Unit> continuation) {
        return ((C16271xfa5e1c8) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Set setEmptySet = SetsKt.emptySet();
            this.label = 1;
            if (flowCollector.emit(setEmptySet, this) == coroutine_suspended) {
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
