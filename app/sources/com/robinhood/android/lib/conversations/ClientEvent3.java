package com.robinhood.android.lib.conversations;

import com.robinhood.android.lib.conversations.ClientEvent;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationChangeEvent;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "<init>", "()V", "conversation", "Lcom/twilio/conversations/Conversation;", "getConversation", "()Lcom/twilio/conversations/Conversation;", "Added", "Updated", "Deleted", "SynchronizationChange", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$Added;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$Deleted;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$SynchronizationChange;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$Updated;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ConversationChangeEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class ClientEvent3 extends ClientEvent.Started {
    public /* synthetic */ ClientEvent3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Conversation getConversation();

    private ClientEvent3() {
        super(null);
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$Added;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "conversation", "Lcom/twilio/conversations/Conversation;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/Conversation;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getConversation", "()Lcom/twilio/conversations/Conversation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationChangeEvent$Added, reason: from toString */
    public static final /* data */ class Added extends ClientEvent3 {
        private final ConversationsClient client;
        private final Conversation conversation;

        public static /* synthetic */ Added copy$default(Added added, ConversationsClient conversationsClient, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = added.client;
            }
            if ((i & 2) != 0) {
                conversation = added.conversation;
            }
            return added.copy(conversationsClient, conversation);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        public final Added copy(ConversationsClient client, Conversation conversation) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new Added(client, conversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Added)) {
                return false;
            }
            Added added = (Added) other;
            return Intrinsics.areEqual(this.client, added.client) && Intrinsics.areEqual(this.conversation, added.conversation);
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.conversation.hashCode();
        }

        public String toString() {
            return "Added(client=" + this.client + ", conversation=" + this.conversation + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent3
        public Conversation getConversation() {
            return this.conversation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Added(ConversationsClient client, Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.client = client;
            this.conversation = conversation;
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$Updated;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "conversation", "Lcom/twilio/conversations/Conversation;", "reason", "Lcom/twilio/conversations/Conversation$UpdateReason;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/Conversation;Lcom/twilio/conversations/Conversation$UpdateReason;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getConversation", "()Lcom/twilio/conversations/Conversation;", "getReason", "()Lcom/twilio/conversations/Conversation$UpdateReason;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationChangeEvent$Updated, reason: from toString */
    public static final /* data */ class Updated extends ClientEvent3 {
        private final ConversationsClient client;
        private final Conversation conversation;
        private final Conversation.UpdateReason reason;

        public static /* synthetic */ Updated copy$default(Updated updated, ConversationsClient conversationsClient, Conversation conversation, Conversation.UpdateReason updateReason, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = updated.client;
            }
            if ((i & 2) != 0) {
                conversation = updated.conversation;
            }
            if ((i & 4) != 0) {
                updateReason = updated.reason;
            }
            return updated.copy(conversationsClient, conversation, updateReason);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        /* renamed from: component3, reason: from getter */
        public final Conversation.UpdateReason getReason() {
            return this.reason;
        }

        public final Updated copy(ConversationsClient client, Conversation conversation, Conversation.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Updated(client, conversation, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Updated)) {
                return false;
            }
            Updated updated = (Updated) other;
            return Intrinsics.areEqual(this.client, updated.client) && Intrinsics.areEqual(this.conversation, updated.conversation) && this.reason == updated.reason;
        }

        public int hashCode() {
            return (((this.client.hashCode() * 31) + this.conversation.hashCode()) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Updated(client=" + this.client + ", conversation=" + this.conversation + ", reason=" + this.reason + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent3
        public Conversation getConversation() {
            return this.conversation;
        }

        public final Conversation.UpdateReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Updated(ConversationsClient client, Conversation conversation, Conversation.UpdateReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.client = client;
            this.conversation = conversation;
            this.reason = reason;
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$Deleted;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "conversation", "Lcom/twilio/conversations/Conversation;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/Conversation;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getConversation", "()Lcom/twilio/conversations/Conversation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationChangeEvent$Deleted, reason: from toString */
    public static final /* data */ class Deleted extends ClientEvent3 {
        private final ConversationsClient client;
        private final Conversation conversation;

        public static /* synthetic */ Deleted copy$default(Deleted deleted, ConversationsClient conversationsClient, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = deleted.client;
            }
            if ((i & 2) != 0) {
                conversation = deleted.conversation;
            }
            return deleted.copy(conversationsClient, conversation);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        public final Deleted copy(ConversationsClient client, Conversation conversation) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new Deleted(client, conversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Deleted)) {
                return false;
            }
            Deleted deleted = (Deleted) other;
            return Intrinsics.areEqual(this.client, deleted.client) && Intrinsics.areEqual(this.conversation, deleted.conversation);
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.conversation.hashCode();
        }

        public String toString() {
            return "Deleted(client=" + this.client + ", conversation=" + this.conversation + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent3
        public Conversation getConversation() {
            return this.conversation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Deleted(ConversationsClient client, Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.client = client;
            this.conversation = conversation;
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ConversationChangeEvent$SynchronizationChange;", "Lcom/robinhood/android/lib/conversations/ConversationChangeEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "conversation", "Lcom/twilio/conversations/Conversation;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/Conversation;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getConversation", "()Lcom/twilio/conversations/Conversation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ConversationChangeEvent$SynchronizationChange, reason: from toString */
    public static final /* data */ class SynchronizationChange extends ClientEvent3 {
        private final ConversationsClient client;
        private final Conversation conversation;

        public static /* synthetic */ SynchronizationChange copy$default(SynchronizationChange synchronizationChange, ConversationsClient conversationsClient, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = synchronizationChange.client;
            }
            if ((i & 2) != 0) {
                conversation = synchronizationChange.conversation;
            }
            return synchronizationChange.copy(conversationsClient, conversation);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        public final SynchronizationChange copy(ConversationsClient client, Conversation conversation) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new SynchronizationChange(client, conversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SynchronizationChange)) {
                return false;
            }
            SynchronizationChange synchronizationChange = (SynchronizationChange) other;
            return Intrinsics.areEqual(this.client, synchronizationChange.client) && Intrinsics.areEqual(this.conversation, synchronizationChange.conversation);
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.conversation.hashCode();
        }

        public String toString() {
            return "SynchronizationChange(client=" + this.client + ", conversation=" + this.conversation + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent3
        public Conversation getConversation() {
            return this.conversation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SynchronizationChange(ConversationsClient client, Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.client = client;
            this.conversation = conversation;
        }
    }
}
