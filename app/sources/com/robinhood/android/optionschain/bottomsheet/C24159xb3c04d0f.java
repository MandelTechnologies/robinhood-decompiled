package com.robinhood.android.optionschain.bottomsheet;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$6$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C24159xb3c04d0f extends ContinuationImpl7 implements Function3<FlowCollector<? super Optional<? extends CuratedListItem>>, OptionLegBundle, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionChainBottomSheetDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24159xb3c04d0f(Continuation continuation, OptionChainBottomSheetDuxo optionChainBottomSheetDuxo) {
        super(3, continuation);
        this.this$0 = optionChainBottomSheetDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Optional<? extends CuratedListItem>> flowCollector, OptionLegBundle optionLegBundle, Continuation<? super Unit> continuation) {
        C24159xb3c04d0f c24159xb3c04d0f = new C24159xb3c04d0f(continuation, this.this$0);
        c24159xb3c04d0f.L$0 = flowCollector;
        c24159xb3c04d0f.L$1 = optionLegBundle;
        return c24159xb3c04d0f.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String longStrategyCode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            OptionLegBundle optionLegBundle = (OptionLegBundle) this.L$1;
            int i2 = OptionChainBottomSheetDuxo.C241712.AnonymousClass6.WhenMappings.$EnumSwitchMapping$0[optionLegBundle.getOptionConfigurationBundle().getOptionSide().ordinal()];
            if (i2 == 1) {
                longStrategyCode = optionLegBundle.getOptionInstrument().getLongStrategyCode();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                longStrategyCode = optionLegBundle.getOptionInstrument().getShortStrategyCode();
            }
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.optionsWatchlistStore.streamItemByStrategyCode(longStrategyCode)), Integer.MAX_VALUE, null, 2, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBuffer$default, this) == coroutine_suspended) {
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
