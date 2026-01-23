package com.robinhood.android.equity;

import com.robinhood.models.api.ApiEstimatedFees;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: FeeEstimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2$staleJob$1", m3645f = "FeeEstimation.kt", m3646l = {110, 112}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equity.FeeEstimationKt$estimateFees$1$2$staleJob$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FeeEstimation3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Produce4<Result<ApiEstimatedFees>> $$this$channelFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FeeEstimation3(Produce4<? super Result<ApiEstimatedFees>> produce4, Continuation<? super FeeEstimation3> continuation) {
        super(2, continuation);
        this.$$this$channelFlow = produce4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FeeEstimation3 feeEstimation3 = new FeeEstimation3(this.$$this$channelFlow, continuation);
        feeEstimation3.L$0 = obj;
        return feeEstimation3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeeEstimation3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r6.send(null, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(500L, this) != coroutine_suspended) {
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
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (CoroutineScope2.isActive(coroutineScope)) {
            Produce4<Result<ApiEstimatedFees>> produce4 = this.$$this$channelFlow;
            this.L$0 = null;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
