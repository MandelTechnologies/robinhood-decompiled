package kotlinx.coroutines.flow;

import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: SharingStarted.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/SharingStarted;", "<init>", "()V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "toString", "", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.flow.StartedLazily, reason: use source file name */
/* loaded from: classes23.dex */
final class SharingStarted4 implements SharingStarted {

    /* compiled from: SharingStarted.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.StartedLazily$command$1", m3645f = "SharingStarted.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1 */
    /* loaded from: classes14.dex */
    static final class C461201 extends ContinuationImpl7 implements Function2<FlowCollector<? super SharingStarted2>, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateFlow<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C461201(StateFlow<Integer> stateFlow, Continuation<? super C461201> continuation) {
            super(2, continuation);
            this.$subscriptionCount = stateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C461201 c461201 = new C461201(this.$subscriptionCount, continuation);
            c461201.L$0 = obj;
            return c461201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super SharingStarted2> flowCollector, Continuation<? super Unit> continuation) {
            return ((C461201) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                StateFlow<Integer> stateFlow = this.$subscriptionCount;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(booleanRef, flowCollector);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SharingStarted.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<SharingStarted2> $$this$flow;
            final /* synthetic */ Ref.BooleanRef $started;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.BooleanRef booleanRef, FlowCollector<? super SharingStarted2> flowCollector) {
                this.$started = booleanRef;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(int i, Continuation<? super Unit> continuation) {
                SharingStarted5 sharingStarted5;
                if (continuation instanceof SharingStarted5) {
                    sharingStarted5 = (SharingStarted5) continuation;
                    int i2 = sharingStarted5.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        sharingStarted5.label = i2 - Integer.MIN_VALUE;
                    } else {
                        sharingStarted5 = new SharingStarted5(this, continuation);
                    }
                }
                Object obj = sharingStarted5.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = sharingStarted5.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i > 0) {
                        Ref.BooleanRef booleanRef = this.$started;
                        if (!booleanRef.element) {
                            booleanRef.element = true;
                            FlowCollector<SharingStarted2> flowCollector = this.$$this$flow;
                            SharingStarted2 sharingStarted2 = SharingStarted2.START;
                            sharingStarted5.label = 1;
                            if (flowCollector.emit(sharingStarted2, sharingStarted5) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingStarted2> command(StateFlow<Integer> subscriptionCount) {
        return FlowKt.flow(new C461201(subscriptionCount, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
