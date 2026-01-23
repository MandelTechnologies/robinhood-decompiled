package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiEquityTradingSessionChangedResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/api/ApiEquityTradingSessionChangedResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$sharedAlert$1", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {69, 69}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class EquityTradingSessionChangedStore$sharedAlert$1 extends ContinuationImpl7 implements Function2<FlowCollector<? super ApiEquityTradingSessionChangedResponse>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityTradingSessionChangedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradingSessionChangedStore$sharedAlert$1(EquityTradingSessionChangedStore equityTradingSessionChangedStore, Continuation<? super EquityTradingSessionChangedStore$sharedAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = equityTradingSessionChangedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradingSessionChangedStore$sharedAlert$1 equityTradingSessionChangedStore$sharedAlert$1 = new EquityTradingSessionChangedStore$sharedAlert$1(this.this$0, continuation);
        equityTradingSessionChangedStore$sharedAlert$1.L$0 = obj;
        return equityTradingSessionChangedStore$sharedAlert$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ApiEquityTradingSessionChangedResponse> flowCollector, Continuation<? super Unit> continuation) {
        return ((EquityTradingSessionChangedStore$sharedAlert$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        EquityTradingSessionChangedStore$sharedAlert$1 equityTradingSessionChangedStore$sharedAlert$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Endpoint endpoint = this.this$0.endpoint;
            Unit unit = Unit.INSTANCE;
            this.L$0 = flowCollector;
            this.label = 1;
            equityTradingSessionChangedStore$sharedAlert$1 = this;
            obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, equityTradingSessionChangedStore$sharedAlert$1, 2, null);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        equityTradingSessionChangedStore$sharedAlert$1 = this;
        equityTradingSessionChangedStore$sharedAlert$1.L$0 = null;
        equityTradingSessionChangedStore$sharedAlert$1.label = 2;
    }
}
