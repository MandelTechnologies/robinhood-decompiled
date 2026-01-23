package com.robinhood.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Race.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.flow.RaceKt$race$2$1$channels$1$1", m3645f = "Race.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.coroutines.flow.RaceKt$race$2$1$channels$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class Race3<T> extends ContinuationImpl7 implements Function2<Produce4<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Race3(Flow<? extends T> flow, Continuation<? super Race3> continuation) {
        super(2, continuation);
        this.$flow = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Race3 race3 = new Race3(this.$flow, continuation);
        race3.L$0 = obj;
        return race3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Produce4<? super T> produce4, Continuation<? super Unit> continuation) {
        return ((Race3) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Race.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.coroutines.flow.RaceKt$race$2$1$channels$1$1$1 */
    static final class C329771<T> implements FlowCollector {
        final /* synthetic */ Produce4<T> $$this$produce;

        /* JADX WARN: Multi-variable type inference failed */
        C329771(Produce4<? super T> produce4) {
            this.$$this$produce = produce4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        
            if (kotlinx.coroutines.Yield.yield(r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            Race4 race4;
            if (continuation instanceof Race4) {
                race4 = (Race4) continuation;
                int i = race4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    race4.label = i - Integer.MIN_VALUE;
                } else {
                    race4 = new Race4(this, continuation);
                }
            }
            Object obj = race4.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = race4.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4<T> produce4 = this.$$this$produce;
                race4.label = 1;
                if (produce4.send(t, race4) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            race4.label = 2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Produce4 produce4 = (Produce4) this.L$0;
            Flow<T> flow = this.$flow;
            C329771 c329771 = new C329771(produce4);
            this.label = 1;
            if (flow.collect(c329771, this) == coroutine_suspended) {
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
