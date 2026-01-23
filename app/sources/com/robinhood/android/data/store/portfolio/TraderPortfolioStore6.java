package com.robinhood.android.data.store.portfolio;

import com.robinhood.models.dao.PortfolioDao;
import com.robinhood.models.p320db.Portfolio2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;

/* compiled from: TraderPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore$portfolioEndpoint$2", m3645f = "TraderPortfolioStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$portfolioEndpoint$2, reason: use source file name */
/* loaded from: classes17.dex */
final class TraderPortfolioStore6 extends ContinuationImpl7 implements Function2<GetAccountValueResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderPortfolioStore6(TraderPortfolioStore traderPortfolioStore, Continuation<? super TraderPortfolioStore6> continuation) {
        super(2, continuation);
        this.this$0 = traderPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderPortfolioStore6 traderPortfolioStore6 = new TraderPortfolioStore6(this.this$0, continuation);
        traderPortfolioStore6.L$0 = obj;
        return traderPortfolioStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAccountValueResponseDto getAccountValueResponseDto, Continuation<? super Unit> continuation) {
        return ((TraderPortfolioStore6) create(getAccountValueResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            GetAccountValueResponseDto getAccountValueResponseDto = (GetAccountValueResponseDto) this.L$0;
            PortfolioDao portfolioDao = this.this$0.dao;
            Instant instant = this.this$0.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            portfolioDao.insert(Portfolio2.toDbModel(getAccountValueResponseDto, instant));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
