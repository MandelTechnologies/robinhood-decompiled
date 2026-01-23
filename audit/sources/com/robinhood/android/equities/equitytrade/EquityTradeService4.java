package com.robinhood.android.equities.equitytrade;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: EquityTradeService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$validateAndSubmit$2$summaryResult$1$1", m3645f = "EquityTradeService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$validateAndSubmit$2$summaryResult$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeService4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Deferred<String> $deferredSummary;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeService4(Deferred<String> deferred, Continuation<? super EquityTradeService4> continuation) {
        super(2, continuation);
        this.$deferredSummary = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeService4(this.$deferredSummary, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((EquityTradeService4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Deferred<String> deferred = this.$deferredSummary;
        this.label = 1;
        Object objAwait = deferred.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
