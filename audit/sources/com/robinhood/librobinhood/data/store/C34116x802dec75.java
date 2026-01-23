package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationResponse;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.simulatedreturns.OptionSimulatedReturnsConfigurationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/simulatedreturns/OptionSimulatedReturnsConfigurationResponse;", "request", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$getOptionSimulatedReturnConfigurationV3Endpoint$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {61}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$getOptionSimulatedReturnConfigurationV3Endpoint$1 */
/* loaded from: classes13.dex */
final class C34116x802dec75 extends ContinuationImpl7 implements Function2<ApiOptionSimulatedReturnsConfigurationV3Request, Continuation<? super OptionSimulatedReturnsConfigurationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionSimulatedReturnsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34116x802dec75(OptionSimulatedReturnsStore optionSimulatedReturnsStore, Continuation<? super C34116x802dec75> continuation) {
        super(2, continuation);
        this.this$0 = optionSimulatedReturnsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34116x802dec75 c34116x802dec75 = new C34116x802dec75(this.this$0, continuation);
        c34116x802dec75.L$0 = obj;
        return c34116x802dec75;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request, Continuation<? super OptionSimulatedReturnsConfigurationResponse> continuation) {
        return ((C34116x802dec75) create(apiOptionSimulatedReturnsConfigurationV3Request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request2 = (ApiOptionSimulatedReturnsConfigurationV3Request) this.L$0;
            OptionsProduct optionsProduct = this.this$0.optionsProductApi;
            this.L$0 = apiOptionSimulatedReturnsConfigurationV3Request2;
            this.label = 1;
            Object simulatedReturnsConfigurationV3 = optionsProduct.getSimulatedReturnsConfigurationV3(apiOptionSimulatedReturnsConfigurationV3Request2, this);
            if (simulatedReturnsConfigurationV3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiOptionSimulatedReturnsConfigurationV3Request = apiOptionSimulatedReturnsConfigurationV3Request2;
            obj = simulatedReturnsConfigurationV3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiOptionSimulatedReturnsConfigurationV3Request = (ApiOptionSimulatedReturnsConfigurationV3Request) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiOptionSimulatedReturnsConfigurationResponse) obj).toDbModel(apiOptionSimulatedReturnsConfigurationV3Request.getOptionParamsList());
    }
}
