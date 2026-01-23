package com.robinhood.android.lib.conversations;

import com.robinhood.android.lib.conversations.ConversationFlows;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.Message;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ConversationFlows.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"streamNewMessages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/twilio/conversations/Message;", "Lcom/twilio/conversations/Conversation;", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ConversationFlowsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConversationFlows {

    /* compiled from: ConversationFlows.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/twilio/conversations/Message;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.conversations.ConversationFlowsKt$streamNewMessages$1", m3645f = "ConversationFlows.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.conversations.ConversationFlowsKt$streamNewMessages$1 */
    static final class C202121 extends ContinuationImpl7 implements Function2<Produce4<? super Message>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Conversation $this_streamNewMessages;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C202121(Conversation conversation, Continuation<? super C202121> continuation) {
            super(2, continuation);
            this.$this_streamNewMessages = conversation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C202121 c202121 = new C202121(this.$this_streamNewMessages, continuation);
            c202121.L$0 = obj;
            return c202121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super Message> produce4, Continuation<? super Unit> continuation) {
            return ((C202121) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.robinhood.android.lib.conversations.ConversationFlowsKt$streamNewMessages$1$listener$1, com.twilio.conversations.ConversationListener] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce4 = (Produce4) this.L$0;
                final ?? r1 = new SimpleConversationListener() { // from class: com.robinhood.android.lib.conversations.ConversationFlowsKt$streamNewMessages$1$listener$1
                    @Override // com.robinhood.android.lib.conversations.SimpleConversationListener, com.twilio.conversations.ConversationListener
                    public void onMessageAdded(Message message) {
                        Intrinsics.checkNotNullParameter(message, "message");
                        produce4.mo8337trySendJP2dKIU(message);
                    }
                };
                this.$this_streamNewMessages.addListener(r1);
                final Conversation conversation = this.$this_streamNewMessages;
                Function0 function0 = new Function0() { // from class: com.robinhood.android.lib.conversations.ConversationFlowsKt$streamNewMessages$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationFlows.C202121.invokeSuspend$lambda$0(conversation, r1);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Conversation conversation, ConversationFlows2 conversationFlows2) {
            conversation.removeListener(conversationFlows2);
            return Unit.INSTANCE;
        }
    }

    public static final Flow<Message> streamNewMessages(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        return FlowKt.callbackFlow(new C202121(conversation, null));
    }
}
