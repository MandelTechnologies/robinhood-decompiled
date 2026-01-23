package com.robinhood.android.lib.conversations;

import com.robinhood.android.lib.conversations.ClientEvent;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClientEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/UserEvent;", "Lcom/robinhood/android/lib/conversations/ClientEvent$Started;", "<init>", "()V", "user", "Lcom/twilio/conversations/User;", "getUser", "()Lcom/twilio/conversations/User;", "Updated", "Subscribed", "Unsubscribed", "Lcom/robinhood/android/lib/conversations/UserEvent$Subscribed;", "Lcom/robinhood/android/lib/conversations/UserEvent$Unsubscribed;", "Lcom/robinhood/android/lib/conversations/UserEvent$Updated;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.UserEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class ClientEvent5 extends ClientEvent.Started {
    public /* synthetic */ ClientEvent5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract User getUser();

    private ClientEvent5() {
        super(null);
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/UserEvent$Updated;", "Lcom/robinhood/android/lib/conversations/UserEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "user", "Lcom/twilio/conversations/User;", "reason", "Lcom/twilio/conversations/User$UpdateReason;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/User;Lcom/twilio/conversations/User$UpdateReason;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getUser", "()Lcom/twilio/conversations/User;", "getReason", "()Lcom/twilio/conversations/User$UpdateReason;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.UserEvent$Updated, reason: from toString */
    public static final /* data */ class Updated extends ClientEvent5 {
        private final ConversationsClient client;
        private final User.UpdateReason reason;
        private final User user;

        public static /* synthetic */ Updated copy$default(Updated updated, ConversationsClient conversationsClient, User user, User.UpdateReason updateReason, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = updated.client;
            }
            if ((i & 2) != 0) {
                user = updated.user;
            }
            if ((i & 4) != 0) {
                updateReason = updated.reason;
            }
            return updated.copy(conversationsClient, user, updateReason);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component3, reason: from getter */
        public final User.UpdateReason getReason() {
            return this.reason;
        }

        public final Updated copy(ConversationsClient client, User user, User.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Updated(client, user, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Updated)) {
                return false;
            }
            Updated updated = (Updated) other;
            return Intrinsics.areEqual(this.client, updated.client) && Intrinsics.areEqual(this.user, updated.user) && this.reason == updated.reason;
        }

        public int hashCode() {
            return (((this.client.hashCode() * 31) + this.user.hashCode()) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Updated(client=" + this.client + ", user=" + this.user + ", reason=" + this.reason + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent5
        public User getUser() {
            return this.user;
        }

        public final User.UpdateReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Updated(ConversationsClient client, User user, User.UpdateReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.client = client;
            this.user = user;
            this.reason = reason;
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/UserEvent$Subscribed;", "Lcom/robinhood/android/lib/conversations/UserEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "user", "Lcom/twilio/conversations/User;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/User;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getUser", "()Lcom/twilio/conversations/User;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.UserEvent$Subscribed, reason: from toString */
    public static final /* data */ class Subscribed extends ClientEvent5 {
        private final ConversationsClient client;
        private final User user;

        public static /* synthetic */ Subscribed copy$default(Subscribed subscribed, ConversationsClient conversationsClient, User user, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = subscribed.client;
            }
            if ((i & 2) != 0) {
                user = subscribed.user;
            }
            return subscribed.copy(conversationsClient, user);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        public final Subscribed copy(ConversationsClient client, User user) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(user, "user");
            return new Subscribed(client, user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscribed)) {
                return false;
            }
            Subscribed subscribed = (Subscribed) other;
            return Intrinsics.areEqual(this.client, subscribed.client) && Intrinsics.areEqual(this.user, subscribed.user);
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.user.hashCode();
        }

        public String toString() {
            return "Subscribed(client=" + this.client + ", user=" + this.user + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent5
        public User getUser() {
            return this.user;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscribed(ConversationsClient client, User user) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(user, "user");
            this.client = client;
            this.user = user;
        }
    }

    /* compiled from: ClientEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/UserEvent$Unsubscribed;", "Lcom/robinhood/android/lib/conversations/UserEvent;", "client", "Lcom/twilio/conversations/ConversationsClient;", "user", "Lcom/twilio/conversations/User;", "<init>", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/User;)V", "getClient", "()Lcom/twilio/conversations/ConversationsClient;", "getUser", "()Lcom/twilio/conversations/User;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.UserEvent$Unsubscribed, reason: from toString */
    public static final /* data */ class Unsubscribed extends ClientEvent5 {
        private final ConversationsClient client;
        private final User user;

        public static /* synthetic */ Unsubscribed copy$default(Unsubscribed unsubscribed, ConversationsClient conversationsClient, User user, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationsClient = unsubscribed.client;
            }
            if ((i & 2) != 0) {
                user = unsubscribed.user;
            }
            return unsubscribed.copy(conversationsClient, user);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationsClient getClient() {
            return this.client;
        }

        /* renamed from: component2, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        public final Unsubscribed copy(ConversationsClient client, User user) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(user, "user");
            return new Unsubscribed(client, user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unsubscribed)) {
                return false;
            }
            Unsubscribed unsubscribed = (Unsubscribed) other;
            return Intrinsics.areEqual(this.client, unsubscribed.client) && Intrinsics.areEqual(this.user, unsubscribed.user);
        }

        public int hashCode() {
            return (this.client.hashCode() * 31) + this.user.hashCode();
        }

        public String toString() {
            return "Unsubscribed(client=" + this.client + ", user=" + this.user + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent.Started
        public ConversationsClient getClient() {
            return this.client;
        }

        @Override // com.robinhood.android.lib.conversations.ClientEvent5
        public User getUser() {
            return this.user;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unsubscribed(ConversationsClient client, User user) {
            super(null);
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(user, "user");
            this.client = client;
            this.user = user;
        }
    }
}
