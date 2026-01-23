package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationResponse2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV4Request;
import com.robinhood.models.p320db.simulatedreturns.OptionSimulatedReturnsConfigurationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import options_product.service.GetSimulatedReturnsParamsV4RequestDto;
import options_product.service.SimulatedReturns;
import options_product.service.SimulatedReturnsParamsResponseDto;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/simulatedreturns/OptionSimulatedReturnsConfigurationResponse;", "request", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV4Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$getOptionSimulatedReturnConfigurationV4Endpoint$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$getOptionSimulatedReturnConfigurationV4Endpoint$1 */
/* loaded from: classes13.dex */
final class C34118x15129f36 extends ContinuationImpl7 implements Function2<ApiOptionSimulatedReturnsConfigurationV4Request, Continuation<? super OptionSimulatedReturnsConfigurationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionSimulatedReturnsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34118x15129f36(OptionSimulatedReturnsStore optionSimulatedReturnsStore, Continuation<? super C34118x15129f36> continuation) {
        super(2, continuation);
        this.this$0 = optionSimulatedReturnsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34118x15129f36 c34118x15129f36 = new C34118x15129f36(this.this$0, continuation);
        c34118x15129f36.L$0 = obj;
        return c34118x15129f36;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionSimulatedReturnsConfigurationV4Request apiOptionSimulatedReturnsConfigurationV4Request, Continuation<? super OptionSimulatedReturnsConfigurationResponse> continuation) {
        return ((C34118x15129f36) create(apiOptionSimulatedReturnsConfigurationV4Request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiOptionSimulatedReturnsConfigurationV4Request apiOptionSimulatedReturnsConfigurationV4Request = (ApiOptionSimulatedReturnsConfigurationV4Request) this.L$0;
            SimulatedReturns simulatedReturns = this.this$0.simulatedReturnsService;
            GetSimulatedReturnsParamsV4RequestDto dto = apiOptionSimulatedReturnsConfigurationV4Request.toDto();
            this.label = 1;
            obj = simulatedReturns.GetSimulatedReturnsParamsV4(dto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ApiOptionSimulatedReturnsConfigurationResponse2.toDbModel((SimulatedReturnsParamsResponseDto) obj);
    }
}
