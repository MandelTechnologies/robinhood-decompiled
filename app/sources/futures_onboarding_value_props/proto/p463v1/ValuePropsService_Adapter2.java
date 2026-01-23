package futures_onboarding_value_props.proto.p463v1;

import futures_onboarding_value_props.proto.p463v1.ValuePropsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ValuePropsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lfutures_onboarding_value_props/proto/v1/GetValuePropPagesResponseDto;", "request", "Lfutures_onboarding_value_props/proto/v1/GetValuePropPagesRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "futures_onboarding_value_props.proto.v1.ValuePropsService_Adapter$GetValuePropPagesEndpoint$call$1", m3645f = "ValuePropsService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: futures_onboarding_value_props.proto.v1.ValuePropsService_Adapter$GetValuePropPagesEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class ValuePropsService_Adapter2 extends ContinuationImpl7 implements Function2<GetValuePropPagesRequestDto, Continuation<? super GetValuePropPagesResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ValuePropsService_Adapter.GetValuePropPagesEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValuePropsService_Adapter2(ValuePropsService_Adapter.GetValuePropPagesEndpoint getValuePropPagesEndpoint, Continuation<? super ValuePropsService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getValuePropPagesEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ValuePropsService_Adapter2 valuePropsService_Adapter2 = new ValuePropsService_Adapter2(this.this$0, continuation);
        valuePropsService_Adapter2.L$0 = obj;
        return valuePropsService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetValuePropPagesRequestDto getValuePropPagesRequestDto, Continuation<? super GetValuePropPagesResponseDto> continuation) {
        return ((ValuePropsService_Adapter2) create(getValuePropPagesRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetValuePropPagesRequestDto getValuePropPagesRequestDto = (GetValuePropPagesRequestDto) this.L$0;
        ValuePropsService valuePropsService = this.this$0.service;
        this.label = 1;
        Object objGetValuePropPages = valuePropsService.GetValuePropPages(getValuePropPagesRequestDto, this);
        return objGetValuePropPages == coroutine_suspended ? coroutine_suspended : objGetValuePropPages;
    }
}
