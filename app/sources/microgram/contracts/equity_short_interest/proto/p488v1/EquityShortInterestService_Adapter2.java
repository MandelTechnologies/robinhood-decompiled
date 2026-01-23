package microgram.contracts.equity_short_interest.proto.p488v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.equity_short_interest.proto.p488v1.EquityShortInterestService_Adapter;

/* compiled from: EquityShortInterestService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/equity_short_interest/proto/v1/SetScrubIndexResponseDto;", "request", "Lmicrogram/contracts/equity_short_interest/proto/v1/SetScrubIndexRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.equity_short_interest.proto.v1.EquityShortInterestService_Adapter$SetScrubIndexEndpoint$call$1", m3645f = "EquityShortInterestService_Adapter.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.equity_short_interest.proto.v1.EquityShortInterestService_Adapter$SetScrubIndexEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class EquityShortInterestService_Adapter2 extends ContinuationImpl7 implements Function2<SetScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityShortInterestService_Adapter.SetScrubIndexEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityShortInterestService_Adapter2(EquityShortInterestService_Adapter.SetScrubIndexEndpoint setScrubIndexEndpoint, Continuation<? super EquityShortInterestService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = setScrubIndexEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityShortInterestService_Adapter2 equityShortInterestService_Adapter2 = new EquityShortInterestService_Adapter2(this.this$0, continuation);
        equityShortInterestService_Adapter2.L$0 = obj;
        return equityShortInterestService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SetScrubIndexRequestDto setScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto> continuation) {
        return ((EquityShortInterestService_Adapter2) create(setScrubIndexRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        SetScrubIndexRequestDto setScrubIndexRequestDto = (SetScrubIndexRequestDto) this.L$0;
        EquityShortInterestService equityShortInterestService = this.this$0.service;
        this.label = 1;
        Object objSetScrubIndex = equityShortInterestService.SetScrubIndex(setScrubIndexRequestDto, this);
        return objSetScrubIndex == coroutine_suspended ? coroutine_suspended : objSetScrubIndex;
    }
}
