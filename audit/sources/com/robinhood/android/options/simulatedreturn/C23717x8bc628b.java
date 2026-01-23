package com.robinhood.android.options.simulatedreturn;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.models.p320db.OptionTooltip;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$invokeSuspend$$inlined$flatMapLatest$2", m3645f = "OptionsSimulatedReturnDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnDuxo$onCreate$3$invokeSuspend$$inlined$flatMapLatest$2 */
/* loaded from: classes11.dex */
public final class C23717x8bc628b extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends OptionTooltip, ? extends OptionTooltip>>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsSimulatedReturnDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23717x8bc628b(Continuation continuation, OptionsSimulatedReturnDuxo optionsSimulatedReturnDuxo) {
        super(3, continuation);
        this.this$0 = optionsSimulatedReturnDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends OptionTooltip, ? extends OptionTooltip>> flowCollector, String str, Continuation<? super Unit> continuation) {
        C23717x8bc628b c23717x8bc628b = new C23717x8bc628b(continuation, this.this$0);
        c23717x8bc628b.L$0 = flowCollector;
        c23717x8bc628b.L$1 = str;
        return c23717x8bc628b.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, r10, r9) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        FlowCollector flowCollector;
        OptionTooltip optionTooltip;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            str = (String) this.L$1;
            OptionTooltipStore optionTooltipStore = this.this$0.optionTooltipStore;
            String fixedAccountNumber = ((OptionsSimulatedReturnFragment.Args) OptionsSimulatedReturnDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getKey().getFixedAccountNumber();
            this.L$0 = flowCollector3;
            this.L$1 = str;
            this.label = 1;
            Object optionSimulatedReturnSliderTooltip = optionTooltipStore.getOptionSimulatedReturnSliderTooltip(str, fixedAccountNumber, this);
            if (optionSimulatedReturnSliderTooltip != coroutine_suspended) {
                flowCollector = flowCollector3;
                obj = optionSimulatedReturnSliderTooltip;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            str = (String) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            optionTooltip = (OptionTooltip) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            Flow flowFlowOf = FlowKt.flowOf(Tuples4.m3642to(optionTooltip, (OptionTooltip) obj));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        OptionTooltip optionTooltip2 = (OptionTooltip) obj;
        OptionTooltipStore optionTooltipStore2 = this.this$0.optionTooltipStore;
        String fixedAccountNumber2 = ((OptionsSimulatedReturnFragment.Args) OptionsSimulatedReturnDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getKey().getFixedAccountNumber();
        this.L$0 = flowCollector;
        this.L$1 = optionTooltip2;
        this.label = 2;
        Object optionSimulatedReturnInfoButtonTooltip = optionTooltipStore2.getOptionSimulatedReturnInfoButtonTooltip(str, fixedAccountNumber2, this);
        if (optionSimulatedReturnInfoButtonTooltip != coroutine_suspended) {
            optionTooltip = optionTooltip2;
            obj = optionSimulatedReturnInfoButtonTooltip;
            flowCollector2 = flowCollector;
            Flow flowFlowOf2 = FlowKt.flowOf(Tuples4.m3642to(optionTooltip, (OptionTooltip) obj));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
