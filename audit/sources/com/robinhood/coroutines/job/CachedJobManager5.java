package com.robinhood.coroutines.job;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ak\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00042B\u0010\u0005\u001a>\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"flowFrom", "Lkotlinx/coroutines/flow/Flow;", "T", "C", "Lcom/robinhood/coroutines/job/CachedJobManager;", "block", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "component", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/robinhood/coroutines/job/CachedJobManager;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.job.CachedJobManagerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class CachedJobManager5 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedJobManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.job.CachedJobManagerKt$flowFrom$1", m3645f = "CachedJobManager.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.coroutines.job.CachedJobManagerKt$flowFrom$1 */
    static final class C329861<T> extends ContinuationImpl7 implements Function2<Produce4<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, C, Continuation<? super Flow<? extends T>>, Object> $block;
        final /* synthetic */ CachedJobManager<C> $this_flowFrom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329861(CachedJobManager<? extends C> cachedJobManager, Function3<? super CoroutineScope, ? super C, ? super Continuation<? super Flow<? extends T>>, ? extends Object> function3, Continuation<? super C329861> continuation) {
            super(2, continuation);
            this.$this_flowFrom = cachedJobManager;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C329861 c329861 = new C329861(this.$this_flowFrom, this.$block, continuation);
            c329861.L$0 = obj;
            return c329861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super T> produce4, Continuation<? super Unit> continuation) {
            return ((C329861) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Add missing generic type declarations: [C] */
        /* compiled from: CachedJobManager.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "C", "Lkotlinx/coroutines/CoroutineScope;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.coroutines.job.CachedJobManagerKt$flowFrom$1$1", m3645f = "CachedJobManager.kt", m3646l = {69, 69}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.coroutines.job.CachedJobManagerKt$flowFrom$1$1, reason: invalid class name */
        static final class AnonymousClass1<C> extends ContinuationImpl7 implements Function3<CoroutineScope, C, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<T> $$this$channelFlow;
            final /* synthetic */ Function3<CoroutineScope, C, Continuation<? super Flow<? extends T>>, Object> $block;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function3<? super CoroutineScope, ? super C, ? super Continuation<? super Flow<? extends T>>, ? extends Object> function3, Produce4<? super T> produce4, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.$block = function3;
                this.$$this$channelFlow = produce4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object obj, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (CoroutineScope) obj, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, C c, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$$this$channelFlow, continuation);
                anonymousClass1.L$0 = coroutineScope;
                anonymousClass1.L$1 = c;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CachedJobManager.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.coroutines.job.CachedJobManagerKt$flowFrom$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C506551 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ Produce4<T> $tmp0;

                /* JADX WARN: Multi-variable type inference failed */
                C506551(Produce4<? super T> produce4) {
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

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                if (((kotlinx.coroutines.flow.Flow) r7).collect(r3, r6) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Object obj2 = this.L$1;
                    Function3<CoroutineScope, C, Continuation<? super Flow<? extends T>>, Object> function3 = this.$block;
                    this.L$0 = null;
                    this.label = 1;
                    obj = function3.invoke(coroutineScope, obj2, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                C506551 c506551 = new C506551(this.$$this$channelFlow);
                this.label = 2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                CachedJobManager<C> cachedJobManager = this.$this_flowFrom;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, produce4, null);
                this.label = 1;
                if (cachedJobManager.execute(anonymousClass1, this) == coroutine_suspended) {
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

    public static final <C, T> Flow<T> flowFrom(CachedJobManager<? extends C> cachedJobManager, Function3<? super CoroutineScope, ? super C, ? super Continuation<? super Flow<? extends T>>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(cachedJobManager, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt.channelFlow(new C329861(cachedJobManager, block, null));
    }
}
