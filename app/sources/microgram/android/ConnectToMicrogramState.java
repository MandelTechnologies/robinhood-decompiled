package microgram.android;

import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ConnectToMicrogramState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001¨\u0006\u0007"}, m3636d2 = {"connectToMicrogramState", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "T", "stateFlow", "Lmicrogram/android/MicrogramState;", "loadingResultFlow", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.ConnectToMicrogramStateKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ConnectToMicrogramState {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConnectToMicrogramState.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.ConnectToMicrogramStateKt$connectToMicrogramState$1", m3645f = "ConnectToMicrogramState.kt", m3646l = {21}, m3647m = "invokeSuspend")
    /* renamed from: microgram.android.ConnectToMicrogramStateKt$connectToMicrogramState$1 */
    public static final class C462421 extends ContinuationImpl7 implements Function2 {
        int label;

        C462421(Continuation<? super C462421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C462421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((C462421) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public static /* synthetic */ Flow connectToMicrogramState$default(Flow flow, Flow flow2, Flow flow3, int i, Object obj) {
        if ((i & 2) != 0) {
            flow3 = FlowKt.flow(new C462421(null));
        }
        return connectToMicrogramState(flow, flow2, flow3);
    }

    public static final <T> Flow<Result<T>> connectToMicrogramState(Flow<? extends Result<? extends T>> flow, Flow<? extends Monitoring> stateFlow, Flow<? extends Result<? extends T>> loadingResultFlow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(stateFlow, "stateFlow");
        Intrinsics.checkNotNullParameter(loadingResultFlow, "loadingResultFlow");
        return FlowKt.transformLatest(stateFlow, new C46241xa7d36983(null, loadingResultFlow, flow));
    }
}
