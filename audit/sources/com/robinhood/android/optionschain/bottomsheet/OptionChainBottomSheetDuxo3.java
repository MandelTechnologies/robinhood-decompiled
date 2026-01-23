package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.librobinhood.data.store.OptionOrderStrategyStore;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.ApiOptionOrderStrategies;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$1$1$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {150}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$1$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainBottomSheetDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionOrderStrategies>, Object> {
    final /* synthetic */ List<ApiOptionOrderRequest.Leg> $legs;
    int label;
    final /* synthetic */ OptionChainBottomSheetDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainBottomSheetDuxo3(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, List<ApiOptionOrderRequest.Leg> list, Continuation<? super OptionChainBottomSheetDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = optionChainBottomSheetDuxo;
        this.$legs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainBottomSheetDuxo3(this.this$0, this.$legs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionOrderStrategies> continuation) {
        return ((OptionChainBottomSheetDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OptionOrderStrategyStore optionOrderStrategyStore = this.this$0.optionOrderStrategyStore;
        List<ApiOptionOrderRequest.Leg> list = this.$legs;
        this.label = 1;
        Object objFetchOptionOrderStrategies = optionOrderStrategyStore.fetchOptionOrderStrategies(list, this);
        return objFetchOptionOrderStrategies == coroutine_suspended ? coroutine_suspended : objFetchOptionOrderStrategies;
    }
}
