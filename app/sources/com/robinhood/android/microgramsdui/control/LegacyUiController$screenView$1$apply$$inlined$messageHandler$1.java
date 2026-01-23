package com.robinhood.android.microgramsdui.control;

import android.os.Parcelable;
import com.robinhood.android.microgramsdui.control.LegacyUiController;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.RouterMessage5;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: FlowMessageHandlers.kt */
@Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m3636d2 = {"com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$1", "Lmicrogram/android/MessageHandler;", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LegacyUiController$screenView$1$apply$$inlined$messageHandler$1 implements MessageHandler {
    final /* synthetic */ RouterMessage5 $screenType$inlined;
    final /* synthetic */ SharedFlow2 $this_messageHandler;
    final /* synthetic */ LegacyUiController this$0;

    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController$screenView$1$apply$$inlined$messageHandler$1", m3645f = "LegacyUiController.kt", m3646l = {16}, m3647m = "handle")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$screenView$1$apply$$inlined$messageHandler$1$1 */
    public static final class C219221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C219221(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyUiController$screenView$1$apply$$inlined$messageHandler$1.this.handle(null, this);
        }
    }

    public LegacyUiController$screenView$1$apply$$inlined$messageHandler$1(SharedFlow2 sharedFlow2, RouterMessage5 routerMessage5, LegacyUiController legacyUiController) {
        this.$this_messageHandler = sharedFlow2;
        this.$screenType$inlined = routerMessage5;
        this.this$0 = legacyUiController;
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
    public Object handle(Message message, Continuation<? super Boolean> continuation) throws IOException {
        C219221 c219221;
        UiObject.Legacy legacy;
        if (continuation instanceof C219221) {
            c219221 = (C219221) continuation;
            int i = c219221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219221.label = i - Integer.MIN_VALUE;
            } else {
                c219221 = new C219221(continuation);
            }
        }
        Object obj = c219221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2 sharedFlow2 = this.$this_messageHandler;
            String payload = message.getPayload();
            if (payload == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int i3 = LegacyUiController.C219411.WhenMappings.$EnumSwitchMapping$0[this.$screenType$inlined.ordinal()];
            if (i3 == 1 || i3 == 2) {
                Object objFromJson = this.this$0.getStandardScreenAdapter().fromJson(payload);
                if (objFromJson != null) {
                    legacy = new UiObject.Legacy((Parcelable) objFromJson);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objFromJson2 = this.this$0.getHtmlCanvasScreenAdapter().fromJson(payload);
                if (objFromJson2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                legacy = new UiObject.Legacy((Parcelable) objFromJson2);
            }
            c219221.label = 1;
            if (sharedFlow2.emit(legacy, c219221) == coroutine_suspended) {
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
