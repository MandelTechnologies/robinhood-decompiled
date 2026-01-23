package com.robinhood.android.microgramsdui.control;

import com.plaid.internal.EnumC7081g;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.SharedFlow2;
import microgram.Message;
import microgram.android.MessageHandler;

/* compiled from: FlowMessageHandlers.kt */
@Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m3636d2 = {"com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$1", "Lmicrogram/android/MessageHandler;", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1 implements MessageHandler {
    final /* synthetic */ JsonAdapter $adapter$inlined;
    final /* synthetic */ SharedFlow2 $this_messageHandler;
    final /* synthetic */ Function1 $transform$inlined;

    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1", m3645f = "FlowMessageHandlers.kt", m3646l = {16}, m3647m = "handle")
    /* renamed from: com.robinhood.android.microgramsdui.control.FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1$1 */
    public static final class C218771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C218771(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1.this.handle(null, this);
        }
    }

    public FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1(SharedFlow2 sharedFlow2, Function1 function1, JsonAdapter jsonAdapter) {
        this.$this_messageHandler = sharedFlow2;
        this.$transform$inlined = function1;
        this.$adapter$inlined = jsonAdapter;
    }

    @Override // microgram.android.MessageHandler
    public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
        return MessageHandler.DefaultImpls.handleWithReplyAsync(this, message, continuation);
    }

    public Object handle$$forInline(Message message, Continuation continuation) throws IOException {
        InlineMarker.mark(4);
        new C218771(continuation);
        InlineMarker.mark(5);
        SharedFlow2 sharedFlow2 = this.$this_messageHandler;
        String payload = message.getPayload();
        if (payload == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Function1 function1 = this.$transform$inlined;
        Object objFromJson = this.$adapter$inlined.fromJson(payload);
        if (objFromJson != null) {
            Object objInvoke = function1.invoke(objFromJson);
            InlineMarker.mark(0);
            sharedFlow2.emit(objInvoke, continuation);
            InlineMarker.mark(1);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.MessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handle(Message message, Continuation<? super Boolean> continuation) throws IOException {
        C218771 c218771;
        if (continuation instanceof C218771) {
            c218771 = (C218771) continuation;
            int i = c218771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c218771.label = i - Integer.MIN_VALUE;
            } else {
                c218771 = new C218771(continuation);
            }
        }
        Object obj = c218771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c218771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2 sharedFlow2 = this.$this_messageHandler;
            String payload = message.getPayload();
            if (payload == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Function1 function1 = this.$transform$inlined;
            Object objFromJson = this.$adapter$inlined.fromJson(payload);
            if (objFromJson != null) {
                Object objInvoke = function1.invoke(objFromJson);
                c218771.label = 1;
                if (sharedFlow2.emit(objInvoke, c218771) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(true);
    }
}
