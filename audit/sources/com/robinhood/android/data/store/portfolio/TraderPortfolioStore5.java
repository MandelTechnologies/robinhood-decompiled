package com.robinhood.android.data.store.portfolio;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import rosetta.portfolio.p541v1.GetAccountValueRequestDto;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;
import rosetta.portfolio.p541v1.Portfolio;

/* compiled from: TraderPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore$portfolioEndpoint$1", m3645f = "TraderPortfolioStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$portfolioEndpoint$1, reason: use source file name */
/* loaded from: classes17.dex */
final class TraderPortfolioStore5 extends ContinuationImpl7 implements Function2<String, Continuation<? super GetAccountValueResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderPortfolioStore5(TraderPortfolioStore traderPortfolioStore, Continuation<? super TraderPortfolioStore5> continuation) {
        super(2, continuation);
        this.this$0 = traderPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderPortfolioStore5 traderPortfolioStore5 = new TraderPortfolioStore5(this.this$0, continuation);
        traderPortfolioStore5.L$0 = obj;
        return traderPortfolioStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super GetAccountValueResponseDto> continuation) {
        return ((TraderPortfolioStore5) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        Portfolio portfolio = this.this$0.portfolioService;
        GetAccountValueRequestDto getAccountValueRequestDto = new GetAccountValueRequestDto(str, "trading", null, 4, null);
        this.label = 1;
        Object objGetAccountValue = portfolio.GetAccountValue(getAccountValueRequestDto, this);
        return objGetAccountValue == coroutine_suspended ? coroutine_suspended : objGetAccountValue;
    }
}
