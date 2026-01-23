package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetManagedPortfolioRestrictedStocksRequestDto;
import advisory.proto.p008v1.GetManagedPortfolioRestrictedStocksResponseDto;
import com.robinhood.models.advisory.p304db.portfolio.RestrictStocks;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedStocksResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RestrictStocksStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedStocksResponse;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.RestrictStocksStore$getRestrictedStocksEndpoint$2", m3645f = "RestrictStocksStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.RestrictStocksStore$getRestrictedStocksEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class RestrictStocksStore3 extends ContinuationImpl7 implements Function2<String, Continuation<? super RestrictedStocksResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RestrictStocksStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestrictStocksStore3(RestrictStocksStore restrictStocksStore, Continuation<? super RestrictStocksStore3> continuation) {
        super(2, continuation);
        this.this$0 = restrictStocksStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RestrictStocksStore3 restrictStocksStore3 = new RestrictStocksStore3(this.this$0, continuation);
        restrictStocksStore3.L$0 = obj;
        return restrictStocksStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super RestrictedStocksResponse> continuation) {
        return ((RestrictStocksStore3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            AdvisoryService advisoryService = this.this$0.advisoryService;
            GetManagedPortfolioRestrictedStocksRequestDto getManagedPortfolioRestrictedStocksRequestDto = new GetManagedPortfolioRestrictedStocksRequestDto(str);
            this.label = 1;
            obj = advisoryService.GetManagedPortfolioRestrictedStocks(getManagedPortfolioRestrictedStocksRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return RestrictStocks.toDbModel((GetManagedPortfolioRestrictedStocksResponseDto) obj);
    }
}
