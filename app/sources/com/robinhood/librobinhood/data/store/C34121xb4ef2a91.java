package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$pollOptionQuoteFlow$1", m3645f = "OptionSimulatedReturnsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore$streamMarketDataParamsV3$2$pollOptionQuoteFlow$1 */
/* loaded from: classes13.dex */
final class C34121xb4ef2a91 extends ContinuationImpl7 implements Function2<FlowCollector<? super Object>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    C34121xb4ef2a91(Continuation<? super C34121xb4ef2a91> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34121xb4ef2a91 c34121xb4ef2a91 = new C34121xb4ef2a91(continuation);
        c34121xb4ef2a91.L$0 = obj;
        return c34121xb4ef2a91;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<Object>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((C34121xb4ef2a91) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            if (flowCollector.emit(unit, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
