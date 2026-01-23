package androidx.paging;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SimpleChannelFlow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022-\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"simpleChannelFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Landroidx/paging/SimpleProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "paging-common_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.paging.SimpleChannelFlowKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class SimpleChannelFlow {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SimpleChannelFlow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", m3645f = "SimpleChannelFlow.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1 */
    static final class C27861<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<SimpleChannelFlow3<T>, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27861(Function2<? super SimpleChannelFlow3<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C27861> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27861 c27861 = new C27861(this.$block, continuation);
            c27861.L$0 = obj;
            return c27861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C27861) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SimpleChannelFlow.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", m3645f = "SimpleChannelFlow.kt", m3646l = {67, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FlowCollector<T> $$this$flow;
            final /* synthetic */ Function2<SimpleChannelFlow3<T>, Continuation<? super Unit>, Object> $block;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(FlowCollector<? super T> flowCollector, Function2<? super SimpleChannelFlow3<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$flow = flowCollector;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
            
                if (r6.emit(r13, r12) == r0) goto L20;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007b -> B:7:0x001a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Job jobLaunch$default;
                Channel3 it;
                Job job;
                Channel3 channel3;
                Object objHasNext;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Channel channelChannel$default = Channel4.Channel$default(0, null, null, 6, null);
                    jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SimpleChannelFlow2(channelChannel$default, this.$block, null), 3, null);
                    it = channelChannel$default.iterator();
                    this.L$0 = jobLaunch$default;
                    this.L$1 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channel3 = (Channel3) this.L$1;
                    job = (Job) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = channel3;
                    jobLaunch$default = job;
                    this.L$0 = jobLaunch$default;
                    this.L$1 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext != coroutine_suspended) {
                        Job job2 = jobLaunch$default;
                        channel3 = it;
                        obj = objHasNext;
                        job = job2;
                        if (!((Boolean) obj).booleanValue()) {
                            Object next = channel3.next();
                            FlowCollector<T> flowCollector = this.$$this$flow;
                            this.L$0 = job;
                            this.L$1 = channel3;
                            this.label = 2;
                        } else {
                            Job.DefaultImpls.cancel$default(job, null, 1, null);
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                channel3 = (Channel3) this.L$1;
                job = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowCollector) this.L$0, this.$block, null);
                this.label = 1;
                if (CoroutineScope2.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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

    public static final <T> Flow<T> simpleChannelFlow(Function2<? super SimpleChannelFlow3<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Context7.buffer$default(FlowKt.flow(new C27861(block, null)), -2, null, 2, null);
    }
}
