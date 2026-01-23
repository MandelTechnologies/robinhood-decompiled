package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: Combine.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m3645f = "Combine.kt", m3646l = {86}, m3647m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1, reason: use source file name */
/* loaded from: classes14.dex */
final class Combine5 extends ContinuationImpl7 implements Function2<Produce4<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T2> $flow2;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Combine5(Flow<? extends T2> flow, Continuation<? super Combine5> continuation) {
        super(2, continuation);
        this.$flow2 = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Combine5 combine5 = new Combine5(this.$flow2, continuation);
        combine5.L$0 = obj;
        return combine5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Produce4<? super Object> produce4, Continuation<? super Unit> continuation) {
        return invoke2((Produce4<Object>) produce4, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Produce4<Object> produce4, Continuation<? super Unit> continuation) {
        return ((Combine5) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Combine.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 */
    static final class C461321<T> implements FlowCollector {
        final /* synthetic */ Produce4<Object> $$this$produce;

        C461321(Produce4<Object> produce4) {
            this.$$this$produce = produce4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T2 t2, Continuation<? super Unit> continuation) {
            Combine6 combine6;
            if (continuation instanceof Combine6) {
                combine6 = (Combine6) continuation;
                int i = combine6.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    combine6.label = i - Integer.MIN_VALUE;
                } else {
                    combine6 = new Combine6(this, continuation);
                }
            }
            Object obj = combine6.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = combine6.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel9<Object> channel = this.$$this$produce.getChannel();
                Symbol symbol = t2;
                if (t2 == 0) {
                    symbol = NullSurrogate.NULL;
                }
                combine6.label = 1;
                if (channel.send(symbol, combine6) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Produce4 produce4 = (Produce4) this.L$0;
            Flow<T2> flow = this.$flow2;
            C461321 c461321 = new C461321(produce4);
            this.label = 1;
            if (flow.collect(c461321, this) == coroutine_suspended) {
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
