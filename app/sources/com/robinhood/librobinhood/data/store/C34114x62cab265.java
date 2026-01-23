package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.optionsproduct.OptionsProduct;
import com.robinhood.models.api.simulatedreturns.ApiOptionShouldShowSimulatedReturnsResponse;
import com.robinhood.models.p320db.simulatedreturns.OptionShouldShowSimulatedReturnsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/simulatedreturns/OptionShouldShowSimulatedReturnsResponse;", "strategyCode", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$getOptionShouldShowSimulatedReturnsEndpoint$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {83}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$getOptionShouldShowSimulatedReturnsEndpoint$1 */
/* loaded from: classes13.dex */
final class C34114x62cab265 extends ContinuationImpl7 implements Function2<String, Continuation<? super OptionShouldShowSimulatedReturnsResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionSimulatedReturnsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34114x62cab265(OptionSimulatedReturnsStore optionSimulatedReturnsStore, Continuation<? super C34114x62cab265> continuation) {
        super(2, continuation);
        this.this$0 = optionSimulatedReturnsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34114x62cab265 c34114x62cab265 = new C34114x62cab265(this.this$0, continuation);
        c34114x62cab265.L$0 = obj;
        return c34114x62cab265;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super OptionShouldShowSimulatedReturnsResponse> continuation) {
        return ((C34114x62cab265) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            OptionsProduct optionsProduct = this.this$0.optionsProductApi;
            this.label = 1;
            obj = optionsProduct.getShouldShowSimulatedReturns(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiOptionShouldShowSimulatedReturnsResponse) obj).toDbModel();
    }
}
