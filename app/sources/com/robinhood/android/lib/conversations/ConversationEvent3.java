package com.robinhood.android.lib.conversations;

import com.twilio.conversations.Conversation;
import com.twilio.conversations.Participant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ParticipantEvent;", "Lcom/robinhood/android/lib/conversations/ConversationEvent;", "<init>", "()V", "participant", "Lcom/twilio/conversations/Participant;", "getParticipant", "()Lcom/twilio/conversations/Participant;", "Added", "Updated", "Deleted", "Typing", "Lcom/robinhood/android/lib/conversations/ParticipantEvent$Added;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent$Deleted;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent$Typing;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent$Updated;", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.ParticipantEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class ConversationEvent3 extends ConversationEvent {
    public /* synthetic */ ConversationEvent3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Participant getParticipant();

    private ConversationEvent3() {
        super(null);
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ParticipantEvent$Added;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent;", "participant", "Lcom/twilio/conversations/Participant;", "<init>", "(Lcom/twilio/conversations/Participant;)V", "getParticipant", "()Lcom/twilio/conversations/Participant;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ParticipantEvent$Added, reason: from toString */
    public static final /* data */ class Added extends ConversationEvent3 {
        private final Participant participant;

        public static /* synthetic */ Added copy$default(Added added, Participant participant, int i, Object obj) {
            if ((i & 1) != 0) {
                participant = added.participant;
            }
            return added.copy(participant);
        }

        /* renamed from: component1, reason: from getter */
        public final Participant getParticipant() {
            return this.participant;
        }

        public final Added copy(Participant participant) {
            Intrinsics.checkNotNullParameter(participant, "participant");
            return new Added(participant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Added) && Intrinsics.areEqual(this.participant, ((Added) other).participant);
        }

        public int hashCode() {
            return this.participant.hashCode();
        }

        public String toString() {
            return "Added(participant=" + this.participant + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent3
        public Participant getParticipant() {
            return this.participant;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Added(Participant participant) {
            super(null);
            Intrinsics.checkNotNullParameter(participant, "participant");
            this.participant = participant;
        }
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ParticipantEvent$Updated;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent;", "participant", "Lcom/twilio/conversations/Participant;", "reason", "Lcom/twilio/conversations/Participant$UpdateReason;", "<init>", "(Lcom/twilio/conversations/Participant;Lcom/twilio/conversations/Participant$UpdateReason;)V", "getParticipant", "()Lcom/twilio/conversations/Participant;", "getReason", "()Lcom/twilio/conversations/Participant$UpdateReason;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ParticipantEvent$Updated, reason: from toString */
    public static final /* data */ class Updated extends ConversationEvent3 {
        private final Participant participant;
        private final Participant.UpdateReason reason;

        public static /* synthetic */ Updated copy$default(Updated updated, Participant participant, Participant.UpdateReason updateReason, int i, Object obj) {
            if ((i & 1) != 0) {
                participant = updated.participant;
            }
            if ((i & 2) != 0) {
                updateReason = updated.reason;
            }
            return updated.copy(participant, updateReason);
        }

        /* renamed from: component1, reason: from getter */
        public final Participant getParticipant() {
            return this.participant;
        }

        /* renamed from: component2, reason: from getter */
        public final Participant.UpdateReason getReason() {
            return this.reason;
        }

        public final Updated copy(Participant participant, Participant.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(participant, "participant");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Updated(participant, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Updated)) {
                return false;
            }
            Updated updated = (Updated) other;
            return Intrinsics.areEqual(this.participant, updated.participant) && this.reason == updated.reason;
        }

        public int hashCode() {
            return (this.participant.hashCode() * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Updated(participant=" + this.participant + ", reason=" + this.reason + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent3
        public Participant getParticipant() {
            return this.participant;
        }

        public final Participant.UpdateReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Updated(Participant participant, Participant.UpdateReason reason) {
            super(null);
            Intrinsics.checkNotNullParameter(participant, "participant");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.participant = participant;
            this.reason = reason;
        }
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ParticipantEvent$Deleted;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent;", "participant", "Lcom/twilio/conversations/Participant;", "<init>", "(Lcom/twilio/conversations/Participant;)V", "getParticipant", "()Lcom/twilio/conversations/Participant;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ParticipantEvent$Deleted, reason: from toString */
    public static final /* data */ class Deleted extends ConversationEvent3 {
        private final Participant participant;

        public static /* synthetic */ Deleted copy$default(Deleted deleted, Participant participant, int i, Object obj) {
            if ((i & 1) != 0) {
                participant = deleted.participant;
            }
            return deleted.copy(participant);
        }

        /* renamed from: component1, reason: from getter */
        public final Participant getParticipant() {
            return this.participant;
        }

        public final Deleted copy(Participant participant) {
            Intrinsics.checkNotNullParameter(participant, "participant");
            return new Deleted(participant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deleted) && Intrinsics.areEqual(this.participant, ((Deleted) other).participant);
        }

        public int hashCode() {
            return this.participant.hashCode();
        }

        public String toString() {
            return "Deleted(participant=" + this.participant + ")";
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent3
        public Participant getParticipant() {
            return this.participant;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Deleted(Participant participant) {
            super(null);
            Intrinsics.checkNotNullParameter(participant, "participant");
            this.participant = participant;
        }
    }

    /* compiled from: ConversationEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ParticipantEvent$Typing;", "Lcom/robinhood/android/lib/conversations/ParticipantEvent;", "conversation", "Lcom/twilio/conversations/Conversation;", "participant", "Lcom/twilio/conversations/Participant;", "kind", "Lcom/robinhood/android/lib/conversations/ParticipantEvent$Typing$Kind;", "<init>", "(Lcom/twilio/conversations/Conversation;Lcom/twilio/conversations/Participant;Lcom/robinhood/android/lib/conversations/ParticipantEvent$Typing$Kind;)V", "getConversation", "()Lcom/twilio/conversations/Conversation;", "getParticipant", "()Lcom/twilio/conversations/Participant;", "getKind", "()Lcom/robinhood/android/lib/conversations/ParticipantEvent$Typing$Kind;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Kind", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.conversations.ParticipantEvent$Typing, reason: from toString */
    public static final /* data */ class Typing extends ConversationEvent3 {
        private final Conversation conversation;
        private final Kind kind;
        private final Participant participant;

        public static /* synthetic */ Typing copy$default(Typing typing, Conversation conversation, Participant participant, Kind kind, int i, Object obj) {
            if ((i & 1) != 0) {
                conversation = typing.conversation;
            }
            if ((i & 2) != 0) {
                participant = typing.participant;
            }
            if ((i & 4) != 0) {
                kind = typing.kind;
            }
            return typing.copy(conversation, participant, kind);
        }

        /* renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        /* renamed from: component2, reason: from getter */
        public final Participant getParticipant() {
            return this.participant;
        }

        /* renamed from: component3, reason: from getter */
        public final Kind getKind() {
            return this.kind;
        }

        public final Typing copy(Conversation conversation, Participant participant, Kind kind) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(participant, "participant");
            Intrinsics.checkNotNullParameter(kind, "kind");
            return new Typing(conversation, participant, kind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typing)) {
                return false;
            }
            Typing typing = (Typing) other;
            return Intrinsics.areEqual(this.conversation, typing.conversation) && Intrinsics.areEqual(this.participant, typing.participant) && this.kind == typing.kind;
        }

        public int hashCode() {
            return (((this.conversation.hashCode() * 31) + this.participant.hashCode()) * 31) + this.kind.hashCode();
        }

        public String toString() {
            return "Typing(conversation=" + this.conversation + ", participant=" + this.participant + ", kind=" + this.kind + ")";
        }

        public final Conversation getConversation() {
            return this.conversation;
        }

        @Override // com.robinhood.android.lib.conversations.ConversationEvent3
        public Participant getParticipant() {
            return this.participant;
        }

        public final Kind getKind() {
            return this.kind;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Typing(Conversation conversation, Participant participant, Kind kind) {
            super(null);
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(participant, "participant");
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.conversation = conversation;
            this.participant = participant;
            this.kind = kind;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConversationEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ParticipantEvent$Typing$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "ENDED", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.conversations.ParticipantEvent$Typing$Kind */
        public static final class Kind {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Kind[] $VALUES;
            public static final Kind STARTED = new Kind("STARTED", 0);
            public static final Kind ENDED = new Kind("ENDED", 1);

            private static final /* synthetic */ Kind[] $values() {
                return new Kind[]{STARTED, ENDED};
            }

            public static EnumEntries<Kind> getEntries() {
                return $ENTRIES;
            }

            private Kind(String str, int i) {
            }

            static {
                Kind[] kindArr$values = $values();
                $VALUES = kindArr$values;
                $ENTRIES = EnumEntries2.enumEntries(kindArr$values);
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) $VALUES.clone();
            }
        }
    }
}
