package com.robinhood.store.futures.arsenal;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.arsenal.proto.p281v1.idl.GetMarginRequirementRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesMarginRequirement;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesContractStore$marginRequirementEndpoint$1", m3645f = "FuturesContractStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesContractStore$marginRequirementEndpoint$1 extends ContinuationImpl7 implements Function2<GetMarginRequirementRequestDto, Continuation<? super FuturesMarginRequirement>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContractStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesContractStore$marginRequirementEndpoint$1(FuturesContractStore futuresContractStore, Continuation<? super FuturesContractStore$marginRequirementEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresContractStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContractStore$marginRequirementEndpoint$1 futuresContractStore$marginRequirementEndpoint$1 = new FuturesContractStore$marginRequirementEndpoint$1(this.this$0, continuation);
        futuresContractStore$marginRequirementEndpoint$1.L$0 = obj;
        return futuresContractStore$marginRequirementEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMarginRequirementRequestDto getMarginRequirementRequestDto, Continuation<? super FuturesMarginRequirement> continuation) {
        return ((FuturesContractStore$marginRequirementEndpoint$1) create(getMarginRequirementRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetMarginRequirementRequestDto getMarginRequirementRequestDto = (GetMarginRequirementRequestDto) this.L$0;
        InstrumentService instrumentService = this.this$0.arsenalService;
        this.label = 1;
        Object marginRequirement = ArsenalServiceExt.getMarginRequirement(instrumentService, getMarginRequirementRequestDto, this);
        return marginRequirement == coroutine_suspended ? coroutine_suspended : marginRequirement;
    }
}
