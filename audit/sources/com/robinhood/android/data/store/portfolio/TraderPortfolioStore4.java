package com.robinhood.android.data.store.portfolio;

import com.robinhood.models.dao.PortfolioDao;
import com.robinhood.models.p320db.Portfolio2;
import com.robinhood.utils.Optional;
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
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;

/* compiled from: TraderPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore$individualAccountPortfolioEndpoint$2", m3645f = "TraderPortfolioStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$individualAccountPortfolioEndpoint$2, reason: use source file name */
/* loaded from: classes17.dex */
final class TraderPortfolioStore4 extends ContinuationImpl7 implements Function2<Optional<? extends GetAccountValueResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderPortfolioStore4(TraderPortfolioStore traderPortfolioStore, Continuation<? super TraderPortfolioStore4> continuation) {
        super(2, continuation);
        this.this$0 = traderPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderPortfolioStore4 traderPortfolioStore4 = new TraderPortfolioStore4(this.this$0, continuation);
        traderPortfolioStore4.L$0 = obj;
        return traderPortfolioStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<GetAccountValueResponseDto> optional, Continuation<? super Unit> continuation) {
        return ((TraderPortfolioStore4) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends GetAccountValueResponseDto> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<GetAccountValueResponseDto>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GetAccountValueResponseDto getAccountValueResponseDto = (GetAccountValueResponseDto) ((Optional) this.L$0).component1();
        if (getAccountValueResponseDto != null) {
            TraderPortfolioStore traderPortfolioStore = this.this$0;
            PortfolioDao portfolioDao = traderPortfolioStore.dao;
            Instant instant = traderPortfolioStore.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            portfolioDao.insert(Portfolio2.toDbModel(getAccountValueResponseDto, instant));
        }
        return Unit.INSTANCE;
    }
}
