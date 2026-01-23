package com.robinhood.android.options.portfolioriskanalyzer.extensions;

import com.robinhood.android.options.portfolioriskanalyzer.extensions.Flow5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Flow.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\u0010\t\"\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"withFallbackAfter", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "", "fallback", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "TIMEOUT_TWO_SECONDS", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.extensions.FlowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class Flow5 {
    public static final long TIMEOUT_TWO_SECONDS = 2000;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.extensions.FlowKt$withFallbackAfter$1", m3645f = "Flow.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.extensions.FlowKt$withFallbackAfter$1 */
    static final class C236731<T> extends ContinuationImpl7 implements Function2<Produce4<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $fallback;
        final /* synthetic */ Flow<T> $this_withFallbackAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C236731(Flow<? extends T> flow, long j, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super C236731> continuation) {
            super(2, continuation);
            this.$this_withFallbackAfter = flow;
            this.$timeoutMillis = j;
            this.$fallback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C236731 c236731 = new C236731(this.$this_withFallbackAfter, this.$timeoutMillis, this.$fallback, continuation);
            c236731.L$0 = obj;
            return c236731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super T> produce4, Continuation<? super Unit> continuation) {
            return ((C236731) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new Flow6(this.$this_withFallbackAfter, booleanRef, produce4, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new AnonymousClass1(this.$timeoutMillis, booleanRef, produce4, this.$fallback, null), 3, null);
                Function0 function0 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.extensions.FlowKt$withFallbackAfter$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Flow5.C236731.invokeSuspend$lambda$0(jobLaunch$default);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
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

        /* compiled from: Flow.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.extensions.FlowKt$withFallbackAfter$1$1", m3645f = "Flow.kt", m3646l = {28, 29, 29}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.extensions.FlowKt$withFallbackAfter$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<T> $$this$channelFlow;
            final /* synthetic */ Ref.BooleanRef $emitted;
            final /* synthetic */ Function1<Continuation<? super T>, Object> $fallback;
            final /* synthetic */ long $timeoutMillis;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(long j, Ref.BooleanRef booleanRef, Produce4<? super T> produce4, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$timeoutMillis = j;
                this.$emitted = booleanRef;
                this.$$this$channelFlow = produce4;
                this.$fallback = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$timeoutMillis, this.$emitted, this.$$this$channelFlow, this.$fallback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
            
                if (r1.send(r8, r7) != r0) goto L23;
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
                if (!this.$emitted.element) {
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
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Job job) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final <T> Flow<T> withFallbackAfter(Flow<? extends T> flow, long j, Function1<? super Continuation<? super T>, ? extends Object> fallback) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new C236731(flow, j, fallback, null));
    }
}
