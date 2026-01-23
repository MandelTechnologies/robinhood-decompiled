package microgram.android;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import microgram.android.Monitoring;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "microgram.android.ConnectToMicrogramStateKt$connectToMicrogramState$$inlined$flatMapLatest$1", m3645f = "ConnectToMicrogramState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: microgram.android.ConnectToMicrogramStateKt$connectToMicrogramState$$inlined$flatMapLatest$1 */
/* loaded from: classes14.dex */
public final class C46241xa7d36983<T> extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends T>>, Monitoring, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $loadingResultFlow$inlined;
    final /* synthetic */ Flow $this_connectToMicrogramState$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46241xa7d36983(Continuation continuation, Flow flow, Flow flow2) {
        super(3, continuation);
        this.$loadingResultFlow$inlined = flow;
        this.$this_connectToMicrogramState$inlined = flow2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Result<? extends T>> flowCollector, Monitoring monitoring, Continuation<? super Unit> continuation) {
        C46241xa7d36983 c46241xa7d36983 = new C46241xa7d36983(continuation, this.$loadingResultFlow$inlined, this.$this_connectToMicrogramState$inlined);
        c46241xa7d36983.L$0 = flowCollector;
        c46241xa7d36983.L$1 = monitoring;
        return c46241xa7d36983.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Monitoring monitoring = (Monitoring) this.L$1;
            if (monitoring instanceof Monitoring.Loading) {
                flowFlowOf = this.$loadingResultFlow$inlined;
            } else if (monitoring instanceof Monitoring.Ready) {
                flowFlowOf = this.$this_connectToMicrogramState$inlined;
            } else {
                if (!(monitoring instanceof Monitoring.Terminated)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion = Result.INSTANCE;
                flowFlowOf = FlowKt.flowOf(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(new ConnectToMicrogramState2(((Monitoring.Terminated) monitoring).getException())))));
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
