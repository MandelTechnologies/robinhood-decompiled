package com.robinhood.store.futures.extensions;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Flows.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"alsoSubscribeTo", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.extensions.FlowsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Flows {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Flows.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.extensions.FlowsKt$alsoSubscribeTo$1", m3645f = "Flows.kt", m3646l = {10}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.extensions.FlowsKt$alsoSubscribeTo$1 */
    static final class C415021<T> extends ContinuationImpl7 implements Function2<Produce4<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Flow<T> $this_alsoSubscribeTo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C415021(Flow<? extends T> flow, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C415021> continuation) {
            super(2, continuation);
            this.$this_alsoSubscribeTo = flow;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415021 c415021 = new C415021(this.$this_alsoSubscribeTo, this.$block, continuation);
            c415021.L$0 = obj;
            return c415021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super T> produce4, Continuation<? super Unit> continuation) {
            return ((C415021) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Job job;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new Flows2(this.$block, null), 3, null);
                Flow<T> flow = this.$this_alsoSubscribeTo;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(produce4);
                this.L$0 = jobLaunch$default;
                this.label = 1;
                if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job = jobLaunch$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                job = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Job.DefaultImpls.cancel$default(job, null, 1, null);
            return Unit.INSTANCE;
        }

        /* compiled from: Flows.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.store.futures.extensions.FlowsKt$alsoSubscribeTo$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ Produce4<T> $tmp0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Produce4<? super T> produce4) {
                this.$tmp0 = produce4;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                Object objSend = this.$tmp0.send(t, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }
        }
    }

    public static final <T> Flow<T> alsoSubscribeTo(Flow<? extends T> flow, Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt.channelFlow(new C415021(flow, block, null));
    }
}
