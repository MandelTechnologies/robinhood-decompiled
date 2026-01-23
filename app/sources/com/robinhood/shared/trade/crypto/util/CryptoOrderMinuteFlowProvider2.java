package com.robinhood.shared.trade.crypto.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: CryptoOrderMinuteFlowProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "j$/time/Instant", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider$minuteFlow$1", m3645f = "CryptoOrderMinuteFlowProvider.kt", m3646l = {26, 27}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider$minuteFlow$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderMinuteFlowProvider2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Instant>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoOrderMinuteFlowProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderMinuteFlowProvider2(CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, Continuation<? super CryptoOrderMinuteFlowProvider2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoOrderMinuteFlowProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderMinuteFlowProvider2 cryptoOrderMinuteFlowProvider2 = new CryptoOrderMinuteFlowProvider2(this.this$0, continuation);
        cryptoOrderMinuteFlowProvider2.L$0 = obj;
        return cryptoOrderMinuteFlowProvider2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Instant> flowCollector, Continuation<? super Unit> continuation) {
        return ((CryptoOrderMinuteFlowProvider2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (!JobKt.isActive(getContext())) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector2;
                if (!JobKt.isActive(getContext())) {
                    Instant instant = this.this$0.clock.instant();
                    Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                    this.L$0 = flowCollector;
                    this.label = 1;
                    if (flowCollector.emit(instant, this) != coroutine_suspended) {
                        flowCollector2 = flowCollector;
                        this.L$0 = flowCollector2;
                        this.label = 2;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = flowCollector2;
            this.label = 2;
        }
    }
}
