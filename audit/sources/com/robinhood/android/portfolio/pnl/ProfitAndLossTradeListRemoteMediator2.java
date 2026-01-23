package com.robinhood.android.portfolio.pnl;

import com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: ProfitAndLossTradeListRemoteMediator.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListRemoteMediator$load$nextCursor$remoteKey$1", m3645f = "ProfitAndLossTradeListRemoteMediator.kt", m3646l = {44}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossTradeListRemoteMediator$load$nextCursor$remoteKey$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossTradeListRemoteMediator2 extends ContinuationImpl7 implements Function1<Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ ProfitAndLossTradeListRemoteMediator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossTradeListRemoteMediator2(ProfitAndLossTradeListRemoteMediator profitAndLossTradeListRemoteMediator, Continuation<? super ProfitAndLossTradeListRemoteMediator2> continuation) {
        super(1, continuation);
        this.this$0 = profitAndLossTradeListRemoteMediator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProfitAndLossTradeListRemoteMediator2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((ProfitAndLossTradeListRemoteMediator2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        ProfitAndLossTradeItemRemoteKeyDao profitAndLossTradeItemRemoteKeyDao = this.this$0.remoteKeyDao;
        String string2 = this.this$0.requestDto.toString();
        this.label = 1;
        Object nextCursor = profitAndLossTradeItemRemoteKeyDao.getNextCursor(string2, this);
        return nextCursor == coroutine_suspended ? coroutine_suspended : nextCursor;
    }
}
