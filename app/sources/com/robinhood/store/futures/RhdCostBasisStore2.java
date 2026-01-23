package com.robinhood.store.futures;

import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetPnLRequestDto;
import com.robinhood.ceres.p284v1.PnLCostBasisDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.store.futures.RhdCostBasisStore;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhdCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/PnLCostBasisDto;", "param", "Lcom/robinhood/store/futures/RhdCostBasisStore$ApiCostBasisParam;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.RhdCostBasisStore$rhdCostBasisEndpoint$1", m3645f = "RhdCostBasisStore.kt", m3646l = {42}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.RhdCostBasisStore$rhdCostBasisEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class RhdCostBasisStore2 extends ContinuationImpl7 implements Function2<RhdCostBasisStore.ApiCostBasisParam, Continuation<? super Response<? extends PnLCostBasisDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhdCostBasisStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhdCostBasisStore2(RhdCostBasisStore rhdCostBasisStore, Continuation<? super RhdCostBasisStore2> continuation) {
        super(2, continuation);
        this.this$0 = rhdCostBasisStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhdCostBasisStore2 rhdCostBasisStore2 = new RhdCostBasisStore2(this.this$0, continuation);
        rhdCostBasisStore2.L$0 = obj;
        return rhdCostBasisStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(RhdCostBasisStore.ApiCostBasisParam apiCostBasisParam, Continuation<? super Response<PnLCostBasisDto>> continuation) {
        return ((RhdCostBasisStore2) create(apiCostBasisParam, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(RhdCostBasisStore.ApiCostBasisParam apiCostBasisParam, Continuation<? super Response<? extends PnLCostBasisDto>> continuation) {
        return invoke2(apiCostBasisParam, (Continuation<? super Response<PnLCostBasisDto>>) continuation);
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
        RhdCostBasisStore.ApiCostBasisParam apiCostBasisParam = (RhdCostBasisStore.ApiCostBasisParam) this.L$0;
        Ceres ceres = this.this$0.ceres;
        String strSafeToString = Uuids.safeToString(apiCostBasisParam.getRhdAccountId());
        UUID contractId = apiCostBasisParam.getContractId();
        Request<GetPnLRequestDto> request = new Request<>(new GetPnLRequestDto(strSafeToString, contractId != null ? Uuids.safeToString(contractId) : null), null, 2, null);
        this.label = 1;
        Object objGetPnLCostBasis = ceres.GetPnLCostBasis(request, this);
        return objGetPnLCostBasis == coroutine_suspended ? coroutine_suspended : objGetPnLCostBasis;
    }
}
