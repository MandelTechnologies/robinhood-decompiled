package contracts.crypto.trade.proto.p431v1;

import contracts.crypto.trade.proto.p431v1.CryptoOrderValidationService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderValidationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto;", "request", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "contracts.crypto.trade.proto.v1.CryptoOrderValidationService_Adapter$ValidateCryptoOrderEndpoint$call$1", m3645f = "CryptoOrderValidationService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: contracts.crypto.trade.proto.v1.CryptoOrderValidationService_Adapter$ValidateCryptoOrderEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class CryptoOrderValidationService_Adapter2 extends ContinuationImpl7 implements Function2<ValidateCryptoOrderRequestDto, Continuation<? super ValidateCryptoOrderResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoOrderValidationService_Adapter.ValidateCryptoOrderEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderValidationService_Adapter2(CryptoOrderValidationService_Adapter.ValidateCryptoOrderEndpoint validateCryptoOrderEndpoint, Continuation<? super CryptoOrderValidationService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = validateCryptoOrderEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderValidationService_Adapter2 cryptoOrderValidationService_Adapter2 = new CryptoOrderValidationService_Adapter2(this.this$0, continuation);
        cryptoOrderValidationService_Adapter2.L$0 = obj;
        return cryptoOrderValidationService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ValidateCryptoOrderRequestDto validateCryptoOrderRequestDto, Continuation<? super ValidateCryptoOrderResponseDto> continuation) {
        return ((CryptoOrderValidationService_Adapter2) create(validateCryptoOrderRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ValidateCryptoOrderRequestDto validateCryptoOrderRequestDto = (ValidateCryptoOrderRequestDto) this.L$0;
        CryptoOrderValidationService cryptoOrderValidationService = this.this$0.service;
        this.label = 1;
        Object objValidateCryptoOrder = cryptoOrderValidationService.ValidateCryptoOrder(validateCryptoOrderRequestDto, this);
        return objValidateCryptoOrder == coroutine_suspended ? coroutine_suspended : objValidateCryptoOrder;
    }
}
