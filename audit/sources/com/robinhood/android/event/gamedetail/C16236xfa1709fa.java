package com.robinhood.android.event.gamedetail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.builders.BuildGameDetailTitle;
import com.robinhood.android.event.gamedetail.builders.TitleState;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "GameDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C16236xfa1709fa extends ContinuationImpl7 implements Function3<FlowCollector<? super TitleState>, UUID, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $eventStateFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GameDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16236xfa1709fa(Continuation continuation, GameDetailDuxo gameDetailDuxo, Flow flow) {
        super(3, continuation);
        this.this$0 = gameDetailDuxo;
        this.$eventStateFlow$inlined = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super TitleState> flowCollector, UUID uuid, Continuation<? super Unit> continuation) {
        C16236xfa1709fa c16236xfa1709fa = new C16236xfa1709fa(continuation, this.this$0, this.$eventStateFlow$inlined);
        c16236xfa1709fa.L$0 = flowCollector;
        c16236xfa1709fa.L$1 = uuid;
        return c16236xfa1709fa.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final UUID uuid = (UUID) this.L$1;
            BuildGameDetailTitle buildGameDetailTitle = this.this$0.streamLiveDateTitle;
            Flow<PredictionMarketEventState> flow = this.$eventStateFlow$inlined;
            Clock clock = this.this$0.clock;
            final GameDetailDuxo gameDetailDuxo = this.this$0;
            Flow<TitleState> flowInvoke = buildGameDetailTitle.invoke(flow, clock, new Function0<Unit>() { // from class: com.robinhood.android.event.gamedetail.GameDetailDuxo$onCreate$1$23$2$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    gameDetailDuxo.eventStateStore.refreshEventState(uuid, true);
                }
            });
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowInvoke, this) == coroutine_suspended) {
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
