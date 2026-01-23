package com.robinhood.android.common.options.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiAggregateOptionPositionToIndexFlow$$inlined$flatMapLatest$1", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiAggregateOptionPositionToIndexFlow$$inlined$flatMapLatest$1 */
/* loaded from: classes2.dex */
public final class C11347xe926b613 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Tuples2<? extends String, ? extends String>, ? extends Integer>>, Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $accountNumberToStrategyCodeToIndexFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11347xe926b613(Continuation continuation, Flow flow) {
        super(3, continuation);
        this.$accountNumberToStrategyCodeToIndexFlow$inlined = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends Tuples2<? extends String, ? extends String>, ? extends Integer>> flowCollector, Tuples2<? extends UiOptionStrategyInfo, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
        C11347xe926b613 c11347xe926b613 = new C11347xe926b613(continuation, this.$accountNumberToStrategyCodeToIndexFlow$inlined);
        c11347xe926b613.L$0 = flowCollector;
        c11347xe926b613.L$1 = tuples2;
        return c11347xe926b613.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flowFilterSameIndex = OptionsDetailPageDuxoHelper.filterSameIndex(FlowKt.distinctUntilChanged(this.$accountNumberToStrategyCodeToIndexFlow$inlined), ((Number) ((Tuples2) this.L$1).component2()).intValue(), new Function1<Tuples2<? extends Tuples2<? extends String, ? extends String>, ? extends Integer>, Integer>() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getUiAggregateOptionPositionToIndexFlow$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Integer invoke2(Tuples2<Tuples2<String, String>, Integer> tuples2) {
                    Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                    return Integer.valueOf(tuples2.component2().intValue());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Tuples2<? extends Tuples2<? extends String, ? extends String>, ? extends Integer> tuples2) {
                    return invoke2((Tuples2<Tuples2<String, String>, Integer>) tuples2);
                }
            });
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFilterSameIndex, this) == coroutine_suspended) {
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
