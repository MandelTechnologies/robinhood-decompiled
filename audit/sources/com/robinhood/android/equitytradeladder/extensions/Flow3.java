package com.robinhood.android.equitytradeladder.extensions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Flow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1", m3645f = "Flow.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1, reason: use source file name */
/* loaded from: classes3.dex */
final class Flow3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Produce4<T> $$this$channelFlow;
    final /* synthetic */ Function1<Continuation<? super T>, Object> $fallback;
    final /* synthetic */ boolean $skipFallback;
    final /* synthetic */ Flow<T> $this_withFallbackAfter;
    final /* synthetic */ long $timeoutMillis;
    final /* synthetic */ Ref.ObjectRef<Job> $watchdogJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Flow3(Flow<? extends T> flow, Ref.ObjectRef<Job> objectRef, Produce4<? super T> produce4, boolean z, long j, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super Flow3> continuation) {
        super(2, continuation);
        this.$this_withFallbackAfter = flow;
        this.$watchdogJob = objectRef;
        this.$$this$channelFlow = produce4;
        this.$skipFallback = z;
        this.$timeoutMillis = j;
        this.$fallback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Flow3 flow3 = new Flow3(this.$this_withFallbackAfter, this.$watchdogJob, this.$$this$channelFlow, this.$skipFallback, this.$timeoutMillis, this.$fallback, continuation);
        flow3.L$0 = obj;
        return flow3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Flow3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Flow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1$1 */
    static final class C159261<T> implements FlowCollector {
        final /* synthetic */ Produce4<T> $$this$channelFlow;
        final /* synthetic */ CoroutineScope $$this$launch;
        final /* synthetic */ Function1<Continuation<? super T>, Object> $fallback;
        final /* synthetic */ boolean $skipFallback;
        final /* synthetic */ long $timeoutMillis;
        final /* synthetic */ Ref.ObjectRef<Job> $watchdogJob;

        /* JADX WARN: Multi-variable type inference failed */
        C159261(Ref.ObjectRef<Job> objectRef, Produce4<? super T> produce4, boolean z, CoroutineScope coroutineScope, long j, Function1<? super Continuation<? super T>, ? extends Object> function1) {
            this.$watchdogJob = objectRef;
            this.$$this$channelFlow = produce4;
            this.$skipFallback = z;
            this.$$this$launch = coroutineScope;
            this.$timeoutMillis = j;
            this.$fallback = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            Flow4 flow4;
            if (continuation instanceof Flow4) {
                flow4 = (Flow4) continuation;
                int i = flow4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flow4.label = i - Integer.MIN_VALUE;
                } else {
                    flow4 = new Flow4(this, continuation);
                }
            }
            Object obj = flow4.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = flow4.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Job job = this.$watchdogJob.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                Produce4<T> produce4 = this.$$this$channelFlow;
                flow4.label = 1;
                if (produce4.send(t, flow4) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!this.$skipFallback) {
                this.$watchdogJob.element = (T) BuildersKt__Builders_commonKt.launch$default(this.$$this$launch, null, null, new AnonymousClass1(this.$timeoutMillis, this.$$this$channelFlow, this.$fallback, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Flow.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1$1$1", m3645f = "Flow.kt", m3646l = {34, 36, 36}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<T> $$this$channelFlow;
            final /* synthetic */ Function1<Continuation<? super T>, Object> $fallback;
            final /* synthetic */ long $timeoutMillis;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(long j, Produce4<? super T> produce4, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$timeoutMillis = j;
                this.$$this$channelFlow = produce4;
                this.$fallback = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$timeoutMillis, this.$$this$channelFlow, this.$fallback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
            
                if (r1.send(r8, r7) != r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Channel9 channel9;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.$timeoutMillis;
                    this.label = 1;
                    if (DelayKt.delay(j, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    channel9 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 3;
                }
                channel9 = this.$$this$channelFlow;
                Function1<Continuation<? super T>, Object> function1 = this.$fallback;
                this.L$0 = channel9;
                this.label = 2;
                obj = function1.invoke(this);
                if (obj != coroutine_suspended) {
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow<T> flow = this.$this_withFallbackAfter;
            C159261 c159261 = new C159261(this.$watchdogJob, this.$$this$channelFlow, this.$skipFallback, coroutineScope, this.$timeoutMillis, this.$fallback);
            this.label = 1;
            if (flow.collect(c159261, this) == coroutine_suspended) {
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
