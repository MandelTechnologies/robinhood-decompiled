package com.robinhood.android.portfolio.pnl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import wormhole.service.p554v1.GetSupportedAssetClassesRequestDto;
import wormhole.service.p554v1.GetSupportedAssetClassesResponseDto;
import wormhole.service.p554v1.PNLService;

/* compiled from: ProfitAndLossHubSectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lwormhole/service/v1/GetSupportedAssetClassesResponseDto;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$supportedAssetTypesEndpoint$1", m3645f = "ProfitAndLossHubSectionStore.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore$supportedAssetTypesEndpoint$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ProfitAndLossHubSectionStore6 extends ContinuationImpl7 implements Function2<String, Continuation<? super GetSupportedAssetClassesResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfitAndLossHubSectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfitAndLossHubSectionStore6(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, Continuation<? super ProfitAndLossHubSectionStore6> continuation) {
        super(2, continuation);
        this.this$0 = profitAndLossHubSectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitAndLossHubSectionStore6 profitAndLossHubSectionStore6 = new ProfitAndLossHubSectionStore6(this.this$0, continuation);
        profitAndLossHubSectionStore6.L$0 = obj;
        return profitAndLossHubSectionStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super GetSupportedAssetClassesResponseDto> continuation) {
        return ((ProfitAndLossHubSectionStore6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        PNLService pNLService = this.this$0.wormholePnlService;
        GetSupportedAssetClassesRequestDto getSupportedAssetClassesRequestDto = new GetSupportedAssetClassesRequestDto(str);
        this.label = 1;
        Object objGetSupportedAssetClasses = pNLService.GetSupportedAssetClasses(getSupportedAssetClassesRequestDto, this);
        return objGetSupportedAssetClasses == coroutine_suspended ? coroutine_suspended : objGetSupportedAssetClasses;
    }
}
