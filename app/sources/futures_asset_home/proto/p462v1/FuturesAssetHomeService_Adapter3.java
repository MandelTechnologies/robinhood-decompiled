package futures_asset_home.proto.p462v1;

import futures_asset_home.proto.p462v1.FuturesAssetHomeService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAssetHomeService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeNuxInfoResponseDto;", "request", "Lfutures_asset_home/proto/v1/GetFuturesAssetHomeNuxInfoRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "futures_asset_home.proto.v1.FuturesAssetHomeService_Adapter$GetFuturesAssetHomeNuxInfoEndpoint$call$1", m3645f = "FuturesAssetHomeService_Adapter.kt", m3646l = {84}, m3647m = "invokeSuspend")
/* renamed from: futures_asset_home.proto.v1.FuturesAssetHomeService_Adapter$GetFuturesAssetHomeNuxInfoEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class FuturesAssetHomeService_Adapter3 extends ContinuationImpl7 implements Function2<GetFuturesAssetHomeNuxInfoRequestDto, Continuation<? super GetFuturesAssetHomeNuxInfoResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAssetHomeService_Adapter.GetFuturesAssetHomeNuxInfoEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAssetHomeService_Adapter3(FuturesAssetHomeService_Adapter.GetFuturesAssetHomeNuxInfoEndpoint getFuturesAssetHomeNuxInfoEndpoint, Continuation<? super FuturesAssetHomeService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = getFuturesAssetHomeNuxInfoEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAssetHomeService_Adapter3 futuresAssetHomeService_Adapter3 = new FuturesAssetHomeService_Adapter3(this.this$0, continuation);
        futuresAssetHomeService_Adapter3.L$0 = obj;
        return futuresAssetHomeService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetFuturesAssetHomeNuxInfoRequestDto getFuturesAssetHomeNuxInfoRequestDto, Continuation<? super GetFuturesAssetHomeNuxInfoResponseDto> continuation) {
        return ((FuturesAssetHomeService_Adapter3) create(getFuturesAssetHomeNuxInfoRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetFuturesAssetHomeNuxInfoRequestDto getFuturesAssetHomeNuxInfoRequestDto = (GetFuturesAssetHomeNuxInfoRequestDto) this.L$0;
        FuturesAssetHomeService futuresAssetHomeService = this.this$0.service;
        this.label = 1;
        Object objGetFuturesAssetHomeNuxInfo = futuresAssetHomeService.GetFuturesAssetHomeNuxInfo(getFuturesAssetHomeNuxInfoRequestDto, this);
        return objGetFuturesAssetHomeNuxInfo == coroutine_suspended ? coroutine_suspended : objGetFuturesAssetHomeNuxInfo;
    }
}
