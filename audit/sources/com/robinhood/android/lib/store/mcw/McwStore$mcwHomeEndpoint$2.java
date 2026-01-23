package com.robinhood.android.lib.store.mcw;

import com.robinhood.android.lib.store.mcw.data.McwHomeSectionData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.mcw_cash_balances.proto.p497v1.CashBalancesHomeSectionService;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesHomeSectionRequestDto;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesHomeSectionResponseDto;

/* compiled from: McwStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/store/mcw/data/McwHomeSectionData;", "request", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.mcw.McwStore$mcwHomeEndpoint$2", m3645f = "McwStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class McwStore$mcwHomeEndpoint$2 extends ContinuationImpl7 implements Function2<GetCashBalancesHomeSectionRequestDto, Continuation<? super McwHomeSectionData>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ McwStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    McwStore$mcwHomeEndpoint$2(McwStore mcwStore, Continuation<? super McwStore$mcwHomeEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = mcwStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        McwStore$mcwHomeEndpoint$2 mcwStore$mcwHomeEndpoint$2 = new McwStore$mcwHomeEndpoint$2(this.this$0, continuation);
        mcwStore$mcwHomeEndpoint$2.L$0 = obj;
        return mcwStore$mcwHomeEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetCashBalancesHomeSectionRequestDto getCashBalancesHomeSectionRequestDto, Continuation<? super McwHomeSectionData> continuation) {
        return ((McwStore$mcwHomeEndpoint$2) create(getCashBalancesHomeSectionRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        McwHomeSectionData.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetCashBalancesHomeSectionRequestDto getCashBalancesHomeSectionRequestDto = (GetCashBalancesHomeSectionRequestDto) this.L$0;
            McwHomeSectionData.Companion companion2 = McwHomeSectionData.INSTANCE;
            CashBalancesHomeSectionService cashBalancesHomeSectionService = this.this$0.mcwHomeService;
            this.L$0 = companion2;
            this.label = 1;
            obj = cashBalancesHomeSectionService.GetCashBalancesHomeSection(getCashBalancesHomeSectionRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (McwHomeSectionData.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return companion.toMcwHomeSectionData((GetCashBalancesHomeSectionResponseDto) obj);
    }
}
