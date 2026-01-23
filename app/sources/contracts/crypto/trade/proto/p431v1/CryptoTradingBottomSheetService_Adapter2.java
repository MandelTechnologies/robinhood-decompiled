package contracts.crypto.trade.proto.p431v1;

import contracts.crypto.trade.proto.p431v1.CryptoTradingBottomSheetService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTradingBottomSheetService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetResponseDto;", "request", "Lcontracts/crypto/trade/proto/v1/LaunchBottomSheetRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "contracts.crypto.trade.proto.v1.CryptoTradingBottomSheetService_Adapter$LaunchBottomSheetEndpoint$call$1", m3645f = "CryptoTradingBottomSheetService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: contracts.crypto.trade.proto.v1.CryptoTradingBottomSheetService_Adapter$LaunchBottomSheetEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class CryptoTradingBottomSheetService_Adapter2 extends ContinuationImpl7 implements Function2<LaunchBottomSheetRequestDto, Continuation<? super LaunchBottomSheetResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTradingBottomSheetService_Adapter.LaunchBottomSheetEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTradingBottomSheetService_Adapter2(CryptoTradingBottomSheetService_Adapter.LaunchBottomSheetEndpoint launchBottomSheetEndpoint, Continuation<? super CryptoTradingBottomSheetService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = launchBottomSheetEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTradingBottomSheetService_Adapter2 cryptoTradingBottomSheetService_Adapter2 = new CryptoTradingBottomSheetService_Adapter2(this.this$0, continuation);
        cryptoTradingBottomSheetService_Adapter2.L$0 = obj;
        return cryptoTradingBottomSheetService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LaunchBottomSheetRequestDto launchBottomSheetRequestDto, Continuation<? super LaunchBottomSheetResponseDto> continuation) {
        return ((CryptoTradingBottomSheetService_Adapter2) create(launchBottomSheetRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        LaunchBottomSheetRequestDto launchBottomSheetRequestDto = (LaunchBottomSheetRequestDto) this.L$0;
        CryptoTradingBottomSheetService cryptoTradingBottomSheetService = this.this$0.service;
        this.label = 1;
        Object objLaunchBottomSheet = cryptoTradingBottomSheetService.LaunchBottomSheet(launchBottomSheetRequestDto, this);
        return objLaunchBottomSheet == coroutine_suspended ? coroutine_suspended : objLaunchBottomSheet;
    }
}
