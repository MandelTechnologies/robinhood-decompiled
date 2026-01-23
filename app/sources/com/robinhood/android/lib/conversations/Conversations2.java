package com.robinhood.android.lib.conversations;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.twilio.conversations.CallbackListener;
import com.twilio.conversations.CancellationToken;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.Message;
import com.twilio.util.ErrorInfo;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Conversations.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u000b\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0004\u001a\u0016\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u0001*\u00020\u0004\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0004¨\u0006\u0010"}, m3636d2 = {"getLastMessages", "Lio/reactivex/Single;", "", "Lcom/twilio/conversations/Message;", "Lcom/twilio/conversations/Conversation;", "count", "", "getMessagesBefore", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "buildAndSend", "Lcom/twilio/conversations/Conversation$MessageBuilder;", "getMessagesCount", "getUnreadMessagesCount", "Lcom/robinhood/utils/Optional;", "setAllMessagesRead", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ConversationsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Conversations2 {
    public static final Single<List<Message>> getLastMessages(final Conversation conversation, final int i) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        return SingleCallbackListener2.callbackToSingle(new Function1() { // from class: com.robinhood.android.lib.conversations.ConversationsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Conversations2.getLastMessages$lambda$0(conversation, i, (CallbackListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLastMessages$lambda$0(Conversation conversation, int i, CallbackListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        conversation.getLastMessages(i, callback);
        return Unit.INSTANCE;
    }

    public static final Single<List<Message>> getMessagesBefore(final Conversation conversation, final long j, final int i) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        return SingleCallbackListener2.callbackToSingle(new Function1() { // from class: com.robinhood.android.lib.conversations.ConversationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Conversations2.getMessagesBefore$lambda$1(conversation, j, i, (CallbackListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMessagesBefore$lambda$1(Conversation conversation, long j, int i, CallbackListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        conversation.getMessagesBefore(j, i, callback);
        return Unit.INSTANCE;
    }

    /* compiled from: Conversations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationsKt$buildAndSend$1 */
    /* synthetic */ class C202291 extends FunctionReferenceImpl implements Function1<CallbackListener<Message>, CancellationToken> {
        C202291(Object obj) {
            super(1, obj, Conversation.MessageBuilder.class, "buildAndSend", "buildAndSend(Lcom/twilio/conversations/CallbackListener;)Lcom/twilio/conversations/CancellationToken;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CancellationToken invoke(CallbackListener<Message> callbackListener) {
            return ((Conversation.MessageBuilder) this.receiver).buildAndSend(callbackListener);
        }
    }

    public static final Single<Message> buildAndSend(Conversation.MessageBuilder messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "<this>");
        return SingleCallbackListener2.callbackToSingleWithCancellationToken(new C202291(messageBuilder));
    }

    /* compiled from: Conversations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationsKt$getMessagesCount$1 */
    /* synthetic */ class C202301 extends FunctionReferenceImpl implements Function1<CallbackListener<Long>, Unit> {
        C202301(Object obj) {
            super(1, obj, Conversation.class, "getMessagesCount", "getMessagesCount(Lcom/twilio/conversations/CallbackListener;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CallbackListener<Long> callbackListener) {
            invoke2(callbackListener);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CallbackListener<Long> callbackListener) {
            ((Conversation) this.receiver).getMessagesCount(callbackListener);
        }
    }

    public static final Single<Long> getMessagesCount(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        return SingleCallbackListener2.callbackToSingle(new C202301(conversation));
    }

    public static final Single<Optional<Long>> getUnreadMessagesCount(final Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        Single<Optional<Long>> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.lib.conversations.ConversationsKt.getUnreadMessagesCount.1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(final SingleEmitter<Optional<Long>> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                conversation.getUnreadMessagesCount(new CallbackListener<Long>() { // from class: com.robinhood.android.lib.conversations.ConversationsKt.getUnreadMessagesCount.1.1
                    @Override // com.twilio.conversations.CallbackListener
                    public void onSuccess(Long result) {
                        if (emitter.getDisposed()) {
                            return;
                        }
                        emitter.onSuccess(Optional3.asOptional(result));
                    }

                    @Override // com.twilio.conversations.CallbackListener
                    public void onError(ErrorInfo errorInfo) {
                        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                        if (emitter.getDisposed()) {
                            return;
                        }
                        emitter.onError(new ChatException(errorInfo, null, 2, null));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        return singleCreate;
    }

    /* compiled from: Conversations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationsKt$setAllMessagesRead$1 */
    /* synthetic */ class C202321 extends FunctionReferenceImpl implements Function1<CallbackListener<Long>, Unit> {
        C202321(Object obj) {
            super(1, obj, Conversation.class, "setAllMessagesRead", "setAllMessagesRead(Lcom/twilio/conversations/CallbackListener;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CallbackListener<Long> callbackListener) {
            invoke2(callbackListener);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CallbackListener<Long> callbackListener) {
            ((Conversation) this.receiver).setAllMessagesRead(callbackListener);
        }
    }

    public static final Single<Long> setAllMessagesRead(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        return SingleCallbackListener2.callbackToSingle(new C202321(conversation));
    }
}
