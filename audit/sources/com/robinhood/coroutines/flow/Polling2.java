package com.robinhood.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: Polling.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"T", "j$/time/Duration", "interval", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "Lkotlinx/coroutines/flow/Flow;", "networkPoll", "(Lj$/time/Duration;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.flow.PollingKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Polling2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Polling.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.flow.PollingKt$networkPoll$1", m3645f = "Polling.kt", m3646l = {20, 23, 29, 30}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.coroutines.flow.PollingKt$networkPoll$1 */
    static final class C329751<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ Duration $interval;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329751(Function1<? super Continuation<? super T>, ? extends Object> function1, Duration duration, Continuation<? super C329751> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.$interval = duration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329751 c329751 = new C329751(this.$block, this.$interval, continuation);
            c329751.L$0 = obj;
            return c329751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C329751) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:20:0x0048, B:13:0x0030), top: B:37:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[PHI: r1
          0x0060: PHI (r1v5 kotlinx.coroutines.flow.FlowCollector) = (r1v12 kotlinx.coroutines.flow.FlowCollector), (r1v13 kotlinx.coroutines.flow.FlowCollector) binds: [B:24:0x005d, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006e -> B:18:0x003e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:18:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            boolean zIsNetworkRelated;
            Object objDelay;
            FlowCollector flowCollector2;
            Object objEmit;
            FlowCollector flowCollector3;
            long millis;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        flowCollector2 = flowCollector;
                    } finally {
                        if (zIsNetworkRelated) {
                            if (objDelay != coroutine_suspended) {
                                if (!JobKt.isActive(getContext())) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    this.L$0 = flowCollector2;
                    this.label = 3;
                    objEmit = flowCollector2.emit(obj, this);
                    flowCollector3 = flowCollector2;
                    if (objEmit != coroutine_suspended) {
                        millis = this.$interval.toMillis();
                        this.L$0 = flowCollector3;
                        this.label = 4;
                        flowCollector = flowCollector3;
                        if (DelayKt.delay(millis, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    if (i == 3) {
                        FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        flowCollector3 = flowCollector4;
                        millis = this.$interval.toMillis();
                        this.L$0 = flowCollector3;
                        this.label = 4;
                        flowCollector = flowCollector3;
                        if (DelayKt.delay(millis, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector5;
            }
            if (!JobKt.isActive(getContext())) {
                Function1<Continuation<? super T>, Object> function1 = this.$block;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = function1.invoke(this);
                flowCollector2 = flowCollector;
                if (obj != coroutine_suspended) {
                    this.L$0 = flowCollector2;
                    this.label = 3;
                    objEmit = flowCollector2.emit(obj, this);
                    flowCollector3 = flowCollector2;
                    if (objEmit != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> Flow<T> networkPoll(Duration interval, Function1<? super Continuation<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt.flow(new C329751(block, interval, null));
    }
}
