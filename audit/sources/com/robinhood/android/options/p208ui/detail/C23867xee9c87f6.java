package com.robinhood.android.options.p208ui.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.models.p320db.OptionTooltip;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C23867xee9c87f6 extends ContinuationImpl7 implements Function3<FlowCollector<? super OptionsSimulatedReturnTooltipState>, Tuples2<? extends String, ? extends Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsDetailPageDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23867xee9c87f6(Continuation continuation, OptionsDetailPageDuxo optionsDetailPageDuxo) {
        super(3, continuation);
        this.this$0 = optionsDetailPageDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super OptionsSimulatedReturnTooltipState> flowCollector, Tuples2<? extends String, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
        C23867xee9c87f6 c23867xee9c87f6 = new C23867xee9c87f6(continuation, this.this$0);
        c23867xee9c87f6.L$0 = flowCollector;
        c23867xee9c87f6.L$1 = tuples2;
        return c23867xee9c87f6.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r4, r10, r9) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        int i;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            String str2 = (String) tuples2.component1();
            int iIntValue = ((Number) tuples2.component2()).intValue();
            OptionTooltipStore optionTooltipStore = this.this$0.optionTooltipStore;
            String serverValue = ((OptionsDetailPageFragment.Args) OptionsDetailPageDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getLaunchMode().getSource().getServerValue();
            this.L$0 = flowCollector;
            this.L$1 = str2;
            this.I$0 = iIntValue;
            this.label = 1;
            Object optionDetailPageProjectedReturnTooltip = optionTooltipStore.getOptionDetailPageProjectedReturnTooltip(serverValue, str2, this);
            if (optionDetailPageProjectedReturnTooltip != coroutine_suspended) {
                i = iIntValue;
                obj = optionDetailPageProjectedReturnTooltip;
                str = str2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        i = this.I$0;
        str = (String) this.L$1;
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        OptionTooltip optionTooltip = (OptionTooltip) obj;
        Flow flowFlowOf = FlowKt.flowOf(optionTooltip == null ? null : new OptionsSimulatedReturnTooltipState(optionTooltip, i, str));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
