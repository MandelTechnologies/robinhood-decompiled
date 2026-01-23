package microgram.contracts.money_movement.transfer_validation.proto.p501v1;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.ValidationService_Adapter;

/* compiled from: ValidationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/ValidateResponseDto;", "request", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/ValidateRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.contracts.money_movement.transfer_validation.proto.v1.ValidationService_Adapter$ValidateEndpoint$call$1", m3645f = "ValidationService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: microgram.contracts.money_movement.transfer_validation.proto.v1.ValidationService_Adapter$ValidateEndpoint$call$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ValidationService_Adapter2 extends ContinuationImpl7 implements Function2<ValidateRequestDto, Continuation<? super ValidateResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ValidationService_Adapter.ValidateEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidationService_Adapter2(ValidationService_Adapter.ValidateEndpoint validateEndpoint, Continuation<? super ValidationService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = validateEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ValidationService_Adapter2 validationService_Adapter2 = new ValidationService_Adapter2(this.this$0, continuation);
        validationService_Adapter2.L$0 = obj;
        return validationService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ValidateRequestDto validateRequestDto, Continuation<? super ValidateResponseDto> continuation) {
        return ((ValidationService_Adapter2) create(validateRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ValidateRequestDto validateRequestDto = (ValidateRequestDto) this.L$0;
        ValidationService validationService = this.this$0.service;
        this.label = 1;
        Object objValidate = validationService.Validate(validateRequestDto, this);
        return objValidate == coroutine_suspended ? coroutine_suspended : objValidate;
    }
}
