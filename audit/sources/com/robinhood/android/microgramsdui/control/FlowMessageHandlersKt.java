package com.robinhood.android.microgramsdui.control;

import com.plaid.internal.EnumC7081g;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow2;
import microgram.Message;
import microgram.android.MessageHandler;

/* compiled from: FlowMessageHandlers.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080\bø\u0001\u0000\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0000\u001aF\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b2\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00020\u0005H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m3636d2 = {"messageHandler", "Lmicrogram/android/MessageHandler;", "A", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "decode", "Lkotlin/Function1;", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "T", "transform", "lib-microgram-sdui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FlowMessageHandlersKt {

    /* compiled from: FlowMessageHandlers.kt */
    @Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$1", "Lmicrogram/android/MessageHandler;", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.android.microgramsdui.control.FlowMessageHandlersKt$messageHandler$1 */
    public static final class C218791 implements MessageHandler {
        final /* synthetic */ Function1<String, A> $decode;
        final /* synthetic */ SharedFlow2<A> $this_messageHandler;

        /* JADX WARN: Multi-variable type inference failed */
        public C218791(SharedFlow2<A> sharedFlow2, Function1<? super String, ? extends A> function1) {
            this.$this_messageHandler = sharedFlow2;
            this.$decode = function1;
        }

        @Override // microgram.android.MessageHandler
        public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
            return MessageHandler.DefaultImpls.handleWithReplyAsync(this, message, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // microgram.android.MessageHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object handle(Message message, Continuation<? super Boolean> continuation) {
            FlowMessageHandlersKt$messageHandler$1$handle$1 flowMessageHandlersKt$messageHandler$1$handle$1;
            if (continuation instanceof FlowMessageHandlersKt$messageHandler$1$handle$1) {
                flowMessageHandlersKt$messageHandler$1$handle$1 = (FlowMessageHandlersKt$messageHandler$1$handle$1) continuation;
                int i = flowMessageHandlersKt$messageHandler$1$handle$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowMessageHandlersKt$messageHandler$1$handle$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowMessageHandlersKt$messageHandler$1$handle$1 = new FlowMessageHandlersKt$messageHandler$1$handle$1(this, continuation);
                }
            }
            Object obj = flowMessageHandlersKt$messageHandler$1$handle$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = flowMessageHandlersKt$messageHandler$1$handle$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = this.$this_messageHandler;
                Function1<String, A> function1 = this.$decode;
                String payload = message.getPayload();
                if (payload == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Object objInvoke = function1.invoke(payload);
                flowMessageHandlersKt$messageHandler$1$handle$1.label = 1;
                if (flowCollector.emit(objInvoke, flowMessageHandlersKt$messageHandler$1$handle$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(true);
        }

        public Object handle$$forInline(Message message, Continuation<? super Boolean> continuation) {
            InlineMarker.mark(4);
            new FlowMessageHandlersKt$messageHandler$1$handle$1(this, continuation);
            InlineMarker.mark(5);
            FlowCollector flowCollector = this.$this_messageHandler;
            Function1<String, A> function1 = this.$decode;
            String payload = message.getPayload();
            if (payload == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object objInvoke = function1.invoke(payload);
            InlineMarker.mark(0);
            flowCollector.emit(objInvoke, continuation);
            InlineMarker.mark(1);
            return Boolean.TRUE;
        }
    }

    public static final <A> MessageHandler messageHandler(SharedFlow2<A> sharedFlow2, JsonAdapter<A> adapter) {
        Intrinsics.checkNotNullParameter(sharedFlow2, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$2(sharedFlow2, adapter);
    }

    public static final <A, T> MessageHandler messageHandler(SharedFlow2<A> sharedFlow2, JsonAdapter<T> adapter, Function1<? super T, ? extends A> transform) {
        Intrinsics.checkNotNullParameter(sharedFlow2, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1(sharedFlow2, transform, adapter);
    }

    public static final <A> MessageHandler messageHandler(SharedFlow2<A> sharedFlow2, Function1<? super String, ? extends A> decode) {
        Intrinsics.checkNotNullParameter(sharedFlow2, "<this>");
        Intrinsics.checkNotNullParameter(decode, "decode");
        return new C218791(sharedFlow2, decode);
    }
}
