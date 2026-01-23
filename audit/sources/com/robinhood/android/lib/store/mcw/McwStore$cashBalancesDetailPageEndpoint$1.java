package com.robinhood.android.lib.store.mcw;

import com.robinhood.android.lib.store.mcw.data.CashBalancesDetailsPageData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CashBalancesDetailsPageService;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesDetailsPageFooterRequestDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesDetailsPageFooterResponseDto;

/* compiled from: McwStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/store/mcw/data/CashBalancesDetailsPageData;", "request", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore$cashBalancesDetailPageEndpoint$1", m3645f = "McwStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class McwStore$cashBalancesDetailPageEndpoint$1 extends ContinuationImpl7 implements Function2<GetCashBalancesDetailsPageFooterRequestDto, Continuation<? super CashBalancesDetailsPageData>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwStore$cashBalancesDetailPageEndpoint$1(McwStore mcwStore, Continuation<? super McwStore$cashBalancesDetailPageEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = mcwStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwStore$cashBalancesDetailPageEndpoint$1 mcwStore$cashBalancesDetailPageEndpoint$1 = new McwStore$cashBalancesDetailPageEndpoint$1(this.this$0, continuation);
        mcwStore$cashBalancesDetailPageEndpoint$1.L$0 = obj;
        return mcwStore$cashBalancesDetailPageEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCashBalancesDetailsPageFooterRequestDto getCashBalancesDetailsPageFooterRequestDto, Continuation<? super CashBalancesDetailsPageData> continuation) {
        return ((McwStore$cashBalancesDetailPageEndpoint$1) create(getCashBalancesDetailsPageFooterRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CashBalancesDetailsPageData.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetCashBalancesDetailsPageFooterRequestDto getCashBalancesDetailsPageFooterRequestDto = (GetCashBalancesDetailsPageFooterRequestDto) this.L$0;
            CashBalancesDetailsPageData.Companion companion2 = CashBalancesDetailsPageData.INSTANCE;
            CashBalancesDetailsPageService cashBalancesDetailsPageService = this.this$0.cashBalancesDetailsService;
            this.L$0 = companion2;
            this.label = 1;
            obj = cashBalancesDetailsPageService.GetCashBalancesDetailsPageFooter(getCashBalancesDetailsPageFooterRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (CashBalancesDetailsPageData.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return companion.toCashBalancesDetailsPageData((GetCashBalancesDetailsPageFooterResponseDto) obj);
    }
}
