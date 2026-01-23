package crypto.fee_tier.proto.p434v1;

import crypto.fee_tier.proto.p434v1.CryptoFeesBottomSheetService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoFeesBottomSheetService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetResponseDto;", "request", "Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "crypto.fee_tier.proto.v1.CryptoFeesBottomSheetService_Adapter$LaunchFeeTierUpsellBottomSheetEndpoint$call$1", m3645f = "CryptoFeesBottomSheetService_Adapter.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: crypto.fee_tier.proto.v1.CryptoFeesBottomSheetService_Adapter$LaunchFeeTierUpsellBottomSheetEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class CryptoFeesBottomSheetService_Adapter2 extends ContinuationImpl7 implements Function2<LaunchFeeTierUpsellBottomSheetRequestDto, Continuation<? super LaunchFeeTierUpsellBottomSheetResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoFeesBottomSheetService_Adapter.LaunchFeeTierUpsellBottomSheetEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeesBottomSheetService_Adapter2(CryptoFeesBottomSheetService_Adapter.LaunchFeeTierUpsellBottomSheetEndpoint launchFeeTierUpsellBottomSheetEndpoint, Continuation<? super CryptoFeesBottomSheetService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = launchFeeTierUpsellBottomSheetEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoFeesBottomSheetService_Adapter2 cryptoFeesBottomSheetService_Adapter2 = new CryptoFeesBottomSheetService_Adapter2(this.this$0, continuation);
        cryptoFeesBottomSheetService_Adapter2.L$0 = obj;
        return cryptoFeesBottomSheetService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LaunchFeeTierUpsellBottomSheetRequestDto launchFeeTierUpsellBottomSheetRequestDto, Continuation<? super LaunchFeeTierUpsellBottomSheetResponseDto> continuation) {
        return ((CryptoFeesBottomSheetService_Adapter2) create(launchFeeTierUpsellBottomSheetRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        LaunchFeeTierUpsellBottomSheetRequestDto launchFeeTierUpsellBottomSheetRequestDto = (LaunchFeeTierUpsellBottomSheetRequestDto) this.L$0;
        CryptoFeesBottomSheetService cryptoFeesBottomSheetService = this.this$0.service;
        this.label = 1;
        Object objLaunchFeeTierUpsellBottomSheet = cryptoFeesBottomSheetService.LaunchFeeTierUpsellBottomSheet(launchFeeTierUpsellBottomSheetRequestDto, this);
        return objLaunchFeeTierUpsellBottomSheet == coroutine_suspended ? coroutine_suspended : objLaunchFeeTierUpsellBottomSheet;
    }
}
