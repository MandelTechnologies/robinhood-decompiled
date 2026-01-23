package com.robinhood.android.data.store.portfolio;

import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout6;
import rosetta.portfolio.p541v1.GetAccountValueRequestDto;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;
import rosetta.portfolio.p541v1.Portfolio;

/* compiled from: TraderPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.portfolio.TraderPortfolioStore$individualAccountPortfolioEndpoint$1", m3645f = "TraderPortfolioStore.kt", m3646l = {42, 48, 54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.portfolio.TraderPortfolioStore$individualAccountPortfolioEndpoint$1, reason: use source file name */
/* loaded from: classes17.dex */
final class TraderPortfolioStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Optional<? extends GetAccountValueResponseDto>>, Object> {
    int label;
    final /* synthetic */ TraderPortfolioStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderPortfolioStore2(TraderPortfolioStore traderPortfolioStore, Continuation<? super TraderPortfolioStore2> continuation) {
        super(2, continuation);
        this.this$0 = traderPortfolioStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderPortfolioStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Optional<? extends GetAccountValueResponseDto>> continuation) {
        return invoke2(unit, (Continuation<? super Optional<GetAccountValueResponseDto>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Optional<GetAccountValueResponseDto>> continuation) {
        return ((TraderPortfolioStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Account account;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        GetAccountValueResponseDto getAccountValueResponseDto = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Job jobRefresh = this.this$0.accountProvider.refresh(true);
            this.label = 1;
            if (jobRefresh.join(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                getAccountValueResponseDto = (GetAccountValueResponseDto) obj;
                return Optional3.asOptional(getAccountValueResponseDto);
            }
            ResultKt.throwOnFailure(obj);
            account = (Account) obj;
            if (account != null) {
                Portfolio portfolio = this.this$0.portfolioService;
                GetAccountValueRequestDto getAccountValueRequestDto = new GetAccountValueRequestDto(account.getAccountNumber(), "trading", null, 4, null);
                this.label = 3;
                obj = portfolio.GetAccountValue(getAccountValueRequestDto, this);
            }
            return Optional3.asOptional(getAccountValueResponseDto);
        }
        ResultKt.throwOnFailure(obj);
        TraderPortfolioStore3 traderPortfolioStore3 = new TraderPortfolioStore3(this.this$0, null);
        this.label = 2;
        obj = Timeout6.withTimeout(5000L, traderPortfolioStore3, this);
        if (obj != coroutine_suspended) {
            account = (Account) obj;
            if (account != null) {
            }
            return Optional3.asOptional(getAccountValueResponseDto);
        }
        return coroutine_suspended;
    }
}
