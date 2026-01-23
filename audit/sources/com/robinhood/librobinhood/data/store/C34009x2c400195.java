package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.models.api.chainsettings.ApiChainCustomization;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization$UpdateMetricsRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$updateStrategyBuilderSelectedMetricsEndpoint$1", m3645f = "OptionChainCustomizationStore.kt", m3646l = {115}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$updateStrategyBuilderSelectedMetricsEndpoint$1 */
/* loaded from: classes13.dex */
final class C34009x2c400195 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends ApiChainCustomization.UpdateMetricsRequest>, Continuation<? super ApiChainCustomization>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionChainCustomizationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34009x2c400195(OptionChainCustomizationStore optionChainCustomizationStore, Continuation<? super C34009x2c400195> continuation) {
        super(2, continuation);
        this.this$0 = optionChainCustomizationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34009x2c400195 c34009x2c400195 = new C34009x2c400195(this.this$0, continuation);
        c34009x2c400195.L$0 = obj;
        return c34009x2c400195;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends ApiChainCustomization.UpdateMetricsRequest> tuples2, Continuation<? super ApiChainCustomization> continuation) {
        return invoke2((Tuples2<String, ApiChainCustomization.UpdateMetricsRequest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, ApiChainCustomization.UpdateMetricsRequest> tuples2, Continuation<? super ApiChainCustomization> continuation) {
        return ((C34009x2c400195) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        String str = (String) tuples2.component1();
        ApiChainCustomization.UpdateMetricsRequest updateMetricsRequest = (ApiChainCustomization.UpdateMetricsRequest) tuples2.component2();
        OptionsProduct optionsProduct = this.this$0.optionsProduct;
        this.label = 1;
        Object objUpdateStrategyBuilderCustomization = optionsProduct.updateStrategyBuilderCustomization(str, updateMetricsRequest, this);
        return objUpdateStrategyBuilderCustomization == coroutine_suspended ? coroutine_suspended : objUpdateStrategyBuilderCustomization;
    }
}
