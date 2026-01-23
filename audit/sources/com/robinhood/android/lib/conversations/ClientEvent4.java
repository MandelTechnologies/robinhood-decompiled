package com.robinhood.android.lib.conversations;

import com.robinhood.android.lib.conversations.ClientEvent;
import com.twilio.conversations.ConversationsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ErrorEvent;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "client", "Lcom/twilio/conversations/ConversationsClient;", "exception", "Lcom/robinhood/android/lib/conversations/ChatException;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/robinhood/android/lib/conversations/ChatException;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getException", "()Lcom/robinhood/android/lib/conversations/ChatException;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ErrorEvent, reason: use source file name */
/* loaded from: classes8.dex */
public final class ClientEvent4 extends ClientEvent.Started {
    private final ConversationsClient client;
    private final ChatException exception;

    @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
    public ConversationsClient getClient() {
        return this.client;
    }

    public final ChatException getException() {
        return this.exception;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientEvent4(ConversationsClient client, ChatException exception) {
        super(null);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.client = client;
        this.exception = exception;
    }
}
