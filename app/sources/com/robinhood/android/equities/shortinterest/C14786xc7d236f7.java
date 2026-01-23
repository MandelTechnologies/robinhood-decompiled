package com.robinhood.android.equities.shortinterest;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.trading.contracts.EquitiesSubzeroSiChart;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.contracts.equity_short_interest.proto.p488v1.StreamShortInterestSectionResponseDto;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.equities.shortinterest.ShortInterestSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "ShortInterestSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.shortinterest.ShortInterestSectionDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C14786xc7d236f7 extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamShortInterestSectionResponseDto>, EquitiesSubzeroSiChart.Variant, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $instrumentId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ShortInterestSectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14786xc7d236f7(Continuation continuation, ShortInterestSectionDuxo shortInterestSectionDuxo, UUID uuid) {
        super(3, continuation);
        this.this$0 = shortInterestSectionDuxo;
        this.$instrumentId$inlined = uuid;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StreamShortInterestSectionResponseDto> flowCollector, EquitiesSubzeroSiChart.Variant variant, Continuation<? super Unit> continuation) {
        C14786xc7d236f7 c14786xc7d236f7 = new C14786xc7d236f7(continuation, this.this$0, this.$instrumentId$inlined);
        c14786xc7d236f7.L$0 = flowCollector;
        c14786xc7d236f7.L$1 = variant;
        return c14786xc7d236f7.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<StreamShortInterestSectionResponseDto> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            EquitiesSubzeroSiChart.Variant variant = (EquitiesSubzeroSiChart.Variant) this.L$1;
            this.this$0.applyMutation(new ShortInterestSectionDuxo2(variant, null));
            if (variant.getEnabled()) {
                flowFlowOf = this.this$0.shortInterestService.streamShortInterestSection(this.$instrumentId$inlined);
            } else {
                flowFlowOf = FlowKt.flowOf((Object) null);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
