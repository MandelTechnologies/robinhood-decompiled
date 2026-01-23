package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.FuturesCostBasis2;
import com.robinhood.ceres.p284v1.PnLCostBasisDto;
import com.robinhood.idl.Response;
import com.robinhood.store.futures.RhdCostBasisStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: RhdCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "param", "Lcom/robinhood/store/futures/RhdCostBasisStore$ApiCostBasisParam;", "pnlCostBasisDto", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/PnLCostBasisDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.RhdCostBasisStore$rhdCostBasisEndpoint$2", m3645f = "RhdCostBasisStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.RhdCostBasisStore$rhdCostBasisEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class RhdCostBasisStore3 extends ContinuationImpl7 implements Function3<RhdCostBasisStore.ApiCostBasisParam, Response<? extends PnLCostBasisDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RhdCostBasisStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhdCostBasisStore3(RhdCostBasisStore rhdCostBasisStore, Continuation<? super RhdCostBasisStore3> continuation) {
        super(3, continuation);
        this.this$0 = rhdCostBasisStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(RhdCostBasisStore.ApiCostBasisParam apiCostBasisParam, Response<PnLCostBasisDto> response, Continuation<? super Unit> continuation) {
        RhdCostBasisStore3 rhdCostBasisStore3 = new RhdCostBasisStore3(this.this$0, continuation);
        rhdCostBasisStore3.L$0 = apiCostBasisParam;
        rhdCostBasisStore3.L$1 = response;
        return rhdCostBasisStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(RhdCostBasisStore.ApiCostBasisParam apiCostBasisParam, Response<? extends PnLCostBasisDto> response, Continuation<? super Unit> continuation) {
        return invoke2(apiCostBasisParam, (Response<PnLCostBasisDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.costBasisDao.insert((Iterable) FuturesCostBasis2.toUiModel((PnLCostBasisDto) ((Response) this.L$1).getData(), ((RhdCostBasisStore.ApiCostBasisParam) this.L$0).getRhdAccountId()));
        return Unit.INSTANCE;
    }
}
