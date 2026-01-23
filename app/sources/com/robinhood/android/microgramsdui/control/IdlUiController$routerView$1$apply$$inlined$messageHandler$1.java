package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.RouterMessage5;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
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
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.RouterOutboundDto;

/* compiled from: FlowMessageHandlers.kt */
@Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\b"}, m3636d2 = {"com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$1", "Lmicrogram/android/MessageHandler;", "handle", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug", "com/robinhood/android/microgramsdui/control/FlowMessageHandlersKt$messageHandler$$inlined$messageHandler$1"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class IdlUiController$routerView$1$apply$$inlined$messageHandler$1 implements MessageHandler {
    final /* synthetic */ JsonAdapter $adapter$inlined;
    final /* synthetic */ SharedFlow2 $this_messageHandler;
    final /* synthetic */ IdlUiController this$0;

    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$routerView$1$apply$$inlined$messageHandler$1", m3645f = "IdlUiController.kt", m3646l = {16}, m3647m = "handle")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$routerView$1$apply$$inlined$messageHandler$1$1 */
    public static final class C218891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C218891(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdlUiController$routerView$1$apply$$inlined$messageHandler$1.this.handle(null, this);
        }
    }

    public IdlUiController$routerView$1$apply$$inlined$messageHandler$1(SharedFlow2 sharedFlow2, JsonAdapter jsonAdapter, IdlUiController idlUiController) {
        this.$this_messageHandler = sharedFlow2;
        this.$adapter$inlined = jsonAdapter;
        this.this$0 = idlUiController;
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
        C218891 c218891;
        if (continuation instanceof C218891) {
            c218891 = (C218891) continuation;
            int i = c218891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c218891.label = i - Integer.MIN_VALUE;
            } else {
                c218891 = new C218891(continuation);
            }
        }
        Object obj = c218891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c218891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2 sharedFlow2 = this.$this_messageHandler;
            String payload = message.getPayload();
            if (payload == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object objFromJson = this.$adapter$inlined.fromJson(payload);
            if (objFromJson != null) {
                RouterOutboundDto routerOutboundDto = (RouterOutboundDto) objFromJson;
                RouterOutboundDto.ConcreteDto concrete = routerOutboundDto.getConcrete();
                if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentBottomSheet) {
                    this.this$0.bottomSheetView(((RouterOutboundDto.ConcreteDto.PresentBottomSheet) concrete).getValue().getIdentifier());
                } else if (concrete instanceof RouterOutboundDto.ConcreteDto.PushScreen) {
                    RouterOutboundDto.ConcreteDto.PushScreen pushScreen = (RouterOutboundDto.ConcreteDto.PushScreen) concrete;
                    this.this$0.screenView(pushScreen.getValue().getIdentifier(), RouterMessage5.INSTANCE.fromProtoValue(pushScreen.getValue().getScreen_type()));
                } else if (concrete instanceof RouterOutboundDto.ConcreteDto.ShowRouter) {
                    InitialScreenDataDto data = ((RouterOutboundDto.ConcreteDto.ShowRouter) concrete).getValue().getData();
                    if (data != null) {
                        this.this$0.routerView(data.getRouter_identifier());
                        this.this$0.screenView(data.getScreen_identifier(), RouterMessage5.INSTANCE.fromProtoValue(data.getScreen_type()));
                    }
                } else {
                    if (!(concrete instanceof RouterOutboundDto.ConcreteDto.DismissAll) && !(concrete instanceof RouterOutboundDto.ConcreteDto.DismissScreen) && !(concrete instanceof RouterOutboundDto.ConcreteDto.OpenDeeplink) && !(concrete instanceof RouterOutboundDto.ConcreteDto.PresentAlert) && !(concrete instanceof RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareContents) && !(concrete instanceof RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareLink) && !(concrete instanceof RouterOutboundDto.ConcreteDto.PresentToast) && concrete != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                UiObject.Idl idl2 = new UiObject.Idl(routerOutboundDto);
                c218891.label = 1;
                if (sharedFlow2.emit(idl2, c218891) == coroutine_suspended) {
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
