package microgram.contracts.mcw_cash_balances.proto.p497v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CashBalancesHomeSectionService_Adapter;

/* compiled from: CashBalancesHomeSectionService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "request", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.mcw_cash_balances.proto.v1.CashBalancesHomeSectionService_Adapter$GetCashBalancesHomeSectionEndpoint$call$1", m3645f = "CashBalancesHomeSectionService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.mcw_cash_balances.proto.v1.CashBalancesHomeSectionService_Adapter$GetCashBalancesHomeSectionEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class CashBalancesHomeSectionService_Adapter2 extends ContinuationImpl7 implements Function2<GetCashBalancesHomeSectionRequestDto, Continuation<? super GetCashBalancesHomeSectionResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CashBalancesHomeSectionService_Adapter.GetCashBalancesHomeSectionEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashBalancesHomeSectionService_Adapter2(CashBalancesHomeSectionService_Adapter.GetCashBalancesHomeSectionEndpoint getCashBalancesHomeSectionEndpoint, Continuation<? super CashBalancesHomeSectionService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getCashBalancesHomeSectionEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CashBalancesHomeSectionService_Adapter2 cashBalancesHomeSectionService_Adapter2 = new CashBalancesHomeSectionService_Adapter2(this.this$0, continuation);
        cashBalancesHomeSectionService_Adapter2.L$0 = obj;
        return cashBalancesHomeSectionService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCashBalancesHomeSectionRequestDto getCashBalancesHomeSectionRequestDto, Continuation<? super GetCashBalancesHomeSectionResponseDto> continuation) {
        return ((CashBalancesHomeSectionService_Adapter2) create(getCashBalancesHomeSectionRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetCashBalancesHomeSectionRequestDto getCashBalancesHomeSectionRequestDto = (GetCashBalancesHomeSectionRequestDto) this.L$0;
        CashBalancesHomeSectionService cashBalancesHomeSectionService = this.this$0.service;
        this.label = 1;
        Object objGetCashBalancesHomeSection = cashBalancesHomeSectionService.GetCashBalancesHomeSection(getCashBalancesHomeSectionRequestDto, this);
        return objGetCashBalancesHomeSection == coroutine_suspended ? coroutine_suspended : objGetCashBalancesHomeSection;
    }
}
