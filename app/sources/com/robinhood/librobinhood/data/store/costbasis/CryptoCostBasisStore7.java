package com.robinhood.librobinhood.data.store.costbasis;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import nummus.p512v1.CreateCostBasisLotRequestDto;
import nummus.p512v1.CreateCostBasisLotResponseDto;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoCostBasisStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lnummus/v1/CreateCostBasisLotResponseDto;", "request", "Lnummus/v1/CreateCostBasisLotRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$saveLotEndpoint$1", m3645f = "CryptoCostBasisStore.kt", m3646l = {108}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$saveLotEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoCostBasisStore7 extends ContinuationImpl7 implements Function2<CreateCostBasisLotRequestDto, Continuation<? super CreateCostBasisLotResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoCostBasisStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisStore7(CryptoCostBasisStore cryptoCostBasisStore, Continuation<? super CryptoCostBasisStore7> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCostBasisStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoCostBasisStore7 cryptoCostBasisStore7 = new CryptoCostBasisStore7(this.this$0, continuation);
        cryptoCostBasisStore7.L$0 = obj;
        return cryptoCostBasisStore7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateCostBasisLotRequestDto createCostBasisLotRequestDto, Continuation<? super CreateCostBasisLotResponseDto> continuation) {
        return ((CryptoCostBasisStore7) create(createCostBasisLotRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CreateCostBasisLotRequestDto createCostBasisLotRequestDto = (CreateCostBasisLotRequestDto) this.L$0;
        RestNummusService restNummusService = this.this$0.nummusService;
        this.label = 1;
        Object objCreateCostBasisLot = restNummusService.CreateCostBasisLot(createCostBasisLotRequestDto, this);
        return objCreateCostBasisLot == coroutine_suspended ? coroutine_suspended : objCreateCostBasisLot;
    }
}
