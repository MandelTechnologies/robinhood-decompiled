package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: Channels.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "", "trySendBlocking", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 48, m3641xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt, reason: use source file name */
/* loaded from: classes23.dex */
final /* synthetic */ class Channels4 {

    /* compiled from: Channels.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m3645f = "Channels.kt", m3646l = {39}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 */
    /* loaded from: classes14.dex */
    static final class C460702 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Channel5<? extends Unit>>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ Channel9<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C460702(Channel9<? super E> channel9, E e, Continuation<? super C460702> continuation) {
            super(2, continuation);
            this.$this_trySendBlocking = channel9;
            this.$element = e;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C460702 c460702 = new C460702(this.$this_trySendBlocking, this.$element, continuation);
            c460702.L$0 = obj;
            return c460702;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Channel5<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Channel5<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Channel5<Unit>> continuation) {
            return ((C460702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel9<E> channel9 = this.$this_trySendBlocking;
                    E e = this.$element;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    if (channel9.send(e, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            return Channel5.m28802boximpl(Result.m28556isSuccessimpl(objM28550constructorimpl) ? Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE) : Channel5.INSTANCE.m28813closedJP2dKIU(Result.m28553exceptionOrNullimpl(objM28550constructorimpl)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(Channel9<? super E> channel9, E e) {
        Object objMo8337trySendJP2dKIU = channel9.mo8337trySendJP2dKIU(e);
        if (objMo8337trySendJP2dKIU instanceof Channel5.Failed) {
            return ((Channel5) BuildersKt__BuildersKt.runBlocking$default(null, new C460702(channel9, e, null), 1, null)).getHolder();
        }
        return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
    }
}
