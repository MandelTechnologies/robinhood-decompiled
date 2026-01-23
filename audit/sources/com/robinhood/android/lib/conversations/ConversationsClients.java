package com.robinhood.android.lib.conversations;

import android.content.Context;
import com.twilio.conversations.CallbackListener;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.StatusListener;
import com.twilio.util.ErrorInfo;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationsClients.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"createConversationsClient", "Lio/reactivex/Single;", "Lcom/twilio/conversations/ConversationsClient;", "context", "Landroid/content/Context;", "token", "", "getConversation", "Lcom/twilio/conversations/Conversation;", "conversationSid", "updateToken", "", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ConversationsClientsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ConversationsClients {
    public static final Single<ConversationsClient> createConversationsClient(final Context context, final String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        final ConversationsClient.Properties propertiesCreateProperties = ConversationsClient.Properties.newBuilder().setCommandTimeout(10000).createProperties();
        return SingleCallbackListener2.callbackToSingle(new Function1() { // from class: com.robinhood.android.lib.conversations.ConversationsClientsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationsClients.createConversationsClient$lambda$0(context, token, propertiesCreateProperties, (CallbackListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConversationsClient$lambda$0(Context context, String str, ConversationsClient.Properties properties, CallbackListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ConversationsClient.create(context, str, properties, listener);
        return Unit.INSTANCE;
    }

    public static final Single<Conversation> getConversation(final ConversationsClient conversationsClient, final String conversationSid) {
        Intrinsics.checkNotNullParameter(conversationsClient, "<this>");
        Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
        return SingleCallbackListener2.callbackToSingle(new Function1() { // from class: com.robinhood.android.lib.conversations.ConversationsClientsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationsClients.getConversation$lambda$1(conversationsClient, conversationSid, (CallbackListener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getConversation$lambda$1(ConversationsClient conversationsClient, String str, CallbackListener it) {
        Intrinsics.checkNotNullParameter(it, "it");
        conversationsClient.getConversation(str, it);
        return Unit.INSTANCE;
    }

    public static final Single<Unit> updateToken(final ConversationsClient conversationsClient, final String token) {
        Intrinsics.checkNotNullParameter(conversationsClient, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        Single<Unit> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.lib.conversations.ConversationsClientsKt.updateToken.1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(final SingleEmitter<Unit> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                conversationsClient.updateToken(token, new StatusListener() { // from class: com.robinhood.android.lib.conversations.ConversationsClientsKt.updateToken.1.1
                    @Override // com.twilio.conversations.StatusListener
                    public void onSuccess() {
                        if (emitter.getDisposed()) {
                            return;
                        }
                        emitter.onSuccess(Unit.INSTANCE);
                    }

                    @Override // com.twilio.conversations.StatusListener
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
}
