package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.SharedFlow2;
import microgram.Message;
import microgram.android.MessageHandler;
import microgram.p507ui.p508v1.RouterOutboundDto;

/* compiled from: FlowMessageHandlers.kt */
@Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\b"}, m3636d2 = {"com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$1", "Lmicrogram/android/MessageHandler;", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug", "com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$embeddedSectionView$1$apply$$inlined$messageHandler$2 */
/* loaded from: classes8.dex */
public final class C21884xc19eaa5e implements MessageHandler {
    final /* synthetic */ JsonAdapter $adapter$inlined;
    final /* synthetic */ SharedFlow2 $this_messageHandler;

    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$embeddedSectionView$1$apply$$inlined$messageHandler$2", m3645f = "IdlUiController.kt", m3646l = {16}, m3647m = "handle")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$embeddedSectionView$1$apply$$inlined$messageHandler$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C21884xc19eaa5e.this.handle(null, this);
        }
    }

    public C21884xc19eaa5e(SharedFlow2 sharedFlow2, JsonAdapter jsonAdapter) {
        this.$this_messageHandler = sharedFlow2;
        this.$adapter$inlined = jsonAdapter;
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
    public Object handle(Message message, Continuation continuation) throws IOException {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2 sharedFlow2 = this.$this_messageHandler;
            String payload = message.getPayload();
            if (payload == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object objFromJson = this.$adapter$inlined.fromJson(payload);
            if (objFromJson == null) {
                throw new IllegalStateException("Required value was null.");
            }
            UiObject.Idl idl2 = new UiObject.Idl((RouterOutboundDto) objFromJson);
            anonymousClass1.label = 1;
            if (sharedFlow2.emit(idl2, anonymousClass1) == coroutine_suspended) {
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
}
