package com.twilio.conversations;

import com.plaid.internal.EnumC7081g;
import com.twilio.conversations.Messages;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Messages.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.conversations.Messages$UnsentMessageImpl$send$job$1", m3645f = "Messages.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.twilio.conversations.Messages$UnsentMessageImpl$send$job$1, reason: use source file name */
/* loaded from: classes12.dex */
final class Messages3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CallbackListenerForwarder<Message> $listenerForwarder;
    int label;
    final /* synthetic */ Messages this$0;
    final /* synthetic */ Messages.UnsentMessageImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Messages3(Messages messages, Messages.UnsentMessageImpl unsentMessageImpl, CallbackListenerForwarder<Message> callbackListenerForwarder, Continuation<? super Messages3> continuation) {
        super(2, continuation);
        this.this$0 = messages;
        this.this$1 = unsentMessageImpl;
        this.$listenerForwarder = callbackListenerForwarder;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Messages3(this.this$0, this.this$1, this.$listenerForwarder, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Messages3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Messages messages = this.this$0;
            Messages.MessageDescriptor messageDescriptor = this.this$1.getMessageDescriptor();
            CallbackListenerForwarder<Message> callbackListenerForwarder = this.$listenerForwarder;
            this.label = 1;
            if (messages.sendMessage(messageDescriptor, callbackListenerForwarder, this) == coroutine_suspended) {
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
