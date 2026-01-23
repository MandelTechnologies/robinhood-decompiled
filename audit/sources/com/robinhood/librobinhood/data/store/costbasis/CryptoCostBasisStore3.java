package com.robinhood.librobinhood.data.store.costbasis;

import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.GetCostBasisDetailsRequestDto;
import nummus.p512v1.GetCostBasisDetailsResponseDto;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lnummus/v1/GetCostBasisDetailsResponseDto;", "params", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore$DetailsParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$getDetails$1", m3645f = "CryptoCostBasisStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$getDetails$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoCostBasisStore3 extends ContinuationImpl7 implements Function2<CryptoCostBasisStore.DetailsParams, Continuation<? super GetCostBasisDetailsResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoCostBasisStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisStore3(CryptoCostBasisStore cryptoCostBasisStore, Continuation<? super CryptoCostBasisStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCostBasisStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCostBasisStore3 cryptoCostBasisStore3 = new CryptoCostBasisStore3(this.this$0, continuation);
        cryptoCostBasisStore3.L$0 = obj;
        return cryptoCostBasisStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoCostBasisStore.DetailsParams detailsParams, Continuation<? super GetCostBasisDetailsResponseDto> continuation) {
        return ((CryptoCostBasisStore3) create(detailsParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoCostBasisStore.DetailsParams detailsParams = (CryptoCostBasisStore.DetailsParams) this.L$0;
        RestNummusService restNummusService = this.this$0.nummusService;
        String string2 = detailsParams.getAccountId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = detailsParams.getSourceId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        GetCostBasisDetailsRequestDto getCostBasisDetailsRequestDto = new GetCostBasisDetailsRequestDto(string2, string3, detailsParams.getSourceType());
        this.label = 1;
        Object objGetCostBasisDetails = restNummusService.GetCostBasisDetails(getCostBasisDetailsRequestDto, this);
        return objGetCostBasisDetails == coroutine_suspended ? coroutine_suspended : objGetCostBasisDetails;
    }
}
